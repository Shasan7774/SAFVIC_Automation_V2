package com.safvic.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuickCreatePeople {
	WebDriver ldriver;

	public QuickCreatePeople(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='People']")
	@CacheLookup
	WebElement navigatePeople;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Add Person']")
	@CacheLookup
	WebElement btnAddPerson;

	// People Basic Info
	@FindBy(how = How.XPATH, using = "//input[@id='FirstName']")
	@CacheLookup
	WebElement personFirstName;

	@FindBy(how = How.XPATH, using = "//input[@id='LastName']")
	@CacheLookup
	WebElement personLastName;

	@FindBy(how = How.XPATH, using = "//input[@id='MiddleName']")
	@CacheLookup
	WebElement personMiddleName;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='Alias_label']/span")
	@CacheLookup
	WebElement checkAlias;

	@FindBy(how = How.XPATH, using = "//input[@id='AliasDesc']")
	@CacheLookup
	WebElement txtAliasDescription;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='Victim_label']/span")
	@CacheLookup
	WebElement checkVictim;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='Suspect_label']/span")
	@CacheLookup
	WebElement checkSuspect;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='Witness_label']/span")
	@CacheLookup
	WebElement checkWitness;
	
    //victim would like to use Pseudonym
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='VictimAlias_label']/span")
	@CacheLookup
	WebElement checkVictimPseudonym;

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

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='Unknown_label']/span")
	@CacheLookup
	WebElement checkUnknownPerson;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='RaceId_label']/span")
	@CacheLookup
	WebElement selectRace;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='RaceId_listbox']/li[text()='Am Indian']")
	@CacheLookup
	WebElement selectRaceOption;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='SexId_label']/span")
	@CacheLookup
	WebElement selectSex;

	@FindBy(how = How.XPATH, using = "//input[@id='DateOfBirth']")
	@CacheLookup
	WebElement personDOB;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Age']")
	@CacheLookup
	WebElement personAge;

	@FindBy(how = How.XPATH, using = "//*[text()='Save & Show More']")
	@CacheLookup
	WebElement btnSaveShowMore;

	public void navigatePeople() {
		navigatePeople.click();
	}

	public void clickAddPerson() {
		btnAddPerson.click();
	}

	public void setPersonFirstName() {
		personFirstName.sendKeys("Test First Name");
	}

	public void setPersonLastName() {
		personLastName.sendKeys("Test Last Name");
	}

	public void setPersonMiddleName() {
		personMiddleName.sendKeys("Test Middle Name");
	}

	public void enableAlias() {
		checkAlias.click();
	}

	public void setAliasName() {
		txtAliasDescription.sendKeys("Test Alias Name");
	}

	public void checkPersonVictim() {
		checkVictim.click();
	}
	
	public void checkPersonSuspect() {
		checkSuspect.click();
	}
	
	public void checkPersonWitness() {
		checkWitness.click();
	}
	
	public void viewPseudonymVictim() {
		checkVictimPseudonym.click();
	}

	public void confirmViewPseudonymVictim() {
		btnConfirmPseudonym.click();
	}

	//Victim real last name
	public void setPseudoFirstNameVictim() {
		txtPseudoRealFirstName.sendKeys("Test Victim Real First Name");
	}

	//Victim Real first name
	public void setPseudoLastNameVictim() {
		txtPseudoRealLastName.sendKeys("Test Victim Real Last Name");
	}

	//Victim Real middle name
	public void setPseudoMiddleNameVictim() {
		txtPseudoRealMiddleName.sendKeys("Test Victim Real Last Name");
	}

	public void enableUnknownPerson() {
		checkUnknownPerson.click();
	}

	public void selectPersonRace() {
		selectRace.click();
	}
	
	public void selectRaceOption() {
		selectRaceOption.click();
	}

	public void selectPersonSex() {
		selectSex.sendKeys("Male");
	}

	public void setPersonDOB() {
		personDOB.sendKeys("t");
	}

	public void savePersonInitialInformation() {
		btnSaveShowMore.click();
	}

}
