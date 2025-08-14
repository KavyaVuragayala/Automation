package com.kavyavuragayala.Sample.TestNGExamples;

import org.testng.annotations.Test;

public class P1_TestCases {

    public void request1(){
        // this is a normal function , this will not execute
    }

    @Test
    public void request2(){
        // this is a testNG testcase -> will create a separate testNG file and will execute
    }

}
