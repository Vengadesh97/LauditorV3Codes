package com.pom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class CreateMatter extends Reusable {

	WebDriver driver;

	public CreateMatter(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Left Side Menu Matter Name
	@FindBy(xpath = "(//div //img[@class='mattersicon'])[1]")
	WebElement matterTab;

	// Legal Matter Tab
	@FindBy(xpath = "//*[text()='Legal Matters']")
	WebElement legalMatterTab;

	// Create Matter Tab
	@FindBy(xpath = "//a[text()='Create']")
	WebElement createMatterTab;

	// Case Title
	@FindBy(id = "title")
	WebElement caseTitleField;

	// Case Number
	@FindBy(name = "case_number")
	WebElement caseNumberField;

	// Date of Filling
	@FindBy(xpath = "//*[@class='mat-mdc-button-touch-target']")
	WebElement dateOfFillingClick;

	// Description
	@FindBy(name = "description")
	WebElement descriptionField;

	// Case Type
	@FindBy(id = "case_type")
	WebElement caseTypeField;

	// Court name
	@FindBy(name = "court_name")
	WebElement courtNameField;

	// Judges
	@FindBy(name = "judges")
	WebElement judgesField;

	// Opponent Advocates [Add] Buttons
	@FindBy(xpath = "//input[@type='button']")
	WebElement addOpponentAdvocates;

	// Name
	@FindBy(name ="name")
	WebElement opponentAdvocatesName;

	// Email
	@FindBy(name ="email")
	WebElement opponentAdvocatesEmail;

	// Phone
	@FindBy(id ="phone")
	WebElement opponentAdvocatesPhone;

	// Save
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement opponentAdvocatesSavebtn;

	// Next
	@FindBy(className = "btnsave")
	WebElement matterInfoNext;

	// Cancel
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement matterInfoCancel;

	public void leftMatterTab() throws InterruptedException {
		Thread.sleep(3000);
		matterTab.click();
	}

	public void createMatter(String caseTitle, String caseNumber) throws InterruptedException {
		Thread.sleep(5000);
		createMatterTab.click();
		caseTitleField.sendKeys(caseTitle);
		caseNumberField.sendKeys(caseNumber);
		Thread.sleep(1000);

		pageDown();
		Thread.sleep(3000);
		matterInfoNext.click();

	}

	public void createMatterAllFieldEnter(String caseTitle, String caseNumber, String caseType, String courtName,
			String judges, String date, String prioritySelect, String description, String advocateName,
			String advocateEmail, String advocatePhone) throws InterruptedException {
		Thread.sleep(5000);
		createMatterTab.click();
		caseTitleField.sendKeys(caseTitle);
		caseNumberField.sendKeys(caseNumber);
		caseTypeField.sendKeys(caseType);
		courtNameField.sendKeys(courtName);
		judgesField.sendKeys(judges);
		dateOfFillingClick.click();
		Thread.sleep(4000);
		// String date = " 5 ";
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
		Thread.sleep(5000);
		pageDown();
		Thread.sleep(5000);
		// Prioirty
		// String select = "Low";
		driver.findElement(By.xpath("//button[text()='" + prioritySelect + "']")).click();
		Thread.sleep(2000);
		descriptionField.sendKeys(description);
		Thread.sleep(3000);
		addOpponentAdvocates.click();
		opponentAdvocatesName.sendKeys(advocateName);
		opponentAdvocatesEmail.sendKeys(advocateEmail);
		opponentAdvocatesPhone.sendKeys(advocatePhone);
		Thread.sleep(3000);
		pageDown();
		opponentAdvocatesSavebtn.click();
		Thread.sleep(3000);
		matterInfoNext.click();
	}

	// Groups Selecting

	// All Name Text Group
	@FindBy(xpath = "//div[@class='callselect']")
	List<WebElement> listOfGroupsName;

	// CheckBox Select
	@FindBy(xpath = "//*[@id='flexCheckDefault']")
	List<WebElement> checkboxSelectGroup;

	public void selecting(String[] NameList) throws InterruptedException {
		Thread.sleep(5000);

		// String[] groupNameList = {"Group Modules Test","Corporative
		// Law","Administration Group"};

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");

		int j = 0;
		List<String> groupNames = Arrays.asList(NameList);
	//	List<String> groupNames = new ArrayList<>(Arrays.asList(NameList));

		for (int i = 0; i <listOfGroupsName.size(); i++) {
			
			String textGroup = listOfGroupsName.get(i).getText();
			Thread.sleep(1000);
			
			if (groupNames.contains(textGroup)) {
				j++;
				Thread.sleep(2000);
				WebElement checkboxSelectedGroupName = checkboxSelectGroup.get(i);
				Thread.sleep(2000);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				Thread.sleep(2000);
				executor.executeScript("arguments[0].click();", checkboxSelectedGroupName);
				
				if (j == groupNames.size()) {
					break;

				}

			}

		}

		Thread.sleep(2000);

		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);
		// Next
		driver.findElement(By.className("btnsave")).click();

	}
	
	public void selecting1(String[] NameList) throws InterruptedException {
		Thread.sleep(5000);

		// String[] groupNameList = {"Group Modules Test","Corporative
		// Law","Administration Group"};

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");

		int j = 0;
		List<String> groupNames = Arrays.asList(NameList);
	//	List<String> groupNames = new ArrayList<>(Arrays.asList(NameList));

		for (int i = 0; i <listOfGroupsName.size(); i++) {
			
			String textGroup = listOfGroupsName.get(i).getText();
			Thread.sleep(1000);
			
			if (groupNames.contains(textGroup)) {
				j++;
				Thread.sleep(2000);
				WebElement checkboxSelectedGroupName = checkboxSelectGroup.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", checkboxSelectedGroupName);
				
				if (j == groupNames.size()) {
					break;

				}

			}

		}

		Thread.sleep(2000);

		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);
		// Next
		driver.findElement(By.className("btnsave")).click();

	}

	// Document Page Save / Alert Popup

	@FindBy(xpath = "//div[@class='alertbutton ng-star-inserted']//button[2]")
	WebElement alertYes;

	@FindBy(className = "alertbtnno")
	WebElement alertNo;

	@FindBy(xpath = "//button[text()='Add Matter']")
	WebElement addMatterSuccessPopup;

	@FindBy(xpath = "//button[text()='View Matter List']")
	WebElement viewMatterListSuccessPopup;

	public void documentPageSaveandSuccessPopup() throws InterruptedException {
	//	Thread.sleep(3000);
	//	matterInfoNext.click();
		Thread.sleep(5000);
		alertYes.click();
		Thread.sleep(5000);
		viewMatterListSuccessPopup.click();

	}
	
	public void documentPageSave() throws InterruptedException
	{	
		matterInfoNext.click();
		Thread.sleep(3000);
	}
	
	public void alertPopupYes()
	{
		alertYes.click();		
	}
	
	public void viewMatterListSuccess()
	{
		viewMatterListSuccessPopup.click();
	}

}
