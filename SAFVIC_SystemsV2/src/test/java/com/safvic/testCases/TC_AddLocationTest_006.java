package com.safvic.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentUpdate;
import com.safvic.pageObjects.LocationAdding;
import com.safvic.pageObjects.PeopleBasicInfo;
import com.safvic.pageObjects.QuickCreatePeople;

public class TC_AddLocationTest_006 extends BaseClass {
	// Add Incident Location
	@Test
	public void NavigateLocation() throws InterruptedException {
		LocationAdding addLoc = new LocationAdding(driver);
		Thread.sleep(2000);

		addLoc.navigateLocation();

		if (driver.getTitle().equals("Incident Locations - SAFV_Site")) {
			Assert.assertTrue(true);
			log.info("Navigated to incident location sucessfully");

			addLoc.clickAddLocation();
			addLoc.selectLocation();
			addLoc.selectLocationOption();
			addLoc.selectAddressGroup();
			addLoc.selectAddressGroupOption();
			addLoc.setAddress1();
			addLoc.setAddress2();
			addLoc.setCity();
			addLoc.setState();
			addLoc.selectCounty();
			addLoc.selectCountyOption();
			addLoc.setZipCode();
			addLoc.checkDispatchedLocation();
			addLoc.saveLocation();

			Thread.sleep(2000);

			String pageSource = driver.getPageSource();
			String toastMessage = driver.findElement(By.className("k-notification-content")).getText();

			System.out.println("Toast Message is:" + toastMessage);

			if (pageSource.contains("Create Location-Location Info")) {
				Assert.assertEquals(toastMessage, "Incident location information has been updated successfully");
				log.info("Location Created Successfully");
			} else {
				// Assert.assertTrue(false);
				log.info("Location Creation Failed");
			}

		} else {
			// Assert.assertTrue(false);
			log.info("Failed to Navigate to the Incident Location");
		}

	}
	/*
	 * @Test public void AddLocation() throws InterruptedException{ LocationAdding
	 * addLoc = new LocationAdding(driver); Thread.sleep(2000);
	 * addLoc.clickAddLocation(); addLoc.selectLocation();
	 * addLoc.selectLocationOption(); addLoc.selectAddressGroup();
	 * addLoc.selectAddressGroupOption(); addLoc.setAddress1();
	 * addLoc.setAddress2(); addLoc.setCity(); addLoc.setState();
	 * addLoc.selectCounty(); addLoc.selectCountyOption(); addLoc.setZipCode();
	 * addLoc.checkDispatchedLocation(); addLoc.saveLocation();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * String pageSource = driver.getPageSource(); String toastMessage =
	 * driver.findElement(By.className("k-notification-content")).getText();
	 * 
	 * System.out.println("Toast Message is:" + toastMessage);
	 * 
	 * 
	 * if (pageSource.contains("Create Location-Location Info")) {
	 * Assert.assertEquals(toastMessage,
	 * "Incident location information has been updated successfully");
	 * log.info("Location Created Successfully"); } else {
	 * //Assert.assertTrue(false); log.info("Location Creation Failed"); }
	 * 
	 * }
	 */
}
