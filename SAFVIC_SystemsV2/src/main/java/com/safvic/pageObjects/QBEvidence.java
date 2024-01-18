package com.safvic.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class QBEvidence {
	WebDriver ldriver;

	public QBEvidence(WebDriver rdriver){
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(how = How.XPATH, using = "//button[@onclick='addNewevidence()']")
	@CacheLookup
	WebElement btnAddEvidence;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='EvidenceTypeId_label']/span")
	@CacheLookup
	WebElement selectEvidenceType;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='EvidenceTypeId_listbox']/li[text()='Weapon']")
	@CacheLookup						
	WebElement selectEvidenceTypeOption;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='EvidenceDispositionId_label']/span")
	@CacheLookup
	WebElement selectEvidenceDisposition;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='EvidenceDispositionId_listbox']/li[text()='Police Evidence']")
	@CacheLookup						
	WebElement selectEvidenceDispositionOption;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='FromPerson_label']/span")
	@CacheLookup
	WebElement collectedFromPerson;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='IncidentPersonId_label']/span")
	@CacheLookup
	WebElement selectPerson;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='IncidentPersonId_listbox']/li[data-offset-index='1']")
	@CacheLookup						
	WebElement selectPersonOption;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Location']")
	@CacheLookup						
	WebElement txtWhereFound;
	
	@FindBy(how = How.XPATH, using = "//textarea[@id='PhysicalDesc']")
	@CacheLookup						
	WebElement txtDescribe;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='Seized_label']/span")
	@CacheLookup
	WebElement wasSeized;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='IncidentWeaponTypeId_label']/span")
	@CacheLookup
	WebElement selectTypeOfWeapon;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='IncidentWeaponTypeId_listbox']/li[text()='Firearm (type not stated)']")
	@CacheLookup						
	WebElement selectTypeOfWeaponOption;
	
	@FindBy(how = How.XPATH, using = "//input[@id='SerialNumber']")
	@CacheLookup						
	WebElement txtSerialNumber;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='WeaponManufacturerId_label']/span")
	@CacheLookup
	WebElement selectWeaponManufacturer;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='WeaponManufacturerId_listbox']/li[text()='556 Tactical']")
	@CacheLookup						
	WebElement selectWeaponManufacturerOption;
	
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='WeaponCaliberId_label']/span")
	@CacheLookup
	WebElement selectWeaponCaliber;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='WeaponCaliberId_listbox']/li[text()='6mm/.243']")
	@CacheLookup						
	WebElement selectWeaponCaliberOption;
	
	@FindBy(how = How.XPATH, using = "//input[@id='CollectedBy']")
	@CacheLookup						
	WebElement txtCollectedBy;
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='evidenceViewModel.submitEvidenceInfo()']")
	@CacheLookup						
	WebElement btnSave;
	
	public void addEvidence() {
		btnAddEvidence.click();
	}
	
	public void selectEvidenceType() {
		selectEvidenceType.click();
	}
	
	public void selectEvidenceTypeOption() {
		selectEvidenceTypeOption.click();
	}
	
	public void selectEvidenceDisposition() {
		selectEvidenceDisposition.click();
	}
	 
	public void selectEvidenceDispositionOption() {
		selectEvidenceDispositionOption.click();
	}
	
	public void collectedFromPerson() {
		collectedFromPerson.click();
	}
	
	public void selectPerson() {
		selectPerson.click();
	}
	
	public void selectPersonOption() {
		selectPersonOption.click();
	}
	
	public void whereFound() {
		txtWhereFound.sendKeys("Test Weapon Found Location");
	}
	
	public void weaponDescription() {
		txtDescribe.sendKeys("Test Weapon Description");
	}
	
	public void wasSeized() {
		wasSeized.click();
	}
	
	public void selectTypeOfWeapon() {
		selectTypeOfWeapon.click();
	}
	
	public void selectTypeOfWeaponOption() {
		selectTypeOfWeaponOption.click();
	}

	public void weaponSerialNumber() {
		txtSerialNumber.sendKeys("Test S/N:12213123123");
	}
	
	public void selectWeaponManufacturer() {
		selectWeaponManufacturer.click();
	}
	
	public void selectWeaponManufacturerOption() {
		selectWeaponManufacturerOption.click();
	}
	
	public void selectWeaponCaliber() {
		selectWeaponCaliber.click();
	}
	
	public void selectWeaponCaliberOption() {
		selectWeaponCaliberOption.click();
	}
	
	public void collectedBy() {
		txtCollectedBy.click();
	}
	
	public void saveEvidence() {
		btnSave.click();
	}
	
	
	
	


}
