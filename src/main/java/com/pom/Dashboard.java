package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class Dashboard extends Reusable {
	
	 WebDriver driver;

	
	public Dashboard(WebDriver driver)
	{	
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	
	
	

	@FindBy(xpath="//span[text()='Groups']")
	WebElement texts;
	
	public CreateGroup groupsMenuClick() throws InterruptedException
	{
		// Scroll Down
		Thread.sleep(10000);
		WebElement scol = driver.findElement(By.cssSelector("html"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", scol);
	
		// Group Select on Left Side
		Thread.sleep(10000);
		texts.click();
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_UP).build().perform();
		a.sendKeys(Keys.PAGE_UP).build().perform();
	CreateGroup createGroup = new CreateGroup(driver);
	return createGroup;
	
		
	}
	
	
	public ViewGroups viewdGroup() throws InterruptedException
	{
		// Scroll Down
		Thread.sleep(10000);
		WebElement scol = driver.findElement(By.cssSelector("html"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", scol);
	
		// Group Select on Left Side
		Thread.sleep(10000);
		texts.click();
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_UP).build().perform();
		a.sendKeys(Keys.PAGE_UP).build().perform();
		ViewGroups viewGroups = new ViewGroups(driver);
		return viewGroups;
	}
	
	

}
