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


public class Vehicles {
	WebDriver ldriver;
	
	public Vehicles(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.XPATH, using="//span[normalize-space()='Vehicles']")
	@CacheLookup
	WebElement tabVehicles;
	
	@FindBy(how =How.XPATH, using="//a[normalize-space()='Add Vehicle']")
	@CacheLookup
	WebElement btnAddVehicle;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='IncidentPersonId_listbox']/span")
	@CacheLookup
	WebElement selectOwner;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='IncidentPersonId_listbox']/li[@data-offset-index='0']")
	@CacheLookup						
	WebElement selectOwnerOption;
	
	@FindBy(how = How.ID , using = "Make")
	@CacheLookup						
	WebElement txtMake;
	
	@FindBy(how = How.ID , using = "Year")
	@CacheLookup						
	WebElement txtYear;
	
	@FindBy(how = How.ID , using = "Model")
	@CacheLookup						
	WebElement txtModel;
	
	@FindBy(how = How.ID , using = "BodyStyle")
	@CacheLookup						
	WebElement txtBodyStyle;
	
	@FindBy(how = How.ID , using = "Color")
	@CacheLookup						
	WebElement txtColor;
	
	@FindBy(how = How.ID , using = "LicensePlateNo")
	@CacheLookup						
	WebElement txtLicensePlateNo;
	
	@FindBy(how = How.ID , using = "State")
	@CacheLookup						
	WebElement txtState;
	
	@FindBy(how = How.ID , using = "PlateYear")
	@CacheLookup						
	WebElement txtPlateYear;
	
	@FindBy(how = How.ID , using = "VIN")
	@CacheLookup						
	WebElement txtVIN;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='Impounded_label']")
	@CacheLookup						
	WebElement checkImpounded;
	
	@FindBy(how = How.ID , using = "TowedBy")
	@CacheLookup						
	WebElement txtTowedBy;
	
	@FindBy(how = How.ID , using = "StoredAt")
	@CacheLookup						
	WebElement txtStoredAt;
	
	@FindBy(how = How.ID , using = "Condition")
	@CacheLookup						
	WebElement txtCondition;
	
	@FindBy(how = How.ID , using = "//span[@aria-labelledby='OnHold_label']")
	@CacheLookup						
	WebElement checkOnHold;
	
	@FindBy(how = How.ID , using = "ReasonForHold")
	@CacheLookup						
	WebElement txtReasonForHold;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='Photographed_label']")
	@CacheLookup						
	WebElement checkPhotographed_label;
	
	@FindBy(how = How.XPATH, using = "//div/button[@type='submit']")
	@CacheLookup						
	WebElement btnSaveVehicle;

	public void navigateVehicle() {
		btnAddVehicle.click();
	}
	
	public void addVehicle() {
		tabVehicles.click();
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
	
	public void checkImpounded() {
		checkImpounded.click();
	}
	
	public void inputTowedBy() {
		txtModel.sendKeys("Test Towed By");
	}
	
	public void inputStoredAt() {
		txtStoredAt.sendKeys("Test Stored At Texas Police Station");
	}
	
	public void inputVehicleCondition() {
		txtCondition.sendKeys("Test Vehicle Condition");
	}
	
	public void checkOnHold() {
		checkOnHold.click();
	}
	
	public void inputReasonForHold() {
		checkOnHold.sendKeys("Test On Hold");
	}
	
	public void checkPhotographed_label() {
		checkOnHold.sendKeys("Test Photographed label");
	}
	
	public void saveVehicle() {
		btnSaveVehicle.click();
	}

}
