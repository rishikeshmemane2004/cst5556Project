package day1jul23;

import org.testng.annotations.Test;

public class ClassDP2 {

	
	@Test(dataProvider="DP3",dataProviderClass=DPClass.class)
	public void test1(String fn, String ln, int age)
	{
		System.out.println(fn + " : " + ln + " : " + age);
	}
	
	 
}
