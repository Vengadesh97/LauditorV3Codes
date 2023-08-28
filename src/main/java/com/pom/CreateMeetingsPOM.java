package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class CreateMeetingsPOM extends Reusable {

	WebDriver driver;

	public CreateMeetingsPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Left side Meetings Tab
	@FindBy(xpath = "//span[text()='Meetings']")
	WebElement meetingTabBtn;

	// Create Tab
	@FindBy(xpath = "//a[text()='Create']")
	WebElement createTabBtn;

	// Event Type Legal
	@FindBy(id = "legalMatter")
	WebElement legalEventTypeBtn;

	// MatterName
	@FindBy(xpath = "//div //select")
	WebElement listLegalNames;

	// Subject / Task
	@FindBy(xpath = "//div //select[@formcontrolname='title']")
	WebElement taskList;

	// Time Zone
	@FindBy(xpath = "//div //select[@formcontrolname='timezone_location']")
	WebElement timeZoneList;

	// Start Time
	@FindBy(xpath = "//div //select[@formcontrolname='from_ts']")
	WebElement startTimeList;

	// End Time
	@FindBy(xpath = "//div //select[2]")
	WebElement endTimeList;

	// Date
	@FindBy(id = "drp")
	WebElement dates;

	// Repetition
	@FindBy(xpath = "//div //select[@formcontrolname='repeat_interval']")
	WebElement repetitionList;

	// AllDays
	@FindBy(id = "allday")
	WebElement allDayCheckBox;

	// Meeting-Link
	@FindBy(id = "meeting-link")
	WebElement meetingLinkInput;

	// Dial-In Number
	@FindBy(id = "number")
	WebElement dialNumberInput;

	// Location
	@FindBy(id = "location")
	WebElement locationInput;

	// Meeting - Agenda
	@FindBy(name = "meeting-agenda")
	WebElement meetingAgendaInput;

	// AddEntity
	@FindBy(xpath = "//select[@class='textbox form-control']")
	WebElement addEntityList;

	// searchboxEntity
	@FindBy(xpath = "//input[@placeholder='Search client']")
	WebElement searchBoxEntityInput;

	// Add Entity button
	@FindBy(xpath = "(//input[@type='button'])[2]")
	WebElement addEntityButton;

	// AddTeamMember
	@FindBy(xpath = "//input[@placeholder='Search team member']")
	WebElement searchBoxTeamMemberInput;

	// AddButtonTeamMember
	@FindBy(xpath = "(//input[@type='button'])[1]")
	WebElement addTMbutton;

	// AddDocument
	@FindBy(xpath = "//input[@placeholder='Search Document']")
	WebElement searchBoxDocumentInput;

	// Attach Button Document
	@FindBy(xpath = "//input[@value='Attach']")
	WebElement attachDocumentbutton;

	// Add Individuals
	@FindBy(xpath = "//input[@placeholder='Search Individual Clients']")
	WebElement searchBoxIndividualsInput;

	// Add button Individuals
	@FindBy(xpath = "//div//input[@placeholder='Search Individual Clients']/following::input")
	WebElement addIndividualsbutton;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton;

	@FindBy(xpath = "//button[text()='View Changes']")
	WebElement viewChangesButton;

//----------------------------------------------------------------------------------------------------------

	// Left side Meeting Tab
	public void leftMeetingTab() throws InterruptedException {
		visibilityOfAllElements(meetingTabBtn);
		meetingTabBtn.click();
		Thread.sleep(2000);
		scrollUp();
		Thread.sleep(2000);
	}

	// CreateTab
	public void createTab() {
		visibilityOfAllElements(createTabBtn);
		createTabBtn.click();
	}

	// Event Type
	public void legalEvent() {
		visibilityOfAllElements(legalEventTypeBtn);
		legalEventTypeBtn.click();
	}

	// Matter Name Method
	public void matterName(String name) throws InterruptedException {
		if (!name.equals("")) {
			visibilityOfAllElements(listLegalNames);
			listLegalNames.click();
			selectingNames(listLegalNames, name);
			listLegalNames.click();
		}
	}

	// Subject/Task Method
	public void taskName(String name) throws InterruptedException {
		if (!name.equals("")) {
			visibilityOfAllElements(taskList);
			taskList.click();
			selectingNames(taskList, name);
			taskList.click();
		}
	}

	// TimeZone
	public void timeZone(String name) throws InterruptedException {
		if (!name.equals("")) {
			visibilityOfAllElements(timeZoneList);
			timeZoneList.click();
			selectingNames(timeZoneList, name);
			timeZoneList.click();
		}
	}

	// StartDate
	public void startTime(String name) throws InterruptedException {
		if (!name.equals("")) {
			visibilityOfAllElements(startTimeList);
			startTimeList.click();
			selectingNames(startTimeList, name);
			startTimeList.click();
		}
	}

	// EndDate
	public void endTime(String name) throws InterruptedException {
		if (!name.equals("")) {
			visibilityOfAllElements(endTimeList);
			endTimeList.click();
			selectingNames(endTimeList, name);
			endTimeList.click();
		}
	}

	// Date
	public void dateChoosen(String date) throws InterruptedException {
		if (!date.equals("")) {
			dates.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='" + date + "']")).click();
		}
	}

	// Repetition
	public void repetition(String name) throws InterruptedException {
		if (!name.equals("")) {
			visibilityOfAllElements(repetitionList);
			repetitionList.click();
			selectingNames(repetitionList, name);
			repetitionList.click();
		}
	}

	// All Days
	public void allDays() {
		visibilityOfAllElements(allDayCheckBox);
		allDayCheckBox.click();
	}

	// Meeting Link
	public void meetingLink(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(meetingLinkInput);
			meetingLinkInput.sendKeys(text);
		}
	}

	// Dial-in Number
	public void dialNumber(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(dialNumberInput);
			dialNumberInput.sendKeys(text);
		}
	}

	// Location
	public void location(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(locationInput);
			locationInput.sendKeys(text);
		}
	}

	// Meeting Agenda
	public void meetingAgenda(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(meetingAgendaInput);
			meetingAgendaInput.sendKeys(text);
		}
	}

	// Add Team Member
	public void addTeamMember(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(searchBoxTeamMemberInput);
			searchBoxTeamMemberInput.click();
			searchBoxTeamMemberInput.sendKeys(text);
			visibilityOfAllElements(addTMbutton);
			addTMbutton.click();
		}
	}

	// Add Entity
	public void addEntityFirmSelect(String name) throws InterruptedException {
		if (!name.equals("")) {
			visibilityOfAllElements(addEntityList);
			addEntityList.click();
			selectingNames(addEntityList, name);
			addEntityList.click();
		}
	}

	public void addEntityMemberSelect(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(searchBoxEntityInput);
			searchBoxEntityInput.click();
			searchBoxEntityInput.sendKeys(text);
			visibilityOfAllElements(addEntityButton);
			addEntityButton.click();
		}
	}

	// Add document
	public void addDocument(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(searchBoxDocumentInput);
			searchBoxDocumentInput.click();
			searchBoxDocumentInput.sendKeys(text);
			visibilityOfAllElements(attachDocumentbutton);
			attachDocumentbutton.click();
		}
	}

	// Add Individual
	public void addIndividuals(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(searchBoxIndividualsInput);
			searchBoxIndividualsInput.click();
			searchBoxIndividualsInput.sendKeys(text);
			visibilityOfAllElements(addIndividualsbutton);
			addIndividualsbutton.click();
		}
	}

	// save
	public void saveButton() {
		visibilityOfAllElements(submitButton);
		submitButton.click();
	}

	// view Change
	public void viewChangesButton() {
		visibilityOfAllElements(viewChangesButton);
		viewChangesButton.click();
	}

	// Scrolldown
	public void scrollDown1() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,250)");
	}

	// After
	public void scrollDown2() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,600)");
	}

	// before add document and before add individuals
	public void scrollDown3() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void scrollUp() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}

}
