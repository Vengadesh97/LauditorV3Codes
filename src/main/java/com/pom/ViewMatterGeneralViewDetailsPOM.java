package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.abst.Reusable;

public class ViewMatterGeneralViewDetailsPOM extends Reusable {

	WebDriver driver;

	public ViewMatterGeneralViewDetailsPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Left Side Menu Matter Name
	@FindBy(xpath = "(//div //img[@class='mattersicon'])[1]")
	WebElement matterTab;

	@FindBy(xpath = "//a[text()='General Matters']")
	WebElement generalMattersTab;

	public void generalMatterTab() throws InterruptedException {
		pageUp1();
		Thread.sleep(1000);
		visibilityOfElementWait(matterTab);
		matterTab.click();
		Thread.sleep(2000);
		visibilityOfElementWait(generalMattersTab);
		generalMattersTab.click();
	}

	@FindBy(id = "title")
	WebElement caseTitleGeneral;

	public void casetitle(String name) throws InterruptedException {

		visibilityOfElementWait(caseTitleGeneral);
		caseTitleGeneral.clear();
		caseTitleGeneral.sendKeys(name);
	}

	@FindBy(id = "matterNumber")
	WebElement matterNumberGeneral;

	public void matternumber(String name) throws InterruptedException {

		visibilityOfElementWait(matterNumberGeneral);
		matterNumberGeneral.clear();
		matterNumberGeneral.sendKeys(name);
	}
	
	
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement descriptionGeneral;

	public void description(String name) throws InterruptedException {

		visibilityOfElementWait(descriptionGeneral);
		descriptionGeneral.clear();
		descriptionGeneral.sendKeys(name);
	}
	
	
	@FindBy(id = "matterType")
	WebElement matterTypeGeneral;

	public void mattertype(String name) throws InterruptedException {

		visibilityOfElementWait(matterTypeGeneral);
		matterTypeGeneral.clear();
		matterTypeGeneral.sendKeys(name);
	}
	
	
	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[1]")
	WebElement startDate;

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[2]")
	WebElement endDate;

	// Start Date
	public void startDate(String date) throws InterruptedException {

		visibilityOfElementWait(startDate);
		startDate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}

	// End Date
	public void endDate(String date) throws InterruptedException {

		visibilityOfElementWait(endDate);
		endDate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}

	
	@FindBy(xpath="//button[@type='submit']")
	WebElement savebtn;
	
	// Next or Save
	public void editMatterInfoSave()
	{
		visibilityOfElementWait(savebtn);
	savebtn.click();
	}
	
	@FindBy(xpath="//button[text()='View Matter List']")
	WebElement alertSuccesspoup;
	
	// Next or Save
	public void editMatterViewChangesSuccess() throws InterruptedException
	{
		Thread.sleep(3000);
		visibilityOfElementWait(alertSuccesspoup);
		alertSuccesspoup.click();
	}
	
	//Assertion 
	
	public void caseTitleGeneralVerifyAssert(String text) throws InterruptedException
	{
		visibilityOfAllElements(caseTitleGeneral);
		String caseTitleGeneralAssert = caseTitleGeneral.getAttribute("value");
		Assert.assertEquals(text, caseTitleGeneralAssert,"caseTitleGeneralAssertVerify");
	}
	
	public void matterNumberGeneralVerifyAssert(String text) throws InterruptedException
	{
		visibilityOfAllElements(matterNumberGeneral);
		String matterNumberGeneralAssert = matterNumberGeneral.getAttribute("value");
		Assert.assertEquals(text, matterNumberGeneralAssert,"matterNumberGeneralAssertVerify");
	}
	
	public void descriptionGeneralVerifyAssert(String text) throws InterruptedException
	{
		visibilityOfAllElements(descriptionGeneral);
		String descriptionGeneralAssert = descriptionGeneral.getAttribute("value");
		Assert.assertEquals(text, descriptionGeneralAssert,"descriptionGeneralAssertVerify");
	}
	
	public void matterTypeGeneralVerifyAssert(String text) throws InterruptedException
	{
		visibilityOfAllElements(matterTypeGeneral);
		String matterTypeGeneralAssert = matterTypeGeneral.getAttribute("value");
		Assert.assertEquals(text, matterTypeGeneralAssert,"matterTypeGeneralAssertVerify");
	}
	
}
