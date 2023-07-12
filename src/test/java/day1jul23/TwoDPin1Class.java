package day1jul23;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDPin1Class {

	@DataProvider(name="DP1")
	public Object[][] getData1()
	{
		return new Object[][] {
			{"un1","pw1"},
			{"un2","pw2"}
		};
	}
	@DataProvider(name="DP2")
	public Object[][] getData2()
	{
		return new Object[][] {
			{"un3","pw3"},
			{"un4","pw4"},
			{"un5","pw5"},
		};
	}
	
	@Test
	public void verifyTest3()
	{
		System.out.println("This is simple test case without Data provider");
	}
	
	@Test(dataProvider="DP1")
	public void verifyTest1(String un, String pw)
	{
		System.out.println(un + " : " + pw);
	}
	
	@Test(dataProvider="DP2")
	public void verifyTest2(String un, String pw)
	{
		System.out.println(un + " : " + pw);
	}
}
