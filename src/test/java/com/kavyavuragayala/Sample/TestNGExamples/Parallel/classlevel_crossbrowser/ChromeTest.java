package com.kavyavuragayala.Sample.TestNGExamples.Parallel.classlevel_crossbrowser;

import org.testng.annotations.Test;

public class ChromeTest {

    @Test
    public void chrome1(){
        System.out.println("1");
        System.out.println(Thread.currentThread().getId());
    }

    @Test
    public void chrome2(){
        System.out.println("2");
        System.out.println(Thread.currentThread().getId());
    }
}
