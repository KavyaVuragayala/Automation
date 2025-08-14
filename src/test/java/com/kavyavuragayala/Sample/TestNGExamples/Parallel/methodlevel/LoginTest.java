package com.kavyavuragayala.Sample.TestNGExamples.Parallel.methodlevel;

import org.testng.annotations.Test;

public class LoginTest {

    public void validLogin() {
        System.out.println("validLogin – Thread " + Thread.currentThread().getId());
    }

    @Test
    public void invalidLogin() {
        System.out.println("invalidLogin – Thread " + Thread.currentThread().getId());
    }

    @Test
    public void invalidLogin2() {
        System.out.println("invalidLogin – Thread " + Thread.currentThread().getId());
    }
}
