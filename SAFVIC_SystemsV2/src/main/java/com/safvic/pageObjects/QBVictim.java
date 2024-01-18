package com.safvic.pageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class QBVictim {
	WebDriver ldriver;

	public QBVictim(WebDriver rdriver){
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

	//Pseudonym
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='VictimAlias_label']/span")
	@CacheLookup
	WebElement checkVictimPseudonym;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary mb-1']")
	@CacheLookup
	WebElement btnDisplyEditRealName;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Confirm']")
	@CacheLookup
	WebElement btnConfirmPseudonym;

	@FindBy(how = How.XPATH, using = "//input[@id='VictimRealFirstName']")
	@CacheLookup
	WebElement txtPseudoRealFirstName;

	@FindBy(how = How.XPATH, using = "//input[@id='VictimRealLastName']")
	@CacheLookup
	WebElement txtPseudoRealLastName;

	@FindBy(how = How.XPATH, using = "//input[@id='VictimRealMiddleName']")
	@CacheLookup
	WebElement txtPseudoRealMiddleName;

	//Race & Sex
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='RaceId_label']/span")
	@CacheLookup
	WebElement selectRace;

	//@FindBy(how = How.XPATH, using = "//ul[@id='RaceId_listbox']/li[text()='Black']")
	@FindBy(how = How.XPATH, using = "//ul[@id='RaceId_listbox']/li[@data-offset-index='0']")
	@CacheLookup						
	WebElement selectRaceOption;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='SexId_label']/span")
	@CacheLookup
	WebElement selectSex;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='SexId_listbox']/li[@data-offset-index='0']")
	//@FindBy(how = How.XPATH, using = "//ul[@id='SexId_listbox']/li[text()='Male']")
	@CacheLookup
	WebElement selectSexOption;

	@FindBy(how = How.XPATH, using = "//input[@id='DateOfBirth']")
	@CacheLookup
	WebElement personDOB;

	@FindBy(how = How.XPATH, using = "//button[@onclick='viewModelVictim.nextTab()']")
	@CacheLookup
	WebElement btnVictimSaveAndNext;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btn-submit-victim']")
	@CacheLookup
	WebElement btnSaveVictim;

	public void setVictimFirstName() {
		personFirstName.sendKeys("Test Victim First Name");
	}

	public void setVictimLastName() {
		personLastName.sendKeys("Victim Last Name");
	}

	public void checkPseudonym() {
		Actions actions = new Actions(ldriver);
		actions.moveToElement(checkVictimPseudonym).click().perform();
		
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(checkVictimPseudonym));
		checkVictimPseudonym.click();
	}

	public void clickDisplayRealName() {
		btnDisplyEditRealName.click();
	}

	public void clickConfirm() {
		btnConfirmPseudonym.click();
	}

	public void setPseudoFirstNameVictim() {
		txtPseudoRealFirstName.sendKeys("Test Victim Real First Name");
	}

	public void setPseudoLastNameVictim() {
		txtPseudoRealLastName.sendKeys("Test Victim Real Last Name");
	}

	public void setPseudoMiddleNameVictim() {
		txtPseudoRealMiddleName.sendKeys("Test Victim Real Middle Name");
	}

	public void selectVictimRace() {
		//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		//wait.until(ExpectedConditions.elementToBeClickable(selectRace));
		selectRace.click();
	}

	public void selectVictimRaceOption() {
		//WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		//wait.until(ExpectedConditions.elementToBeClickable(selectRaceOption));
		selectRaceOption.click();
	}

	public void selectVictimSex() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectSex));
		selectSex.click();
	}

	public void selectVictimSexOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectSexOption));
		selectSexOption.click();
	}

	public void setVictimDOB() {
		personDOB.sendKeys("t");
	}

	public void saveVictimAndNavigateNext() {
		btnVictimSaveAndNext.click();
	}
	
	public void saveVictim() {
		btnSaveVictim.click();
	}

}
