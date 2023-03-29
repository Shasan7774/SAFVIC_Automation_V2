 package com.safvic.testCases;

import org.testng.annotations.Test;

import com.safvic.pageObjects.IncidentUpdate;
import com.safvic.pageObjects.QuickCreatePeople;

public class TC_CreateVictimTest_004 extends BaseClass{

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
        victim.setPersonDOB();
        victim.savePersonInitialInformation();
		
		
	}
	

}
