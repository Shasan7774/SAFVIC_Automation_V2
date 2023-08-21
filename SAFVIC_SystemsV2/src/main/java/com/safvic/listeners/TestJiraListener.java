package com.safvic.listeners;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.safvic.util.JiraPolicy;
import com.safvic.util.JiraServiceProvider;

public class TestJiraListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady = jiraPolicy.logTicket();
		if(isTicketReady) {
			System.out.println("Is Ticket Ready For JIRA:"+ isTicketReady);
			JiraServiceProvider jiraSp = new JiraServiceProvider("https://stellaint.atlassian.net/", 
					"hasan.shahria@brainstation-23.com", 
					"ATATT3xFfGF0oFq117q2BujLqqcZdFa4T-ErAi6oEJrn-5OtflphV1qwWF6EZVcsckq4UzSEe4BeDiFExfs8zpZVEu3DBYzWPln-ve7YeyV9QHeCGscvUJngfa7Vuo73Bi0gCdpWLm4avNw6EFFdoFuavJD_O9jbjcuu9UxWKep9AYkxzI49aQo=A38D959D", 
					"SAFV");
			
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName() 
					+ " got failed due to some assertions or exceptions";
			
			String issueDescription = result.getThrowable().getMessage() + "\n";
			
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
			
			jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "Hasan Shahriar");
			
			
			
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
		//ITestListener.super.onFinish(context);
	}
	

}
