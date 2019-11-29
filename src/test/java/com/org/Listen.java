package com.org;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listen implements ITestListener {

	@Override
	public void onFinish(ITestContext no) {
System.out.println("on finish "+no);		
	}

	@Override
	public void onStart(ITestContext no) {
System.out.println("on start "+no.getName());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult no) {
System.out.println("with success percent "+no.SUCCESS_PERCENTAGE_FAILURE);		
	}

	@Override
	public void onTestFailure(ITestResult no) {
System.out.println("on test failure "+no.getName());		
	}

	@Override
	public void onTestSkipped(ITestResult no) {
System.out.println("on test skipped "+no.getName());		
	}

	@Override
	public void onTestStart(ITestResult no) {
System.out.println("on test start "+no.STARTED);		
	}

	@Override
	public void onTestSuccess(ITestResult no) {
System.out.println("on test success "+no.getName());		
	}

}
