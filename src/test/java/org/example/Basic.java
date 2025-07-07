package org.example;

import org.testng.annotations.*;

public class Basic {


    @BeforeMethod
    public void Beforemethod()
    {
        System.out.println("Before Method");
    }
    @BeforeTest
    public void Beforetest()
    {
        System.out.println("Before Test");

    }
    @BeforeClass
    public void Beforeclass()
    {
        System.out.println("Before Class");

    }
    @BeforeSuite
    public void Beforesuite()
    {
        System.out.println("Before Suite");
    }

    @Test(priority = 1)
    public void Priorty_1()
    {
        System.out.println("Priorty 1");

    }
    @Test
    public void OnlyTest()
    {
        System.out.println("Only @Test ");

    }
    @Test
    public void Last()
    {
        System.out.println("Only @ Test with alphbetical order");

    }
    @Test(priority = 0)
    public void Priorityzero()
    {
        System.out.println("Priorty 0");

    }

}
