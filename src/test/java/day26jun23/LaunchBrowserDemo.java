package day26jun23;

import org.testng.annotations.Test;

public class LaunchBrowserDemo {

	@Test(priority=-3,enabled=true)
	public void verifyUrl()   // method, test method, test script
	{
		System.out.println("I am utilizing testng to verify urls");
	}
	
	
	@Test(priority=-3)
	public void verifyTitle()   // method, test method, test script
	{
		System.out.println("I am utilizing testng to verify title");
	}
	
	@Test(priority=20)
	public void verifyBrowser()   // method, test method, test script
	{
		System.out.println("I am utilizing testng to verify browser");
	}
	
	
	
	
}
