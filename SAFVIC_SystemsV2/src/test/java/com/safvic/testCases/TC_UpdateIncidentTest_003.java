package com.safvic.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentUpdate;

public class TC_UpdateIncidentTest_003 extends BaseClass {

	@Test
	public void updateIncidenTest() throws InterruptedException {
		Thread.sleep(3000);
		IncidentUpdate iu = new IncidentUpdate(driver);
		
		iu.navigateIncidentUpdate();
		
		iu.setDistrictInfo();
		iu.enableChildrenInvolved();
		
		iu.enableRequiresCPS();
		iu.enableCPSCalled();
		iu.txtCPSNumber();
		iu.dateCPSNotified();
		iu.txtCPSSafetyIssues();
		
		
		iu.setOfficerPrimaryConcern();
		iu.setSuspectedMethManufacture();
		iu.setSensitiveIssues();
		Thread.sleep(2000);
		iu.enableCovidExposure();
		
		

		
		iu.selectHowPoliceContacted();
		iu.selectHowPoliceContactedOption();
		iu.selectReasonForContact();
		iu.selectReasonForContactOption();

		Thread.sleep(2000);

		iu.selectDispatchedDate();
		iu.selectDispatchedTime();
		iu.saveIncidentUpdate();
		
		Thread.sleep(2000);
		String toastMessage = driver.findElement(By.className("k-notification-content")).getText();
		
		System.out.println("Toast Message is:" + toastMessage);
		
		
		if (driver.getTitle().equals("Incident Overview - SAFV_Site")) {
			Assert.assertEquals(toastMessage, "Incident has been updated successfully");
			log.info("Incident Updated Successfully");
		} else {
			//Assert.assertTrue(false);
			log.info("Incident Update Failed");
		}

	}

}
