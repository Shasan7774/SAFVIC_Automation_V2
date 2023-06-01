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


public class LocationAdding {
	WebDriver ldriver;
	
	public LocationAdding(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.XPATH, using="//span[normalize-space()='Location(s)']")
	@CacheLookup
	WebElement navigateLocation;
	
	@FindBy(how =How.XPATH, using="//a[normalize-space()='Add Location']")
	@CacheLookup
	WebElement addLocation;

	@FindBy(how = How.XPATH, using = "//span[@aria-owns='AddressTypeId_listbox']/span")
	@CacheLookup
	WebElement selectLocation;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='AddressTypeId_listbox']/li[text()='Residence/Home']")
	@CacheLookup						
	WebElement selectLocationOption;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='AddressGroupId_listbox']/span")
	@CacheLookup
	WebElement selectAddressGroup;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='AddressGroupId_listbox']/li[text()='Home']")
	@CacheLookup						
	WebElement selectAddressGroupOption;
	
	@FindBy(how = How.XPATH, using= "//input[@id='serviceInput']")
	@CacheLookup						
	WebElement txtAddress1;
	
	@FindBy(how = How.XPATH, using= "//input[@id='Address2']")
	@CacheLookup						
	WebElement txtAddress2;
	
	@FindBy(how = How.XPATH, using= "//input[@id='City']")
	@CacheLookup						
	WebElement txtCity;
	
	@FindBy(how = How.XPATH, using= "//input[@id='State']")
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
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='submitForm()']")
	@CacheLookup
	WebElement btnSaveLocation;
	
	public void navigateLocation() {
		navigateLocation.click();
	}
	public void clickAddLocation(){
		addLocation.click();
	}
	
	public void selectLocation(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectLocation));
		selectLocation.click();
	}
	
	public void selectLocationOption(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectLocationOption));
		selectLocationOption.click();
	}
	
	
	public void selectAddressGroup(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectAddressGroup));
		selectAddressGroup.click();
	}
	
	public void selectAddressGroupOption(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectAddressGroupOption));
		selectAddressGroupOption.click();
	}
	
	public void setAddress1(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(txtAddress1));
		txtAddress1.sendKeys("Test Address1");
	}
	
	public void setAddress2(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(txtAddress2));
		txtAddress2.sendKeys("Test Address2");
	}
	
	public void setCity(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(txtCity));
		txtCity.sendKeys("Test City");
	}
	
	public void setState(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(txtState));
		txtState.sendKeys("TS");
	}
	
	public void selectCounty(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectCounty));
		selectCounty.click();
	}
	
	public void selectCountyOption(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectCountyOption));
		selectCountyOption.click();
	}
	
	public void setZipCode(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(txtZipCode));
		txtZipCode.sendKeys("Test ZipCode:12345");
	}
	
	public void checkDispatchedLocation(){
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(checkDispatchedLocation));
		checkDispatchedLocation.click();
	}
	
	public void saveLocation(){
		btnSaveLocation.click();
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
