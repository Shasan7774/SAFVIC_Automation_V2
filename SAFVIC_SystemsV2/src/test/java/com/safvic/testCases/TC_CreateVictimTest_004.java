 package com.safvic.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentUpdate;
import com.safvic.pageObjects.PeopleBasicInfo;
import com.safvic.pageObjects.QuickCreatePeople;
import com.safvic.util.JiraPolicy;

public class TC_CreateVictimTest_004 extends BaseClass{
	//Create Victim  Test 
	
	//@JiraPolicy(logTicket=true)
	@Test
	public void CreateVictim() throws InterruptedException {
		QuickCreatePeople victim = new QuickCreatePeople(driver);
		
		Thread.sleep(3000);
		victim.navigatePeople();
		victim.clickAddPerson();
		victim.setPersonFirstName();
		victim.setPersonLastName();
		victim.setPersonMiddleName();
		victim.enableAlias();
		victim.setAliasName();
		victim.checkPersonVictim();
		victim.viewPseudonymVictim();
		victim.confirmViewPseudonymVictim();
		victim.setPseudoFirstNameVictim();
		victim.setPseudoLastNameVictim();
		victim.setPseudoMiddleNameVictim();
		
		Thread.sleep(2000);
        victim.selectPersonRace();
        victim.selectRaceOption();
        
        victim.selectPersonSex();
        victim.selectSexOption();
        
        victim.setPersonDOB();
        victim.savePersonInitialInformation();
        
        Thread.sleep(2000);

	}
	//Victim Basic Info
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
