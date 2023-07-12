package day1jul23;

import java.time.LocalTime;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {

	//first step
	@DataProvider(name="cybersuccessdata")  //, parallel=true)
	public Object[][] getData()
	{
		Object[][] data = {
				{"Don","Don@123"},
				{"Rajan","Rajan@123"},
				{"Daud","Daud@123"},
				{"Shakil","Shakil@123"}
		};
		
		return data;
	}
	
	//second step
	@Test(dataProvider="cybersuccessdata")
	//third step
	public void LoginApplWithDifferentUser(String username, String password)
	{
		LocalTime lt = LocalTime.now();
		System.out.println("date : " + lt.toString());
		if (username.equals("Abhishek"))
			Assert.fail("Failing test for username : " + username);
		System.out.println("username: " + username + "   password: " + password);
	}
}

