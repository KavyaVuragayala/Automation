package com.kavyavuragayala.Sample.TestNGExamples;

import org.testng.annotations.Test;

public class P3_TestNGPriority {
    /* 1.
    1. Default priority is 0
    2. Lower number ⇒ runs earlier, `priority=-3` runs before `priority=-1, prioryt = 0`
    3. Same priority ⇒ alphabetical order
    4. Mix of prioritised & non-prioritised methods - All negative-priority tests run first (ascending), then priority 0 tests (alphabetical), then positive-priority tests (ascending)
 */

    @Test(priority = 1)
    public void test_t1(){
        System.out.println("1");
    }

    @Test(priority = 3)
    public void test_t2(){
        System.out.println("3");
    }

    @Test(priority = 2)
    public void test_t3(){
        System.out.println("2");
    }

    @Test(priority = 4)
    public void test_t4(){
        System.out.println("4");
    }

}
