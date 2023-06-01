package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class ViewMatterPOM extends Reusable {

	
	WebDriver driver;

	public ViewMatterPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	// Left Side Menu Matter Name
	@FindBy(xpath = "(//div //img[@class='mattersicon'])[1]")
	WebElement matterTab;


	public void leftMatterTab() throws InterruptedException {
		Thread.sleep(4000);
		matterTab.click();
		
	}
	
	
	@FindBy(xpath="//input[@placeholder='Search Group']")
	WebElement searchInputFields;
	
	@FindBy(xpath="//div //button[@data-bs-toggle='dropdown']")
	WebElement actionBtnViewLegal;
	
	@FindBy(xpath="//ul[@class='dropdown-menu show'] //li[2]")
	WebElement editMatterInfoPage;
	
	
	public void searchInputandEditMatterInfo(String searchCaseName) throws InterruptedException
	{
		Thread.sleep(5000);
		searchInputFields.clear();
		Thread.sleep(1000);
		searchInputFields.sendKeys(searchCaseName);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");
		
		Thread.sleep(5000);
		//action button
		actionBtnViewLegal.click();
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(editMatterInfoPage).click().perform();
	}
	
	
	// Case Title
		@FindBy(id = "title")
		WebElement reEditCaseTitleField;
		
		public void editCaseTitle(String caseTitle) throws InterruptedException
		{
			Thread.sleep(1000);
			reEditCaseTitleField.clear();
			Thread.sleep(1000);
			reEditCaseTitleField.sendKeys(caseTitle);
		}
	
		// Case Number
		@FindBy(name = "case_number")
		WebElement reEditCaseNumberField;
		
		public void editCaseNumber(String caseNumber) throws InterruptedException
		{
			Thread.sleep(1000);
			reEditCaseNumberField.clear();
			Thread.sleep(1000);
			reEditCaseNumberField.sendKeys(caseNumber);
		}
		
		// Description
		@FindBy(name = "description")
		WebElement reEditDescriptionField;

		public void editDescription(String editDescription) throws InterruptedException
		{
			Thread.sleep(1000);
			reEditDescriptionField.clear();
			Thread.sleep(1000);
			reEditDescriptionField.sendKeys(editDescription);
		}
		
		// Case Type
		@FindBy(id = "case_type")
		WebElement reEditCaseTypeField;

		public void editCaseType(String editCaseType) throws InterruptedException
		{
			Thread.sleep(1000);
			reEditCaseTypeField.clear();
			Thread.sleep(1000);
			reEditCaseTypeField.sendKeys(editCaseType);
		}
			
		// Court name
		@FindBy(name = "court_name")
		WebElement reEditCourtNameField;

		public void editCourtName(String editCourtName) throws InterruptedException
		{
			Thread.sleep(1000);
			reEditCourtNameField.clear();
			Thread.sleep(1000);
			reEditCourtNameField.sendKeys(editCourtName);
		}
			
		// Judges
		@FindBy(name = "judges")
		WebElement reEditJudgesField;

		public void editJudges(String editJudges) throws InterruptedException
		{
			Thread.sleep(1000);
			reEditJudgesField.clear();
			Thread.sleep(1000);
			reEditJudgesField.sendKeys(editJudges);
		}
		
		
		// Opponent Advocates [Add] Buttons
		@FindBy(xpath = "//input[@type='button']")
		WebElement addOpponentAdvocates;

		// Name
		@FindBy(name ="name")
		WebElement addOpponentAdvocatesName;

		// Email
		@FindBy(name ="email")
		WebElement addOpponentAdvocatesEmail;

		// Phone
		@FindBy(id ="phone")
		WebElement addOpponentAdvocatesPhone;

		// Save
		@FindBy(xpath = "(//button[@type='submit'])[1]")
		WebElement opponentAdvocatesSavebtn;

		
		public void addOpponentAdv(String names,String emails,String phone) throws InterruptedException
		{
			Thread.sleep(3000);
			addOpponentAdvocates.click();
			Thread.sleep(3000);
			addOpponentAdvocatesName.sendKeys(names);
			addOpponentAdvocatesEmail.sendKeys(emails);
			addOpponentAdvocatesPhone.sendKeys(phone);
		}
		
		// Date of Filling
		@FindBy(xpath = "//*[@class='mat-mdc-button-touch-target']")
		WebElement addDateOfFillingClick;

		//DateofFilling
		public void dateOfFilling(String date) throws InterruptedException
		{
			Thread.sleep(2000);
			addDateOfFillingClick.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
		}
		
		//Priority
		public void priorityChange(String prioritySelect) throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='" + prioritySelect + "']")).click();
		}
		
		//Status
		@FindBy(id="pills-home-tab")
		WebElement statusSelect;

		//Status
		public void statusPending() throws InterruptedException
		{
			statusSelect.click();
		}
		
		// Next
		@FindBy(xpath = "//button[@type='submit']")
		WebElement editMatterInfoSave;
		
		// Cancel
		@FindBy(xpath = "//button[@type='reset']")
		WebElement matterInfoCancel;
		
		public void editMatterSave() throws InterruptedException
		{
			Thread.sleep(5000);
			editMatterInfoSave.click();
		}

		@FindBy(xpath="//button[@class='btn btn-default alertbtn']")
		WebElement successPopupOk;
		//Success Popup
		public void successPopupEditMatterInfo() throws InterruptedException
		{
			Thread.sleep(5000);
			successPopupOk.click();
		}
		
		public void scrollUp() throws InterruptedException
		{
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,100)");
		}
		
		
		//Scroll down
		public void scrollDown() throws InterruptedException
		{
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}




}
