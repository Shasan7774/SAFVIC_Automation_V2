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


public class QBOffense {
	WebDriver ldriver;
	
	public QBOffense(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id ='DateOfOffense']")
	@CacheLookup						
	WebElement dateOfoffense;
	
	@FindBy(how = How.XPATH, using = "//input[@id ='TimeOfOffense']")
	@CacheLookup						
	WebElement timeOfOffense;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='location-items_listbox']/span")
	@CacheLookup						
	WebElement selectOffenseLocation;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='location-items_listbox']/li[@data-offset-index='0']")
	@CacheLookup						
	WebElement selectOffenseLocationOption;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='OffenseId_listbox']/span")
	@CacheLookup						
	WebElement selectOffenseType;

	@FindBy(how = How.XPATH, using = "//ul[@id='OffenseId_listbox']/li[@data-offset-index='0']")
	@CacheLookup						
	WebElement selectOffenseTypeOption;
	
	@FindBy(how = How.XPATH, using = "//button[@id='addOffenseButton']")
	@CacheLookup						
	WebElement btnAddOffense;
	
	public void selectOffenseDate() {
		dateOfoffense.sendKeys("t");
	}
	public void selectOffenseTime(){
		timeOfOffense.sendKeys("t");
	}
	public void selectOffenseLocation() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectOffenseLocation));
		selectOffenseLocation.click();	
	}
	public void selectOffenseLocationOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectOffenseLocationOption));
		selectOffenseLocationOption.click();	
	}
	
	public void selectOffenseType() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectOffenseType));
		selectOffenseType.click();	
	}
	public void selectOffenseTypeOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(selectOffenseTypeOption));
		selectOffenseTypeOption.click();	
	}
	public void addOffense() {
		btnAddOffense.click();	
	}
	
}
