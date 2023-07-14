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

	public void saveButtonOnEditDetails() {
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

	// Inside the Edit Metadata

	@FindBy(id = "documentName")
	WebElement documentNameInputBox;

	public void editDocumentName(String name) {
		visibilityOfAllElements(documentNameInputBox);
		documentNameInputBox.clear();
		visibilityOfAllElements(documentNameInputBox);
		documentNameInputBox.sendKeys(name);
	}

	@FindBy(xpath = "//textarea[@name='description']")
	WebElement descriptionInputBox;

	public void editDescription(String names) {
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

	// Add Tags Scenario
	
	// Add tag Button
	@FindBy(xpath = "//label[@for='btnradio4']")
	WebElement addTagsTab;
	
	// Select All Button
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement selectAllAddTags;
	
	// Add Button
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement addButtonForAddTags;
	
	//Tag type
	@FindBy(xpath="(//div //input[@id='caseType'])[1]")
	WebElement tagTypeInputFields;
	
	//Tags
	@FindBy(xpath="(//div //input[@id='caseType'])[2]")
	WebElement tagsInputFields;
	
	public void addTagsTabBtn() {
		visibilityOfAllElements(addTagsTab);
		addTagsTab.click();
	}
	
	public void selectAllClk()
	{
		visibilityOfAllElements(selectAllAddTags);
		selectAllAddTags.click();
	}
	
	public void addButtonAddTags()
	{
		visibilityOfAllElements(addButtonForAddTags);
		addButtonForAddTags.click();
	}
	
	public void tagsFields(String names1,String names2) throws InterruptedException
	{
		visibilityOfAllElements(tagTypeInputFields);
		tagTypeInputFields.sendKeys(names1);
		visibilityOfAllElements(tagsInputFields);
		tagsInputFields.sendKeys(names2);
		visibilityOfAllElements(nextButton);
		nextButtonOnAddExisting();
	}
	
	
	// Tags and select one or two tags adds
	@FindBy(xpath="//div[@class='icon-list'] //div //input[@type='checkbox']")
	List<WebElement> tagsSelect;
	
		public void tagsAdd(Integer[] intArray, String[][] des) throws InterruptedException {

			int jj = 0;
			for (jj = 0; jj < intArray.length; jj++) {
				Thread.sleep(2000);
				int eb = intArray[jj];
				tagsSelect.get(eb).click();
				pageDown();
				Thread.sleep(1000);
				addButtonAddTags();
				pageDown();
				Thread.sleep(1000);
				tagsFields(des[eb][0], des[eb][1]);
			}

		}
		
		// Before adding the tags, remove the empty tags
		public void tagsAddAndRemove(Integer[] intArray, String[][] des) throws InterruptedException {

				int jj = 0;
				for (jj = 0; jj < intArray.length; jj++) {
					Thread.sleep(2000);
					int eb = intArray[jj];
					tagsSelect.get(eb).click();
					pageDown();
					addButtonAddTags();
					pageDown();
					removedTags();
					addButtonAddTags();
					pageDown();
					tagsFields(des[eb][0], des[eb][1]);
				}

			}
		
		// Remove Scenario with tagsFields
		
		public void tagsFields1(String names1,String names2) throws InterruptedException
		{
			visibilityOfAllElements(tagTypeInputFields);
			tagTypeInputFields.sendKeys(names1);
			visibilityOfAllElements(tagsInputFields);
			tagsInputFields.sendKeys(names2);
			visibilityOfAllElements(nextButton);
			removedTags();
			nextButtonOnAddExisting();
		}
		

		public void tagsAddandRemoveaddedText(Integer[] intArray, String[][] des) throws InterruptedException {

			int jj = 0;
			for (jj = 0; jj < intArray.length; jj++) {
				Thread.sleep(2000);
				int eb = intArray[jj];
				tagsSelect.get(eb).click();
				pageDown();
				addButtonAddTags();
				pageDown();
				tagsFields1(des[eb][0], des[eb][1]);
				
			}

		}
		
		
		
		// Remove button Tags
		@FindBy(xpath="//div[@class='col-1'] //i[@class='fa fa-times-circle']")
		List<WebElement> removeTags;
		
		public void removedTags()
		{
			for(int i=0;i<removeTags.size();i++)
			{
				removeTags.get(i).click();
			}
		}
		
		
		@FindBy(xpath="//div //i[@class='fa fa-times-circle']")
		List<WebElement> removeUploadDoc;
		
		@FindBy(xpath="//div[@class='documents-list ng-item']")
		List<WebElement> allFileNames;
		
		public void removeFiles(String[] removeDocuments) throws InterruptedException
		{
			Thread.sleep(1000);
			selectNameorRemoveName(removeDocuments, allFileNames, removeUploadDoc);
		}
	
	
	// Below Alert Yes and No and Next and Cancel Button

	@FindBy(xpath = "//button[@class='btn btn-default alertbtn alertbtnyes']")
	WebElement confirmationYesBtn;

	@FindBy(xpath = "//button[@class='btn btn-default alertbtn alertbtnno ng-star-inserted']")
	WebElement confirmationNoBtn;

	@FindBy(xpath = "//div[@aria-label='Close']")
	WebElement closeDuplicteDocument;

	public void confirmationYesBtn() throws InterruptedException {
		Thread.sleep(2000);
		confirmationYesBtn.click();
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
	
	public void editDocumentNameandDescription(String names, String names1) throws InterruptedException {
		editDocumentName(names);
		editDescription(names1);
		nextButton.click();
	}

	public void editDocumentNameandExpirateDate(String names, String date) throws InterruptedException {
		editDocumentName(names);
		expirateDate();
		Thread.sleep(2000);
		dateChose(date);
		nextButton.click();
	}

	public void editDescriptionandExpirateDate(String names, String dates) throws InterruptedException {
		editDescription(names);
		expirateDate();
		Thread.sleep(3000);
		dateChose(dates);
		Thread.sleep(1000);
		nextButton.click();
	}

	public void editAllFields(String names, String names1, String dates) throws InterruptedException {
		editDocumentName(names);
		editDescription(names1);
		expirateDate();
		Thread.sleep(2000);
		dateChose(dates);
		nextButton.click();
	}


	@FindBy(xpath = "//div //i[@class='fa fa-edit']")
	List<WebElement> editButton;

	// View Matter - Document Upload New

	// Edit all Fields

	public void editAllField(Integer[] intArray, String[][] des) throws InterruptedException {
		// int n= intArray.length;
		int jj = 0;
		for (jj = 0; jj < intArray.length; jj++) {
			Thread.sleep(2000);
			int eb = intArray[jj];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(1000);
			editAllFields(des[eb][0], des[eb][1], des[eb][2]);
		}

	}

	// Edit Document Name

	public void editDocumentNameField(Integer[] intArray, String[] des) throws InterruptedException {

		for (int ii = 0; ii < intArray.length; ii++) {
			Thread.sleep(2000);
			int eb = intArray[ii];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(2000);
			editDocumentName(des[eb]);
			saveButtonOnEditDetails();
		}
	}

	// Edit Description Field

	public void editDescriptionField(Integer[] intArray, String[] des) throws InterruptedException {

		for (int ii = 0; ii < intArray.length; ii++) {
			Thread.sleep(2000);
			int eb = intArray[ii];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(2000);
			editDescription(des[eb]);
			saveButtonOnEditDetails();
		}

	}

	// Expirate Date Field

	public void editExpirateField(Integer[] intArray, String[] date) throws InterruptedException {

		for (int ii = 0; ii < intArray.length; ii++) {
			Thread.sleep(2000);
			int eb = intArray[ii];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(2000);
			expirateDate();
			Thread.sleep(1000);
			dateChose(date[eb]);
			saveButtonOnEditDetails();
		}

	}

	// Edit DocumentName and Expirate Date Fields

	public void editDocumentNameandDateFields(Integer[] intArray, String[][] des) throws InterruptedException {

		int jj = 0;
		for (jj = 0; jj < intArray.length; jj++) {
			Thread.sleep(2000);
			int eb = intArray[jj];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(1000);
			editDocumentNameandExpirateDate(des[eb][0], des[eb][1]);
		}

	}

	// Edit DocumentName and Description Fields

	public void editDocumentNameandDescriptionFields(Integer[] intArray, String[][] des) throws InterruptedException {

		int jj = 0;
		for (jj = 0; jj < intArray.length; jj++) {
			Thread.sleep(2000);
			int eb = intArray[jj];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(1000);
			editDocumentNameandDescription(des[eb][0], des[eb][1]);
		}

	}

	// Edit editDescription and ExpirateDate Fields

	public void editDescriptionandExpirateDateFields(Integer[] intArray, String[][] des) throws InterruptedException {

		int jj = 0;
		for (jj = 0; jj < intArray.length; jj++) {
			Thread.sleep(2000);
			int eb = intArray[jj];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(1000);
			editDescriptionandExpirateDate(des[eb][0], des[eb][1]);
		}

	}

	// -------------------------------------------------------------------------------------------------------------------------------------

	

}
