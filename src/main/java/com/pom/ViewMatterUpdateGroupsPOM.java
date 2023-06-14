package com.pom;

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
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.abst.Reusable;

public class ViewMatterUpdateGroupsPOM extends Reusable {

	WebDriver driver;

	public ViewMatterUpdateGroupsPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='Search Group']")
	WebElement searchInputFields;

	@FindBy(xpath = "//div //button[@data-bs-toggle='dropdown']")
	WebElement actionBtnViewLegal;

	@FindBy(xpath = "//ul[@class='dropdown-menu show'] //li[3]")
	WebElement updateGroupsMatter;

	public void searchInputandUpdateGroupsMatter(String searchCaseName) throws InterruptedException {
		Thread.sleep(5000);
		searchInputFields.clear();
		Thread.sleep(1000);
		searchInputFields.sendKeys(searchCaseName);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");

		Thread.sleep(3000);
		// action button
		actionBtnViewLegal.click();

		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(updateGroupsMatter).click().perform();
	}

	// Left Side Unselected Group

	@FindBy(xpath = "(//div[@class='col-6 matterpadding'])[1]")
	WebElement leftSideUnSelectedGroup;

	@FindBy(xpath = "//div[@class='input-group multicheck court']")
	List<WebElement> listOfSelectedGroupNames;

	@FindBy(xpath = "//i[@class='fa fa-regular fa-circle-xmark calimg calitem input-group-append sgroup']")
	List<WebElement> checkBoxSelect;

	public void unSelectedGroupOnLeftSide(String[] unselectedGroupNames) throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(leftSideUnSelectedGroup).perform();

		// String[] selectedGroup = {"Meeting Group","Test123","Group Checking"};

		List<String> selectedGroupNames = Arrays.asList(unselectedGroupNames);

		for (int i = 0; i < listOfSelectedGroupNames.size(); i++) {
			String allGroupNameText = listOfSelectedGroupNames.get(i).getText();

			if (selectedGroupNames.contains(allGroupNameText)) {
				WebElement selectGroup = checkBoxSelect.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				Thread.sleep(3000);
				executor.executeScript("arguments[0].click();", selectGroup);
				i--;
			}
		}

	}

	// Select Group

	@FindBy(xpath = "//div[@class='form-group'][2]")
	WebElement rightSideUnSelectedGroup;

	@FindBy(xpath = "//div[@class='multicheck form-control textbox']")
	List<WebElement> listOfGroupNames;

	@FindBy(xpath = "//input[@class='form-check-inpu calimg calitem input-group-app end checkboxitem']")
	List<WebElement> checkBoxSelect1;

	public void selectGrouponRightSide(String[] selectMultipleGroup) throws InterruptedException {
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(rightSideUnSelectedGroup).perform();

		Thread.sleep(2000);
		List<String> groupNameSelected = Arrays.asList(selectMultipleGroup);

		for (int i = 0; i < listOfGroupNames.size(); i++) {

			String allGroupNameText = listOfGroupNames.get(i).getText();
			if (groupNameSelected.contains(allGroupNameText)) {
				WebElement selectGroup = checkBoxSelect1.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				Thread.sleep(3000);
				executor.executeScript("arguments[0].click();", selectGroup);
				i--;
			}

		}

	}
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitBtn;
	//Submit
	public void submitUpdateGroup()
	{
		visibilityOfElementWait(submitBtn);
		submitBtn.click();
	}

	@FindBy(xpath="//button[@type='reset']")
	WebElement cancelBtn;
	//Cancel
	public void cancelBtnUpdateGroup()
	{
		visibilityOfElementWait(cancelBtn);
		cancelBtn.click();
	}

	@FindBy(xpath="//button[@class='btn btn-default alertbtn alertbtnyes']")
	WebElement alertYesbtn;
	//AlertYes
	public void alertYesButton()
	{
		visibilityOfElementWait(alertYesbtn);
		alertYesbtn.click();
	}

	@FindBy(xpath="//button[@class='btn btn-default alertbtn alertbtnno']")
	WebElement alertNobtn;
	//AlertNo
	public void alertNoButton()
	{
		visibilityOfElementWait(alertNobtn);
		alertNobtn.click();
	}

	@FindBy(xpath="//button[@class='btn btn-default alertbtn']")
	WebElement viewMatter;
	//View Matter [Success Popup]
	public void viewMatterSuccessPopup()
	{
		visibilityOfElementWait(viewMatter);
		viewMatter.click();
	}

	// PageDown
	public void pageDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	
	// PageUp
	public void pageUp()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,250)");
	}

	
	public void selectedGroupNameIsDisplay(String[]  groupNames) throws InterruptedException
	{
		Thread.sleep(3000);
		
		//String[]  groupNames = {"Meeting Group","Case 1","case2"};
		Actions action = new Actions(driver);
		action.moveToElement(leftSideUnSelectedGroup).perform();
		
		for(String groupNameCheckDisplay:groupNames)
		{
			try {
				driver.findElement(By.xpath("//*[contains(text(),'" + groupNameCheckDisplay + "')]"));
                System.out.println("'" + groupNameCheckDisplay + "' is displayed");
			}
			 catch (NoSuchElementException e) {
	                System.out.println("'" + groupNameCheckDisplay + "' is not displayed");
	            }
		}
		
	}
	
	
	//Alert Text
	@FindBy(xpath="//p[@class='alertparatxt']")
	WebElement alertText;
	
	//Alert Ok
	@FindBy(xpath="//button[@class='btn btn-default alertbtn']")
	WebElement alertOKbtn;
	
	//Check alert is present or not 
	
	public void alertIspresent(String selectedName ) throws InterruptedException
	{
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(leftSideUnSelectedGroup).perform();
		
		Thread.sleep(2000);
		for(int i=0;i<listOfSelectedGroupNames.size();i++)
		{
			String textGroupNames = listOfSelectedGroupNames.get(i).getText();
		
			if(selectedName.equals(textGroupNames))
			{
				Thread.sleep(2000);
				WebElement removeClicked = checkBoxSelect.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", removeClicked);
				
				Thread.sleep(3000);
				String text = alertText.getText();
				
				String values ="Alert";
				
		        // Check if the alert is displayed
		        if (text.contains(values)) {
		            System.out.println("Alert is displayed.");
		            alertOKbtn.click();
		        } 
		        else {
		            System.out.println("Alert is not displayed.");
		        }
			}
			}
			
	}
	
	
	
	

	




















}
