package com.practice.praticeIO.entity;

/**
 * @author ：chengjindong
 * @description：TODO
 * @date ：Created in 2019/7/17 0017 14:45
 */
public class ExcelBean {

    private String name;

    private String code;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "com.practice.praticeIO.entity.ExcelBean{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
