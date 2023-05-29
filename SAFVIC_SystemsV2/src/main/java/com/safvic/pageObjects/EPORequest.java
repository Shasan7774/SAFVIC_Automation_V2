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
	
	@FindBy(how = How.XPATH, using = "(//a[normalize-space()='EPO Request Documents'])[1]")
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
	/*
	@FindBy(how = How.ID , using = "//a[normalize-space()='SEND EPO REQUEST']")
	@CacheLookup						
	WebElement btnSendEPORequest;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='SEND EPO REQUEST']")
	@CacheLookup						
	WebElement btnSendEPORequest;
	
	
	
	
	
	

	public void navigateVehicle() {
		tabVehicles.click();
	}
	
	public void addVehicle() {
		btnAddVehicle.click();
	}
	
	public void selectVehicleOwner() {
		selectOwner.click();
	}
	
	public void selectVehicleOwnerOption() {
		selectOwnerOption.click();
	}
	
	public void inputVehicleMake() {
		txtMake.sendKeys("2020");
	}
	
	public void inputVehicleYear() {
		txtYear.sendKeys("2021");
	}
	
	public void inputVehicleModel() {
		txtModel.sendKeys("2022");
	}
	
	public void inputVehicleBodyStyle() {
		txtBodyStyle.sendKeys("Ford");
	}
	
	public void inputVehicleColor() {
		txtColor.sendKeys("Black");
	}
	
	public void inputVehicleLicensePlateNo() {
		txtLicensePlateNo.sendKeys("GA-121212");
	}
	
	public void inputVehicleState() {
		txtState.sendKeys("Texas");
	}
	
	public void inputVehiclePlateYear() {
		txtPlateYear.sendKeys("2023");
	}
	
	public void inputVehicleVIN() {
		txtVIN.sendKeys("VIN:123123");
	}
	
	public void enableImpounded() {
		toggleImpounded.click();
	}
	
	public void inputTowedBy() {
		txtTowedBy.sendKeys("Test Towed By");
	}
	
	public void inputStoredAt() {
		txtStoredAt.sendKeys("Test Stored At Texas Police Station");
	}
	
	public void inputVehicleCondition() {
		txtCondition.sendKeys("Test Vehicle Condition");
	}
	
	public void enableOnHold() {
		toggleOnHold.click();
	}
	
	public void inputReasonForHold() {
		txtReasonForHold.sendKeys("Test On Hold");
	}
	
	public void enablePhotographed() {
		togglePhotographed.click();
	}
	
	public void saveVehicle() {
		btnSaveVehicle.click();
	}
*/
}
