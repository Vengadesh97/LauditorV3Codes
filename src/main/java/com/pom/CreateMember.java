package com.pom;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.abst.Reusable;

public class CreateMember extends Reusable {

	WebDriver driver;

	public CreateMember(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// CreateMember
	@FindBy(xpath = "//button[@routerlink='/groups/create-member']")
	WebElement createMember;

	public void createMemberTab() throws InterruptedException
	{
		Thread.sleep(2000);
		createMember.click();
	}
	// Name
	@FindBy(name = "name")
	WebElement createName;
	// Designation
	@FindBy(name = "designation")
	WebElement designation;
	// Currency
	@FindBy(name = "currency")
	WebElement defaultCurrencyBtn;
	// DefaultRate
	@FindBy(name = "defaultRate")
	WebElement defaultRate;
	// Email
	@FindBy(name = "email")
	WebElement memberEmail;
	// Confirm Email
	@FindBy(name = "emailConfirm")
	WebElement memberConfirmEmail;

	// Click on assign Group
	@FindBy(xpath = "//i[@class='fa fa-solid fa-plus calimg calitem input-group-append sgroup']")
	WebElement assignGroupBtn;

	// List of GroupName text
	@FindBy(xpath = "//div[@class='callselect']")
	List<WebElement> listofgroupsname;

	// selectButton
	@FindBy(xpath = "//input[@id='flexCheckDefault']")
	List<WebElement> selectBtnGroup;

	// Save button selected Group
	@FindBy(xpath = "//button[@class='btn btn-default btnsave']")
	WebElement saveBtnSelectedGroup;

	// Add Team Member
	@FindBy(xpath = "//button[text()='Add Members']")
	WebElement addTeamMemberPopupBtn;

	// View Changes
	@FindBy(xpath = "//button[text()='View Changes']")
	WebElement viewChangesPopupBtn;

	
	
	public void createTeamMemberInfo(String crName, String crDesignation, String crDefaultRate, String crEmail,
			String crConfirmEmail, String currencyNames,String[] named) throws InterruptedException {
		
		Thread.sleep(2000);
		createName.sendKeys(crName);
		designation.sendKeys(crDesignation);
		defaultRate.sendKeys(crDefaultRate);
		memberEmail.sendKeys(crEmail);
		memberConfirmEmail.sendKeys(crConfirmEmail);
		defaultCurrencyBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='" + currencyNames + "']")).click();
		assignGroupBtn.click();
		
		int j = 0;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		List<String> selectgroupname = Arrays.asList(named);

		Thread.sleep(5000);
		for (int i = 0; i < listofgroupsname.size(); i++) {

			String groupsnametext = listofgroupsname.get(i).getText();
			Thread.sleep(2000);
			if (selectgroupname.contains(groupsnametext)) {
				j++;
				Thread.sleep(2000);

				WebElement selectedGroupNameBtnClick = selectBtnGroup.get(i);

				executor.executeScript("arguments[0].click();", selectedGroupNameBtnClick);
				if (j == selectgroupname.size()) {
					break;
				}
			}

		}

		Thread.sleep(2000);

		executor.executeScript("scrollBy(0, 4500)");

		Thread.sleep(2000);
		// Save
		saveBtnSelectedGroup.click();

		Thread.sleep(2000);
		// View Changes
		viewChangesPopupBtn.click();
		
	}

}
