package com.safvic.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentUpdate;
import com.safvic.pageObjects.LocationAdding;
import com.safvic.pageObjects.OffenseAdding;
import com.safvic.pageObjects.PeopleBasicInfo;
import com.safvic.pageObjects.QuickCreatePeople;

public class TC_AddOffenseGroupTest_007 extends BaseClass {
	// Add Incident Location
	@Test
	public void NavigateOffenses() throws InterruptedException {
		OffenseAdding addOff = new OffenseAdding(driver);
		Thread.sleep(2000);

		addOff.navigateOffenseTab();

		if (driver.getTitle().equals("Offense Groups - SAFV_Site")) {
			Assert.assertTrue(true);
			log.info("Navigated to the Offense page sucessfully");
			
			Thread.sleep(2000);
			
			addOff.addOffenseGroup();
			driver.navigate().refresh();
			
			addOff.selectSuspect();
			addOff.selectSuspectOption();
			addOff.selectVictim();
			addOff.selectVictimOption();
			addOff.setDateOfOffense();
			addOff.setTimeOfOffense();
			addOff.selectOffenseLocation();
			addOff.selectOffenseLocationOption();
			addOff.selectOffenseType();
			addOff.selectOffenseTypeOption();
			addOff.saveOffenseGroup();
			

			Thread.sleep(2000);

			String pageSource = driver.getPageSource();
			String toastMessage = driver.findElement(By.className("k-notification-content")).getText();

			System.out.println("Toast Message is:" + toastMessage);

			if (pageSource.contains("Create Offense - Offense")) {
				Assert.assertEquals(toastMessage, "Offense information has been saved successfully");
				log.info("Offense Group Added Successfully");
			} else {
				// Assert.assertTrue(false);
				log.info("Failed to add offense group");
			}

		} else {
			// Assert.assertTrue(false);
			log.info("Failed to Navigate to the Offenses page");
		}

	}
}
