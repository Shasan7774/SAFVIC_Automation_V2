package com.safvic.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IncidentUpdate {
	WebDriver ldriver;

	public IncidentUpdate(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Incident']")
	@CacheLookup
	WebElement linkIncidentUpdate;

	@FindBy(how = How.CSS, using = "#District")
	@CacheLookup
	WebElement txtDistrict;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='InvolvesChildren_label']/span")
	@CacheLookup
	WebElement checkChildrenInvolved;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='RequiresCPSNot_label']/span")
	@CacheLookup
	WebElement checkRequiresCPS;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='CPSCalled_label']/span")
	@CacheLookup
	WebElement checkCpsCalled;

	@FindBy(how = How.XPATH, using = "//input[@id='CPSNumber']")
	@CacheLookup
	WebElement txtCPSNumber;

	@FindBy(how = How.XPATH, using = "//input[@id='CPSNotifedAt']")
	@CacheLookup
	WebElement dateCPSNotified;

	@FindBy(how = How.XPATH, using = "//textarea[@id='CPSSafetyIssues']")
	@CacheLookup
	WebElement txtCPSSafetyIssues;

	@FindBy(how = How.CSS, using = "#OfficerPrimaryConcern")
	@CacheLookup
	WebElement txtOfficerConcern;

	@FindBy(how = How.CSS, using = "#SuspectedMethManufacture")
	@CacheLookup
	WebElement txtSuspectedMeth;

	@FindBy(how = How.CSS, using = "#SensitiveIssues")
	@CacheLookup
	WebElement txtSensitiveIssues;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='Covid19_label']/span")
	@CacheLookup
	WebElement toggleCovid19;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='ReasonForContactId_label']/span")
	@CacheLookup
	WebElement selectHowPoliceContacted;

	@FindBy(how = How.XPATH, using = "//ul[@id='ReasonForContactId_listbox']/li[text()='911 call from within location']")
	@CacheLookup
	WebElement selectHowPoliceContactedOption;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='ReportedId_label']/span")
	@CacheLookup
	WebElement selectReasonForContact;

	@FindBy(how = How.XPATH, using = "//ul[@id='ReportedId_listbox']/li[text()='911 call hang-up']")
	@CacheLookup
	WebElement selectReasonForContactOption;

	@FindBy(how = How.CSS, using = "#DispatchedDate")
	@CacheLookup
	WebElement selectDispatchedDate;

	@FindBy(how = How.CSS, using = "#DispatchedTime")
	@CacheLookup
	WebElement selectDispatchedTime;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success']")
	@CacheLookup
	WebElement btnSave;

	public void navigateIncidentUpdate() {
		linkIncidentUpdate.click();
	}

	public void setDistrictInfo() {
		txtDistrict.sendKeys("Test District Name");
	}

	public void enableChildrenInvolved() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(checkChildrenInvolved));
		checkChildrenInvolved.click();
	}

	public void enableRequiresCPS() {
		checkRequiresCPS.click();
	}

	public void enableCPSCalled() {
		checkCpsCalled.click();
	}

	public void txtCPSNumber() {
		txtCPSNumber.sendKeys("Test CPS Number");
	}

	public void dateCPSNotified() {
		dateCPSNotified.sendKeys("t");
	}

	public void txtCPSSafetyIssues() {
		txtCPSSafetyIssues.sendKeys("Test CPS Safety Issues");
	}

	public void setOfficerPrimaryConcern() {
		txtOfficerConcern.sendKeys("Test Officer Primary Concern");
	}

	public void setSuspectedMethManufacture() {
		txtSuspectedMeth.sendKeys("Test Suspect Meth Manufacture");
	}

	public void setSensitiveIssues() {
		txtSensitiveIssues.sendKeys("Test Sensitive Issues");
	}

	public void enableCovidExposure() {
		toggleCovid19.click();
	}

	public void selectHowPoliceContacted() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectHowPoliceContacted));
		selectHowPoliceContacted.click();
	}

	public void selectHowPoliceContactedOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectHowPoliceContactedOption));
		selectHowPoliceContactedOption.click();
	}

	public void selectReasonForContact() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectReasonForContact));
		selectReasonForContact.click();
	}

	public void selectReasonForContactOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectReasonForContactOption));
		selectReasonForContactOption.click();
	}

	public void selectDispatchedDate() {
		selectDispatchedDate.sendKeys("t");
	}

	public void selectDispatchedTime() {
		selectDispatchedTime.sendKeys("t");
	}

	public void saveIncidentUpdate() {
		btnSave.click();
	}

}
