package com.kavyavuragayala.Sample.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P7_Enabled {

    @Test
    public void test01() {
        Assert.assertTrue(true);
    }
    @Test(enabled = false)   // this will not execute
    public void test02() {
        Assert.assertTrue(true);
    }
    @Test
    public void test03() {
        Assert.assertTrue(true);
    }
}
