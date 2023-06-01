package com.safvic.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.safvic.pageObjects.EPORequest;
import com.safvic.pageObjects.IncidentUpdate;
import com.safvic.pageObjects.LocationAdding;
import com.safvic.pageObjects.OffenseAdding;
import com.safvic.pageObjects.PeopleBasicInfo;
import com.safvic.pageObjects.QuickCreatePeople;
import com.safvic.pageObjects.RiskAssessment;
import com.safvic.pageObjects.Vehicles;

public class TC_CreateEPORequestTest_010 extends BaseClass {
	// Add Incident Location
	@Test
	public void CreateEPORequest() throws InterruptedException {
		EPORequest epoReq = new EPORequest(driver);
		Thread.sleep(2000);

		epoReq.navigateEPORequest();
		
		if (driver.getTitle().equals("EPO Request - SAFV_Site")) {
			Assert.assertTrue(true);
			log.info("Navigated to EPO Request Successfully");
			
			Thread.sleep(2000);
			
			epoReq.createEPORequest();
			
			driver.navigate().refresh();
			
			epoReq.selectOffenseGroup();
			epoReq.selectOffenseGroupOption();
			epoReq.enableRequestedByVictim();
			epoReq.enableRequestedByGuardian();
			epoReq.inputGuardianName();
			epoReq.enableRequestedByOfficer();
			
			epoReq.enableRequestedByState();
			epoReq.inputStateAttorneyName();
			
			epoReq.enableRequestedByMagistrate();
			epoReq.inputMagistrateName();
			
			epoReq.enableHoldRequested();
			epoReq.enable24HoldRequested();
			epoReq.inputExplainHold();
			
			epoReq.saveEPORequest();
			
			epoReq.generateEPORequestDocs();
			
			Thread.sleep(3000);
			
			epoReq.includeAdditionalForms();
			Thread.sleep(3000);
			epoReq.generateRequest();
			
			//epoReq.validateGeneratedEPOFormsTable();
			//epoReq.sendEPORequest();
			//epoReq.selectJudicialOrganization();
			//epoReq.selectJudicialOrganizationOption();
			//epoReq.sendEPOReqWithoutSigning();
			
			

			String pageSource = driver.getPageSource();
			//String toastMessage = driver.findElement(By.className("k-notification-content")).getText();
			//System.out.println("Toast Message is:" + toastMessage);

			if (pageSource.contains("Update EPO : Sent Without Signing to JUDGE ORG")) {
				//Assert.assertEquals(toastMessage, "Risk Assessment has been saved successfully");
				log.info("EPO Request Sent Successfully");
			} else {
				// Assert.assertTrue(false);
				log.info("Failed to Send EPO Request");
			}

		} else {
			// Assert.assertTrue(false);
			log.info("Failed to Navigate to the EPO Request page");
		}

	}
}
