package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.nio.cs.ext.SJIS;
import sun.print.SunPrinterJobService;

public class BasicAnnotation {
     //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("test这是第一个测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("test2测试用例");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod这是在测试方法之后运行");
    }
}

