package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class ViewMatterGeneralViewDetailsPOM extends Reusable{
	
	
	WebDriver driver; 

	public ViewMatterGeneralViewDetailsPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Left Side Menu Matter Name
		@FindBy(xpath = "(//div //img[@class='mattersicon'])[1]")
		WebElement matterTab;
	
	@FindBy(xpath="//a[text()='General Matters']")
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
	
	

}
