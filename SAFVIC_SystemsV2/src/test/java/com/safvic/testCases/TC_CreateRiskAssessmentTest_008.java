package com.safvic.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentUpdate;
import com.safvic.pageObjects.LocationAdding;
import com.safvic.pageObjects.OffenseAdding;
import com.safvic.pageObjects.PeopleBasicInfo;
import com.safvic.pageObjects.QuickCreatePeople;
import com.safvic.pageObjects.RiskAssessment;
import com.safvic.util.JiraPolicy;

public class TC_CreateRiskAssessmentTest_008 extends BaseClass {
	// Create Risk Assessment

	// @JiraPolicy(logTicket=true)
	@Test
	public void CreateRiskAssessment() throws InterruptedException {
		RiskAssessment riAss = new RiskAssessment(driver);
		Thread.sleep(2000);

		riAss.navigateRiskAssTab();

		if (driver.getTitle().equals("Risk Assessment - SAFV_Site")) {
			Assert.assertTrue(true);
			log.info("Navigated to the Risk Assessment Tab Successfully");

			Thread.sleep(2000);

			riAss.createRiskAssessment();
			driver.navigate().refresh();

			Thread.sleep(2000);
			riAss.selectSuspect();
			riAss.selectSuspectOption();

			Thread.sleep(2000);
			riAss.selectVictim();
			riAss.selectVictimOption();

			riAss.checkFamilyViolence();
			riAss.checkUsedThreatenedWeapon();
			riAss.checkThreatenedToKill();
			riAss.checkSuspectHasGun();
			riAss.inputGunDetails();
			riAss.checkStrangulation();
			riAss.checkViolence();
			riAss.checkJealousy();
			riAss.checkControlling();
			riAss.checkViolenceIncreased();
			riAss.inputViolenceIncreasedDesc();
			riAss.checkDestroyedItems();
			riAss.checkHurtPets();
			riAss.checkUnemployed();
			riAss.checkSuicidal();
			riAss.checkspying();
			riAss.checkThreateningMessages();
			riAss.checkAlcoholAbuse();
			riAss.checkDrugsUse();
			riAss.checkMightKillYou();
			riAss.checkforcedSex();
			riAss.checkSeparation();
			riAss.checkRecentSeparation();
			riAss.checkUnrelatedChild();
			riAss.checkPriorContacts();
			riAss.checkCourtAction();
			riAss.inputAdditionalInfo();
			// riAss.inputPriorProtectiveOrder();
			// Thread.sleep(2000);
			riAss.inputDateTimeRiskAss();
			riAss.saveRiskAssessment();

			// Thread.sleep(2000);

			String pageSource = driver.getPageSource();
			String toastMessage = driver.findElement(By.className("k-notification-content")).getText();

			System.out.println("Toast Message is:" + toastMessage);

			if (pageSource.contains("Create Offense - Offense")) {
				Assert.assertEquals(toastMessage, "Risk Assessment has been saved successfully");
				log.info("Risk Assessment Created Successfully");
			} else {
				// Assert.assertTrue(false);
				log.info("Failed to Create Risk Assessment");
			}

		} else {
			// Assert.assertTrue(false);
			log.info("Failed to Navigate to the Risk Assessment page");
		}

	}
}
