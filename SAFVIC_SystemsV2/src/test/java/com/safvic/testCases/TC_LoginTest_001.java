 package com.safvic.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.safvic.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() {
		driver.get(baseURL);
		log.info("URL Is Opeend");
		
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
			Assert.assertFalse(false);
			log.info("Failed to navigate to the homepage");
		}
		
	}
	

}
