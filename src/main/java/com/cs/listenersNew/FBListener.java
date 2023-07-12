package com.cs.listenersNew;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FBListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println(result.getName() + " => test case has begun its execution");
	}
	
	  public  void onTestSuccess(ITestResult result) {
		  System.out.println(result.getName() + " => is passed");
	  
	  }
	
	  public void onTestFailure(ITestResult result) {
		  System.out.println(result.getName() + " => is failed");
		  
	  }
	  
	  public void onTestSkipped(ITestResult result) {
		  System.out.println(result.getName() + " => is skipped");

	  }
	  
	  public void onStart(ITestContext context) {
		  System.out.println("Suite started....");
	  }
	  public void onFinish(ITestContext context) {
		  System.out.println("Suite completed....");
	  }
	  
	  
	  
	
}
