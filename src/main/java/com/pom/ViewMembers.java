package com.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class ViewMembers extends Reusable {

	WebDriver driver;

	public ViewMembers(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ViewMember
	@FindBy(xpath = "//button[@routerlink='/groups/view-member']")
	WebElement viewMember;

	@FindBy(xpath = "//input[@placeholder='Search Member']")
	WebElement searchbarTeamMember;

	@FindBy(xpath = "//button[@data-bs-toggle='dropdown']")
	WebElement actionbtnTM;

	public void viewMemberTab(String memberEmailId) throws InterruptedException {
		Thread.sleep(2000);
		viewMember.click();
		Thread.sleep(2000);
		searchbarTeamMember.sendKeys(memberEmailId);
		Thread.sleep(2000);
		actionbtnTM.click();

	}

	// Edit Member Info

	@FindBy(xpath = "(//ul[@class='dropdown-menu custom-dropdown show'])//li[1]")
	WebElement editmemberinfoBtn;

	// Name
	@FindBy(name = "name")
	WebElement renameName;
	// Designation
	@FindBy(name = "designation")
	WebElement renamedesignation;
	// Currency
	@FindBy(name = "currency")
	WebElement defaultCurrencyBtn;
	// DefaultRate
	@FindBy(name = "defaultRate")
	WebElement renamedefaultRate;
	// Email
	@FindBy(name = "email")
	WebElement renamememberEmail;
	// Confirm Email
	@FindBy(name = "emailConfirm")
	WebElement renamememberConfirmEmail;

	// Save button selected Group
	@FindBy(xpath = "//button[@class='btn btn-default btnsave']")
	WebElement saveBtnEditMemberinfo;

	// Cancel
	@FindBy(xpath = "//button[@class='btn btn-default btncancel']")
	WebElement cancelEditMemberinfo;

	// SUccess popup close button
	@FindBy(xpath = "//button[@class='btn-close pull-right']")
	WebElement successCloseBtn;

	public void renameeditmemberinfo(String changeName, String changeDesignation, String changeDefaultRate,
			String changeEmail, String changeConfirmEmail, String currencyNames) throws InterruptedException {

		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(editmemberinfoBtn).click().perform();

		action.sendKeys(Keys.PAGE_UP).build().perform();

		Thread.sleep(2000);
		renameName.clear();
		renameName.sendKeys(changeName);
		renamedesignation.clear();
		renamedesignation.sendKeys(changeDesignation);
		renamedefaultRate.clear();
		renamedefaultRate.sendKeys(changeDefaultRate);
		renamememberEmail.clear();
		renamememberEmail.sendKeys(changeEmail);
		renamememberConfirmEmail.clear();
		renamememberConfirmEmail.sendKeys(changeConfirmEmail);

		defaultCurrencyBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='" + currencyNames + "']")).click();

		Thread.sleep(2000);
		saveBtnEditMemberinfo.click();

		Thread.sleep(2000);
		successCloseBtn.click();

	}

}
