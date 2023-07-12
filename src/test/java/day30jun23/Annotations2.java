package day30jun23;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BEFORE TEST2 annotation");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("AFTER TEST2 annotation");
	}
	
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("BEFORE CLASS2 executed...");
	}
	@AfterClass
	public void afterClassMethod()
	{
		System.out.println("AFTER CLASS2 executed...");
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("BEFORE METHOD2 test mehod");
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("AFTER METHOD2 test mehod");
	}
	
	
	@Test
	public void test3()
	{
		System.out.println("TEST3 METHOD: this is test3 test method");
	}

	@Test
	public void test4()
	{
		System.out.println("TEST4 METHOD: this is test4 test method");
	}
}
