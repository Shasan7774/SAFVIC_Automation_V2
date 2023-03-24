package com.safvic.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatePeople {
	WebDriver ldriver;

	public CreatePeople(WebDriver rdriver) {
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

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement toggleAlias;

	@FindBy(how = How.XPATH, using = "//input[@id='AliasDesc']")
	@CacheLookup
	WebElement txtAliasDescription;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement personType;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement toggleUnknownPerson;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement selectRace;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement selectSex;

	@FindBy(how = How.XPATH, using = "//input[@id='DateOfBirth']")
	@CacheLookup
	WebElement personDOB;

	@FindBy(how = How.XPATH, using = "//*[text()='Save & Show More']")
	@CacheLookup
	WebElement btnSaveShowMore;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement toggleVictimPseudonym;

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

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement selectEthnicity;

	@FindBy(how = How.XPATH, using = "//input[@id='HeightFt']")
	@CacheLookup
	WebElement txtHeightFeet;

	@FindBy(how = How.XPATH, using = "//input[@id='HeightIn']")
	@CacheLookup
	WebElement txtHeightInch;

	@FindBy(how = How.XPATH, using = "//input[@id='Weight']")
	@CacheLookup
	WebElement txtWeight;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement btnViewSSN;

	@FindBy(how = How.XPATH, using = "//input[@id='SSNAlias']")
	@CacheLookup
	WebElement txtSSN;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success']']")
	@CacheLookup
	WebElement btnSaveSSN;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement selectPrimaryLanguage;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement selectPersonIDType;

	@FindBy(how = How.XPATH, using = "//input[@id='IDCardNo']")
	@CacheLookup
	WebElement txtIDNo;

	@FindBy(how = How.XPATH, using = "//input[@id='IDCardNoState']")
	@CacheLookup
	WebElement txtIDCardNoState;

	@FindBy(how = How.XPATH, using = "//input[@id='EmailAddress']")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement toggleSafeViaEmail;

	@FindBy(how = How.XPATH, using = "//textarea[@id='Occupation']")
	@CacheLookup
	WebElement txtOccupation;

	@FindBy(how = How.XPATH, using = "//input[@id='PlaceOfEmployment']")
	@CacheLookup
	WebElement txtEmployerName;

	@FindBy(how = How.XPATH, using = "//input[@id='TxSID']")
	@CacheLookup
	WebElement txtTxSID;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement togglePlacedIntoHandCuffs;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement toggleChildJuvenille;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement toggleMirandaWarning;

	@FindBy(how = How.XPATH, using = "//input[@id='MirandaWhenDate']")
	@CacheLookup
	WebElement mirandaDate;

	@FindBy(how = How.XPATH, using = "//input[@id='MirandaWhenTime']")
	@CacheLookup
	WebElement mirandaTime;

	@FindBy(how = How.XPATH, using = "//textarea[@id='StatementsAfter']")
	@CacheLookup
	WebElement StatementsAfter;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement togglePersonElderly;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement togglePersonDisabled;

	// Add New Phone Number
	@FindBy(how = How.XPATH, using = "//button[@data-target='#phoneModalCreate']")
	@CacheLookup
	WebElement btnAddNewPhoneNumber;

	@FindBy(how = How.XPATH, using = "//span[@aria-owns='PhoneTypeId_listbox']")
	@CacheLookup
	WebElement selectPhoneType;

	@FindBy(how = How.XPATH, using = "//input[@id='PhoneNumber']")
	@CacheLookup
	WebElement txtPhoneNumber;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement togglePrimaryContact;

	@FindBy(how = How.XPATH, using = "//button[@onclick='saveOrUpdate(false)']")
	@CacheLookup
	WebElement btnSavePhoneNumber;

	// Add New Address
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add new address']")
	@CacheLookup
	WebElement btnAddNewAddress;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='AddressGroupId_listbox']")
	@CacheLookup
	WebElement selectAddressGroup;

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

	@FindBy(how = How.XPATH, using = "//span[@aria-owns='County_listbox']")
	@CacheLookup
	WebElement selectCounty;

	@FindBy(how = How.XPATH, using = "//input[@id='ZipCode']")
	@CacheLookup
	WebElement txtZipCode;

	@FindBy(how = How.XPATH, using = "//button[@onclick='onCreate()']")
	@CacheLookup
	WebElement btnSaveAddress;

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
		toggleAlias.click();
	}

	public void setAliasName() {
		txtAliasDescription.sendKeys("Test Alias Name");
	}

	public void enablePersonType() {
		personType.click();
	}

	public void enableUnknownPerson() {
		toggleUnknownPerson.click();
	}

	public void selectPersonRace() {
		selectRace.click();
	}

	public void selectPersonSex() {
		selectSex.click();
	}

	public void setPersonDOB() {
		personDOB.sendKeys("t");
	}

	public void savePersonInitialInformation() {
		btnSaveShowMore.click();
	}

	public void viewPseudonymVictim() {
		toggleVictimPseudonym.click();
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

	public void selectPersonEthnicity() {
		selectEthnicity.click();
	}

	public void setPersonHeightFeet() {
		txtHeightFeet.sendKeys("5");
	}

	public void setPersonHeightInch() {
		txtHeightInch.sendKeys("10");
	}

	public void setPersonWeight() {
		txtWeight.sendKeys("100");
	}

	public void viewSSNPerson() {
		btnViewSSN.click();
	}

	public void setSSNPerson() {
		txtSSN.sendKeys("123-123-1234");
	}

	public void saveSSNPerson() {
		btnSaveSSN.click();
	}

	public void selectPrimaryLanguagePerson() {
		selectPrimaryLanguage.click();
	}

	public void selectPersonIDType() {
		selectPersonIDType.click();
	}

	public void setPersonIDNo() {
		txtIDNo.sendKeys("123123123");
	}

	public void setPersonIDCardState() {
		txtIDCardNoState.sendKeys("Test State ID Card");
	}

	public void setPersonEmail() {
		txtEmail.sendKeys("testperson@gmail.com");
	}

	public void enableSafeViaEmail() {
		toggleSafeViaEmail.click();
	}

	public void setPersonOccupation() {
		txtOccupation.sendKeys("Test Occupation");
	}

	public void setEmployerName() {
		txtEmployerName.sendKeys("Test Employer Of The Person");
	}

	public void setTxSID() {
		txtEmployerName.sendKeys("Test TxSID: 1234 ");
	}

	public void enablePlacedIntoHandCuffs() {
		togglePlacedIntoHandCuffs.click();
	}

	public void enableChildJuvenille() {
		toggleChildJuvenille.click();
	}

	public void enableMirandaWarning() {
		toggleMirandaWarning.click();
	}

	public void setMirandaDate() {
		mirandaDate.sendKeys("t");
	}

	public void setMirandaTime() {
		mirandaTime.sendKeys("t");
	}

	public void setStatementsAfterMiranda() {
		StatementsAfter.sendKeys("Test Statementes Made After Miranda");
	}

	public void enablePersonElderly() {
		togglePersonElderly.click();
	}

	public void enablePersonDisabled() {
		togglePersonDisabled.click();
	}
	
	//Add Person Phone Number 
	public void clickAddNewPhoneNumber() {
		btnAddNewPhoneNumber.click();
	}
	public void setPhoneNumber() {
		txtPhoneNumber.sendKeys("123-321-3214");
	}
	public void enablePrimaryContact() {
		togglePrimaryContact.click();
	}
	public void savePhoneNumber() {
		btnSavePhoneNumber.click();
	}
	//Add New Address
	public void clickAddNewAddress() {
		btnAddNewAddress.click();
	}
	public void selectAddressGroup() {
		selectAddressGroup.click();
	}
	public void setAddress1() {
		txtAddress1.sendKeys("Test Address1");
	}
	public void setAddress2() {
		txtAddress2.sendKeys("Test Address2");
	}
	public void setCity() {
		txtCity.sendKeys("Test City");
	}
	public void setState() {
		txtState.sendKeys("Test State");
	}
	public void selectCounty() {
		selectCounty.click();
	}
	public void setZipCode() {
		txtZipCode.sendKeys("12345");
	}
	public void saveAddress() {
		btnSaveAddress.click();
	}
	
}
