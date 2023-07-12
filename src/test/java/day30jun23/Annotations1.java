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

public class Annotations1 {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("BEFORESUITE1...");
	}

	@AfterSuite

	public void aftersuite() {
		System.out.println("AFTERSUITE1...");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BEFORE TEST1 annotation");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AFTER TEST1 annotation");
	}

	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("BEFORE CLASS1 executed...");
	}

	@AfterClass
	public void afterClassMethod() {
		System.out.println("AFTER CLASS1 executed...");
	}

	@BeforeMethod
	public void setUp() {
		System.out.println("BEFORE METHOD1 test mehod");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("AFTER METHOD1 test mehod");
	}

	@Test
	public void test1() {
		System.out.println("TEST1 METHOD: this is test1 test method");
	}

	@Test
	public void test2() {
		System.out.println("TEST2 METHOD: this is test2 test method");
	}

}
