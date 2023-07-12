package day30jun23;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunDemo {

	// do not execute as enabled takes precedence
	@Test(enabled=false, alwaysRun=true)
	public void test1()
	{
		System.out.println("test1 method is being called...");
	}
	
	@Test
	public void regUser()
	{
		Assert.fail("Intentionally failing the test script..");
		System.out.println("Registration of an user");
	}
	
	@Test(dependsOnMethods = {"regUser"}, alwaysRun=true)
	public void loginUser()
	{
		System.out.println("Login of an user");
	}
	
	
}
