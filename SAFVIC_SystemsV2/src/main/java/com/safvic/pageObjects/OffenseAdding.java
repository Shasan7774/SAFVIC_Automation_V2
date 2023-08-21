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
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='IncidentPersonId_listbox']/span")
	@CacheLookup
	WebElement selectSuspect;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='IncidentPersonId_listbox']/li[@data-offset-index='0']")
	@CacheLookup						
	WebElement selectSuspectOption;

	@FindBy(how = How.XPATH, using = "//span[@aria-owns='VictimId_listbox']/span")
	@CacheLookup
	WebElement selectVictim;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='VictimId_listbox']/li[@data-offset-index='0']")
	@CacheLookup						
	WebElement selectVictimOption;
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'DateOfOff']")
	@CacheLookup						
	WebElement dateOfoffense;
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'TimeOfOff']")
	@CacheLookup						
	WebElement timeOfOffense;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='IncidentLocationId_listbox']/span")
	@CacheLookup						
	WebElement selectOffenseLocation;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='IncidentLocationId_listbox']/li[@data-offset-index='0']")
	@CacheLookup						
	WebElement selectOffenseLocationOption;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='offenseType_listbox']/span")
	@CacheLookup						
	WebElement selectOffenseType;

	@FindBy(how = How.XPATH, using = "//ul[@id='offenseType_listbox']/li[@data-offset-index='0']")
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
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectSuspect));
		selectSuspect.click();
	}
	
	public void selectSuspectOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectSuspectOption));
		selectSuspectOption.click();
	}
	
	public void selectVictim() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectVictim));
		selectVictim.click();
	}
	
	public void selectVictimOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectVictimOption));
		selectVictimOption.click();
	}
	
	public void setDateOfOffense() {
		dateOfoffense.sendKeys("t");
	}
	
	public void setTimeOfOffense() {
		timeOfOffense.sendKeys("t");
	}
	
	public void selectOffenseLocation() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectOffenseLocation));
		selectOffenseLocation.click();
	}
	
	public void selectOffenseLocationOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectOffenseLocationOption));
		selectOffenseLocationOption.click();
	}
	
	public void selectOffenseType() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectOffenseType));
		selectOffenseType.click();
	}
	
	public void selectOffenseTypeOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectOffenseTypeOption));
		selectOffenseTypeOption.click();
	}
	
	public void saveOffenseGroup() {
		btnSaveOffense.click();
	}

}
