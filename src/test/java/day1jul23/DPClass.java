package day1jul23;

import org.testng.annotations.DataProvider;

public class DPClass {

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
			{"un3","pw3","pp1"},
			{"un4","pw4","pp2"},
			{"un5","pw5","pp3"},
		};
	}
	
	@DataProvider(name="DP3")
	public Object[][] getData3()
	{
		return new Object[][] {
			{"Amit","Jadhav",23},
			{"Siddhesh","Patil",33},
			{"Rahul","Kulkarni",32},
			{"Raghav","Jual",21},
			{"Prashant","Kambale",24}
		};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
