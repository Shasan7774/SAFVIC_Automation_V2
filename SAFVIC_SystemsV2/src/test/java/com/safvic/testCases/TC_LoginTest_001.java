 package com.safvic.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentCreation;
import com.safvic.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException {
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
			AssertJUnit.assertTrue(true);
			log.info("Navigated to the homepage");
		}
		else
		{
			AssertJUnit.assertFalse(false);
			log.info("Failed to navigate to the homepage");
		}
		//Thread.sleep(5000);
		
	}
	/*
	//TC-2 Incident Creation 
	@Test(priority=2)
	public void CreateIncidentTest() throws InterruptedException {
		
		//driver.quit();		
		IncidentCreation ic = new IncidentCreation(driver);
		ic.clickHeaderSettings();
		ic.clcikLogout();
	
	}
	*/

}
