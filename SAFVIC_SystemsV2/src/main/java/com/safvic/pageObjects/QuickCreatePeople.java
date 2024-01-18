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
	
	@FindBy(how = How.XPATH, using = "//input[@id='Age']")
	@CacheLookup
	WebElement personAge;
	
	//Suspect Address
	@FindBy(how = How.XPATH, using = "//button[@data-target='#addressModelCreate']")
	@CacheLookup
	WebElement btnAddNewAddress;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='AddressGroupId_label']/span")
	@CacheLookup
	WebElement selectAddressGroup;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='AddressGroupId_listbox']/li[text()='Home']")
	@CacheLookup
	WebElement selectAddressGroupOption;
	
	@FindBy(how = How.XPATH, using = "//input[@id='serviceInput']")
	@CacheLookup
	WebElement txtAddress1; 
	
	@FindBy(how = How.XPATH, using = "//input[@id='Address2']")
	@CacheLookup
	WebElement txtAddress2; 
	
	@FindBy(how = How.XPATH, using = "//input[@id='City']")
	@CacheLookup
	WebElement txtCity; 
	
	@FindBy(how = How.XPATH, using = "//input[@id='State']")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='County_label']/span")
	@CacheLookup
	WebElement selectCounty;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='County_listbox']/li[text()='Anderson']")
	@CacheLookup
	WebElement selectCountyOption; 
	
	@FindBy(how = How.XPATH, using = "//input[@id='ZipCode']")
	@CacheLookup
	WebElement txtZipCode;  
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='onCreate()']")
	@CacheLookup
	WebElement btnSaveAddress;
	//End of Address
	
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
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectRace));
		selectRace.click();
	}
	
	public void selectRaceOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectRaceOption));
		selectRaceOption.click();
	}

	public void selectPersonSex() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectSex));
		selectSex.click();
	}
	public void selectSexOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectSexOption));
		selectSexOption.click();
	}
	public void setPersonDOB() {
		personDOB.sendKeys("t");
	}
	//Suspect Address
	public void addNewAddress() {
		btnAddNewAddress.click();
	}
	
	public void selectAddressGroup() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectAddressGroup));
		selectAddressGroup.click();
	}
	
	public void selectAddressGroupOption() {		
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectAddressGroupOption));
		selectAddressGroupOption.click();
	}
	
	public void txtAddress1() {
		txtAddress1.sendKeys("TestAddress1");
	}
	
	public void txtAddress2() {
		txtAddress2.sendKeys("Test Address2");
	}
	
	public void txtCity() {
		txtCity.sendKeys("Test City");
	}
	
	public void txtState() {
		txtState.sendKeys("Test State");
	}
	
	public void selectCounty() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectCounty));
		selectCounty.click();
	}
	
	public void selectCountyOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectCountyOption));
		selectCountyOption.click();
	}
	
	public void addZipCode() {
		txtZipCode.sendKeys("12345");
	}
	
	public void btnSaveAddress() {
		btnSaveAddress.click();
	}
	
	public void savePersonInitialInformation() {
		btnSaveShowMore.click();
	}

}
