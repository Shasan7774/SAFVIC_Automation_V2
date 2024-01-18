 package com.safvic.testCases;

import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentUpdate;
import com.safvic.pageObjects.PeopleBasicInfo;
import com.safvic.pageObjects.QuickCreatePeople;
import com.safvic.pageObjects.SuspectInfoTab;
import com.safvic.util.JiraPolicy;

public class TC_CreateSuspectTest_005 extends BaseClass{
	//Create Suspect Test
	
	//@JiraPolicy(logTicket=true)
	@Test(priority = 1)
	public void CreateSuspect() throws InterruptedException {
		QuickCreatePeople suspect = new QuickCreatePeople(driver);
		Thread.sleep(3000);
		
		suspect.navigatePeople();
		
		suspect.clickAddPerson();
		suspect.setPersonFirstName();
		suspect.setPersonLastName();
		suspect.setPersonMiddleName();
		suspect.enableAlias();
		suspect.setAliasName();
		suspect.checkPersonSuspect();
		Thread.sleep(2000);
		
		suspect.selectPersonRace();
		suspect.selectRaceOption();
		suspect.selectPersonSex();
		suspect.selectSexOption();
		suspect.setPersonDOB();
		suspect.savePersonInitialInformation();
        
        Thread.sleep(2000);
        
        //Add Suspect Address 
        suspect.addNewAddress();
        suspect.selectAddressGroup();
        suspect.selectAddressGroupOption();
        suspect.txtAddress1();
        suspect.txtAddress2();
        suspect.txtCity();
        suspect.txtState();
        suspect.selectCounty();
        suspect.selectCountyOption();
        suspect.addZipCode();
        suspect.btnSaveAddress();
        
        Thread.sleep(3000);
	}
	//Arrest  the Suspect
	@Test(priority = 2)
	public void ArrestSuspect() throws InterruptedException {
		SuspectInfoTab suspectTab = new SuspectInfoTab(driver);
		
		suspectTab.navigateToSuspectTab();
		Thread.sleep(2000);
		suspectTab.enabeleSuspectOnScene();
		suspectTab.enabeleSuspectArrestedOnScene();
		suspectTab.setDateOfArrest();
		suspectTab.setTimeOfArrest();
		suspectTab.setDateOfBooking();
		suspectTab.setTimeOfBooking();
		suspectTab.copyFromLocation();
		suspectTab.selectLocation();
		suspectTab.copyLocation();
		Thread.sleep(2000);
		suspectTab.saveSuspectTabInfo();
	}
	//Suspect Basic Info
	/*
	@Test
	public void VictimBasicInfo() throws InterruptedException{
		PeopleBasicInfo bi = new PeopleBasicInfo(driver);
		bi.selectEthnicity();
		bi.selectEthnicityOption();
		bi.selectEyeColor();
		bi.selectEyeColorOption();
		bi.selectHairColor();
		bi.selectHairColorOption();
		bi.setPersonHeightFeet();
		bi.setPersonHeightInch();
		bi.setPersonWeight();
		bi.viewSSNPerson();
		bi.setSSNPerson();
		bi.saveSSNPerson();
		bi.selectPrimaryLanguagePerson();
		bi.selectPrimaryLanguagePersonOption();
		bi.selectPersonIDType();
		bi.selectPersonIDTypeOption();
		bi.setPersonIDNo();
		bi.setPersonIDCardState();
		bi.setPersonEmail();
		bi.enableSafeViaEmail();
		bi.setPersonOccupation();
		bi.setEmployerName();
		bi.setTxSID();
		bi.setSpecialNeeds();
		bi.enablePlacedIntoHandCuffs();
		bi.enableChildJuvenille();
		bi.enableMirandaWarning();
		bi.setMirandaDate();
		bi.setMirandaTime();
		bi.setStatementsAfterMiranda();
		bi.enablePersonElderly();
		bi.enablePersonDisabled();
		Thread.sleep(2000);
		//add new phone number 
		bi.clickAddNewPhoneNumber();
		bi.selectPhoneType();
		bi.selectPhoneTypeOption();
		bi.setPhoneNumber();
		bi.enablePrimaryContact();
		bi.savePhoneNumber();
		Thread.sleep(2000);
		//add new address
		Thread.sleep(2000);
		bi.clickAddNewAddress();
		bi.selectAddressGroup();
		bi.selectAddressGroupOption();
		bi.setAddress1();
		bi.setAddress2();
		bi.setCity();
		bi.setState();
		bi.selectCounty();
		bi.selectCountyOption();
		bi.setZipCode();
		bi.saveAddress();
		Thread.sleep(2000);
		bi.savePersonBasicInfo();
}
*/	

}
