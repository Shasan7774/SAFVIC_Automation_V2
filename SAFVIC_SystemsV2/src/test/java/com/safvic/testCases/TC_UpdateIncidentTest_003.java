 package com.safvic.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentUpdate;

public class TC_UpdateIncidentTest_003 extends BaseClass{
	
	@Test
	public void UpdateIncidenTest() throws InterruptedException {
		Thread.sleep(3000);
		IncidentUpdate iu = new IncidentUpdate(driver);
		iu.navigateIncidentUpdate();
		iu.setDistrictInfo();
		//iu.enableChildrenInvolved();
		iu.setOfficerPrimaryConcern();
		iu.setSuspectedMethManufacture();
		iu.setSensitiveIssues();
		Thread.sleep(2000);
		//iu.enableCovidExposure();
		//iu.selectReasonContactPolice();
		Thread.sleep(2000);
		//iu.selectReportedDetails();
		iu.selectDispatchedDate();
		iu.selectDispatchedTime();
		iu.saveIncidentUpdate();
		
		
	}
	

}
