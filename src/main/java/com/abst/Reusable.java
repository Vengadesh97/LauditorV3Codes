package com.abst;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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

	public void pageDown() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void pageUp() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,0)");
	}
	
	public void pageUp1() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
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
	
	
	public void visibilityOfAllElements(WebElement actionBtn) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(
				ExpectedConditions.visibilityOfAllElements(actionBtn));
	}
	
	public void visibilityOfAllElementsList(List<WebElement> elements) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(
				ExpectedConditions.visibilityOfAllElements(elements));
	}
	
	//Document Name or Not
	
	public void documentNameDisplayCheck(String groupNames,List<WebElement> nameElements) throws InterruptedException {
	       // String expectedName = "John Doe";
			Thread.sleep(2000);
	        boolean isNamePresent = false;
	        for (WebElement nameElement : nameElements) {
	            if (nameElement.getText().equals(groupNames)) {
	                isNamePresent = true;
	                break;
	            }
	        }

	        Assert.assertTrue(isNamePresent, "The name '" + groupNames + "' is not present in the list.");
	    }
	
	//Name select and Remove			
	public void selectNameorRemoveName(String[] NameList,List<WebElement> allNamesText,List<WebElement> removeOrSelectBtn) throws InterruptedException {
		Thread.sleep(2000);
			List<String> groupNames = Arrays.asList(NameList);
			String textGroup = new String();

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			WebElement checkboxSelectedGroupName;
			for (int i = 0; i <allNamesText.size(); i++) {
				textGroup = allNamesText.get(i).getText();
				// System.out.println("All Group Name Text "+textGroup);
				if (groupNames.contains(textGroup)) {
					//Thread.sleep(2000);
					checkboxSelectedGroupName = removeOrSelectBtn.get(i);
					visibilityOfAllElements(checkboxSelectedGroupName);
					Thread.sleep(2000);
					executor.executeScript("arguments[0].click();", checkboxSelectedGroupName);
					i--;
				}
		}

	}

	
	public void mouseClassPerform(WebElement element) throws InterruptedException
	{
		Thread.sleep(1000);
		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(element).perform();
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
				Thread.sleep(2000);
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

	
	

}
