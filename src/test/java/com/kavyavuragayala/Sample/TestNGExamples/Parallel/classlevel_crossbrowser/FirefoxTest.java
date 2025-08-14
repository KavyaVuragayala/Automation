package com.kavyavuragayala.Sample.TestNGExamples.Parallel.classlevel_crossbrowser;

import org.testng.annotations.Test;

public class FirefoxTest {

    @Test
    public void Firefox(){

        System.out.println("2");
        System.out.println(Thread.currentThread().getId());
    }
}
