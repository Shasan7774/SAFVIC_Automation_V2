package com.safvic.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PeopleBasicInfo {
	WebDriver ldriver;

	public PeopleBasicInfo(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='EthnicityId_label']/span")
	@CacheLookup
	WebElement selectEthnicity;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='EthnicityId_listbox']/li[text()='Non-Hispanic']")
	@CacheLookup
	WebElement selectEthnicityOption;
	
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='EyeColorId_label']/span")
	@CacheLookup
	WebElement selectEyeColor;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='EthnicityId_listbox']/li[text()='Non-Hispanic']")
	@CacheLookup
	WebElement selectEyeColorOption;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement selectHairColor;

	@FindBy(how = How.XPATH, using = "//input[@id='HeightFt']")
	@CacheLookup
	WebElement txtHeightFeet;

	@FindBy(how = How.XPATH, using = "//input[@id='HeightIn']")
	@CacheLookup
	WebElement txtHeightInch;

	@FindBy(how = How.XPATH, using = "//input[@id='Weight']")
	@CacheLookup
	WebElement txtWeight;

	@FindBy(how = How.XPATH, using = "//form[@id='createbasicinfoform']/div/div/div[@data-bind='invisible: isSSNShow']/button[@data-bind='click: onSSNShowChange']")
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

	@FindBy(how = How.XPATH, using = "//span[@aria-owns='PrimaryLanguage_listbox']/span/span[@aria-label='select']")
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
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='VictimSafeEMail_label']/span")
	@CacheLookup
	WebElement clickSafeViaEmail;
	
	@FindBy(how = How.CSS, using = "#Occupation")
	@CacheLookup
	WebElement txtOccupation;
	
	@FindBy(how = How.CSS, using = "#PlaceOfEmployment")
	@CacheLookup
	WebElement txtNameEmployer;
	
	@FindBy(how = How.CSS, using = "#TxSID")
	@CacheLookup
	WebElement txtTxSID;
	
	@FindBy(how = How.CSS, using = "//input[@id='SpecialNeeds']")
	@CacheLookup
	WebElement txtSpecialNeeds;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='RestraintPriorToArrest_label']/span")
	@CacheLookup
	WebElement checkPlacedIntoHandCuffs;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='ChildPresent_label']/span")
	@CacheLookup
	WebElement checkChildJuvenille;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='MirandaWarning_label']/span")
	@CacheLookup
	WebElement checkMirandaWarning;

	@FindBy(how = How.XPATH, using = "//input[@id='MirandaWhenDate']")
	@CacheLookup
	WebElement mirandaDate;

	@FindBy(how = How.XPATH, using = "//input[@id='MirandaWhenTime']")
	@CacheLookup
	WebElement mirandaTime;

	@FindBy(how = How.XPATH, using = "//textarea[@id='StatementsAfter']")
	@CacheLookup
	WebElement txtStatementsMade;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='Elderly_label']/span")
	@CacheLookup
	WebElement checkPersonElderly;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='Disabled_label']/span")
	@CacheLookup
	WebElement checkPersonDisabled;

	//Add New Phone Number
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

	//Add New Address
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
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']")
	@CacheLookup
	WebElement btnSaveBasicInfo;

	public void selectEthnicity() {
		selectEthnicity.click();
	}
	
	public void selectEyeColor() {
		selectEyeColor.click();
	}
	
	public void selectHairColor() {
		selectHairColor.click();
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
		clickSafeViaEmail.click();
	}

	public void setPersonOccupation() {
		txtOccupation.sendKeys("Test Occupation");
	}

	public void setEmployerName() {
		txtNameEmployer.sendKeys("Test Employer Of The Person");
	}

	public void setTxSID() {
		txtTxSID.sendKeys("Test TxSID: 1234 ");
	}
	
	public void setSpecialNeeds() {
		txtTxSID.sendKeys("Test Person Special Needs");
	}
	

	public void enablePlacedIntoHandCuffs() {
		checkPlacedIntoHandCuffs.click();
	}

	public void enableChildJuvenille() {
		checkChildJuvenille.click();
	}

	public void enableMirandaWarning() {
		checkMirandaWarning.click();
	}

	public void setMirandaDate() {
		mirandaDate.sendKeys("t");
	}

	public void setMirandaTime() {
		mirandaTime.sendKeys("t");
	}

	public void setStatementsAfterMiranda() {
		txtStatementsMade.sendKeys("Test Statementes Made After Miranda");
	}

	public void enablePersonElderly() {
		checkPersonElderly.click();
	}

	public void enablePersonDisabled() {
		checkPersonDisabled.click();
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
	
	public void savePersonBasicInfo() {
		btnSaveBasicInfo.click();
	}
	
}
