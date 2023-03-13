package com.safvic.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="Email")
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
	
	
	/*
	By txtEmail =  By.id("Email");   
	By txtPassword = By.id("Password");
	By btnLogin = By.xpath("//div/button");
	
	public WebElement setEmail() {
		return ldriver.findElement(txtEmail);
	}
	
	public WebElement setPassword() { 
		return ldriver.findElement(txtPassword);
	}
	
	public WebElement login() {
		return ldriver.findElement(btnLogin);
	}
	*/

}
