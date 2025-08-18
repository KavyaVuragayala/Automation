package com.kavyavuragayala.Sample.TestAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P2_TestNGAssertions {


    @Test
    public void hard_Assertion(){

        System.out.println("start");
        Assert.assertEquals("alice","Alice");  // if this stmt fails then rest of the stmts will not execute
        System.out.println("end");
    }


    @Test
    public void soft_Assertion(){
        SoftAssert SA = new SoftAssert();
        SA.assertEquals("alice","Alice");  // even this fails soft assertion will execute next lines of code
        System.out.println("End");
        SA.assertAll();
    }
}
