package day1jul23;

import org.testng.annotations.Test;

public class ClassDP1 {

	
	@Test(dataProvider="DP1",dataProviderClass=DPClass.class)
	public void test1(String u, String p)
	{
		System.out.println(u + " : " + p);
	}
	
	@Test(dataProvider="DP2",dataProviderClass=DPClass.class)
	public void test2(String u, String p, String pp)
	{
		System.out.println(u + " : " + p + " : " + pp);
	}
	
}
