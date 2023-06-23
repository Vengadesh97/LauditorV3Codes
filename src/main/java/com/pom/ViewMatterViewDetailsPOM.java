package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class ViewMatterViewDetailsPOM extends Reusable {

	WebDriver driver;
	
	public ViewMatterViewDetailsPOM(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//ul[@class='dropdown-menu show'] //li[1]")
	WebElement viewDetailsbtn;
	
	public void viewDetailsBtn()
	{
		visibilityOfElementWait(viewDetailsbtn);
		Actions action = new Actions(driver);
		action.moveToElement(viewDetailsbtn).click().perform();
	}
	
	
	
	
	
	
	
	
	
}
