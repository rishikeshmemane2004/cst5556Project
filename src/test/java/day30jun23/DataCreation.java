package day30jun23;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class DataCreation {
	static int cnt=0;
	
	@Test(invocationCount = 30)
	public void createData()
	{
//		System.out.println(cnt++ + "createData is being called...");
		Faker f = new Faker();
		System.out.println(cnt++ + " : " + f.name().bloodGroup());
		System.out.println(cnt++ + " : " + f.internet().domainName());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
