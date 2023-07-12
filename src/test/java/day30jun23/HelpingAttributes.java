package day30jun23;

import org.testng.annotations.Test;

public class HelpingAttributes {

	@Test(enabled = true, description = "test to verify title", timeOut=1)
	public void test1() throws InterruptedException {
	//	Thread.sleep(1000l);
		System.out.println("test1 method is getting executed....");
	}

	@Test(description = "test to verify url")
	public void test2() {
		System.out.println("test2 method is getting executed....");
	}

}
