package com.safvic.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.safvic.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void siteUrlTest() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in - SAFV_TEST";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			Assert.assertTrue(true);
			log.info("Login page loaded");
		} else {
			// Assert.assertTrue(false);
			log.info("Failed to load the login page");
		}
	}

	@Test
	public void loginTest() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);

		lp.setEmail(officerEmail);
		log.info("Officer Email Entered");

		lp.setPassword(officerPassword);
		log.info("Officer Password Entered");

		lp.clickLogin();
		log.info("Login Clicked");

		/*
		 * lp.setEmail().sendKeys(officerEmail);
		 * lp.setPassword().sendKeys(officerEmail); lp.login().click();
		 */
		Thread.sleep(2000);
		if (driver.getTitle().equals("Home Page - SAFV_Site")) {
			Assert.assertTrue(true);
			log.info("Login Successful");
		} else {
			// Assert.assertTrue(false);
			log.info("Login Failed");
		}

	}
}
