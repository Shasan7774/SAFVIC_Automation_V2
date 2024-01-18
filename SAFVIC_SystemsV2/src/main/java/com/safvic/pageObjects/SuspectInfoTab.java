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


public class SuspectInfoTab {
	WebDriver ldriver;

	public SuspectInfoTab(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}//li[@id='suspect-nav-item']

	//Suspect Info 
	@FindBy(how = How.XPATH, using = "//a[@id='suspect_tab']")
	@CacheLookup
	WebElement tabSuspectInfo;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='SuspectOnScene_label']/span")
	@CacheLookup
	WebElement suspectWasOnScene;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='SuspectArrested_label']/span")
	@CacheLookup
	WebElement suspectWasArrestedOnScene;

	@FindBy(how = How.XPATH, using = "//input[@id='DateOfArr']")
	@CacheLookup
	WebElement dateOfArrest;

	@FindBy(how = How.XPATH, using = "//input[@id='TimeOfArr']") 
	@CacheLookup
	WebElement timeOfArrest;

	@FindBy(how = How.XPATH, using = "//input[@id='DateOfBook']") 
	@CacheLookup 
	WebElement dateOfBooking;

	@FindBy(how = How.XPATH, using = "//input[@id='TimeOfBook']")
	@CacheLookup
	WebElement timeOfBooking;
	
	//Copy Location
	@FindBy(how = How.XPATH, using = "//button[@data-target='#ArrestAddressCopy']")
	@CacheLookup
	WebElement btnCopyFromLocation;

	@FindBy(how = How.XPATH, using = "(//input[@aria-label='Select row'])[1]")
	@CacheLookup
	WebElement checkLocation;
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='copyAddress_ArrestAddressCopy ()']")
	@CacheLookup
	WebElement btnCopyLocation; 
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='viewModelSuspect.saveData()']")
	@CacheLookup
	WebElement btnSaveSuspectTab;
	
	//Suspect Info
	public void navigateToSuspectTab() {
		tabSuspectInfo.click();
	}
	
	public void enabeleSuspectOnScene() {
		suspectWasOnScene.click();
	}
	public void enabeleSuspectArrestedOnScene() {
		suspectWasArrestedOnScene.click();
	}
	public void setDateOfArrest() {
		dateOfArrest.sendKeys("t");
	}
	
	public void setTimeOfArrest() {
		timeOfArrest.sendKeys("t");
	}
	
	public void setDateOfBooking() {
		dateOfBooking.sendKeys("t");
	}
	
	public void setTimeOfBooking() {
		timeOfBooking.sendKeys("t");
	}
	
	//Arrest Address Information  
	public void copyFromLocation() {
		btnCopyFromLocation.click();
	}
	
	public void selectLocation() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(checkLocation));
		checkLocation.click();
	}
	
	public void copyLocation() {
		btnCopyLocation.click();
	}
	
	public void saveSuspectTabInfo() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(btnSaveSuspectTab));
		btnSaveSuspectTab.click();
	}
	

}
