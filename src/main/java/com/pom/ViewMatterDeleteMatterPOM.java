package com.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.abst.Reusable;

public class ViewMatterDeleteMatterPOM extends Reusable {

	WebDriver driver;

	public ViewMatterDeleteMatterPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// SearchBar
	@FindBy(xpath = "//input[@placeholder='Search Group']")
	WebElement searchBarViewMatter;

	// Action Button
	@FindBy(xpath = "//div //button[@data-bs-toggle='dropdown']")
	WebElement actionBtn;

	// Delete Button
	@FindBy(xpath = "//ul[@class='dropdown-menu custom-dropdown show'] //li[5]")
	WebElement deletebtn;

	// alertBtnYes
	@FindBy(xpath = "//button[@class='btn btn-default alertbtn alertbtnyes']")
	WebElement alertBtnYes;

	// alertBtnCancel
	@FindBy(xpath = "//button[@class='btn btn-default alertbtn alertbtnno']")
	WebElement alertBtnNo;

	// View matter success
	@FindBy(xpath = "//button[@class='btn btn-default alertbtn']")
	WebElement viewMatterSuccess;

	@FindBy(xpath = "//tr[@class='rone veiw-items ng-star-inserted'] //td[1]")
	WebElement matterNamesPresent;

	public void deleteMatter() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfElementWait(deletebtn);
		Actions action = new Actions(driver);
		action.moveToElement(deletebtn).click().perform();
		visibilityOfElementWait(alertBtnYes);
		alertBtnYes.click();
		visibilityOfElementWait(viewMatterSuccess);
		viewMatterSuccess.click();

	}

	public void deleteMatterCancelBtn() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfElementWait(deletebtn);
		Actions action = new Actions(driver);
		action.moveToElement(deletebtn).click().perform();
		visibilityOfElementWait(alertBtnNo);
		alertBtnNo.click();
	//	Thread.sleep(3000);
	//	visibilityOfElementWait(matterNamesPresent);
	//	boolean displayed = matterNamesPresent.isDisplayed();
		//System.out.println("Matter Name is displayed: " + displayed);
	//	Assert.assertTrue(displayed);
	}

	/*
	@FindBy(xpath="//tr//td[1]")
	List<WebElement> allMatterNamesText;
	
	@FindBy(xpath="//tr//td[6]")
	List<WebElement> actionBtnClicked; 
	
	
	public void searchBarFieldsandActionBtn(String MatterName) throws InterruptedException
	{
		Thread.sleep(5000);
		searchBarViewMatter.clear();
		searchBarViewMatter.sendKeys(MatterName);
		
		Thread.sleep(2000);
		pageDown();
		
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
	
	*/
	
	
}
