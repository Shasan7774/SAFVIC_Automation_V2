package com.safvic.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class IncidentCreation {
	WebDriver ldriver;
	
	public IncidentCreation(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.XPATH, using="//span[@class='info-box-text'][normalize-space()='Incidents']")
	//@FindBy(how=How.XPATH,using="//div[@class='info-box bg-white'])[1]")
	@CacheLookup
	WebElement incidentArea;
	
	@FindBy(how =How.XPATH, using="//a[normalize-space()='Create new incident']")
	@CacheLookup
	WebElement incidentQuickCreate;
	
	@FindBy(how=How.CSS, using="#IncidentDate")
	@CacheLookup
	WebElement incidentDate;
	
	@FindBy(how =How.CSS, using="#AgencyIdentifier")
	@CacheLookup
	WebElement incidentCaseNumber;
	
	@FindBy(how =How.CSS, using="#IncidentTypeId")
	@CacheLookup
	WebElement incidentType;
	
	@FindBy(how =How.CSS, using="#incident-creation-form")
	@CacheLookup
	WebElement clickIncidentType;
	
	@FindBy(how =How.XPATH, using="//input[@type='submit']")
	@CacheLookup
	WebElement btnCreateIncidentPeople;
	
	public void navigateIncident() {
		incidentArea.click();
	}
	public void clickCreateIncident(){
		incidentQuickCreate.click();
	}
	public void selectIncidentDate() {
		incidentDate.sendKeys("t");
	}
	public void setIncidentCaseNumber() {
		incidentCaseNumber.sendKeys("Test Incident");
	}
	public void selectIncidentType() {
		incidentType.click();
		Select sel = new  Select(ldriver.findElement(By.cssSelector("#IncidentTypeId")));
		sel.selectByVisibleText("Sexual Assault");
	}
	public void clickIncidentType() {
		clickIncidentType.click();
	}
	public void clickCreateIncidentPeople() {
		btnCreateIncidentPeople.click();
	}
	
	/*
	@FindBy(how =How.CSS, using="#headerSettingButton")
	@CacheLookup
	WebElement headerSettings;
	
	public void clickHeaderSettings() {
		headerSettings.click();
	}
	
	@FindBy(how =How.CSS, using="#logout")
	@CacheLookup
	WebElement logOut;
	
	public void clickLogout() {
		logOut.click();
	}
	*/
	 
}
