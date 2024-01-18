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


public class QBEPORequest {
	WebDriver ldriver;

	public QBEPORequest(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='viewModelQuickBookTab.visitIncidentTab()']")
	@CacheLookup						
	WebElement btnReviewQuickBook;
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='getEPODataVM.navigateToEPO()']")
	@CacheLookup						
	WebElement btnCreateEPORequest;
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='getEPODataVM.navigateToIncident()']")
	@CacheLookup						
	WebElement btnBackToIncident;
	
	public void reviewQuickBook() {
		btnReviewQuickBook.click();
	}
	
	public void createEPORequest() {
		btnCreateEPORequest.click();
	}
	
	public void backToIncident() {
		btnBackToIncident.click();
	}
	
}
