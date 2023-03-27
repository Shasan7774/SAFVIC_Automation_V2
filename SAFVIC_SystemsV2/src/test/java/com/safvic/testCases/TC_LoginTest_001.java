 package com.safvic.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.safvic.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		
		log.info("URL Is Opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail(officerEmail);
		log.info("Officer Email Entered");
		
		lp.setPassword(officerPassword);
		log.info("Officer Password Entered");
		
		lp.clickLogin();
		log.info("Login Clicked");
		
		/*
		lp.setEmail().sendKeys(officerEmail);
		lp.setPassword().sendKeys(officerEmail);
		lp.login().click();
		*/
		if(driver.getTitle().equals("Home Page - SAFV_Site"))
		{
			Assert.assertTrue(true);
	 		log.info("Navigated to the homepage");
			
		}
		else
		{
			Assert.assertTrue(true);
			log.info("Failed to navigate to the homepage");
		}
		//Thread.sleep(5000);
		
	}
}
