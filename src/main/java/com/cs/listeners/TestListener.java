package com.cs.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " just started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " is passed");
	}

	 public void onTestFailure(ITestResult result) {
			System.out.println(result.getName() + " is failed");
	 }

	 public void onTestSkipped(ITestResult result) {
		 System.out.println(result.getName() + " is skipped");
		  }
	 
	 // will execute when entire test suite kicks off 
	 public void onStart(ITestContext context) {
		 System.out.println("Suite execution is started...");		  }

	// will execute when entire test suite finished 
		  public void onFinish(ITestContext context) {
			  System.out.println("Suite execution is completed...");
		  }
}
