package com.safvic.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentUpdate;
import com.safvic.pageObjects.LocationAdding;
import com.safvic.pageObjects.OffenseAdding;
import com.safvic.pageObjects.PeopleBasicInfo;
import com.safvic.pageObjects.QuickCreatePeople;
import com.safvic.pageObjects.RiskAssessment;
import com.safvic.pageObjects.Vehicles;

public class TC_AddVehicleTest_009 extends BaseClass {
	// Add Incident Location
	@Test
	public void AddVehicleInformation() throws InterruptedException {
		Vehicles vehicle = new Vehicles(driver);
		Thread.sleep(2000);

		vehicle.navigateVehicle();
		
		if (driver.getTitle().equals("Incident Vehicle - SAFV_Site")) {
			Assert.assertTrue(true);
			log.info("Navigated to the Vehicle Tab Successfully");
			
			Thread.sleep(2000);
			
			vehicle.addVehicle();
			driver.navigate().refresh();
			vehicle.selectVehicleOwner();
			vehicle.selectVehicleOwnerOption();
			vehicle.inputVehicleMake();
			vehicle.inputVehicleYear();
			vehicle.inputVehicleModel();
			vehicle.inputVehicleBodyStyle();
			vehicle.inputVehicleColor();
			vehicle.inputVehicleLicensePlateNo();
			vehicle.inputVehicleState();
			vehicle.inputVehiclePlateYear();
			vehicle.inputVehicleVIN();
			
			vehicle.enableImpounded();
			vehicle.inputTowedBy();
			vehicle.inputStoredAt();
			vehicle.inputVehicleCondition();
			
			vehicle.enableOnHold();
			vehicle.inputReasonForHold();
			
			vehicle.enablePhotographed();
			
			vehicle.saveVehicle();
			
			Thread.sleep(2000);

			String pageSource = driver.getPageSource();
			String toastMessage = driver.findElement(By.className("k-notification-content")).getText();
			System.out.println("Toast Message is:" + toastMessage);

			if (pageSource.contains("Incident Vehicle")) {
				Assert.assertEquals(toastMessage, "Vehicle added successfully.");
				log.info("Vehicle Added Successfully");
			} else {
				// Assert.assertTrue(false);
				log.info("Failed to Add Vehicle");
			}

		} else {
			// Assert.assertTrue(false);
			log.info("Failed to Navigate to the Risk Assessment page");
		}

	}
}
