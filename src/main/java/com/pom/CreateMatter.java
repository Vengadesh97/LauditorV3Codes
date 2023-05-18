package com.pom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JComboBox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.abst.Reusable;
import com.aventstack.extentreports.util.Assert;

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
		Thread.sleep(4000);
		matterTab.click();
		Thread.sleep(4000);
		createMatterTab.click();
	}

	
	
	public void createMatter(String caseTitle, String caseNumber) throws InterruptedException {
		Thread.sleep(5000);
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
		//Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,400)");
		Thread.sleep(3000);
		caseTitleField.sendKeys(caseTitle);
		caseNumberField.sendKeys(caseNumber);
		caseTypeField.sendKeys(caseType);
		courtNameField.sendKeys(courtName);
		judgesField.sendKeys(judges);
		Thread.sleep(3000);
		dateOfFillingClick.click();
		Thread.sleep(4000);
		// String date = " 5 ";
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
		Thread.sleep(5000);
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//	Thread.sleep(5000);
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
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		opponentAdvocatesSavebtn.click();
		Thread.sleep(3000);
		matterInfoNext.click();
	}

	// Groups Selecting

	// All Name Text Group
	@FindBy(xpath = "//div //div[@class='callselect']")
	List<WebElement> listOfGroupsName;
	

	// CheckBox Select
	@FindBy(xpath = "//*[@id='flexCheckDefault']")
	List<WebElement> checkboxSelectGroup;

	public void selecting(String[] NameList) throws InterruptedException {
		Thread.sleep(4000);

		// String[] groupNameList = {"Group Modules Test","Corporative
		// Law","Administration Group"};

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");

	try
	{
		
		int j = 0;
		
		List<String> groupNames = Arrays.asList(NameList);
	//	System.out.println("Selected Groups Name "+groupNames);
		String textGroup=new String();
	//	WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(5000); 
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement checkboxSelectedGroupName;
		for (int i = 0; i <listOfGroupsName.size(); i++) 
		{
			textGroup = listOfGroupsName.get(i).getText();
		//	System.out.println("All Group Name Text "+textGroup);
			  if (groupNames.contains(textGroup)) { 
				  j++; 
				  Thread.sleep(3000); 
				  checkboxSelectedGroupName = checkboxSelectGroup.get(i); 
				  executor.executeScript("arguments[0].click();", checkboxSelectedGroupName);
				  i--;
				  }	
			  if (j == groupNames.size())
			  { 
				  break;
				  }
		}		
	}
		catch (Exception e)
		{
			System.out.println(e);
	
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
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,50)");
	}
	
	public void nextPage() throws InterruptedException
	{	
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		matterInfoNext.click();
	}
	
	public void alertPopupYes() throws InterruptedException
	{
		Thread.sleep(4000);
		alertYes.click();		
	}
	
	public void viewMatterListSuccess() throws InterruptedException
	{
		Thread.sleep(4000);
		viewMatterListSuccessPopup.click();
	}

	@FindBy(xpath="//button[@class='btn btn-default alertbtn ng-star-inserted']")
	WebElement addMatterSuccess;
	
	public void addMatterSuccess() throws InterruptedException
	{
		Thread.sleep(4000);
		addMatterSuccess.click();
	}
	
	
	//Temp Client - Individuals
	
	@FindBy(xpath="//input[@placeholder='SearchClient']")
	WebElement inputTempClientSearchBox;
	
	@FindBy(id="name")
	WebElement firstNameTempClient;
	
	@FindBy(id="lastName")
	WebElement lastNameTempClient;
	
	@FindBy(id="email")
	WebElement emailTempClient;
	
	@FindBy(id="confirmemail")
	WebElement confirmemailTempClient;
	
	@FindBy(id="phonenumber")
	WebElement phonenumberTempClient;
	
	@FindBy(xpath="//select[@class='form-control textbox ng-untouched ng-pristine ng-invalid']")
	WebElement countryTempClient;
	//Cancel
	@FindBy(xpath="(//button[@class='btn btn-default btncancel btnrightitem'])[1]")
	WebElement cancelTempClient;

	//Add Temporary Button
	@FindBy(xpath="//button[@class='btn btn-primary savecls']")
	WebElement addTemporaryBtn;
	
	//
	@FindBy(xpath="//button[@class='btn btn-default alertbtn']")
	WebElement addTeamMembersBtnTempClients;
	
	
	public void tempClientIndividuals(String searchTempClient,String firstName,String lastName,String emailAddress,String confirmEmailAddress,String country,String phoneNumber) throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		inputTempClientSearchBox.sendKeys(searchTempClient);
		Thread.sleep(3000);
		firstNameTempClient.sendKeys(firstName);
		lastNameTempClient.sendKeys(lastName);
		emailTempClient.sendKeys(emailAddress);
		Thread.sleep(2000);
		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		confirmemailTempClient.sendKeys(confirmEmailAddress);
		Thread.sleep(2000);
		countryTempClient.click();
		Select objSelect =new Select(driver.findElement(By.xpath("//select[@class='form-control textbox ng-untouched ng-pristine ng-invalid']")));
		Thread.sleep(2000);
		objSelect.selectByVisibleText(country);
		phonenumberTempClient.sendKeys(phoneNumber);
		Thread.sleep(5000);
		addTemporaryBtn.click();
		Thread.sleep(4000);
		addTeamMembersBtnTempClients.click();
	}
	
	
	//Temp Client - Entity
	
	@FindBy(name="entity")
	WebElement entityTab;
	
	@FindBy(id="fullname")
	WebElement firmNameEntity;

	@FindBy(id="contact_person")
	WebElement contactPersonEntity;
	
	public void tempClientEntity(String searchTempEntity,String firmName,String contactPerson,String emailId,String confirmEmailId,String countryEntitys,String phoneNumber) throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		inputTempClientSearchBox.sendKeys(searchTempEntity);
		Thread.sleep(5000);
		entityTab.click();
		Thread.sleep(3000);
		firmNameEntity.sendKeys(firmName);
		contactPersonEntity.sendKeys(contactPerson);
		emailTempClient.sendKeys(emailId);
		Thread.sleep(2000);
		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		confirmemailTempClient.sendKeys(confirmEmailId);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div//select")).click();
		Select objSelect1 =new Select(driver.findElement(By.xpath("//div//select")));
		Thread.sleep(2000);
		objSelect1.selectByVisibleText(countryEntitys);
		phonenumberTempClient.sendKeys(phoneNumber);
		Thread.sleep(4000);
		addTemporaryBtn.click();
		Thread.sleep(4000);
		addTeamMembersBtnTempClients.click();
		
	}
	
	
	
	
}
