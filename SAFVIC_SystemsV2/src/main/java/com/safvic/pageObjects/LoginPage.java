package com.safvic.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		this.ldriver = rdriver;
	}
	
	By email =  By.id("Email");   
	By password = By.id("Password");
	By login = By.xpath("//div/button");
	
	public WebElement setEmail() {
		return ldriver.findElement(email);
	}
	
	public WebElement setPassword() { 
		return ldriver.findElement(password);
	}
	
	public WebElement login() {
		return ldriver.findElement(login);
	}
	

}
