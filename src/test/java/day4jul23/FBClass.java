package day4jul23;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class FBClass {

	@Test
	public void FBRegisterUser()
	{
		System.out.println("FBClass => registering new user");
	}
	
	@Test
	public void FBSingupUser()
	{
		System.out.println("FBClass => registering new user");
		throw new SkipException("Skipping test case...");
	}
	
	
	
	
	
	
	
	
	
	
	
}
