package com.pom;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
		pageUp1();
		Thread.sleep(1000);
		visibilityOfElementWait(matterTab);
		matterTab.click();

	}

	@FindBy(xpath = "//input[@placeholder='Search Group']")
	WebElement searchInputFields;

	@FindBy(xpath = "//div //button[@data-bs-toggle='dropdown']")
	WebElement actionBtnViewLegal;

	@FindBy(xpath = "//ul[@class='dropdown-menu custom-dropdown show'] //li[2]")
	WebElement editMatterInfoPage;
	
	
	public void editMatterInfoPageBtn()
	{
		visibilityOfElementWait(editMatterInfoPage);
		Actions action = new Actions(driver);
		action.moveToElement(editMatterInfoPage).click().perform();
	}
	

	// Case Title
	@FindBy(id = "title")
	WebElement reEditCaseTitleField;

	public void editCaseTitle(String caseTitle) throws InterruptedException {
		
		visibilityOfElementWait(reEditCaseTitleField);
		reEditCaseTitleField.clear();
		reEditCaseTitleField.sendKeys(caseTitle);
	}
	
	//Assertion CaseTitleVerify 
	
	public void caseTitleVerifyAssert(String text) throws InterruptedException
	{
		visibilityOfAllElements(reEditCaseTitleField);
		String caseTitleVerify1 = reEditCaseTitleField.getAttribute("value");
		Assert.assertEquals(text, caseTitleVerify1,"caseTitleVerify");
	}
	
	// Case Number
	@FindBy(name = "case_number")
	WebElement reEditCaseNumberField;

	public void editCaseNumber(String caseNumber) throws InterruptedException {
		
		visibilityOfElementWait(reEditCaseNumberField);
		reEditCaseNumberField.clear();
		reEditCaseNumberField.sendKeys(caseNumber);
	}

	public void caseNumberVerifyAssert(String text) throws InterruptedException
	{
		visibilityOfAllElements(reEditCaseNumberField);
		String caseNumberVerifyAssert1 = reEditCaseNumberField.getAttribute("value");
		Assert.assertEquals(text, caseNumberVerifyAssert1,"caseNumberVerify");
	}
	
	
	// Description
	@FindBy(name = "description")
	WebElement reEditDescriptionField;

	public void editDescription(String editDescription) throws InterruptedException {
		
		visibilityOfElementWait(reEditDescriptionField);
		reEditDescriptionField.clear();
		reEditDescriptionField.sendKeys(editDescription);
	}


	public void descriptionVerifyAssert(String text) throws InterruptedException
	{
		visibilityOfAllElements(reEditDescriptionField);
		String descriptionVerifyAssert1 = reEditDescriptionField.getAttribute("value");
		Assert.assertEquals(text, descriptionVerifyAssert1,"descriptionVerify");
	}
	
	
	// Case Type
	@FindBy(id = "case_type")
	WebElement reEditCaseTypeField;

	public void editCaseType(String editCaseType) throws InterruptedException {
		
		visibilityOfElementWait(reEditCaseTypeField);
		reEditCaseTypeField.clear();
		reEditCaseTypeField.sendKeys(editCaseType);
	}
	
	public void caseTypeVerifyAssert(String text) throws InterruptedException
	{
		visibilityOfAllElements(reEditCaseTypeField);
		String caseTypeVerifyAssert1 = reEditCaseTypeField.getAttribute("value");
		Assert.assertEquals(text, caseTypeVerifyAssert1,"caseTypeVerify");
	}

	// Court name
	@FindBy(name = "court_name")
	WebElement reEditCourtNameField;

	public void editCourtName(String editCourtName) throws InterruptedException {
		
		visibilityOfElementWait(reEditCourtNameField);
		reEditCourtNameField.clear();
		reEditCourtNameField.sendKeys(editCourtName);
	}
	
	public void courtNameVerifyAssert(String text) throws InterruptedException
	{
		visibilityOfAllElements(reEditCourtNameField);
		String courtNameVerifyAssert1 = reEditCourtNameField.getAttribute("value");
		Assert.assertEquals(text, courtNameVerifyAssert1,"courtNameVerify");
	}
	
	// Judges
	@FindBy(name = "judges")
	WebElement reEditJudgesField;

	public void editJudges(String editJudges) throws InterruptedException {
		
		visibilityOfElementWait(reEditJudgesField);
		reEditJudgesField.clear();
		reEditJudgesField.sendKeys(editJudges);
	}
	
	public void judgesVerifyAssert(String text) throws InterruptedException
	{
		visibilityOfAllElements(reEditJudgesField);
		String judgesVerifyAssert1 = reEditJudgesField.getAttribute("value");
		Assert.assertEquals(text, judgesVerifyAssert1,"judgesVerify");
	}

	// Opponent Advocates [Add] Buttons
	@FindBy(xpath = "//input[@type='button']")
	WebElement addOpponentAdvocates;

	// Name
	@FindBy(name = "name")
	WebElement addOpponentAdvocatesName;

	// Email
	@FindBy(name = "email")
	WebElement addOpponentAdvocatesEmail;

	// Phone
	@FindBy(id = "phone")
	WebElement addOpponentAdvocatesPhone;

	// Save
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement opponentAdvocatesSavebtn;

	public void addOpponentAdv(String names, String emails, String phone) throws InterruptedException {
		Thread.sleep(1000);
		visibilityOfElementWait(addOpponentAdvocates);
		addOpponentAdvocates.click();
		visibilityOfElementWait(addOpponentAdvocatesName);
		addOpponentAdvocatesName.sendKeys(names);
		visibilityOfElementWait(addOpponentAdvocatesEmail);
		addOpponentAdvocatesEmail.sendKeys(emails);
		Thread.sleep(1000);
		scrollDown();
		visibilityOfElementWait(addOpponentAdvocatesPhone);
		addOpponentAdvocatesPhone.sendKeys(phone);
		visibilityOfAllElements(opponentAdvocatesSavebtn);
		opponentAdvocatesSavebtn.click();
		}

	
	
	@FindBy(xpath="//div[@class='opponent']")
	List<WebElement> opponentAdv;
	
	public void opponentAd(String names) throws InterruptedException
	{
		Thread.sleep(2000);
		boolean anyMatch = opponentAdv.stream().anyMatch(documentVer-> documentVer.getText().equalsIgnoreCase(names));
		Thread.sleep(1000);
		Assert.assertTrue(anyMatch);
	}
	
	// Date of Filling
	@FindBy(xpath = "//*[@class='mat-mdc-button-touch-target']")
	WebElement addDateOfFillingClick;

	// DateofFilling
	public void dateOfFilling(String date) throws InterruptedException {
		
		visibilityOfElementWait(addDateOfFillingClick);
		addDateOfFillingClick.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}

	@FindBy(xpath="//input[@name='date_of_filling']")
	WebElement dof;
	
	public void dateOfFillingVerifyAssert(String text)
	{
		visibilityOfAllElements(dof);
		String dateOfFillingVerifyAssert1 = dof.getAttribute("value");
		Assert.assertEquals(text, dateOfFillingVerifyAssert1);
	}
	
	
	
	
	// Priority
	public void priorityChange(String prioritySelect) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='" + prioritySelect + "']")).click();
	}

	// Status - Active
	@FindBy(xpath = "//button[text()='Active']")
	WebElement statusActiveBtn;

	// Status - Active
	public void statusActive() throws InterruptedException {
		visibilityOfElementWait(statusActiveBtn);
		statusActiveBtn.click();
	}

	// Status Pending
	@FindBy(xpath = "//button[text()='Pending']")
	WebElement statusSelect;

	// Status - Pending
	public void statusPending() throws InterruptedException {
		visibilityOfElementWait(statusSelect);
		statusSelect.click();
		
	}

	// Next
	@FindBy(xpath = "//button[@class='btn btn-primary btnsave savecls']")
	WebElement editMatterInfoSave;

	// Cancel
	@FindBy(xpath = "//button[@type='reset']")
	WebElement matterInfoCancel;

	public void editMatterSave() throws InterruptedException {
		visibilityOfElementWait(editMatterInfoSave);
		editMatterInfoSave.click();
	}

	public void editMatterCancel() throws InterruptedException {
		visibilityOfElementWait(matterInfoCancel);
		matterInfoCancel.click();
	}

	
	
	@FindBy(xpath = "//button[@class='btn btn-default alertbtn']")
	WebElement successPopupOk;

	// Success Popup
	public void successPopupEditMatterInfo() throws InterruptedException {
		visibilityOfElementWait(successPopupOk);
		successPopupOk.click();
	}

	public void pageUp() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}
	
	
	public void scrollUp() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,100)");
	}

	// Scroll down
	public void scrollDown() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	
	@FindBy(xpath="//tr//td[1]")
	List<WebElement> allMatterNamesText;
	
	// Action Button Click
	@FindBy(xpath="//tr//td[6]")
	List<WebElement> actionBtnClicked; 
	
	// Action Button
	@FindBy(xpath = "//div //button[@data-bs-toggle='dropdown']")
	WebElement actionBtn;
	
	
	public void searchBarFieldsandActionBtn(String MatterName) throws InterruptedException
	{
		visibilityOfElementWait(searchInputFields);
		searchInputFields.clear();
		searchInputFields.sendKeys(MatterName);
		
		pageDown();
		Thread.sleep(10000);
		Actions action = new Actions(driver);
		
		for(int i=0;i<allMatterNamesText.size();i++)
		{
			String textNames = allMatterNamesText.get(i).getText();
			
			if(MatterName.contains(textNames))
			{
				visibilityOfAllElements(actionBtn);
				WebElement actionClicked = actionBtnClicked.get(i);
				visibilityOfAllElements(actionBtn);
			action.moveToElement(actionClicked).click().perform();
				
			}
			
		}
	}
	
	//String names ="List of Legal Matters";
	
	@FindBy(xpath="//div[@class='custusername tab-margin fontweight']")
	WebElement texts;
	
	public void nameIsDisplay(String names) throws InterruptedException {

		scrollUp();
		
		visibilityOfAllElements(texts);
		
		String text = texts.getText();
		
		if(names.contains(text))
		{
			System.out.println("Name is displayed");
		}
		else
		{
			System.out.println("Nmae not displayed");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
