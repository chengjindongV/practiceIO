import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * excel 详细设置，参考 https://blog.csdn.net/qq_21137441/article/details/79226171
 * @author ：chengjindong
 * @description：TODO
 * @date ：Created in 2019/7/17 0017 14:21
 */
public class ExcelIODemo {

    public static void excelConvert() throws Exception{

        String path = "F:/ExcelConvert/泽荔商品品类.xls";

        InputStream in = new FileInputStream(path);


        HSSFWorkbook workbook =new HSSFWorkbook(in);
        in.close();

        HSSFSheet sheet = workbook.getSheetAt(0);

        int lastRowNum = sheet.getLastRowNum();

        List<ExcelBean> excelBean = createExcelBean(sheet, lastRowNum);


        XSSFWorkbook xssfWorkbook =new XSSFWorkbook(); // 创建工作簿

        XSSFSheet sheet1 = xssfWorkbook.createSheet("sheet1"); // 创建一个sheet

        XSSFRow header = sheet1.createRow(0); // 创建表头

        //填充表头的每列
        header.createCell(0).setCellValue("名称");
        header.createCell(1).setCellValue("编码");


        for(int i =0; i< excelBean.size();i++){
            XSSFRow row = sheet1.createRow(i+1);
            row.createCell(0).setCellValue(excelBean.get(i).getName());
            row.createCell(1).setCellValue(excelBean.get(i).getCode());
        }

        String filePath = "D:/createSqlByExcel/";
        String fileName = "一个人的夜.xlsx";

        File file = new File(filePath); // 如果文件夹不存在，就创建一个
        if (!file.exists()) {
            file.mkdirs();
        }


        FileOutputStream outputStream = new FileOutputStream(filePath+fileName);

        xssfWorkbook.write(outputStream); //excel写入输出流
        outputStream.close(); // 关闭输出流

    }

    private static List<ExcelBean> createExcelBean(HSSFSheet sheet, int lastRowNum) {

        List<ExcelBean> excelBeans = new ArrayList<>();

        for (int currentNow = 0;currentNow<=lastRowNum;currentNow++){
            ExcelBean bean = new ExcelBean();
            HSSFRow row = sheet.getRow(currentNow+1);
            if (row!=null){
                HSSFCell cell =row.getCell(0);
                if (cell!=null){
                    bean.setName(cell.getStringCellValue());
                }

                HSSFCell cell1 =row.getCell(1);
                if (cell1!=null){
                    bean.setCode(cell1.getStringCellValue());
                }
            }

            excelBeans.add(bean);

        }

        return excelBeans;
    }

    public static void main(String[] args) throws Exception{
        excelConvert();
    }
}
