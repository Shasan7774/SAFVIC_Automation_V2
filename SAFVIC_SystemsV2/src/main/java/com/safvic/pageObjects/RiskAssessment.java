package com.safvic.pageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RiskAssessment {
	WebDriver ldriver;
	
	public RiskAssessment(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.XPATH, using="//span[normalize-space()='Risk Ass.']")
	@CacheLookup
	WebElement tabRiskAssessment;
	
	@FindBy(how =How.XPATH, using="//a[normalize-space()='Create Risk Assessment']")
	@CacheLookup
	WebElement btnCreateRiskAssessment;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-owns='IncidentPersonId_listbox']/span")
	@CacheLookup
	WebElement selectSuspect;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='IncidentPersonId_listbox']/li[@data-offset-index='0']")
	@CacheLookup						
	WebElement selectSuspectOption;

	@FindBy(how = How.XPATH, using = "//span[@aria-owns='VictimId_listbox']/span")
	@CacheLookup
	WebElement selectVictim;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='VictimId_listbox']/li[@data-offset-index='0']")
	@CacheLookup						
	WebElement selectVictimOption;
	
	//input[@id='']
	@FindBy(how = How.ID, using = "FVLikelyToOccur")
	@CacheLookup						
	WebElement familyViolence;
	
	@FindBy(how = How.ID, using = "ThreatWithWeapon")
	@CacheLookup						
	WebElement usedThreatenedWeapon;
	
	@FindBy(how = How.ID, using = "ThreatToKill")
	@CacheLookup						
	WebElement threatenedToKill;

	@FindBy(how = How.ID, using = "SuspectHasGun")
	@CacheLookup						
	WebElement suspectHasGun;
	
	@FindBy(how = How.ID, using = "GunDetails")
	@CacheLookup						
	WebElement txtGunDetails;
	
	@FindBy(how = How.ID, using = "SuspectStrangle")
	@CacheLookup						
	WebElement strangulation;
	
	@FindBy(how = How.ID, using = "Violent")
	@CacheLookup						
	WebElement violence;
	
	@FindBy(how = How.ID, using = "Jealous")
	@CacheLookup						
	WebElement jealousy;
	
	@FindBy(how = How.ID, using = "ControlActivities")
	@CacheLookup						
	WebElement controlling;
	
	@FindBy(how = How.ID, using = "IncreaseInViolence")
	@CacheLookup						
	WebElement violenceIncreased;
	
	@FindBy(how = How.ID, using = "IncreaseInViolenceDesc")
	@CacheLookup						
	WebElement txtviolenceIncreasedDesc;
	
	@FindBy(how = How.ID, using = "DestroyedItems")
	@CacheLookup						
	WebElement destroyedItems;
	
	@FindBy(how = How.ID, using = "KilledPets")
	@CacheLookup						
	WebElement hurtPets;
	
	@FindBy(how = How.ID, using = "Unemployed")
	@CacheLookup						
	WebElement unemployed;
	
	@FindBy(how = How.ID, using = "AttemptedSuicide")
	@CacheLookup						
	WebElement suicidal;

	@FindBy(how = How.ID, using = "FollowSpyShowUp")
	@CacheLookup						
	WebElement spying;
	
	@FindBy(how = How.ID, using = "ThreateningMessages")
	@CacheLookup						
	WebElement threateningMessages;
	
	@FindBy(how = How.ID, using = "AbuseAlcohol")
	@CacheLookup						
	WebElement alcoholAbuse;
	
	@FindBy(how = How.ID, using = "UseLegalDrugs")
	@CacheLookup						
	WebElement drugsUse;
	
	@FindBy(how = How.ID, using = "MightKillYou")
	@CacheLookup						
	WebElement mightKillYou;
	
	@FindBy(how = How.ID, using = "ForcedSex")
	@CacheLookup						
	WebElement forcedSex;
	
	@FindBy(how = How.ID, using = "LeftOrSeparated")
	@CacheLookup						
	WebElement separation;
	
	@FindBy(how = How.ID, using = "RecentSeparation")
	@CacheLookup						
	WebElement recentSeparation;
	
	@FindBy(how = How.ID, using = "ChildNotWithSuspect")
	@CacheLookup						
	WebElement unrelatedChild;
	
	@FindBy(how = How.ID, using = "PriorContacts")
	@CacheLookup						
	WebElement priorContacts;
	
	@FindBy(how = How.ID, using = "CourtAction")
	@CacheLookup						
	WebElement courtAction;

	@FindBy(how = How.XPATH, using = "//textarea[@id = 'AdditionalInformation']")
	@CacheLookup						
	WebElement txtAdditionalInfo;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id = 'PriorProtectiveOrder']")
	@CacheLookup						
	WebElement txtPriorProtectiveOrder;
	
	@FindBy(how = How.XPATH, using = "//input[@id ='AssessmentDate']")
	@CacheLookup						
	WebElement dateTimeOfRiskAss;
	
	@FindBy(how = How.XPATH, using = "//div/button[@type='submit']")
	@CacheLookup
	WebElement btnSaveRiskAss;
	
	public void navigateRiskAssTab() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(tabRiskAssessment));
		tabRiskAssessment.click();
	}
	
	public void createRiskAssessment() {
		btnCreateRiskAssessment.click();
	}
	
	public void selectSuspect() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectSuspect));
		selectSuspect.click();
	}
	
	public void selectSuspectOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectSuspectOption));
		selectSuspectOption.click();
	}
	
	public void selectVictim() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectVictim));
		selectVictim.click();
	}
	
	public void selectVictimOption() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(selectVictimOption));
		selectVictimOption.click();
	}
	
	public void checkFamilyViolence() {
		familyViolence.click();
	}
	
	public void checkUsedThreatenedWeapon() {
		usedThreatenedWeapon.click();
	}
	
	public void checkThreatenedToKill() {
		threatenedToKill.click();
	}
	
	public void checkSuspectHasGun() {
		suspectHasGun.click();
	}
	
	public void inputGunDetails() {
		txtGunDetails.sendKeys("Test Gun Details");
	}

	public void checkStrangulation() {
		strangulation.click();
	}
	
	public void checkViolence() {
		violence.click();
	}
	
	public void checkJealousy() {
		jealousy.click();
	}
	
	public void checkControlling() {
		controlling.click();
	}
	
	public void checkViolenceIncreased() {
		violenceIncreased.click();
	}
	
	public void inputViolenceIncreasedDesc() {
		txtviolenceIncreasedDesc.sendKeys("Test Violence Increased Description");
	}
	
	public void checkDestroyedItems() {
		destroyedItems.click();
	}
	
	public void checkHurtPets() {
		hurtPets.click();
	}
	
	public void checkUnemployed() {
		unemployed.click();
	}
	
	public void checkSuicidal() {
		suicidal.click();
	}
	
	public void checkspying() {
		spying.click();
	}
	
	public void checkThreateningMessages() {
		threateningMessages.click();
	}
	
	public void checkAlcoholAbuse() {
		alcoholAbuse.click();
	}
	
	public void checkDrugsUse() {
		drugsUse.click();
	}
	
	public void checkMightKillYou() {
		mightKillYou.click();
	}
	
	public void checkforcedSex() {
		forcedSex.click();
	}
	
	public void checkSeparation() {
		separation.click();
	}
	
	public void checkRecentSeparation() {
		recentSeparation.click();
	}
	
	public void checkUnrelatedChild() {
		unrelatedChild.click();
	}
	
	public void checkPriorContacts() {
		priorContacts.click();
	}
	
	public void checkCourtAction() {
		courtAction.click();
	}
	
	public void inputAdditionalInfo() {
		txtAdditionalInfo.sendKeys("Test Risk Assessment Additional Info");
	}
	
	public void inputPriorProtectiveOrder() {
		txtPriorProtectiveOrder.sendKeys("Test Prior Protective Order Risk Assessment");
	}
	
	public void inputDateTimeRiskAss() {
		dateTimeOfRiskAss.sendKeys("t");
	}
	
	public void saveOffenseGroup() {
		btnSaveRiskAss.click();
	}

}
