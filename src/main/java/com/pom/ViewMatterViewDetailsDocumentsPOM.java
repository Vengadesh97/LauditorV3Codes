package com.pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
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

public class ViewMatterViewDetailsDocumentsPOM extends Reusable {

	WebDriver driver;

	public ViewMatterViewDetailsDocumentsPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "pills-profile-tab")
	WebElement documentTabs;

	public void documentTab() {
		visibilityOfAllElements(documentTabs);
		documentTabs.click();
	}

	@FindBy(xpath = "//i[@class='fa fa-regular fa-circle-xmark calimg calitem input-group-append sgroup removedoc']")
	List<WebElement> removeDocument;

	// Check if a specific name is present in the list

	@FindBy(xpath = "//table //tr //td[2]")
	List<WebElement> nameElements;

	public void documentRemove(String[] nameList) throws InterruptedException {
		Thread.sleep(2000);
		selectNameorRemoveName(nameList, nameElements, removeDocument);
	}

	public void documentNameDisplayorNot(String nameChecked) throws InterruptedException {
		Thread.sleep(2000);
		documentNameDisplayCheck(nameChecked, nameElements);
	}

	public void pageMiddle() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,450)");
	}

	// AddNew Button
	@FindBy(xpath = "(//li //button[@id='pills-home-tab'])[2]")
	WebElement AddNewBtn;

	public void addNewBtn() {
		visibilityOfAllElements(AddNewBtn);
		AddNewBtn.click();
	}

	// AddExisting

	@FindBy(id = "pills-home-tab")
	WebElement addExisitngBtn;

	public void addExistingBtn() {
		visibilityOfAllElements(addExisitngBtn);
		addExisitngBtn.click();
	}

	// Left side UnSelect the Document

	// Document Selected Name
	@FindBy(xpath = "(//table[@class='table table-borderless tblgrid'])[1] //tbody //tr //td[1]")
	List<WebElement> documentNames;

	// Remove button on left side
	@FindBy(xpath = "//table //td //i[@class='fa fa-regular fa-circle-xmark calimg input-group-append sgroup']")
	List<WebElement> removeSelectedDocumentBtn;

	public void removeDocumentButtonOnLeftSide(String[] documentRemoveName) throws InterruptedException {
		Thread.sleep(2000);
		selectNameorRemoveName(documentRemoveName, documentNames, removeSelectedDocumentBtn);
	}

	// Right side Select the Document

	// Document Name
	@FindBy(xpath = "(//table[@class='table table-borderless tblgrid'])[2] //tbody //tr //td[1]")
	List<WebElement> documentNamesRightSide;

	// Select button document on right side
	@FindBy(xpath = "//td //input[@id='flexCheckDefault']")
	List<WebElement> selectDocumentBtn;

	public void selectDocumentOnRightSide(String[] names) throws InterruptedException {
		Thread.sleep(2000);
		selectNameorRemoveName(names, documentNamesRightSide, selectDocumentBtn);
	}

	// Select All Button

	@FindBy(xpath = "(//div //input[@type=\"checkbox\"])[2]")
	WebElement selectAllBtn;

	public void selectAllClick() {
		visibilityOfAllElements(selectAllBtn);
		selectAllBtn.click();
	}

	// Next Button

	@FindBy(xpath = "//button[@type='submit']")
	WebElement nextButton;

	public void nextBtnOnlyEditScenario() {
		visibilityOfAllElements(nextButton);
		nextButton.click();
	}

	public void nextButtonOnAddExisting() throws InterruptedException {
		pageDown();
		Thread.sleep(4000);
		visibilityOfAllElements(nextButton);
		nextButton.click();
	}

	// Cancel Button

	@FindBy(xpath = "//button[@type='reset']")
	WebElement cancelButton;

	public void cancelButtonOnAddExisting() throws InterruptedException {
		pageDown();
		Thread.sleep(2000);
		visibilityOfAllElements(cancelButton);
		cancelButton.click();
	}

	public void documentSelectedPageDown() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,550)");
	}

	@FindBy(xpath = "(//table[@class='table table-borderless tblgrid'])[2] //tbody")
	WebElement rightSideDocumentNotDisplay;

	public void checkRightSideDocumentFieldsareEmpty() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(rightSideDocumentNotDisplay.getText().isEmpty());
	}

	public void checkSelectAllCheckboxIsUnSelected() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(selectAllBtn);
		boolean isNameUnselected = selectAllBtn.isSelected();
		Assert.assertTrue(isNameUnselected);

	}

	// Upload New Button

	@FindBy(xpath = "(//button[@id='pills-profile-tab'])[2]")
	WebElement uploadNewBtn;

	public void uploadNewBtn() {
		visibilityOfAllElements(uploadNewBtn);
		uploadNewBtn.click();
	}

	@FindBy(xpath = "(//div //button[@type='button'])[7]")
	WebElement browseButtonClick;

	public void browseAndUploadDoc() throws InterruptedException {
		Thread.sleep(2000);
		// visibilityOfAllElements(browseButtonClick);
		browseButtonClick.click();
	}

	public void fileUpload(String path) throws InterruptedException {
		Thread.sleep(4000);
		getFile(path);
	}

	@FindBy(xpath = "//div //div[@class='documents-list ng-item']")
	List<WebElement> uploadedDocumentNames;

	@FindBy(xpath = "//div //i[@class='fa fa-times-circle']")
	List<WebElement> uploadedDocumentRemove;

	public void dragAndDropDocumentRemove(String[] removeDocument) throws InterruptedException {
		Thread.sleep(2000);
		selectNameorRemoveName(removeDocument, uploadedDocumentNames, uploadedDocumentRemove);
	}

	// Enable and Disable Document Page

	@FindBy(xpath = "//label[@for='btnradio1']")
	WebElement enableTab;

	@FindBy(xpath = "//label[@for='btnradio2']")
	WebElement disableTab;

	@FindBy(xpath = "//label[@for='btnradio3']")
	WebElement editMetaDataTab;

	@FindBy(xpath = "//label[@for='btnradio4']")
	WebElement addTagsTab;

	@FindBy(xpath = "//div //i[@class='fa fa-times-circle']")
	List<WebElement> removeButton;

	public void enableTabBtn() {
		visibilityOfAllElements(enableTab);
		enableTab.click();
	}

	public void disableTabBtn() {
		visibilityOfAllElements(disableTab);
		disableTab.click();
	}

	public void editMetaDataTabBtn() {
		visibilityOfAllElements(editMetaDataTab);
		editMetaDataTab.click();
	}

	public void addTagsTabBtn() {
		visibilityOfAllElements(addTagsTab);
		addTagsTab.click();
	}

	// Inside the Edit Metadata

	@FindBy(id = "documentName")
	WebElement documentNameInputBox;

	public void documentNameInputFields(String name) {
		visibilityOfAllElements(documentNameInputBox);
		documentNameInputBox.clear();
		visibilityOfAllElements(documentNameInputBox);
		documentNameInputBox.sendKeys(name);
	}

	@FindBy(xpath = "//textarea[@name='description']")
	WebElement descriptionInputBox;

	public void descriptionInputFields(String names) {
		visibilityOfAllElements(descriptionInputBox);
		descriptionInputBox.clear();
		visibilityOfAllElements(descriptionInputBox);
		descriptionInputBox.sendKeys(names);
	}

	@FindBy(xpath = "//span[@class='mat-mdc-button-touch-target']")
	WebElement ExpirateDateBtn;

	public void expirateDate() {
		visibilityOfAllElements(ExpirateDateBtn);
		ExpirateDateBtn.click();
	}

	public void dateChose(String date) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}

	public void combinationDocumentNameAndDescription(String names, String names1) throws InterruptedException {
		documentNameInputFields(names);
		descriptionInputFields(names1);
		nextButton.click();
	}

	public void combinationDocumentNameAndExpirateDate(String names, String dates) throws InterruptedException {
	
		documentNameInputFields(names);
		expirateDate();
		Thread.sleep(2000);
		dateChose(dates);
		nextButton.click();
	}

	public void combinationDescriptionAndExpirateDate(String names1, String dates) throws InterruptedException {
		descriptionInputFields(names1);
		expirateDate();
		Thread.sleep(3000);
		dateChose(dates);
		Thread.sleep(1000);
		nextButton.click();
	}

	public void allEditCombination(String names, String names1, String dates) throws InterruptedException {
		documentNameInputFields(names);
		descriptionInputFields(names1);
		expirateDate();
		Thread.sleep(2000);
		dateChose(dates);
		nextButton.click();
	}

	// Below Alert Yes and No and Next and Cancel Button

	@FindBy(xpath = "//button[@class='btn btn-default alertbtn alertbtnyes']")
	WebElement confirmationYesBtn;

	@FindBy(xpath = "//button[@class='btn btn-default alertbtn alertbtnno ng-star-inserted']")
	WebElement confirmationNoBtn;

	@FindBy(xpath = "//div[@aria-label='Close']")
	WebElement closeDuplicteDocument;

	public void confirmationYes() throws InterruptedException {
		try {
			Thread.sleep(2000);
			confirmationYesBtn.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.sleep(2000);
			visibilityOfAllElements(closeDuplicteDocument);
			closeDuplicteDocument.click();
		}
	}

	public void confirmationNo() throws InterruptedException {
		Thread.sleep(2000);
		confirmationNoBtn.click();
	}

	@FindBy(xpath = "(//div[@class='iconclose'])[1]")
	WebElement alertCloseBtn;

	public void alertClose() throws InterruptedException {
		Thread.sleep(2000);
		alertCloseBtn.click();
	}

	@FindBy(xpath = "//h5[text()='Attach Document(s)']")
	WebElement textNameUploadnewAttachDocum;

	public void textNameUploadnewAttachDocum() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(textNameUploadnewAttachDocum);
		boolean displayed = textNameUploadnewAttachDocum.isDisplayed();
		Assert.assertTrue(displayed);
	}

	@FindBy(xpath = "//div //i[@class='fa fa-edit']")
	List<WebElement> editButton;

	// View Matter - Document Upload New

	// Edit Name Field only

	public void editNameFieldOnly(Integer[] intArray, String names, String names1, String names2, String names3)
			throws InterruptedException {
		// Thread.sleep(2000);
		// Integer[] intArray = new Integer[] { 0, 2,3 };
		List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

		for (int i = 0; i <= editButton.size(); i++) {
			Thread.sleep(2000);
			if (intList.contains(i)) {
				if (i == 0) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					documentNameInputFields(names);
					nextBtnOnlyEditScenario();
				} else if (i == 1) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					documentNameInputFields(names1);
					nextBtnOnlyEditScenario();
				}

				else if (i == 2)

				{
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					documentNameInputFields(names2);
					nextBtnOnlyEditScenario();
				}

				else if (i == 3) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					documentNameInputFields(names3);
					nextBtnOnlyEditScenario();
				}

			}
		}
	}

//EditDescriptionFieldOnly

	public void editDescriptionFieldOnly(Integer[] intArray, String descp, String descp1, String descp2, String descp3)
			throws InterruptedException {

		List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

		for (int i = 0; i <= editButton.size(); i++) {
			Thread.sleep(2000);
			if (intList.contains(i)) {
				if (i == 0) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					descriptionInputFields(descp);
					nextBtnOnlyEditScenario();
				} else if (i == 1) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					descriptionInputFields(descp1);
					nextBtnOnlyEditScenario();
				}

				else if (i == 2)

				{
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					descriptionInputFields(descp2);
					nextBtnOnlyEditScenario();
				}

				else if (i == 3) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					descriptionInputFields(descp3);
					nextBtnOnlyEditScenario();
				}

			}
		}
	}

//Edit ExpirateDate Field only

	public void editExpirateDateFieldOnly(Integer[] intArray, String date, String date1, String date2, String date3)
			throws InterruptedException {

		List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

		for (int i = 0; i <= editButton.size(); i++) {
			Thread.sleep(2000);
			if (intList.contains(i)) {
				if (i == 0) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					expirateDate();
					dateChose(date);
					nextBtnOnlyEditScenario();
				} else if (i == 1) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					expirateDate();
					dateChose(date1);
					nextBtnOnlyEditScenario();
				}

				else if (i == 2)

				{
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					expirateDate();
					dateChose(date2);
					nextBtnOnlyEditScenario();
				}

				else if (i == 3) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					expirateDate();
					dateChose(date3);
					nextBtnOnlyEditScenario();
				}

			}
		}
	}

	// View Matter - combinedDocumentNamesandDescription

	public void combinedDocumentNamesandDescription(Integer[] intArray, String dname, String descp, String dname1,
			String descp1, String dname2, String descp2, String dname3, String descp3) throws InterruptedException {
		// Thread.sleep(2000);
		// Integer[] intArray = new Integer[] { 0, 2,3 };
		List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

		for (int i = 0; i <= editButton.size(); i++) {
			Thread.sleep(2000);
			if (intList.contains(i)) {
				if (i == 0) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDocumentNameAndDescription(dname, descp);
				} else if (i == 1) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDocumentNameAndDescription(dname1, descp1);
				}

				else if (i == 2)

				{
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDocumentNameAndDescription(dname2, descp2);

				}

				else if (i == 3) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDocumentNameAndDescription(dname3, descp3);
				}

			}
		}
	}

	// View Matter - combinedDocumentNamesandExpirateDate

	public void combinedDocumentNamesandExpirateDate(Integer[] intArray, String dname, String date, String dname1,
			String date1, String dname2, String date2, String dname3, String date3) throws InterruptedException {

		List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

		for (int i = 0; i <= editButton.size(); i++) {
			Thread.sleep(2000);
			if (intList.contains(i)) {
				if (i == 0) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDocumentNameAndExpirateDate(dname, date);
				} else if (i == 1) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDocumentNameAndExpirateDate(dname1, date1);
				}

				else if (i == 2)

				{
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDocumentNameAndExpirateDate(dname2, date2);

				}

				else if (i == 3) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDocumentNameAndExpirateDate(dname3, date3);
				}

			}
		}
	}

	// View Matter - combinedDescriptionandExpirateDate

	public void combinedDescriptionandExpirateDate(Integer[] intArray, String descp, String date, String descp1,
			String date1, String descp2, String date2, String descp3, String date3) throws InterruptedException {

		List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

		for (int i = 0; i <= editButton.size(); i++) {
			Thread.sleep(2000);
			if (intList.contains(i)) {
				if (i == 0) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDescriptionAndExpirateDate(descp,date);
				} else if (i == 1) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDescriptionAndExpirateDate(descp1,date1);
				}

				else if (i == 2)

				{
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDescriptionAndExpirateDate(descp2,date2);

				}

				else if (i == 3) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					combinationDescriptionAndExpirateDate(descp3,date3);
				}

			}
		}
	}

	// View Matter - Document Upload New

	public void combinedEditAllInputFields(Integer[] intArray, String names, String descp, String date, String names1,
			String descp1, String date1, String names2, String descp2, String date2, String names3, String descp3,
			String date3) throws InterruptedException {
		// Thread.sleep(2000);
		// Integer[] intArray = new Integer[] { 0, 2,3 };
		List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

		for (int i = 0; i <= editButton.size(); i++) {
			Thread.sleep(2000);
			if (intList.contains(i)) {
				if (i == 0) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					allEditCombination(names, descp, date);
				} else if (i == 1) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					allEditCombination(names1, descp1, date1);
				}

				else if (i == 2)

				{
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					allEditCombination(names2, descp2, date2);

				}

				else if (i == 3) {
					editButton.get(i).click();
					pageDown();
					Thread.sleep(1000);
					allEditCombination(names3, descp3, date3);
				}

			}
		}
	}

}
