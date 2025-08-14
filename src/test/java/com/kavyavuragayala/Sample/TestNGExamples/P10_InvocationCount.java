package com.kavyavuragayala.Sample.TestNGExamples;

import org.testng.annotations.Test;

public class P10_InvocationCount {

    // running testcases multiple time

    @Test(invocationCount = 2)
    public void method1(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void method2(){
        System.out.println("Hello");
    }
}
