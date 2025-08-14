package com.kavyavuragayala.Sample.TestNGExamples;

import org.testng.annotations.Test;

public class P9_SoftVSHard_AlwaysRun {
    @Test
    public void login() { /* might fail */ }

    @Test(dependsOnMethods = "login")         // Hard dependency
    public void placeOrder() {
        /* runs only if login passed */
    }

    @Test(dependsOnMethods = "login",         // Soft dependency
            alwaysRun = true)                  // even though if login false , we have included alwaysRun so this will execute
    public void closeBrowser() {
        /* runs even if login failed */
    }
}
