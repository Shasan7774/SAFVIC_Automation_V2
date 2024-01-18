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

public class QBIncidentCreate {
	WebDriver ldriver;

	public QBIncidentCreate(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Navigate to QB
	@FindBy(how = How.CLASS_NAME, using = "fa-snowflake-o")
	@CacheLookup
	WebElement menuIncidents;

	@FindBy(how = How.CLASS_NAME, using = "fa-home")
	@CacheLookup
	WebElement homePage;

	@FindBy(how = How.XPATH, using = "//span[@class='info-box-text'][normalize-space()='Incidents']")
	// @FindBy(how=How.XPATH,using="//div[@class='info-box bg-white'])[1]")
	@CacheLookup
	WebElement incidentArea;

	@FindBy(how = How.XPATH, using = "//div/a[normalize-space()='Create Quick Book']")
	@CacheLookup
	WebElement createQuickBook;

	// QB Incident Creation
	@FindBy(how = How.CSS, using = "#IncidentDate")
	@CacheLookup
	WebElement incidentReportDate;

	@FindBy(how = How.XPATH, using = "//input[@id='AgencyIdentifier']")
	@CacheLookup
	WebElement incidentCaseNumber;

	/*
	 * @FindBy(how =How.CSS, using="#IncidentTypeId_label")
	 * 
	 * @CacheLookup WebElement incidentType;
	 *
	 *
	 *@FindBy(how = How.XPATH, using = "//div[@id='IncidentTypeId-list']//ul[@id='IncidentTypeId_listbox']/li[text()='Assault FV']")
	  @CacheLookup
	  WebElement assaultFVOption; 
	 */
	
	@FindBy(how = How.CSS, using = "#IncidentTypeId")
	@CacheLookup
	WebElement incidentType;

	@FindBy(how = How.CSS, using = "#DispatchedDate")
	@CacheLookup
	WebElement selectDispatchedDate;

	@FindBy(how = How.CSS, using = "#DispatchedTime")
	@CacheLookup
	WebElement selectDispatchedTime;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='ReasonForContactId_label']/span")
	@CacheLookup
	WebElement selectHowPoliceContacted;

	@FindBy(how = How.XPATH, using = "//ul[@id='ReasonForContactId_listbox']/li[@data-offset-index='0']")
	@CacheLookup
	WebElement selectHowPoliceContactedOption;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='ReportedId_label']/span")
	@CacheLookup
	WebElement selectReasonForContact;

	@FindBy(how = How.XPATH, using = "//ul[@id='ReportedId_listbox']/li[@data-offset-index='0']")
	@CacheLookup
	WebElement selectReasonForContactOption;

	//Incident Location
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='AddressTypeId_listbox']/span")
	@CacheLookup
	WebElement selectLocationType;

	@FindBy(how = How.XPATH, using = "//ul[@id='AddressTypeId_listbox']/li[text()='Residence/Home']")
	@CacheLookup
	WebElement selectLocationTypeOption;

	@FindBy(how = How.XPATH, using = "//span[@aria-owns='AddressGroupId_listbox']/span")
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

	@FindBy(how = How.XPATH, using = "//span[@aria-owns='County_listbox']/span")
	@CacheLookup
	WebElement selectCounty;

	@FindBy(how = How.XPATH, using = "//ul[@id='County_listbox']/li[text()='Anderson']")
	@CacheLookup
	WebElement selectCountyOption;

	@FindBy(how = How.XPATH, using = "//input[@id='ZipCode']")
	@CacheLookup
	WebElement txtZipCode;

	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='IsDispatchLocation_label']/span")
	@CacheLookup
	WebElement checkDispatchedLocation;

	@FindBy(how = How.XPATH, using = "//button[text()='Save and Next']") 
	@CacheLookup
	WebElement btnSaveAndNext;

	public void clickIncidentsMenu() {
		menuIncidents.click();
	}

	public void navigateToHomepage() {
		homePage.click();
	}

	public void clickCreateQuickBook() {
		createQuickBook.click();
	}

	public void selectIncidentReportDate() {
		incidentReportDate.sendKeys("t");
	}

	public void setIncidentCaseNumber() {
		incidentCaseNumber.sendKeys("Test QB Incident Case#123");
	}

	public void selectIncidentType() {

		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(incidentType));
	
		incidentType.click();
		Select sel = new  Select(ldriver.findElement(By.cssSelector("#IncidentTypeId")));
		sel.selectByVisibleText("Assault FV");
	}

	public void selectDispatchedDate() {
		selectDispatchedDate.sendKeys("t");
	}

	public void selectDispatchedTime() {
		selectDispatchedTime.sendKeys("t");
	}
	//Police Notified
	public void selectHowPoliceContacted() {
		selectHowPoliceContacted.click();
	}

	public void selectHowPoliceContactedOption() {
		selectHowPoliceContactedOption.click();
	}
	//Reported
	public void selectReasonForContact() {
		selectReasonForContact.click();
	}

	public void selectReasonForContactOption() {
		selectReasonForContactOption.click();
	}

	// Location
	public void selectLocation() {
		selectLocationType.click();
	}

	public void selectLocationOption() {
		selectLocationTypeOption.click();
	}

	public void selectAddressGroup() {
		selectAddressGroup.click();
	}

	public void selectAddressGroupOption() {
		selectAddressGroupOption.click();
	}

	public void inputAddress1() {
		txtAddress1.sendKeys("Test Address1");
	}

	public void inputAddress2() {
		txtAddress2.sendKeys("Test Address2");
	}

	public void inputCity() {
		txtCity.sendKeys("Test City");
	}

	public void inputState() {
		txtState.sendKeys("TX");
	}

	public void selectCounty() {
		selectCounty.click();
	}

	public void selectCountyOption() {
		selectCountyOption.click();
	}

	public void inputZipCode() {
		txtZipCode.sendKeys("Test Zip:12321");
	}

	public void checkDispatchedLocation() {
		checkDispatchedLocation.click();
	}

	public void saveQBAndNext() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(btnSaveAndNext));
		btnSaveAndNext.click();
	}

}
