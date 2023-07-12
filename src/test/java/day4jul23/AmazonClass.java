package day4jul23;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AmazonClass {

	@Test
	public void AmazonLogin()
	{
		System.out.println("AmzonClass => login to application");
		Assert.fail("Intentionally failing the test case");
		//Assert.assertTrue(1==2);
	}

	@Test
	public void AmazonSignup()
	{
		System.out.println("AmazonClass => Singup to application");
		throw new SkipException("Intentionally skipping the testcase");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
