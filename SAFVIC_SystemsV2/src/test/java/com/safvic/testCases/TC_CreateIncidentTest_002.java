package com.safvic.testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.safvic.pageObjects.IncidentCreation;
import com.safvic.pageObjects.LoginPage;

public class TC_CreateIncidentTest_002 extends BaseClass {

	@Test
	public void createIncidentTest() throws InterruptedException {
		IncidentCreation ic = new IncidentCreation(driver);
		//ic.clickHeaderSettings();
		//ic.clcikLogout();
	
		ic.navigateIncident();
		ic.clickCreateIncident();
		ic.selectIncidentDate();
		ic.setIncidentCaseNumber();
		ic.selectIncidentType();
		ic.clickCreateIncidentPeople();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = " - SAFV_Site";
		
		String toastMessage = driver.findElement(By.className("k-notification-content")).getText();

		System.out.println("Toast Message is:"+toastMessage);

		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			Assert.assertEquals(toastMessage, "1233333Information has been saved successfully");
			log.info("Incident Created Successfully");
		}
		else {
			//Assert.assertTrue(false);
			log.info("Incident Creation Failed");
		}
		
		/*
		Assert.assertTrue(validateToastMessageAppearance, "Information has been saved successfully");
		
		public boolean validateToastMessageAppearance(String message){
		    return waitForElementToBeVisible(String.format(toastMessage,message));
		}
		public boolean waitForElementToBeVisible(By.xpath("test")) {
		    try {
		    wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
		    return true;
		    }catch (Throwable t){
		        return false;
		    }
		}
		
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement toaster = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toaster")));
		String actualMessage = toaster.getText();
		String expectedMessage = "Toaster";
		Assert.assertTrue(actualMessage.contains(expectedMessage));
		*/
		
	}

}
