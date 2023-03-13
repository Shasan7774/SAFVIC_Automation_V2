package com.safvic.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class IncidentCreation {
	WebDriver ldriver;
	
	public IncidentCreation(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.XPATH, using="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//div/button")
	@CacheLookup
	WebElement btnLogin;
	
	public void setEmail(String uemail) {
		txtEmail.sendKeys(uemail);
	}
	public void setPassword(String upassword) {
		txtPassword.sendKeys(upassword);
	}
	public void clickLogin() {
		btnLogin.click();
	}
	
	 
}
