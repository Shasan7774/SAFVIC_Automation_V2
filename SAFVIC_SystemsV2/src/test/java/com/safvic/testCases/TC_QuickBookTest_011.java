package com.safvic.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentCreation;
import com.safvic.pageObjects.LoginPage;
import com.safvic.pageObjects.QBEvidence;
import com.safvic.pageObjects.QBIncidentCreate;
import com.safvic.pageObjects.QBOffense;
import com.safvic.pageObjects.QBRiskAssessment;
import com.safvic.pageObjects.QBSuspect;
import com.safvic.pageObjects.QBVictim;
import com.safvic.util.JiraPolicy;

public class TC_QuickBookTest_011 extends BaseClass {

	@Test(priority = 1)
	public void naviagateToIncidents() {
		IncidentCreation ic = new IncidentCreation(driver);
		ic.navigateIncident();
	}

	// QuickBook Incident Create Test
	@Test(priority = 2)
	public void createQuickBookTest() throws InterruptedException {

		QBIncidentCreate qbIncidentCreate = new QBIncidentCreate(driver);

		// qbIncidentCreate.navigateToHomepage();
		qbIncidentCreate.clickCreateQuickBook();

		/*
		 * String actualTitle = driver.getTitle(); String expectedTitle =
		 * "Quick Book - SAFV_Site";
		 */
		// Thread.sleep(3000);
		qbIncidentCreate.selectIncidentReportDate();
		qbIncidentCreate.setIncidentCaseNumber();

		qbIncidentCreate.selectIncidentType();
		qbIncidentCreate.selectDispatchedDate();
		qbIncidentCreate.selectDispatchedTime();

		qbIncidentCreate.selectHowPoliceContacted();
		qbIncidentCreate.selectHowPoliceContactedOption();

		qbIncidentCreate.selectReasonForContact();
		qbIncidentCreate.selectReasonForContactOption();

		// Add Location
		qbIncidentCreate.selectLocation();
		qbIncidentCreate.selectLocationOption();
		qbIncidentCreate.selectAddressGroup();
		qbIncidentCreate.selectAddressGroupOption();
		qbIncidentCreate.inputAddress1();
		qbIncidentCreate.inputAddress2();
		qbIncidentCreate.inputCity();
		qbIncidentCreate.inputState();
		qbIncidentCreate.selectCounty();
		qbIncidentCreate.selectCountyOption();
		qbIncidentCreate.inputZipCode();
		// qbIncidentCreate.checkDispatchedLocation();
		qbIncidentCreate.saveQBAndNext();
		Thread.sleep(3000);

		/*
		 * String toastMessage =
		 * driver.findElement(By.className("k-notification-content")).getText();
		 * 
		 * System.out.println("Toast Message is:"+toastMessage);
		 * 
		 * if(actualTitle.equalsIgnoreCase(expectedTitle)) {
		 * Assert.assertEquals(toastMessage, "Information has been saved successfully");
		 * log.info("Incident Created Successfully"); } else {
		 * //Assert.assertTrue(false); log.info("Incident Creation Failed"); }
		 */

	}

	// QuickBook Offense Add Test
	@Test(priority = 3)
	public void createQuickBookOffenseTest() throws InterruptedException {
		/*
		 * String expectedTitle = driver.findElement(By.id("form-header")).getText();
		 * String actualTitle = "Offense Selection"; Assert.assertEquals(expectedTitle,
		 * actualTitle);
		 */
		Thread.sleep(2000);
		QBOffense qbOffense = new QBOffense(driver);
		qbOffense.selectOffenseDate();
		qbOffense.selectOffenseTime();

		qbOffense.selectOffenseLocation();
		qbOffense.selectOffenseLocationOption();

		qbOffense.selectOffenseType();
		qbOffense.selectOffenseTypeOption();

		qbOffense.addOffense();
		Thread.sleep(2000);
		driver.findElements(By.xpath("//button[@onclick='viewModelQuickBookTab.visitVictimTab()']")).get(0).click();

	}

	// QuickBook Create Victim Basic Info
	@Test(priority = 4)
	public void createQuickBookVictimBasicInfo() throws InterruptedException {

		/*
		 * String expVictimHeader =
		 * driver.findElement(By.className("label-warning")).getText(); String
		 * actualVictimHeader = "Victim"; Assert.assertEquals(expVictimHeader,
		 * actualVictimHeader);
		 */
		// button[@onclick='viewModelQuickBookTab.visitVictimTab()']
		// Thread.sleep(4000);

		QBVictim qbVictim = new QBVictim(driver);
		// qbVictim.setVictimFirstName();
		// qbVictim.setVictimLastName();

		// Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("custom-loader")));

		// qbVictim.checkPseudonym();

		// qbVictim.clickDisplayRealName();
		// Thread.sleep(2000);
		// qbVictim.clickConfirm();

		// qbVictim.setPseudoFirstNameVictim();
		// qbVictim.setPseudoLastNameVictim();
		// qbVictim.setPseudoMiddleNameVictim();

		// qbVictim.selectVictimRace();
		// qbVictim.selectVictimRaceOption();

		// qbVictim.selectVictimSex();
		// qbVictim.selectVictimSexOption();

		// qbVictim.setVictimDOB();

		// Thread.sleep(3000);
		qbVictim.saveVictim();

		// Thread.sleep(2000);
		driver.findElements(By.xpath("//button[@onclick='viewModelQuickBookTab.visitSuspectTab()']")).get(0).click();

	}
	/*
	 * // QuickBook Create Suspect Basic Info
	 * 
	 * @Test(priority = 5) public void createQuickBookSuspectBasicInfo() throws
	 * InterruptedException {
	 * 
	 * String expVictimHeader =
	 * driver.findElement(By.className("mail-label.label-danger")).getText(); String
	 * actualVictimHeader = "Suspect"; Assert.assertEquals(expVictimHeader,
	 * actualVictimHeader);
	 * 
	 * Thread.sleep(3000); QBSuspect qbSuspect = new QBSuspect(driver);
	 * qbSuspect.setSuspectFirstName(); qbSuspect.setSuspectLastName();
	 * 
	 * qbSuspect.selectSuspectRace(); qbSuspect.selectSuspectRaceOption();
	 * 
	 * qbSuspect.selectSuspectSex(); qbSuspect.selectSuspectSexOption();
	 * 
	 * qbSuspect.setSuepectDOB(); qbSuspect.selectSuspectEyeColor();
	 * qbSuspect.selectSuspectEyeColorOption();
	 * 
	 * qbSuspect.setSuspectHeightFeet(); qbSuspect.setSuspectHeightInch();
	 * qbSuspect.setSuspectWeight();
	 * 
	 * qbSuspect.selectIdCard(); qbSuspect.selectIdCardOption();
	 * 
	 * qbSuspect.setIdNumber(); qbSuspect.setIdStateCounty();
	 * qbSuspect.selectRelationshipToVictim();
	 * qbSuspect.selectRelationshipToVictimOption();
	 * 
	 * qbSuspect.saveSuspectAndNavigateNext();
	 * 
	 * driver.findElement(By.id("evidence-tab")).click(); String expErrorMessage =
	 * driver.findElement(By.className("k-notification-content")).getText(); String
	 * actualErrorMessage = "Please review Suspect Info. Suspect must be arrested.";
	 * Assert.assertEquals(expErrorMessage, actualErrorMessage);
	 * 
	 * // Suspect Info tab qbSuspect.enabeleSuspectArrestedOnScene();
	 * qbSuspect.enabeleSuspectArrestedOnScene(); qbSuspect.setDateOfArrest();
	 * qbSuspect.setTimeOfArrest(); // Arrest Address Information
	 * 
	 * }
	 * 
	 *//*
		 * //Create Evidence
		 * 
		 * @Test(priority=6) public void createQuickBookEvidence() { QBEvidence
		 * qbEvidence = new QBEvidence(driver); qbEvidence.addEvidence();
		 * qbEvidence.selectEvidenceType(); qbEvidence.selectEvidenceTypeOption();
		 * qbEvidence.selectEvidenceDisposition();
		 * qbEvidence.selectEvidenceDispositionOption();
		 * qbEvidence.collectedFromPerson(); qbEvidence.selectPerson();
		 * qbEvidence.selectPersonOption(); qbEvidence.whereFound();
		 * qbEvidence.weaponDescription(); qbEvidence.wasSeized();
		 * qbEvidence.selectTypeOfWeapon(); qbEvidence.selectTypeOfWeaponOption();
		 * qbEvidence.weaponSerialNumber(); qbEvidence.selectWeaponManufacturer();
		 * qbEvidence.selectWeaponManufacturerOption();
		 * qbEvidence.selectWeaponCaliber(); qbEvidence.selectWeaponCaliberOption();
		 * qbEvidence.collectedBy(); qbEvidence.saveEvidence(); }
		 * 
		 * //QucikBook Offense-1
		 * 
		 * @Test(priority=7) public void createOffense_1() { QBOffense qbOffense = new
		 * QBOffense(driver);
		 * 
		 * }
		 * 
		 * //QucikBook Risk Assessment
		 * 
		 * @Test(priority=8) public void createQBRiskAssessment() { QBRiskAssessment
		 * qbRiskAssessment = new QBRiskAssessment(driver);
		 * qbRiskAssessment.checkFamilyViolence();
		 * qbRiskAssessment.checkThreatenedToKill();
		 * qbRiskAssessment.checkSuspectHasGun(); qbRiskAssessment.checkStrangulation();
		 * qbRiskAssessment.checkViolence(); qbRiskAssessment.checkJealousy();
		 * qbRiskAssessment.checkControlling();
		 * qbRiskAssessment.checkViolenceIncreased();
		 * qbRiskAssessment.checkDestroyedItems(); qbRiskAssessment.checkHurtPets();
		 * qbRiskAssessment.checkUnemployed(); qbRiskAssessment.checkSuicidal();
		 * qbRiskAssessment.checkspying(); qbRiskAssessment.checkThreateningMessages();
		 * qbRiskAssessment.checkAlcoholAbuse(); qbRiskAssessment.checkDrugsUse();
		 * qbRiskAssessment.checkMightKillYou(); qbRiskAssessment.checkforcedSex();
		 * qbRiskAssessment.checkSeparation(); qbRiskAssessment.checkRecentSeparation();
		 * qbRiskAssessment.checkUnrelatedChild();
		 * qbRiskAssessment.checkPriorContacts(); qbRiskAssessment.checkCourtAction();
		 * qbRiskAssessment.inputAdditionalInfo();
		 * qbRiskAssessment.inputPriorProtectiveOrder();
		 * qbRiskAssessment.inputDateTimeRiskAss();
		 * qbRiskAssessment.saveRiskAssessmentAndNext(); }
		 * 
		 * 
		 * @Test(priority=9) public void createEPORequest() { //String pageSource =
		 * driver.getPageSource();
		 * 
		 * String expTitle = "EPO Request"; String actualTitle =
		 * driver.findElement(By.id("form-header")).getText();
		 * Assert.assertEquals(expTitle, actualTitle);
		 * 
		 * driver.findElement(By.xpath(
		 * "//button[@onclick='getEPODataVM.navigateToEPO()']")).click();
		 * 
		 * }
		 */

}
