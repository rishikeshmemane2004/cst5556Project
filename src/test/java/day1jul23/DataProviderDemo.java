package day1jul23;

import java.time.LocalTime;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	//first step
	@DataProvider(name="cybersuccessdata", parallel=true)
	public Object[][] getData()
	{
		Object[][] data = new Object[4][2];
		
		// 1st row
		data[0][0] = "Amit";
		data[0][1] = "Amit@123";
		
		//second data set
		data[1][0] = "Abhishek";
		data[1][1] = "Abhishek@123";

		//third data set
		data[2][0] = "Siddhesh";
		data[2][1] = "Siddhesh@123";

		// fourth data set
		data[3][0] = "Rajan";
		data[3][1] = "Rajan@123";
		
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












