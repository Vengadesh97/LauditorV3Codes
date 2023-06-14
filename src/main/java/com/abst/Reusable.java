package com.abst;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable {

	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	
	public Reusable(WebDriver driver) {
		this.driver = driver;
	}

	public void selectEditField(Integer[] intArray,String dname, String descp, String dname1, String descp1, String dname2, String descp2,
			String dname3, String descp3) throws InterruptedException {
		Thread.sleep(5000);
		//Integer[] intArray = new Integer[] { 0, 2,3 };
		List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

		List<WebElement> edit = driver.findElements(By.xpath("//i[@class='fa fa-edit']"));
		Thread.sleep(5000);
		for (int i = 0; i <= edit.size(); i++) {
			Thread.sleep(2000);
			if (intList.contains(i)) {
				Thread.sleep(2000);
				if (i == 0) {
					Thread.sleep(1000);
					driver.findElements(By.xpath("//i[@class='fa fa-edit']")).get(i).click();
					Thread.sleep(1000);
					commonFieldForEdit(dname, descp);
			} 
				else if (i == 1)
				{
					Thread.sleep(1000);
					driver.findElements(By.xpath("//i[@class='fa fa-edit']")).get(i).click();
					Thread.sleep(1000);
					commonFieldForEdit(dname1, descp1);
				} 
	
				else if (i == 2)
					
				{
					Thread.sleep(1000);
					driver.findElements(By.xpath("//i[@class='fa fa-edit']")).get(i).click();
					Thread.sleep(1000);
					commonFieldForEdit(dname2, descp2);
				}

				else if (i == 3)
				{
					Thread.sleep(1000);
					driver.findElements(By.xpath("//i[@class='fa fa-edit']")).get(i).click();
					Thread.sleep(1000);
					commonFieldForEdit(dname3, descp3);
				}
				
			}				
		}
	}

	public void commonFieldForEdit(String name, String descp) throws InterruptedException {
		Thread.sleep(2000);
		WebElement dName = driver.findElement(By.id("documentName"));
		// Name
		dName.click();
		dName.clear();
		dName.sendKeys(name);
		Thread.sleep(2000);
		WebElement dDescrp = driver.findElement(By.xpath("//textarea[@name='description']"));
		// Description
		dDescrp.click();
		dDescrp.clear();
		dDescrp.sendKeys(descp);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public void pageDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void visibilityOfElementWait(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(submitBtn));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void webDriverWaitelementToBeSelected(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	public void elementtoBeClickableWait() {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div //img[@class='mattersicon'])[1]")));

	}
}
