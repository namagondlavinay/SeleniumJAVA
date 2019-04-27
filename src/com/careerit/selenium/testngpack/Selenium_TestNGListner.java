package com.careerit.selenium.testngpack;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Selenium_TestNGListner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart(ITestResult result)");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess(ITestResult result)");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure(ITestResult result)");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped(ITestResult result)");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart(ITestContext context)");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish(ITestContext context)");
		
	}

}
