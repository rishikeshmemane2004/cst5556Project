package day30jun23;

import org.testng.annotations.Test;

public class DependsOnMethodDemo2 {
                                 
	@Test(dependsOnMethods = {"loginToUser"})
	public void logout()
	{
		System.out.println("Log out...");
	}
	
	@Test 
	public void regOfUser()
	{
		 System.out.println("Registering user...");
	}

	@Test(dependsOnMethods = {"regOfUser"})
	public void loginToUser()
	{
		 System.out.println("Login to user...");
	}

}
