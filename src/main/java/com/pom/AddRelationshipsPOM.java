package com.pom;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.abst.Reusable;

public class AddRelationshipsPOM extends Reusable {

	WebDriver driver;

	public AddRelationshipsPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Left Side Relationship
	@FindBy(xpath = "(//a //*[@class='mattersicon'])[3]")
	WebElement leftSideRelationshipsBtn;

	public void leftSideRelationshipTab() throws InterruptedException {
		pageUp();
		Thread.sleep(2000);
		visibilityOfAllElements(leftSideRelationshipsBtn);
		leftSideRelationshipsBtn.click();
	}

	// Add RelationShip Tab
	@FindBy(xpath = "//div //a[text()='Add Relationship']")
	WebElement addRelationshipTabBtn;

	public void addRelationShipTab() {
		visibilityOfAllElements(addRelationshipTabBtn);
		addRelationshipTabBtn.click();
	}

	// Tab Individuals
	@FindBy(xpath = "//div //a[text()='Individual']")
	WebElement individualsTabBtn;

	public void indivdualsTab() {
		visibilityOfAllElements(individualsTabBtn);
		individualsTabBtn.click();
	}

	// InputSearch
	@FindBy(xpath = "//*[@placeholder='Search by email']")
	WebElement inputSearchBar;

	public void inputSearchBox(String text) {
		visibilityOfAllElements(inputSearchBar);
		inputSearchBar.sendKeys(text);
	}

	// SearchButton
	@FindBy(id = "btnadd")
	WebElement searchBtn;

	public void searchButton() {
		visibilityOfAllElements(searchBtn);
		searchBtn.click();
	}

	// FirstName
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstNameFields;

	public void firstName(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(firstNameFields);
			firstNameFields.sendKeys(text);
		}
	}

	// LastName
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastNameFields;

	public void lastName(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(lastNameFields);
			lastNameFields.sendKeys(text);
		}
	}

	// ConfirmEmail
	@FindBy(xpath = "//input[@name='confirmEmail']")
	WebElement confirmEmails;

	public void confirmEmail(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(confirmEmails);
			confirmEmails.sendKeys(text);
		}
	}

	// country
	@FindBy(xpath = "//select[@name='country']")
	WebElement countryAll;

	public void country(String text) {
		if (!text.equals("")) {
			visibilityOfAllElements(countryAll);
			countryAll.click();
			visibilityOfAllElements(countryAll);
			Select countrys = new Select(countryAll);
			countrys.selectByVisibleText(text);
			countryAll.click();
		}
	}

	// Entity

	@FindBy(xpath = "//input[@placeholder='Search by name']")
	WebElement entitySearch;

	public void entitySearchBox(String name) throws InterruptedException {
		if (!name.equals("")) {
			visibilityOfAllElements(entitySearch);
			entitySearch.click();
			entitySearch.sendKeys(name);
			entitySearch.sendKeys(Keys.BACK_SPACE);
		}
	}

	// Entity Name
	@FindBy(name = "entityName")
	WebElement entityName;

	public void entityName(String name) {
		if (!name.equals("")) {
			visibilityOfAllElements(entityName);
			entityName.sendKeys(name);
		}
	}

	// Contact Person
	@FindBy(name = "contactPerson")
	WebElement contactPerson;

	public void contactPerson(String name) {
		if (!name.equals("")) {
			visibilityOfAllElements(contactPerson);
			contactPerson.sendKeys(name);
		}
	}

	// Email Id
	@FindBy(name = "email")
	WebElement emailId;

	public void emailId(String name) {
		if (!name.equals("")) {
			visibilityOfAllElements(emailId);
			emailId.sendKeys(name);
		}
	}

	// Contact Phone
	@FindBy(name = "contactPhone")
	WebElement contactPhone;

	public void contactPhone(String name) {
		if (!name.equals("")) {
			visibilityOfAllElements(contactPhone);
			contactPhone.sendKeys(name);
		}
	}

	// Confirm Email
	@FindBy(name = "confirmEmail")
	WebElement confirmEmail;

	public void entityConfirmEmail(String name) {
		if (!name.equals("")) {
			visibilityOfAllElements(confirmEmail);
			confirmEmail.sendKeys(name);
		}
	}

	// Cancel
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelButton;

	public void cancelBtn() {
		visibilityOfAllElements(cancelButton);
		cancelButton.click();
	}

	// SendRequest
	@FindBy(xpath = "//button[text()='Send Request']")
	WebElement sendRequestButton;

	public void sendRequestBtn() {
		visibilityOfAllElements(sendRequestButton);
		sendRequestButton.click();
	}

	// AlertNo
	@FindBy(xpath = "//div //button[text()='No']")
	WebElement alertNoButton;

	public void alertNoBtn() {
		visibilityOfAllElements(alertNoButton);
		alertNoButton.click();
	}

	// AlertYes
	@FindBy(xpath = "//div //button[text()='Yes']")
	WebElement alertYesButton;

	public void alertYesBtn() {
		visibilityOfAllElements(alertYesButton);
		alertYesButton.click();
	}

	// Success
	// Add Relationship
	@FindBy(xpath = "//div //button[text()='Add Relationship']")
	WebElement addRelationshipButton;

	public void addRelationshipBtn() {
		visibilityOfAllElements(addRelationshipButton);
		addRelationshipButton.click();
	}

	// View Changes
	@FindBy(xpath = "//div //button[text()='View Changes']")
	WebElement viewChangesButton;

	public void viewChangesBtn() {
		visibilityOfAllElements(viewChangesButton);
		viewChangesButton.click();
	}

	// entity search box
	@FindBy(xpath = "//div[@role='listbox'] //mat-option")
	List<WebElement> allEntityNames;

	public void entityNameSelect(String[] name) throws InterruptedException {
		Thread.sleep(2000);
		selectNameorRemoveName(name, allEntityNames, allEntityNames);
	}

	// AllGroupNames
	@FindBy(xpath = "//div //div[@class='callselect'] ")
	List<WebElement> listOfGroupsNames;

	// checkboxSelect
	@FindBy(xpath = "//div //div[@class='multicheck form-control textbox'] //input")
	List<WebElement> checkBox;

	public void groupSelecting(String[] names) throws InterruptedException {
		Thread.sleep(2000);
		selectNameorRemoveName(names, listOfGroupsNames, checkBox);
	}

	// RequestFoundMessage
	@FindBy(xpath = "//div[@class='text-center alertText'] //p")
	WebElement reqFoundMessage;

	// Individuals

	public void addRelationship(String fName, String lName, String confEmail, String country, String[] names)
			throws InterruptedException {

		String text = reqFoundMessage.getText();
		Thread.sleep(2000);
		if (text.contains("Individual")) {
			// Request
			pageDown();
			Thread.sleep(2000);
			groupSelecting(names);
		} else {
			Thread.sleep(2000);
			individualsInvitation(fName, lName, confEmail, country, names);
		}
	}

	public void individualsInvitation(String firstNam, String lastNam, String confEmail, String countryName,
			String[] name) throws InterruptedException {
		Thread.sleep(2000);
		firstName(firstNam);
		lastName(lastNam);
		confirmEmail(confEmail);
		country(countryName);
		pageDown();
		Thread.sleep(2000);
		groupSelecting(name);
	}

	// Entity

	public void addRelationshipEntity(String eName, String cPerson, String email, String cPhone, String cEmail,
			String cName, String[] names) throws InterruptedException {

		String text = reqFoundMessage.getText();
		Thread.sleep(2000);
		if (text.contains("not found")) {
			Thread.sleep(2000);
			entityInvitation(eName, cPerson, email, cPhone, cEmail, cName, names);
		} else {
			// Request
			pageDown();
			Thread.sleep(2000);
			groupSelecting(names);

		}
	}

	public void entityInvitation(String eName, String cPerson, String email, String cPhone, String cEmail, String cName,
			String[] name) throws InterruptedException {
		Thread.sleep(2000);
		entityName(eName);
		contactPerson(cPerson);
		emailId(email);
		contactPhone(cPhone);
		entityConfirmEmail(cEmail);
		country(cName);
		pageDown();
		Thread.sleep(2000);
		groupSelecting(name);
	}

	// ---------------------*******************************-----------------------------

	// ViewRelationships

	@FindBy(xpath = "//span //a[text()='View Relationships']")
	WebElement viewRelationshipTab;

	@FindBy(xpath = "//span //a[text()='Individuals']")
	WebElement individualsTab;

	@FindBy(xpath = "//span //a[text()='Businesses']")
	WebElement businessesTab;

	public void businessesTabBtn() {
		visibilityOfAllElements(businessesTab);
		businessesTab.click();
	}

	@FindBy(xpath = "//span //a[text()='Corporate']")
	WebElement corporateTab;

	public void corporateTabBtn() {
		visibilityOfAllElements(corporateTab);
		corporateTab.click();
	}

	@FindBy(xpath = "//span //a[text()='Temporary Clients']")
	WebElement temporaryClients;

	public void temporaryTabBtn() {
		visibilityOfAllElements(temporaryClients);
		temporaryClients.click();
	}

	// View Relationships

	// RightSide below Searchbar

	@FindBy(xpath = "//div //input[@placeholder='Search']")
	WebElement searchBar;

	// list of client name

	@FindBy(xpath = "//tbody //tr //td[1]")
	List<WebElement> allClientNamesText;

	// Action Button Click
	@FindBy(xpath = "//tr//td[6]")
	List<WebElement> actionBtnClicked;

	// Action Button
	@FindBy(xpath = "//div //button[@data-bs-toggle='dropdown']")
	List<WebElement> actionBtn;

	// ModifygroupAccess
	@FindBy(xpath = "//ul //li //a[text()='Modify Group Access']")
	WebElement modifyGroupAccessBtn;

	public void searchInput(String searchCaseName) throws InterruptedException {

		visibilityOfElementWait(searchBar);
		searchBar.clear();
		searchBar.sendKeys(searchCaseName);

	//	pageDown();
		Thread.sleep(3000);
		Actions action = new Actions(driver);

		for (int i = 0; i < allClientNamesText.size(); i++) {
			String textNames = allClientNamesText.get(i).getText();
			Thread.sleep(2000);
			if (searchCaseName.contains(textNames)) {
				// visibilityOfAllElements(actionBtn);

				WebElement actionClicked = actionBtn.get(i);
				// visibilityOfAllElements(actionBtn);
				Thread.sleep(2000);
				action.moveToElement(actionClicked).click().perform();

			}

		}
	}

	public void individualsModifyGroupAccessBtn() throws InterruptedException {
		Thread.sleep(3000);
	//	visibilityOfElementWait(modifyGroupAccessBtn);
		Actions action = new Actions(driver);
		action.moveToElement(modifyGroupAccessBtn).click().perform();
	}

	// IndividualsModifyGroupAccess

	@FindBy(xpath = "//div[@id='selectbx'] //div[@class='callselect']")
	List<WebElement> allGroupNamesUpdate;

	// Checkbox

	@FindBy(xpath = "//div[@id='selectbx'] //input[@type='checkbox']")
	List<WebElement> checkAndUncheckBox;

	public void updateAndModifyGroupAccess(String[] name) throws InterruptedException {
		Thread.sleep(3000);
		selectNameorRemoveName1(name, allGroupNamesUpdate, checkAndUncheckBox);
	}

	// Cancel

	@FindBy(xpath = "(//div //button[@type='button'])[1]")
	WebElement cancel;

	public void cancelBtnModifyGroup() {
		visibilityOfAllElements(cancel);
		cancel.click();
	}

	// Save

	@FindBy(xpath = "(//div //button[@type='button'])[2]")
	WebElement save;

	public void saveBtnModifyGroup() {
		visibilityOfAllElements(save);
		save.click();
	}

	// Alert No

	@FindBy(xpath = "(//div //button[@aria-label='Close'])[2]")
	WebElement alertNoUpdate;

	public void alertNoUpdate() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(alertNoUpdate);
		alertNoUpdate.click();
	}

	// Alert Yes

	@FindBy(xpath = "(//div //button[@aria-label='Close'])[3]")
	WebElement alertYesUpdate;

	public void alertYesUpdate() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(alertYesUpdate);
		alertYesUpdate.click();
	}

	// Success close

	@FindBy(xpath = "//div[@class='alertbox'] //div")
	WebElement successClose;

	public void successCloseUpdate() {
		visibilityOfAllElements(successClose);
		successClose.click();
	}

	// ---
	// Temp Clients

	// ModifygroupAccess
	@FindBy(xpath = "//ul[@data-popper-placement='top-start'] //li[1]")
	WebElement modifyGroupAccessBtnTemp;

	public void tempclientsModifyGroupAccessBtn() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfElementWait(modifyGroupAccessBtnTemp);
		Actions action = new Actions(driver);
		action.moveToElement(modifyGroupAccessBtnTemp).click().perform();
	}

	// Send Invite

	@FindBy(xpath = "//ul[@data-popper-placement='top-start'] //li[2]")
	WebElement tempClientSendInvite;

	public void tempclientsSendInviteBtn() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfElementWait(tempClientSendInvite);
		Actions action = new Actions(driver);
		action.moveToElement(tempClientSendInvite).click().perform();
	}

}
