package com.pom;

import java.util.Arrays;
import java.util.List;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class CreateGroup extends Reusable {

	WebDriver driver;

	public CreateGroup(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div //button[@type='button'])[1]")
	WebElement creategroupTab;

	public void createGroupTab() throws InterruptedException {
		Thread.sleep(2000);
		pageUp();
		Thread.sleep(2000);
		visibilityOfAllElements(creategroupTab);
		creategroupTab.click();
	}

	@FindBy(id = "caseTitle")
	WebElement groupNametxt;

	public void groupName(String text) {
		visibilityOfAllElements(groupNametxt);
		groupNametxt.sendKeys(text);
	}

	@FindBy(name = "description")
	WebElement groupDescriptiontxt;

	public void groupDescription(String text) {
		visibilityOfAllElements(groupDescriptiontxt);
		groupDescriptiontxt.sendKeys(text);
	}

	@FindBy(xpath = "//i[@class='fa fa-solid fa-plus calimg calitem input-group-append sgroup']")
	WebElement addGroupMem;

	public void addGroupMemberButton() {
		visibilityOfAllElements(addGroupMem);
		addGroupMem.click();
	}

	@FindBy(xpath = "//div //button[text()='Next']")
	WebElement nextBtn;

	public void nextButton() {
		visibilityOfAllElements(nextBtn);
		nextBtn.click();
	}

	@FindBy(xpath = "//div //button[text()='Cancel']")
	WebElement cancelBtn;

	public void cancelButton() {
		visibilityOfAllElements(cancelBtn);
		cancelBtn.click();
	}

	@FindBy(xpath = "//div //button[text()='Back']")
	WebElement backBtn;

	public void backButton() {
		visibilityOfAllElements(backBtn);
		backBtn.click();
	}

	@FindBy(xpath = "//div //button[text()='Save']")
	WebElement saveBtn;

	public void saveButton() {
		visibilityOfAllElements(saveBtn);
		saveBtn.click();
	}

	@FindBy(xpath = "//div //button[text()='No']")
	WebElement confirmPopupNo;

	public void confirmNoButton() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(confirmPopupNo);
		confirmPopupNo.click();
	}

	@FindBy(xpath = "//div //button[text()='Yes']")
	WebElement confirmPopupYes;

	public void confirmYesButton() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(confirmPopupYes);
		confirmPopupYes.click();
	}

	@FindBy(xpath = "//div //button[text()='Add Groups']")
	WebElement successPopupAddGroups;

	public void successAddGroups() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(successPopupAddGroups);
		successPopupAddGroups.click();
	}

	@FindBy(xpath = "//div //button[text()='View Changes']")
	WebElement successPopupViewChanges;

	public void successViewChanges() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(successPopupViewChanges);
		successPopupViewChanges.click();
	}

	// Add Groups Member
	@FindBy(xpath = "//div[@class='callselect']")
	List<WebElement> membersName;

	@FindBy(xpath = "//div /input[@type='checkbox']")
	List<WebElement> memberSelectCheckbox;

	public void selectMemberInGroups(String[] names) throws InterruptedException {
		Thread.sleep(2000);
		selectNameorRemoveName1(names, membersName, memberSelectCheckbox);
	}

	// Remove Member
	@FindBy(xpath = "//div[@class='input-group multicheck court']")
	List<WebElement> removeMemberName;

	@FindBy(xpath = "//div /i")
	List<WebElement> clickRemovebtn;

	public void removeMemberInGroups(String[] names) throws InterruptedException {
		Thread.sleep(2000);
		selectNameorRemoveName(names, removeMemberName, clickRemovebtn);

	}

	// GroupHead
	@FindBy(xpath = "//div[@class='multicheck form-control textbox']")
	List<WebElement> groupHeadListofNames;

	@FindBy(xpath = "//div /input[@name='member']")
	List<WebElement> selectOneGroupHead;

	public void selectOneGroupHead(String[] names) throws InterruptedException {
		Thread.sleep(2000);
		selectNameorRemoveName(names, groupHeadListofNames, selectOneGroupHead);
	}

	// View Groups

	@FindBy(xpath = "driver.findElements(By.xpath(\"//tr /td[1]\"))")
	List<WebElement> groupNameCheck;

}
