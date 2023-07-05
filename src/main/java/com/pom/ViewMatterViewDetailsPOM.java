package com.pom;

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
	
	public ViewMatterViewDetailsPOM(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//ul[@class='dropdown-menu custom-dropdown show'] //li[1]")
	WebElement viewDetailsbtn;
	
	public void viewDetailsBtn()
	{
		visibilityOfElementWait(viewDetailsbtn);
		Actions action = new Actions(driver);
		action.moveToElement(viewDetailsbtn).click().perform();
	}
	
	@FindBy(xpath="//div[@class='wrapper']")
	WebElement leftProgress;
	
	public void viewDetailsleftSide()
	{
		visibilityOfElementWait(leftProgress);
		Actions action = new Actions(driver);
		action.moveToElement(leftProgress).build().perform();
	}
	
	
	@FindBy(id="pills-home-tab")
	WebElement timelineTab;
	
	@FindBy(id="pills-contact-tab")
	WebElement teamMembersandClientsTab;
	
	
	@FindBy(xpath="(//p[@class='pnumber pleagalsubitem'])[2]")
	WebElement meetingNames;
		
	public void checkMeetingNameAppear(String meetingNameAppear) throws InterruptedException
	{
		viewDetailsleftSide();
		Thread.sleep(1000);
		visibilityOfAllElements(meetingNames);
		String text = meetingNames.getText();
		Assert.assertEquals(text,meetingNameAppear);
	}
	
	// Once Meeting is over , that meeting name appear.
	
	@FindBy(xpath="//ul //li //div //img[@class='editico']")
	WebElement meetingBtn;
	
	public void meetingEditBtn() throws InterruptedException
	{
		visibilityOfAllElements(meetingBtn);
		meetingBtn.click();
	}
	
	@FindBy(xpath="//ul //li //div //textarea[@class='ng-pristine ng-valid ng-touched']")
	WebElement descriptionBoxs;
	
	public void descriptionBox(String text) throws InterruptedException
	{
		Thread.sleep(2000);
		//visibilityOfAllElements(descriptionBoxs);
		//descriptionBoxs.click();
		//descriptionBoxs.clear();
		descriptionBoxs.sendKeys(text);
	}
	
	@FindBy(xpath="//button[@type='reset']")
	WebElement cancelBtn;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement savelBtn;
	
	public void cancelButton() throws InterruptedException
	{		
		visibilityOfAllElements(cancelBtn);
		cancelBtn.click();
	}
	
	public void saveButton() throws InterruptedException
	{
			visibilityOfAllElements(savelBtn);
			savelBtn.click();
	}
	
	//Eye Symbol Scenario
	
	@FindBy(xpath="(//img[@class='editico ng-star-inserted'])[2]")
	WebElement eyeClick;
	
	@FindBy(xpath="//img[@class='editico ng-star-inserted onActive']")
	WebElement eyeActive;
	
	@FindBy(xpath="(//p[@class='lgalsubitem noteselipses'])[2]")
	WebElement textIsDisplay;
	
	public void eyeButton(String enteredText)
	{
		visibilityOfAllElements(eyeClick);
		eyeClick.click();
		String text = textIsDisplay.getText();
		Assert.assertEquals(text,enteredText);
	}
	
	//Left Side Arrow
	
	@FindBy(xpath="//img[@class='slidearrowtgl']")
	WebElement sideRightArrow;
	
	public void rightArrowButton()
	{
		visibilityOfAllElements(sideRightArrow);
		sideRightArrow.click();
	}
	
	//Summary Text Verify it appear or not 
	@FindBy(xpath="//p[@class='psize']")
	WebElement summaryHeadingText;
	
	public void summaryTextVerify()
	{
		visibilityOfAllElements(summaryHeadingText);
		String text = summaryHeadingText.getText();
		Assert.assertEquals(text,"Summary");
	}
	
	//Summary Edit btn
	@FindBy(id="but_enable")
	WebElement editBtn;
	
	public void summaryEditButton()
	{
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
	
	
	
	
	
	
	
	
}
