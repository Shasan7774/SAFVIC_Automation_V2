package com.safvic.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.safvic.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass{
	@Test
	public void loginTest() {
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail().sendKeys(officerEmail);
		lp.setPassword().sendKeys(officerPassword);
		lp.login().click();
		
		if(driver.getTitle().equals("Home Page - SAFV_Site"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		
	}
	

}
