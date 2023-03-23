 package com.safvic.testCases;

import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentUpdate;

public class TC_UpdateIncidentTest_003 extends BaseClass{
	
	@Test
	public void UpdateIncidenTest() throws InterruptedException {
		Thread.sleep(3000);
		IncidentUpdate iu = new IncidentUpdate(driver);
		iu.navigateIncidentUpdate();
		iu.setDistrictInfo();
		iu.enableChildrenInvolved();
		iu.setOfficerPrimaryConcern();
		iu.setSuspectedMethManufacture();
		iu.setSensitiveIssues();
		iu.enableCovidExposure();
		iu.selectReasonContactPolice();
		iu.selectReportedDetails();
		iu.selectDispatchedDate();
		iu.selectDispatchedTime();
		iu.saveIncidentUpdate();
		
		
	}
	

}
