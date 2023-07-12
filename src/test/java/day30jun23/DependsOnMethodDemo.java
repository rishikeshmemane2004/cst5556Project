package day30jun23;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodDemo {
                                 // and -> both tests should be passed in order to execute logout method
	@Test(dependsOnMethods = {"regOfUser","loginToUser"})
	public void logout()
	{
		System.out.println("Logging out...");
	}
	
	@Test 
	public void regOfUser()
	{
		 System.out.println("Registering user...");
	}

	@Test
	public void loginToUser()
	{
		Assert.fail("Intionally failing..."); // unconditional fail
		 System.out.println("Login to user...");
	}

}
