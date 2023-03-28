package com.safvic.utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.safvic.testCases.BaseClass;

public class TestNG_Listeners extends BaseClass implements ITestListener  {
	ExtentTest test;
	ExtentReports extents = ExtentReporter.getExtentReportObject();
	ThreadLocal <ExtentTest> extentTest = new ThreadLocal <ExtentTest>();
	//Thread Safe - for parallel test execution - 
	// if we run 10 parallel tests together how would we prepare 1 consolidated report 
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extents.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.PASS, "Test Case Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.FAIL, "Test Case Failed");
		extentTest.get().fail(result.getThrowable());
		  
		WebDriver driver = null;
		String failedTestMethodName = result.getMethod().getMethodName();
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			//getDeclaredField -> getField 
			//getField can get a field inherited from a superclass but getDeclaredField cannot.
		} catch (Exception e) {
			
		}
		try {
			extentTest.get().addScreenCaptureFromPath(getFailedTestScreeshotPath(failedTestMethodName, driver), result.getMethod().getMethodName());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extents.flush();
	}

}
