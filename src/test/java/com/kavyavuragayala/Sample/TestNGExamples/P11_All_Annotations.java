package com.kavyavuragayala.Sample.TestNGExamples;

import org.testng.annotations.*;

public class P11_All_Annotations {

    /* BeforeSuite
       BeforeTest
       BeforeClass
       BeforeMethod
       Test
       AfterMethod
       AfterClass
       AfterTest
       AfterSuite */

    @BeforeSuite
    void demo1()
    {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    void demo2(){
        System.out.println("BeforeTest");
    }

    @BeforeClass
    void demo3(){
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void demo4(){
        System.out.println("BeforeMethod");
    }

    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterMethod
    void demo6(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    void demo7(){
        System.out.println("AfterClass");
    }

    @AfterTest
    void demo8(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    void demo9(){
        System.out.println("AfterSuite");
    }

}
