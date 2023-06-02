package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Hello Before Suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Hai Before Test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Welcome Before Class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Begin Before Method");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Start Program running1");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("Inprogress2");
	}
	
	
	@Test
	public void test3()
	{
		System.out.println("Finished3");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Final after method");
	}
	
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("End after Class");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("Exist after Test");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Quite after Suite");
	}
	
	
	
	
	
}
