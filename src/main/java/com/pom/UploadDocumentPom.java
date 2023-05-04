package com.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.abst.Reusable;

public class UploadDocumentPom extends Reusable {

	WebDriver driver;

	public UploadDocumentPom(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Left Side Document
	@FindBy(xpath = "//*[text()='Documents']")
	WebElement leftSideDocument;

	// Upload Tab
	@FindBy(xpath = "//a[text()='Upload']")
	WebElement uploadTab;

	// Client Tab
	@FindBy(xpath = "//a[text()='Client']")
	WebElement clientTab;

	// Firm Tab
	@FindBy(xpath = "//a[text()='Firm']")
	WebElement firmTab;

	// Inputbox ClientName
	@FindBy(xpath = "//*[@aria-label='Type to select ']")
	WebElement inputboxClientName;

	// BrowserBtn
	@FindBy(id = "btnadd")
	WebElement browseBtn;

	// Enable Download
	@FindBy(xpath = "//*[text()='Enable Download']")
	WebElement enableDownloadBtn;

	// Disable Download
	@FindBy(xpath = "//*[text()='Disable Download']")
	WebElement disableDownloadBtn;

	// Add Tags
	@FindBy(xpath = "//*[text()='Add Tags']")
	WebElement addTagsBtn;

	// Cancel Button
	@FindBy(xpath = "//button[@class='btn btn-default btncancel']")
	WebElement cancelBtn;

	// Submit [Upload]
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;

	// Upload More
	@FindBy(xpath = "//*[text()='Upload More']")
	WebElement uploadMoreBtn;

	// View Changes
	@FindBy(xpath = "//*[text()='View Changes']")
	WebElement viewChangesBtn;

	// Name
	@FindBy(id = "documentName")
	WebElement documentNamesField;

	// Description
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement descriptionField;

	// SubmitBtnEdit
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtnEdit;

	public void leftsideDocument() throws InterruptedException {
		Thread.sleep(4000);
		leftSideDocument.click();
	}

	Reusable reusable = new Reusable(driver);

	public void uploadDocumentWithNoEdit(String clientName, String filePath) throws InterruptedException, AWTException {

		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		uploadTab.click();
		clientTab.click();
		inputboxClientName.click();
		wait.until(ExpectedConditions.elementToBeClickable(inputboxClientName));
		inputboxClientName.sendKeys(clientName);
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);

		browseBtn.click();

		Thread.sleep(5000);
		getFile(filePath);

		Thread.sleep(5000);

		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
		submitBtn.click();

	}

	public void uploadDocumentWithEdit(String clientName, String filePath, Integer[] intArray, String dname1,
			String descp1, String dname2, String descp2, String dname3, String descp3, String dname4, String descp4)
			throws InterruptedException, AWTException {

		Thread.sleep(5000);
		uploadTab.click();
		clientTab.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		dropDownNameSelect(clientName);

		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(browseBtn));
		browseBtn.click();

		Thread.sleep(5000);
		getFile(filePath);

		Thread.sleep(5000);

		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(4000);
		selectEditField(intArray, dname1, descp1, dname2, descp2, dname3, descp3, dname4, descp4);

		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
		submitBtn.click();

	}

	// System Browser File
	public static void getFile(String path) throws InterruptedException {
		File directory = new File(path);

		String allimages = "";
		File[] flist = directory.listFiles();

		for (File file : flist) {
			if (file.isFile()) {
				allimages = allimages + "\"" + file.getName() + "\"" + " ";
			}
		}

		try {

			Runtime.getRuntime().exec(
					"C:\\Users\\Vengadesh\\Documents\\FileUpload\\getthefolder.exe" + " " + directory + File.separator);
			Thread.sleep(5000);
			Runtime.getRuntime().exec(
					"C:\\Users\\Vengadesh\\Documents\\FileUpload\\SelectallandClickonOpen1.exe" + " " + allimages);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Edit Field
	public void commonFieldForEdit(String name, String descp) throws InterruptedException {
		Thread.sleep(5000);

		documentNamesField.click();
		documentNamesField.clear();
		documentNamesField.sendKeys(name);
		Thread.sleep(2000);

		descriptionField.click();
		descriptionField.clear();
		descriptionField.sendKeys(descp);
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		submitBtnEdit.click();

	}

	@FindBy(xpath = "//i[@class='fa fa-edit']")
	List<WebElement> editbtn;

	// Choose the EditField
	public void selectEditField(Integer[] intArray, String dname, String descp, String dname1, String descp1,
			String dname2, String descp2, String dname3, String descp3) throws InterruptedException {
		Thread.sleep(5000);
		// Integer[] intArray = new Integer[] { 0, 2,3 };
		List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

		Thread.sleep(5000);
		for (int i = 0; i <= editbtn.size(); i++) {
			Thread.sleep(2000);
			if (intList.contains(i)) {
				Thread.sleep(2000);
				if (i == 0) {
					Thread.sleep(1000);
					editbtn.get(i).click();
					Thread.sleep(3000);
					commonFieldForEdit(dname, descp);
				} else if (i == 1) {
					Thread.sleep(1000);
					editbtn.get(i).click();
					Thread.sleep(3000);
					commonFieldForEdit(dname1, descp1);
				}
				else if (i == 2){
					Thread.sleep(1000);
					editbtn.get(i).click();
					Thread.sleep(3000);
					commonFieldForEdit(dname2, descp2);
				}
				else if (i == 3) {
					Thread.sleep(1000);
					editbtn.get(i).click();
					Thread.sleep(3000);
					commonFieldForEdit(dname3, descp3);
				}

			}
		}
	}
		
	
	@FindBy(xpath="//a[@class='ng-star-inserted']")
	List<WebElement> clientAllNames;
	
	
		public void dropDownNameSelect(String name) throws InterruptedException
		
		{
			Thread.sleep(4000);
			
			inputboxClientName.click();
			
			
			for (int i = 0; i <clientAllNames.size(); i++) {
				
				String textNames = clientAllNames.get(i).getText();
				
				Thread.sleep(3000);
				
				if (name.contains(textNames)) {
				
					WebElement checkboxSelectedName = clientAllNames.get(i);
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					Thread.sleep(4000);
					executor.executeScript("arguments[0].click();", checkboxSelectedName);
					
				}

			}


		}
		

	}

