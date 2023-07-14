package com.pom;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.abst.Reusable;

public class ViewMatterViewDetailsPOM extends Reusable {

	WebDriver driver;

	public ViewMatterViewDetailsPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='dropdown-menu custom-dropdown show'] //li[1]")
	WebElement viewDetailsbtn;

	public void viewDetailsBtn() {
		visibilityOfElementWait(viewDetailsbtn);
		Actions action = new Actions(driver);
		action.moveToElement(viewDetailsbtn).click().perform();
	}

	@FindBy(xpath = "//div[@class='wrapper']")
	WebElement leftProgress;

	public void viewDetailsleftSide() {
		visibilityOfElementWait(leftProgress);
		Actions action = new Actions(driver);
		action.moveToElement(leftProgress).build().perform();
	}

	@FindBy(id = "pills-home-tab")
	WebElement timelineTab;

	@FindBy(xpath = "(//p[@class='pnumber pleagalsubitem'])[2]")
	WebElement meetingNames;

	public void checkMeetingNameAppear(String meetingNameAppear) throws InterruptedException {
		viewDetailsleftSide();
		Thread.sleep(1000);
		visibilityOfAllElements(meetingNames);
		String text = meetingNames.getText();
		Assert.assertEquals(text, meetingNameAppear);
	}

	// Once Meeting is over , that meeting name appear.

	@FindBy(xpath = "//ul //li //div //img[@class='editico']")
	WebElement meetingBtn;

	public void meetingEditBtn() throws InterruptedException {
		visibilityOfAllElements(meetingBtn);
		meetingBtn.click();
	}

	@FindBy(xpath = "//ul //li //div //textarea[@class='ng-pristine ng-valid ng-touched']")
	WebElement descriptionBoxs;

	public void descriptionBox(String text) throws InterruptedException {
		Thread.sleep(2000);
		// visibilityOfAllElements(descriptionBoxs);
		// descriptionBoxs.click();
		// descriptionBoxs.clear();
		descriptionBoxs.sendKeys(text);
	}

	@FindBy(xpath = "//button[@type='reset']")
	WebElement cancelBtn;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement savelBtn;

	public void cancelButton() throws InterruptedException {
		visibilityOfAllElements(cancelBtn);
		cancelBtn.click();
	}

	public void saveButton() throws InterruptedException {
		visibilityOfAllElements(savelBtn);
		savelBtn.click();
	}

	// Eye Symbol Scenario

	@FindBy(xpath = "//div //ul //li //div //img[2]")
	WebElement eyeClick;

	public void eyes() throws InterruptedException
	{
		Thread.sleep(2000);
		//visibilityOfAllElements(eyeClick);
		eyeClick.click();
	}
	
	@FindBy(xpath = "//div //ul //li //div //img[2]")
	WebElement eyeActive;
	
	public void eyesActives() throws InterruptedException
	{
		Thread.sleep(2000);
		//visibilityOfAllElements(eyeActive);
		eyeActive.click();
	}

	@FindBy(xpath = "(//p[@class='lgalsubitem noteselipses'])[2]")
	WebElement textIsDisplay;

	public void eyeButton(String enteredText) {
		visibilityOfAllElements(eyeClick);
		eyeClick.click();
		String text = textIsDisplay.getText();
		Assert.assertEquals(text, enteredText);
	}

	// Left Side Arrow

	@FindBy(xpath = "//img[@class='slidearrowtgl']")
	WebElement sideRightArrow;

	public void rightArrowButton() {
		visibilityOfAllElements(sideRightArrow);
		sideRightArrow.click();
	}

	// Summary Text Verify it appear or not
	@FindBy(xpath = "//p[@class='psize']")
	WebElement summaryHeadingText;

	public void summaryTextVerify() {
		visibilityOfAllElements(summaryHeadingText);
		String text = summaryHeadingText.getText();
		Assert.assertEquals(text, "Summary");
	}

	// Summary Edit btn
	@FindBy(id = "but_enable")
	WebElement editBtn;

	public void summaryEditButton() {
		visibilityOfAllElements(editBtn);
		editBtn.click();
	}

	public void scrollUpnearbyMattername() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,300)");
	}

	public void scrolldownMatter() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,450)");
	}

	// Team Member selections

	// TeamMember and Clients
	@FindBy(xpath = "(//button[@name='priority'])[3]")
	WebElement teamMembersandClientsTab;

	public void teamMemberAndClientsBtn() {
		visibilityOfAllElements(teamMembersandClientsTab);
		teamMembersandClientsTab.click();
	}

	// TeamMember
	@FindBy(xpath = "(//button[@id='pills-home-tab'])[2]")
	WebElement teamMemberTab;

	public void teamMemberBtn() {
		visibilityOfAllElements(teamMemberTab);
		teamMemberTab.click();
	}

	// List of Names
	@FindBy(xpath = "//div[@id='selectbx '] //div[@id='search']")
	List<WebElement> listOfTMnames;

	// Checkbox select
	@FindBy(xpath = "//div[@id='selectbx '] //input[@id='flexCheckDefault']")
	List<WebElement> checkBoxSelect;

	public void selectTeamMembers(String[] nameList) throws InterruptedException {
		Thread.sleep(2000);
		List<String> groupNames = Arrays.asList(nameList);
		String textGroup = new String();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement checkboxSelectedGroupName;
		for (int i = 0; i < listOfTMnames.size(); i++) {
			textGroup = listOfTMnames.get(i).getText();
			if (groupNames.contains(textGroup)) {
				checkboxSelectedGroupName = checkBoxSelect.get(i);
				visibilityOfAllElements(checkboxSelectedGroupName);
				Thread.sleep(2000);
				executor.executeScript("arguments[0].click();", checkboxSelectedGroupName);
				i--;
			}
		}

	}

	// Select All
	@FindBy(xpath = "//input[@id='selectAllMembers']")
	WebElement selectAllbtn;

	public void selectAllBtn() {
		visibilityOfAllElements(selectAllbtn);
		selectAllbtn.click();
	}

	// Select All Clients
	
	@FindBy(xpath="//input[@id='selectAllClients']")
	WebElement selectAllClient;
	
	public void selectAllClientBtn()
	{
		visibilityOfAllElements(selectAllClient);
		selectAllClient.click();
	}
	
	
	
	
	
	// Save Button

	@FindBy(xpath = "//button[@type='submit']")
	WebElement nextButton;

	public void saveButtonOnAddMembers() throws InterruptedException {
		pageDown();
		Thread.sleep(2000);
		visibilityOfAllElements(nextButton);
		nextButton.click();
	}

	// Cancel Button

	@FindBy(xpath = "//button[@type='reset']")
	WebElement cancelButton;

	public void cancelButtonOnAddMembers() throws InterruptedException {
		pageDown();
		Thread.sleep(2000);
		visibilityOfAllElements(cancelButton);
		cancelButton.click();
	}

	// Close Button

	@FindBy(xpath = "//div[@aria-label='Close']")
	WebElement closeButton;

	public void closeButtonSuccess() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(closeButton);
		closeButton.click();
	}

	// Alert Yes
	@FindBy(xpath = "//button[@class='btn btn-default alertbtn alertbtnyes']")
	WebElement yesBtn;

	public void yesButtonAlert() {
		visibilityOfAllElements(yesBtn);
		yesBtn.click();
	}

	// Alert No
	@FindBy(xpath = "//button[text()='No']")
	WebElement noButtonAlertClick;

	public void alertNoButtonClick() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(noButtonAlertClick);
		noButtonAlertClick.click();
	}

	// Team Member
	
	@FindBy(xpath = "//input[@placeholder='Search team member']")
	WebElement searchBox;

	public void searchNames(String names) {
		visibilityOfAllElements(searchBox);
		searchBox.sendKeys(names);
	}

	// Clients
	
	@FindBy(xpath="//input[@placeholder='Search client']")
	WebElement searchBoxClients;
	
	public void searchClientNames(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		visibilityOfAllElements(searchBoxClients);
		searchBoxClients.sendKeys(name);
	}
	
	@FindBy(xpath = "//input[@id='flexCheckDefault']")
	WebElement selectbtn;

	public void searchAndSelectTeamMember(String nameLists) throws InterruptedException {
		Thread.sleep(2000);
		for (WebElement searchNames : listOfTMnames) {
			Thread.sleep(2000);
			if (searchNames.getText().equalsIgnoreCase(nameLists)) {
				selectbtn.click();
			}
		}
	}

	public void scrolldownTeamMemberSelect() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,750)");
	}

	//
	@FindBy(xpath = "(//div[@class='form-group'])[3]")
	WebElement emptyText;

	public void textsCheck() throws InterruptedException {
		pageDown();
		Thread.sleep(2000);
		Assert.assertTrue(emptyText.getText().isEmpty());
	}

	@FindBy(xpath="//input[@id='but_enable']")
	WebElement editMatterbtnViewDetails;
	
	public void editBtn()
	{
		visibilityOfAllElements(editMatterbtnViewDetails);
		editMatterbtnViewDetails.click();
	}
	
	
	// Clients
	@FindBy(xpath = "(//button[@id='pills-profile-tab'])[2]")
	WebElement clientTab;

	public void clientBtn() {
		visibilityOfAllElements(clientTab);
		clientTab.click();
	}

	// Delete TeamMember with Yes

	@FindBy(xpath = "//div //p[@class='form-control textbox msgitemcls']")
	List<WebElement> selectedAllNames;

	// Delete
	@FindBy(xpath = "//img[@class='msgnotify1 delicocls']")
	List<WebElement> deleteBtn;

	// Alert Yes

	public void deleteTeamMember(String[] nameLists) throws InterruptedException {
		Thread.sleep(2000);
		List<String> groupNames = Arrays.asList(nameLists);
		String textGroup = new String();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement checkboxSelectedGroupName;
		for (int i = 0; i < selectedAllNames.size(); i++) {
			textGroup = selectedAllNames.get(i).getText();
			if (groupNames.contains(textGroup)) {
				checkboxSelectedGroupName = deleteBtn.get(i);
				visibilityOfAllElements(checkboxSelectedGroupName);
				Thread.sleep(2000);
				executor.executeScript("arguments[0].click();", checkboxSelectedGroupName);
				Thread.sleep(2000);
				yesButtonAlert();
				i--;
			}
		}
	}

	// Alert No
	public void deleteTeamMemberWithNo(String[] nameLists) throws InterruptedException {
		Thread.sleep(2000);
		List<String> groupNames = Arrays.asList(nameLists);
		String textGroup = new String();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement checkboxSelectedGroupName;
		for (int i = 0; i < selectedAllNames.size(); i++) {
			textGroup = selectedAllNames.get(i).getText();
			if (groupNames.contains(textGroup)) {
				checkboxSelectedGroupName = deleteBtn.get(i);
				visibilityOfAllElements(checkboxSelectedGroupName);
				Thread.sleep(2000);
				executor.executeScript("arguments[0].click();", checkboxSelectedGroupName);
				Thread.sleep(2000);
				alertNoButtonClick();
			}
		}
	}

	// Alert Close
	public void deleteTeamMemberWithClose(String[] nameLists) throws InterruptedException {
		Thread.sleep(2000);
		List<String> groupNames = Arrays.asList(nameLists);
		String textGroup = new String();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement checkboxSelectedGroupName;
		for (int i = 0; i < selectedAllNames.size(); i++) {
			textGroup = selectedAllNames.get(i).getText();
			if (groupNames.contains(textGroup)) {
				checkboxSelectedGroupName = deleteBtn.get(i);
				visibilityOfAllElements(checkboxSelectedGroupName);
				Thread.sleep(2000);
				executor.executeScript("arguments[0].click();", checkboxSelectedGroupName);
				Thread.sleep(2000);
				closeButtonSuccess();
			}
		}
	}

	// check the member is selected or Not
	public void checkSelectedNameAppear(String[] names) throws InterruptedException {
		Thread.sleep(2000);
		List<String> groupNames = Arrays.asList(names);
		for (int i = 0; i < selectedAllNames.size(); i++) {
			Thread.sleep(2000);
			String text = selectedAllNames.get(i).getText();
			Thread.sleep(2000);
			if (groupNames.contains(text)) {
				Thread.sleep(2000);

			}
		}
	}

	
	// Scroll down to client searchbox
	
	public void scrollDownSearchClient() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,750)");
	}
	
	// View Details 
	

	@FindBy(xpath="//img[@class='slidearrowtgl']")
	WebElement leftArrow;
	
	public void arrowClick()
	{
		visibilityOfAllElements(leftArrow);
		leftArrow.click();
	}
	
	
	
	
	
	
}
