package day1jul23;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class DynamicDataCreationDemo {

	
	@Test(invocationCount = 4)
	public void verifyLoginTest()
	{
		// Dynamic Data Creation
		Faker faker = new Faker();
		String fName = faker.name().firstName();
		System.out.println("This is login test script " + fName);
	}
}
