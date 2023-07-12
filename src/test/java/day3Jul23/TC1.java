package day3Jul23;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TC1 {

	
	@Test
	public void testTC1_1()
	{
		Assert.assertFalse(1==2,"TC1_1 => 1 == 2");
	}
	
	@Test
	public void testTC1_2()
	{
		Assert.assertFalse(1==1, "TC1_2 => 1 == 1");
	}
	
	@Test
	public void testTC1_3()
	{
		throw new SkipException("Intentionally skipping the test script from TC1");
	}
	
	
	
	
	
	
	
	
	
	
}
