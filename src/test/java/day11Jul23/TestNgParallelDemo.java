package day11Jul23;

import java.util.Date;

import org.testng.annotations.Test;

public class TestNgParallelDemo {

	
	
	@Test
	public void test1() throws InterruptedException
	{
		Date dt = new Date();
		System.out.println("test1 is being executed: " + dt.toString());
		Thread.sleep(2000l);
		System.out.println("test1 is completed");
	}
	@Test
	public void test2() throws InterruptedException
	{
		Date dt = new Date();
		System.out.println("test2 is being executed: " + dt.toString());	
		Thread.sleep(2000l);
		System.out.println("test1 is completed");	
	}
	@Test
	public void test3() throws InterruptedException
	{
		Date dt = new Date();
		System.out.println("test3 is being executed: " + dt.toString());	 
	Thread.sleep(2000l);
	System.out.println("test1 is completed");
	}
}
