package day3Jul23;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TC2 {
	
	@Test
	public void testTC2_1()
	{
		Assert.assertFalse(1==2, "TC2_1 => 1 == 2");
	}
	
	@Test
	public void testTC2_2()
	{
		Assert.assertFalse(1==1, "TC2_2 => 1==1");
	}
	
	@Test
	public void testTC2_3()
	{
		throw new SkipException("Intentionally skipping the test script from TC2");
	}
	
}
