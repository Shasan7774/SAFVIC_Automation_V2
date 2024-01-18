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


public class QBSuspect {
	WebDriver ldriver;

	public QBSuspect(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}

	//Basic Info
	@FindBy(how = How.XPATH, using = "//input[@id='FirstName']")
	@CacheLookup
	WebElement personFirstName;

	@FindBy(how = How.XPATH, using = "//input[@id='LastName']")
	@CacheLookup
	WebElement personLastName;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='RaceId_label']/span")
	@CacheLookup
	WebElement selectRace;

	@FindBy(how = How.XPATH, using = "//ul[@id='RaceId_listbox']/li[text()='Black']")
	@CacheLookup						
	WebElement selectRaceOption;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='SexId_label']/span")
	@CacheLookup
	WebElement selectSex;

	@FindBy(how = How.XPATH, using = "//ul[@id='SexId_listbox']/li[text()='Male']")
	@CacheLookup
	WebElement selectSexOption;

	@FindBy(how = How.XPATH, using = "//input[@id='DateOfBirth']")
	@CacheLookup
	WebElement personDOB;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='EyeColorId_label']/span")
	@CacheLookup
	WebElement selectEyeColor;

	@FindBy(how = How.XPATH, using = "//ul[@id='EyeColorId_listbox']/li[text()='Black']")
	@CacheLookup						
	WebElement selectEyeColorOption;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='HairColorId_label']/span")
	@CacheLookup
	WebElement selectHairColor;

	@FindBy(how = How.XPATH, using = "//ul[@id='HairColorId_listbox']/li[text()='Gray']")
	@CacheLookup						
	WebElement selectHairColorOption;

	@FindBy(how = How.XPATH, using = "//input[@id='HeightFt']")
	@CacheLookup
	WebElement txtHeightFeet;

	@FindBy(how = How.XPATH, using = "//input[@id='HeightIn']")
	@CacheLookup
	WebElement txtHeightInch;

	@FindBy(how = How.XPATH, using = "//input[@id='Weight']")
	@CacheLookup
	WebElement txtWeight;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='PersonIDTypeId_label']/span")
	@CacheLookup
	WebElement selectIdCard;

	@FindBy(how = How.XPATH, using = "//ul[@id='PersonIDTypeId_listbox']/li[text()='Passport']")
	@CacheLookup						
	WebElement selectIdCardOption;

	@FindBy(how = How.XPATH, using = "//input[@id='IDCardNo']")
	@CacheLookup
	WebElement txtIDNo;

	@FindBy(how = How.XPATH, using = "//input[@id='IDCardNoState']")
	@CacheLookup
	WebElement txtIDCardNoState;

	@FindBy(how = How.XPATH, using = "//div[@role='listbox']")
	@CacheLookup
	WebElement selectRelationship;

	@FindBy(how = How.XPATH, using = "//ul[@id='Relation_RelationShipNames_listbox']/li[text()='Spouse']")
	@CacheLookup						
	WebElement selectRelationshipOption;

	@FindBy(how = How.XPATH, using = "//button[@onclick='viewModelVictim.nextTab()']")
	@CacheLookup
	WebElement btnSuspectSaveAndNext;

	//Suspect Info 
	@FindBy(how = How.XPATH, using = "//a[@id='suspect-info_tab']")
	@CacheLookup
	WebElement tabSuspectInfo;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='SuspectOnScene_label']/span")
	@CacheLookup
	WebElement suspectWasOnScene;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='SuspectArrestedl']/span")
	@CacheLookup
	WebElement suspectWasArrestedOnScene;

	@FindBy(how = How.ID, using = "DateOfArr")
	@CacheLookup
	WebElement dateOfArrest;

	@FindBy(how = How.ID, using = "TimeOfArr")
	@CacheLookup
	WebElement timeOfArrest;

	@FindBy(how = How.ID, using = "DateOfBook")
	@CacheLookup
	WebElement dateOfBooking;

	@FindBy(how = How.ID, using = "TimeOfBook")
	@CacheLookup
	WebElement timeOfBooking;

	@FindBy(how = How.XPATH, using = "//button[@data-target='#ArrestAddressCopy']")
	@CacheLookup
	WebElement btnCopyLocation;

	@FindBy(how = How.XPATH, using = "/input[@aria-label='Select row']")
	@CacheLookup
	WebElement checkLocation;

	public void setSuspectFirstName() {
		personFirstName.sendKeys("Test Suspect First Name");
	}

	public void setSuspectLastName() {
		personLastName.sendKeys("Test Suspect Last Name");
	}

	public void selectSuspectRace() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectRace));
		selectRace.click();
	}

	public void selectSuspectRaceOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectRaceOption));
		selectRaceOption.click();
	}

	public void selectSuspectSex() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectSex));
		selectSex.click();
	}

	public void selectSuspectSexOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectSexOption));
		selectSexOption.click();
	}

	public void setSuepectDOB() {
		personDOB.sendKeys("t");
	}

	public void selectSuspectEyeColor() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectEyeColor));
		selectEyeColor.click();
	}

	public void selectSuspectEyeColorOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectEyeColorOption));
		selectEyeColorOption.click();
	}

	public void selectSuspectHairColor() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectHairColor));
		selectHairColor.click();
	}

	public void selectSuspectHairColorOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectHairColorOption));
		selectHairColorOption.click();
	}

	public void setSuspectHeightFeet() {
		txtHeightFeet.sendKeys("4");
	}

	public void setSuspectHeightInch() {
		txtHeightInch.sendKeys("4");
	}

	public void setSuspectWeight() {
		txtWeight.sendKeys("50");
	}

	public void selectIdCard() {
		selectIdCard.click();
	}

	public void selectIdCardOption() {
		selectIdCardOption.click();
	}

	public void setIdNumber() {
		txtIDNo.sendKeys("1212321133");
	}

	public void setIdStateCounty() {
		txtIDCardNoState.sendKeys("Texas");
	}

	public void selectRelationshipToVictim() {
		selectRelationship.click();
	}

	public void selectRelationshipToVictimOption() {
		selectRelationshipOption.click();
	}

	public void saveSuspectAndNavigateNext() {
		btnSuspectSaveAndNext.click();
	}

	//Suspect Info
	public void enabeleSuspectOnScene() {
		suspectWasOnScene.click();
	}
	public void enabeleSuspectArrestedOnScene() {
		suspectWasArrestedOnScene.click();//fix
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




}
