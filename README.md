# practiceIO
poi和io的练习


#Gradle-Wrapper是简化Gardle的安装和部署，如果本地没有部署Gardle就使用Gardle-Wrapper
#Wed Nov 21 15:25:07 CST 2018
#distributionBase和distributionPath是配合使用，指定gradle解压后的存放位置
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
#zipStoreBase和zipStorePath配合使用，指定下载gradle.zip存放位置
zipStoreBase=GRADLE_USER_HOME  
zipStorePath=wrapper/dists
distributionUrl=https\://services.gradle.org/distributions/gradle-4.4-all.zip

# https://blog.csdn.net/niuba123456/article/details/81074340 Gradle-Wrapper详解
# https://blog.csdn.net/tengxvincent/article/details/88355527 Gradle、Gradle Wrapper区别和联系
# https://blog.csdn.net/xiaxiayige/article/details/82016470?utm_source=app 重新认识Gradle（一）-安装篇

# GRADLE_USER_HOME 要在本地配置好环境变量，一定要重启电脑才会生效，指向的是gradle本地仓库的位置
# 依赖包下载的位置 Windows系统默认下载到：C:\Users\(用户名)\.gradle\caches\modules-2\files-2.1

# 1.指定对应版本的Gradle，而不通过Gradle Wrapper下载的设置方式是勾选如下图中的Use local gradle distribution，同时指定Gradle home

# 2.通过Gradle Wrapper下载的设置方式 选择use default gradle wrapper
