package com.safvic.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL="https://safv.stellasoftware.com/";
	public String officerEmail="hasan.shahria@brainstation-23.com";
	public String officerPassword="bs23@Test123";
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	}
	
	@AfterClass
	public void terDown() {
		driver.quit();
	}

}
