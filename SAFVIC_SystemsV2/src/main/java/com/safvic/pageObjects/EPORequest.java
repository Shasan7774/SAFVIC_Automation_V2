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


public class EPORequest {
	WebDriver ldriver;
	
	public EPORequest(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.XPATH, using="//span[normalize-space()='EPO/BOOKING']")
	@CacheLookup
	WebElement tabEPORequest;
	
	@FindBy(how =How.XPATH, using="//a[normalize-space()='Create EPO request']")
	@CacheLookup
	WebElement btnCreateEPOReqest;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='IncidentOffGrpId_listbox']/span")
	@CacheLookup
	WebElement selectOffenseGroup;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='IncidentOffGrpId_listbox']/li[@data-offset-index='0']")
	@CacheLookup						
	WebElement selectOffenseGroupOption;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='EPORequesterV_label']")
	@CacheLookup						
	WebElement toggleRequestedByVictim;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='EPORequesterG_label']")
	@CacheLookup						
	WebElement toggleRequestedByGuardian;
	
	@FindBy(how = How.ID , using = "RequesterGNameId")
	@CacheLookup						
	WebElement txtGuardianName;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='EPORequesterO_label']")
	@CacheLookup						
	WebElement toggleRequestedByOfficer;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='EPORequesterS_label']")
	@CacheLookup						
	WebElement toggleRequestedByState;
	
	@FindBy(how = How.ID , using = "RequesterSNameId")
	@CacheLookup						
	WebElement txtStateAttorneyName;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='EPORequesterMagistrate_label']")
	@CacheLookup						
	WebElement toggleRequestedByMagistrate;
	
	@FindBy(how = How.ID , using = "RequesterMagistrateNameId")
	@CacheLookup						
	WebElement txtMagistrateName;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='HoldRequested_label']")
	@CacheLookup						
	WebElement toggleHoldRequested;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='TwentyFour_label']")
	@CacheLookup						
	WebElement toggle24HoldRequested; 
	
	@FindBy(how = How.ID , using = "ExplainHold")
	@CacheLookup						
	WebElement txtExplainHold;
	
	@FindBy(how = How.XPATH, using = "//div/button[@onclick='viewModel.saveData()']")
	@CacheLookup						
	WebElement btnSaveEPORequest;
	
	@FindBy(how = How.XPATH, using = "//a[text()='EPO Request Documents']")
	@CacheLookup						
	WebElement btnEPORequestDocuments;
	
	@FindBy(how = How.XPATH, using = "//input[@aria-label='Select all rows']")
	@CacheLookup						
	WebElement chkAllAdditionalForms;
	
	@FindBy(how = How.ID , using = "generate-req-button")
	@CacheLookup						
	WebElement btnGenerateRequest;
	
	@FindBy(how = How.ID , using = "epo-forms-table")
	@CacheLookup						
	WebElement tableGeneratedEPOForms;
	
	@FindBy(how = How.XPATH, using = "//a[text()='SEND EPO REQUEST']")
	@CacheLookup						
	WebElement btnSendEPORequest;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='organizationId_listbox']/span")
	@CacheLookup						
	WebElement selectJudicialOrganization;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='organizationId_listbox']/li[@data-offset-index='1']")
	@CacheLookup						
	WebElement selectJudicialOrganizationOption;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success']")
	@CacheLookup						
	WebElement btnSendWithoutSigning;
	
	@FindBy(how = How.XPATH, using = "//a[text()='SEND WITH SIGNING']")
	@CacheLookup						
	WebElement btnSendWithSigning;
	
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Signer Name'])[2]")
	@CacheLookup						
	WebElement txtWitnessName;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup						
	WebElement selectJudge;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup						
	WebElement selectJudgeOption;
	
	@FindBy(how = How.ID, using = "create-signing-request")
	@CacheLookup						
	WebElement btnCreateSigningRequest;
	
	public void navigateEPORequest() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(tabEPORequest));
		tabEPORequest.click();
	}
	
	public void createEPORequest() {
		btnCreateEPOReqest.click();
	}
	
	public void selectOffenseGroup() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectOffenseGroup));
		selectOffenseGroup.click();
	}
	
	public void selectOffenseGroupOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectOffenseGroupOption));
		selectOffenseGroupOption.click();
	}
	
	public void enableRequestedByVictim() {
		toggleRequestedByVictim.click();
	}
	
	public void enableRequestedByGuardian() {
		toggleRequestedByGuardian.click();
	}
	
	public void inputGuardianName() {
		txtGuardianName.sendKeys("Test Guardian Name");
	}
	
	public void enableRequestedByOfficer() {
		toggleRequestedByOfficer.click();
	}
	
	public void enableRequestedByState() {
		toggleRequestedByState.click();
	}
	
	public void inputStateAttorneyName() {
		txtStateAttorneyName.sendKeys("Test State Attorney Name");
	}
	
	public void enableRequestedByMagistrate() {
		 toggleRequestedByMagistrate.click();
	}
	
	public void inputMagistrateName() {
		txtMagistrateName.sendKeys("Test Magistrate Name");
	}
	
	public void enableHoldRequested() {
		toggleHoldRequested.click();
	}
	
	public void enable24HoldRequested() {
		toggle24HoldRequested.click();
	}
	
	public void inputExplainHold() {
		txtExplainHold.sendKeys("Test Explain Hold");
	}
	
	public void saveEPORequest() {
		btnSaveEPORequest.click();
	}
	
	public void generateEPORequestDocs() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(btnEPORequestDocuments));
		btnEPORequestDocuments.click();
	}
	
	public void includeAdditionalForms() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(chkAllAdditionalForms));
		chkAllAdditionalForms.click();
	}
	
	public void generateRequest() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(btnGenerateRequest));
		btnGenerateRequest.click();
	}
	
	public void validateGeneratedEPOFormsTable() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(tableGeneratedEPOForms));
		tableGeneratedEPOForms.isDisplayed();
	}
	
	public void sendEPORequest() {
		btnSendEPORequest.click();
	}
	
	public void selectJudicialOrganization() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectJudicialOrganization));
		selectJudicialOrganization.click();
	}
	
	public void selectJudicialOrganizationOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectJudicialOrganizationOption));
		selectJudicialOrganizationOption.click();;
	}
	
	public void sendEPOReqWithoutSigning() {
		btnSendWithSigning.click();;
	}
	
}
