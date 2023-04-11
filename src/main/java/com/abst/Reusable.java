package com.abst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable {

	
	WebDriver driver;
	WebDriverWait wait;
	public Reusable(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void pageDown()
	{	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	public void visibilityOfElementWait(By xpath)
	{
		wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
	}
	
	
	public void elementtoBeClickableWait()
	{

		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div //img[@class='mattersicon'])[1]")));

	}
	
}
