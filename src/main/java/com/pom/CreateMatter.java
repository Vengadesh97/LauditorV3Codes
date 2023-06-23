package com.pom;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

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
	@FindBy(name = "name")
	WebElement opponentAdvocatesName;

	// Email
	@FindBy(name = "email")
	WebElement opponentAdvocatesEmail;

	// Phone
	@FindBy(id = "phone")
	WebElement opponentAdvocatesPhone;

	// Save
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement opponentAdvocatesSavebtn;

	// Cancel
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement matterInfoCancel;

	public void leftMatterTab() throws InterruptedException {
		pageUp();
		Thread.sleep(2000);
		visibilityOfAllElements(matterTab);
		matterTab.click();
		visibilityOfAllElements(createMatterTab);
		createMatterTab.click();
	}

	public void createMatter(String caseTitle, String caseNumber) throws InterruptedException {
		visibilityOfAllElements(caseTitleField);
		caseTitleField.sendKeys(caseTitle);
		visibilityOfAllElements(caseNumberField);
		caseNumberField.sendKeys(caseNumber);
		pageDown();
		Thread.sleep(2000);
		matterInfoNext.click();

	}

	public void createMatterAllFieldEnter(String caseTitle, String caseNumber, String caseType, String courtName,
			String judges, String date, String prioritySelect, String description, String advocateName,
			String advocateEmail, String advocatePhone) throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,400)");
		visibilityOfAllElements(caseTitleField);
		caseTitleField.sendKeys(caseTitle);
		visibilityOfAllElements(caseNumberField);
		caseNumberField.sendKeys(caseNumber);
		visibilityOfAllElements(caseTypeField);
		caseTypeField.sendKeys(caseType);
		visibilityOfAllElements(courtNameField);
		courtNameField.sendKeys(courtName);
		visibilityOfAllElements(judgesField);
		judgesField.sendKeys(judges);
		visibilityOfAllElements(dateOfFillingClick);
		dateOfFillingClick.click();
		Thread.sleep(2000);
		// String date = " 5 ";
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='" + prioritySelect + "']")).click();
		statusActive();
		pageDown();
		Thread.sleep(1000);
		visibilityOfAllElements(descriptionField);
		descriptionField.sendKeys(description);
		visibilityOfAllElements(addOpponentAdvocates);
		addOpponentAdvocates.click();
		opponentAdvocatesName.sendKeys(advocateName);
		opponentAdvocatesEmail.sendKeys(advocateEmail);
		pageDown();
		Thread.sleep(1000);
		opponentAdvocatesPhone.sendKeys(advocatePhone);
		// Scroll down till the bottom of the page
		pageDown();
		Thread.sleep(1000);
		opponentAdvocatesSavebtn.click();
	}

	// Groups Selecting

	// All Name Text Group
	@FindBy(xpath = "//div //div[@class='callselect']")
	List<WebElement> listOfGroupsName;

	// CheckBox Select
	@FindBy(xpath = "//*[@id='flexCheckDefault']")
	List<WebElement> checkboxSelectGroup;

	@FindBy(className = "btnsave")
	WebElement nextBtn;

	public void selecting(String[] NameList) throws InterruptedException {
		Thread.sleep(2000);

		// String[] groupNameList = {"Group Modules Test","Corporative
		// Law","Administration Group"};

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");

		try {

			int j = 0;

			List<String> groupNames = Arrays.asList(NameList);
			// System.out.println("Selected Groups Name "+groupNames);
			String textGroup = new String();
			// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// Thread.sleep(2000);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			WebElement checkboxSelectedGroupName;
			for (int i = 0; i < listOfGroupsName.size(); i++) {
				textGroup = listOfGroupsName.get(i).getText();
				// System.out.println("All Group Name Text "+textGroup);
				if (groupNames.contains(textGroup)) {
					j++;
					Thread.sleep(2000);
					checkboxSelectedGroupName = checkboxSelectGroup.get(i);
					visibilityOfAllElements(checkboxSelectedGroupName);
					executor.executeScript("arguments[0].click();", checkboxSelectedGroupName);
					i--;
				}
				if (j == groupNames.size()) {
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	// Temp Client - Individuals

	@FindBy(xpath = "//input[@placeholder='SearchClient']")
	WebElement inputTempClientSearchBox;

	@FindBy(id = "name")
	WebElement firstNameTempClient;

	@FindBy(id = "lastName")
	WebElement lastNameTempClient;

	@FindBy(id = "email")
	WebElement emailTempClient;

	@FindBy(id = "confirmemail")
	WebElement confirmemailTempClient;

	@FindBy(id = "phonenumber")
	WebElement phonenumberTempClient;

	@FindBy(xpath = "//select[@class='form-control textbox ng-untouched ng-pristine ng-invalid']")
	WebElement countryTempClient;

	public void tempClientIndividuals(String searchTempClient, String firstName, String lastName, String emailAddress,
			String confirmEmailAddress, String country, String phoneNumber) throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(1000);
		visibilityOfAllElements(inputTempClientSearchBox);
		inputTempClientSearchBox.sendKeys(searchTempClient);
		visibilityOfAllElements(firstNameTempClient);
		firstNameTempClient.sendKeys(firstName);
		lastNameTempClient.sendKeys(lastName);
		emailTempClient.sendKeys(emailAddress);
		// Scroll down till the bottom of the page
		pageDown();
		Thread.sleep(1000);
		visibilityOfAllElements(confirmemailTempClient);
		confirmemailTempClient.sendKeys(confirmEmailAddress);
		visibilityOfAllElements(countryTempClient);
		countryTempClient.click();
		Select objSelect = new Select(driver
				.findElement(By.xpath("//select[@class='form-control textbox ng-untouched ng-pristine ng-invalid']")));
		Thread.sleep(2000);
		objSelect.selectByVisibleText(country);
		phonenumberTempClient.sendKeys(phoneNumber);
	}

	// Cancel
	@FindBy(xpath = "(//button[@type='reset'])[1]")
	WebElement cancelTempClient;

	public void cancelTempClientBtn() throws InterruptedException {
		pageDown();
		Thread.sleep(1000);
		cancelTempClient.click();
	}

	// Add Temporary Button
	@FindBy(xpath = "//button[@class='btn btn-primary savecls']")
	WebElement addTemporaryBtn;

	public void addTemporaryButton() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(addTemporaryBtn);
		addTemporaryBtn.click();
	}

	// AddTeamMember
	@FindBy(xpath = "//button[@class='btn btn-default alertbtn']")
	WebElement addTeamMembersBtnTempClients;

	public void addTeamMembersTempClientsBtn() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(addTeamMembersBtnTempClients);
		addTeamMembersBtnTempClients.click();
	}

	// Temp Client - Entity

	@FindBy(name = "entity")
	WebElement entityTab;

	@FindBy(id = "fullname")
	WebElement firmNameEntity;

	@FindBy(id = "contact_person")
	WebElement contactPersonEntity;

	public void tempClientEntity(String searchTempEntity, String firmName, String contactPerson, String emailId,
			String confirmEmailId, String countryEntitys, String phoneNumber) throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(1000);
		visibilityOfAllElements(inputTempClientSearchBox);
		inputTempClientSearchBox.sendKeys(searchTempEntity);
		visibilityOfAllElements(entityTab);
		entityTab.click();
		visibilityOfAllElements(firmNameEntity);
		firmNameEntity.sendKeys(firmName);
		contactPersonEntity.sendKeys(contactPerson);
		emailTempClient.sendKeys(emailId);
		// Scroll down till the bottom of the page
		pageDown();
		Thread.sleep(1000);
		visibilityOfAllElements(confirmemailTempClient);
		confirmemailTempClient.sendKeys(confirmEmailId);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//select")).click();
		Select objSelect1 = new Select(driver.findElement(By.xpath("//div//select")));
		Thread.sleep(2000);
		objSelect1.selectByVisibleText(countryEntitys);
		phonenumberTempClient.sendKeys(phoneNumber);
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

	@FindBy(xpath = "//button[@class='btn btn-default alertbtn ng-star-inserted']")
	WebElement addMatterSuccess;

	public void alertPopupYes() throws InterruptedException {
		visibilityOfAllElements(alertYes);
		alertYes.click();
	}

	public void viewMatterListSuccess() throws InterruptedException {
		visibilityOfAllElements(viewMatterListSuccessPopup);
		viewMatterListSuccessPopup.click();
	}

	public void addMatterSuccess() throws InterruptedException {
		visibilityOfAllElements(addMatterSuccess);
		addMatterSuccess.click();
	}

	public void documentPageSaveandSuccessPopup() throws InterruptedException {
		visibilityOfAllElements(alertYes);
		alertYes.click();
		visibilityOfAllElements(viewMatterListSuccessPopup);
		viewMatterListSuccessPopup.click();
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,50)");
	}

	// Next Page and Cancel Button

	// Next
	@FindBy(className = "btnsave")
	WebElement matterInfoNext;

	// Cancel
	@FindBy(xpath = "//button[@type='reset']")
	WebElement cancel;

	public void nextPage() throws InterruptedException {
		pageDown();
		Thread.sleep(2000);
		matterInfoNext.click();
	}

	public void cancelButton() throws InterruptedException {
		pageDown();
		Thread.sleep(2000);
		visibilityOfAllElements(cancel);
		cancel.click();

	}

	// Status - Active and Pending

	// Status - Active
	@FindBy(xpath = "//button[text()='Active']")
	WebElement statusActiveBtn;

	// Status Pending
	@FindBy(xpath = "//button[text()='Pending']")
	WebElement statusSelect;

	// Status - Active
	public void statusActive() throws InterruptedException {
		visibilityOfAllElements(statusActiveBtn);
		statusActiveBtn.click();
	}

	// Status - Pending
	public void statusPending() throws InterruptedException {
		visibilityOfAllElements(statusSelect);
		statusSelect.click();
	}

	// In left side check group names are appear
	@FindBy(xpath = "//div[@class='col-6 matterpadding'] //div[1]")
	WebElement names;

	public void checkLeftSideSelectedNameareEmpty() throws InterruptedException {

		Thread.sleep(3000);
		Assert.assertTrue("Fields is not empty", names.getText().isEmpty());

	}

	// Select All Button
	@FindBy(id = "selectAll")
	WebElement selectAll;

	public void selectAllBtn() {
		visibilityOfAllElements(selectAll);
		selectAll.click();
	}

	public void checkSelectAllCheckboxIsUnSelected() {
		visibilityOfAllElements(selectAll);
		boolean isNameUnselected = !selectAll.isSelected();
		Assert.assertTrue("The name checkbox should be unselected.", isNameUnselected);

	}

	@FindBy(xpath = "//input[@name='date_of_filling']")
	WebElement dofTextCheck;

	@FindBy(xpath = "//div[@class='opponent']")
	WebElement opponenttext;

	@FindBy(xpath = "(//button[@name='priority'])[1]")
	WebElement priorityHigh;

	@FindBy(xpath = "//button[@class='selectprior optionhigh']")
	WebElement statusActive;

	public void checkAllFieldsareEmptyinMatterinfoPage() throws InterruptedException {

		Thread.sleep(2000);
		Assert.assertTrue("CaseTitle is not empty", caseTitleField.getText().isEmpty());
		Assert.assertTrue("CaseNumber is not empty", caseNumberField.getText().isEmpty());
		Assert.assertTrue("CaseType is not empty", caseTypeField.getText().isEmpty());
		Assert.assertTrue("Court is not empty", courtNameField.getText().isEmpty());
		Assert.assertTrue("Judge is not empty", judgesField.getText().isEmpty());
		Assert.assertTrue("DOF is not empty", dofTextCheck.getText().isEmpty());
		Assert.assertTrue("Description is not empty", descriptionField.getText().isEmpty());
		Assert.assertTrue("Opponent is not empty", opponenttext.getText().isEmpty());
		// Assert.assertTrue("Check Priority is High",priorityHigh.isSelected());
		// Assert.assertTrue("Check Status is active", statusActive.isSelected());
	}

	// Temp Clients

	public void checkAllFieldsareEmptyinTempClients() throws InterruptedException {

		pageUp();
		Thread.sleep(2000);
		Assert.assertTrue("inputTempClientSearchBox is not empty", inputTempClientSearchBox.getText().isEmpty());
		Assert.assertTrue("firstNameTempClient is not empty", firstNameTempClient.getText().isEmpty());
		Assert.assertTrue("lastNameTempClient is not empty", lastNameTempClient.getText().isEmpty());
		pageDown();
		Thread.sleep(1000);
		Assert.assertTrue("emailTempClient is not empty", emailTempClient.getText().isEmpty());
		Assert.assertTrue("confirmemailTempClient is not empty", confirmemailTempClient.getText().isEmpty());
		Assert.assertTrue("phonenumberTempClient is not empty", phonenumberTempClient.getText().isEmpty());
	}

	// Temp Entity

	public void checkAllFieldsareEmptyinTempEntity() throws InterruptedException {

		pageUp();
		Thread.sleep(2000);
		Assert.assertTrue("inputTempClientSearchBox is not empty", inputTempClientSearchBox.getText().isEmpty());
		Assert.assertTrue("firmNameEntity is not empty", firmNameEntity.getText().isEmpty());
		Assert.assertTrue("contactPersonEntity is not empty", contactPersonEntity.getText().isEmpty());
		pageDown();
		Thread.sleep(1000);
		Assert.assertTrue("emailTempClient is not empty", emailTempClient.getText().isEmpty());
		Assert.assertTrue("confirmemailTempClient is not empty", confirmemailTempClient.getText().isEmpty());
		Assert.assertTrue("phonenumberTempClient is not empty", phonenumberTempClient.getText().isEmpty());
	}

}

/*
 * 
 * public void checkAllFieldsEmpty() throws InterruptedException {
 * 
 * Thread.sleep(2000); boolean caseTitle = caseTitleField.getText().isEmpty();
 * boolean caseNumber = caseNumberField.getText().isEmpty(); boolean caseType =
 * caseTypeField.getText().isEmpty(); boolean courtName =
 * courtNameField.getText().isEmpty(); boolean judges =
 * judgesField.getText().isEmpty(); boolean dOFText =
 * dofTextCheck.getText().isEmpty(); boolean description =
 * descriptionField.getText().isEmpty(); boolean opponentText =
 * opponenttext.getText().isEmpty();
 * 
 * System.out.println("CaseTitle is empty: " + caseTitle);
 * System.out.println("CaseNumber  is empty: " + caseNumber);
 * System.out.println("CaseType is empty: " + caseType);
 * System.out.println("CourtName is empty: " + courtName);
 * System.out.println("Judges  is empty: " + judges);
 * System.out.println("DOFText  is empty: " + dOFText);
 * System.out.println("OpponentText  is empty: " + opponentText);
 * System.out.println("Description is empty: " + description);
 * 
 * }
 * 
 * 
 * public void nameIsHighlightedCheck() {
 * 
 * // Find the element by its locator (e.g., ID, CSS selector, XPath, etc.)
 * WebElement element = driver.findElement(By.
 * xpath("(//button[@class='selectprior optionhigh active'])[1]"));
 * 
 * // Get the value of the "style" attribute of the element String
 * styleAttributeValue = element.getAttribute("style");
 * 
 * // Check if the "style" attribute contains the "background-color" property
 * indicating that the name is highlighted boolean isHighlighted =
 * styleAttributeValue.contains("selected");
 * 
 * // Print the result Assert.assertTrue("Name is not highlighted",
 * isHighlighted); }
 * 
 */
