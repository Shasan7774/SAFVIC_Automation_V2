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


public class OffenseAdding {
	WebDriver ldriver;
	
	public OffenseAdding(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.XPATH, using="//span[normalize-space()='Offenses']")
	@CacheLookup
	WebElement tabOffense;
	
	@FindBy(how =How.XPATH, using="//a[normalize-space()='Add Offense Group']")
	@CacheLookup
	WebElement btnAddOffenseGroup;
	
	//modify
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='AddressTypeId_listbox']/span")
	@CacheLookup
	WebElement selectSuspect;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='AddressTypeId_listbox']/li[text()='Residence/Home']")
	@CacheLookup						
	WebElement selectSuspectOption;
	//modify
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='AddressTypeId_listbox']/span")
	@CacheLookup
	WebElement selectVictim;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='AddressTypeId_listbox']/li[text()='Residence/Home']")
	@CacheLookup						
	WebElement selectVictimOption;
	//----------------------------
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup						
	WebElement dateOfoffense;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup						
	WebElement timeOfOffense;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup						
	WebElement selectOffenseLocation;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup						
	WebElement selectOffenseLocationOption;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup						
	WebElement selectOffenseType;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup						
	WebElement selectOffenseTypeOption;
	
	@FindBy(how = How.XPATH, using = "//div/button[@type='submit']")
	@CacheLookup
	WebElement btnSaveOffense;
	
	public void navigateOffenseTab() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(tabOffense));
		tabOffense.click();
	}
	
	public void addOffenseGroup() {
		btnAddOffenseGroup.click();
	}
	
	public void selectSuspect() {
		selectSuspect.click();
	}
	
	public void selectSuspectOption() {
		selectSuspectOption.click();
	}
	
	public void selectVictim() {
		selectSuspect.click();
	}
	
	public void selectVictimOption() {
		selectSuspectOption.click();
	}
	
	public void setDateOfOffense() {
		dateOfoffense.sendKeys("t");
	}
	
	public void setTimeOfOffense() {
		timeOfOffense.sendKeys("t");
	}
	
	public void selectOffenseLocation() {
		selectOffenseLocation.click();
	}
	
	public void selectOffenseLocationOption() {
		selectOffenseLocationOption.click();
	}
	
	public void selectOffenseType() {
		selectOffenseType.click();
	}
	
	public void selectOffenseTypeOption() {
		selectOffenseTypeOption.click();
	}
	
	public void saveOffenseGroup() {
		btnSaveOffense.click();
	}

}
