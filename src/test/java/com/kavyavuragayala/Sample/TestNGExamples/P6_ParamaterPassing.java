package com.kavyavuragayala.Sample.TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P6_ParamaterPassing {


    @Parameters("browser")
    @Test
    public void demo(String value){
        System.out.println("Hi I am demo");
        System.out.println("Yor are starting this param");

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Starting chrome browser");
        }

        if(value.equalsIgnoreCase("firefox")){
            System.out.println("Starting firefox browser");
        }
    }
}
