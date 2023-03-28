package com.safvic.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {

	static ExtentReports extents;

	public static ExtentReports getExtentReportObject() {
		//this method is responsible to complete all the reporting configuration
		String path = System.getProperty("user.dir")+"\\reports\\TestReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("SAFVIC Automation Test Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extents = new ExtentReports();
		extents.attachReporter(reporter);
		extents.setSystemInfo("Automated By", "Hasan Shahriar");
		
		return extents;
  }
}