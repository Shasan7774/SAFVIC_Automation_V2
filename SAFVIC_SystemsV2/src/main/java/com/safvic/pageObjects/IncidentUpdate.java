package com.safvic.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class IncidentUpdate {
	WebDriver ldriver;
	
	public IncidentUpdate(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how =How.XPATH, using="//span[normalize-space()='Incident']")
	@CacheLookup
	WebElement linkIncidentUpdate;
	
	@FindBy(how =How.CSS, using="#District")
	@CacheLookup
	WebElement txtDistrict;

	@FindBy(how =How.CSS, using="#InvolvesChildren")
	@CacheLookup
	WebElement toggleChildrenInvolved;
	
	@FindBy(how =How.CSS, using="#OfficerPrimaryConcern")
	@CacheLookup
	WebElement txtOfficerConcern;
	
	@FindBy(how =How.CSS, using="#SuspectedMethManufacture")
	@CacheLookup
	WebElement txtSuspectedMeth;
	
	@FindBy(how =How.CSS, using="#SensitiveIssues")
	@CacheLookup
	WebElement txtSensitiveIssues;
	
	@FindBy(how =How.CSS, using="#Covid19")
	@CacheLookup
	WebElement toggleCovid19;
	/*
	@FindBy(how =How.XPATH, using="//span[@aria-owns='ReasonForContactId_listbox']")
	@CacheLookup
	WebElement selectReasonForContact;
	*/
	@FindBy(how =How.ID, using="ReasonForContactId_label")
	@CacheLookup
	WebElement howPoliceContacted;
	
	@FindBy(how =How.ID, using="ReasonForContactId")
	@CacheLookup
	WebElement selectReasonForContact; 
	
	/*
	@FindBy(how =How.XPATH, using="//span[@aria-owns='ReportedId_listbox']")
	@CacheLookup
	WebElement selectReportedDetails;
	*/
	@FindBy(how =How.ID, using="ReportedId_label")
	@CacheLookup
	WebElement whatWasReported;
	
	@FindBy(how =How.ID, using="ReportedId_listbox")
	@CacheLookup
	WebElement selectReportedDetails;
	
	@FindBy(how =How.CSS, using="#DispatchedDate")
	@CacheLookup
	WebElement selectDispatchedDate;
	
	@FindBy(how =How.CSS, using="#DispatchedTime")
	@CacheLookup
	WebElement selectDispatchedTime;
	
	@FindBy(how =How.XPATH, using="//button[@class='btn btn-success']")
	@CacheLookup
	WebElement btnSave;
	
	public void navigateIncidentUpdate() {
		linkIncidentUpdate.click();
	}
	public void setDistrictInfo() {
		txtDistrict.sendKeys("Test District Name");
	}
	public void enableChildrenInvolved() {
		toggleChildrenInvolved.click();
	}
	public void setOfficerPrimaryConcern() {
		txtOfficerConcern.sendKeys("Test Officer Primary Concern");
	}
	public void setSuspectedMethManufacture() {
		txtSuspectedMeth.sendKeys("Test Suspect Meth Manufacture");
	}
	public void setSensitiveIssues() {
		txtSensitiveIssues.sendKeys("Test Sensitive Issues");
	}
	public void enableCovidExposure() {
		toggleCovid19.click();
	}
	public void selectReasonContactPolice() {
		howPoliceContacted.sendKeys("911 call from within location");
		selectReasonForContact.click();
		
		//Select sel = new  Select(ldriver.findElement(By.cssSelector("#ReasonForContactId_listbox")));
		//sel.selectByVisibleText("911 call from within location");
	}
	public void selectReportedDetails() {
		whatWasReported.sendKeys("Injury");
		selectReportedDetails.click();
		
		//Select sel = new  Select(ldriver.findElement(By.cssSelector("#ReportedId_listbox")));
		//sel.selectByVisibleText("Disturbance - Physical");
	}
	public void selectDispatchedDate() {
		selectDispatchedDate.sendKeys("t");
	}
	public void selectDispatchedTime() {
		selectDispatchedTime.sendKeys("t");
	}
	public void saveIncidentUpdate() {
		btnSave.click();
	}
	 
}
