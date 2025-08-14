package com.kavyavuragayala.Sample.TestNGExamples.Parallel.testlevel;

import org.testng.annotations.Test;

public class UISmoke {

    @Test
    public void test_API_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }
}
