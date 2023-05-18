package com.safvic.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


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
	
	public void navigateLocation() {
		navigateLocation.click();
	}
	public void clickAddLocation(){
		addLocation.click();
	}
	
	public void selectLocation(){
		selectLocation.click();
	}
	
	public void selectAddressGroup(){
		selectAddressGroup.click();
	}
	
	public void selectAddressGroupOption(){
		selectAddressGroupOption.click();
	}
	
	public void setAddress1(){
		txtAddress1.sendKeys("Test Address1");
	}
	
	public void setAddress2(){
		txtAddress2.sendKeys("Test Address2");
	}
	
	public void setCity(){
		txtAddress2.sendKeys("Test City");
	}
	
	public void setState(){
		txtAddress2.sendKeys("TS");
	}
	
	public void selectCounty(){
		selectCounty.click();
	}
	
	public void selectCountyOption(){
		selectCountyOption.click();
	}
	
	public void setZipCode(){
		selectCountyOption.sendKeys("Test ZipCode:12345");
	}
	
	public void checkDispatchedLocation(){
		checkDispatchedLocation.click();
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
