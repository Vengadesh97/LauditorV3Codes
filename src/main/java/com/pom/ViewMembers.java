package com.pom;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

	// UpdateGroupAccessButton
	@FindBy(xpath = "(//ul[@class='dropdown-menu custom-dropdown show'])//li[2]")
	WebElement updateGroupAccessBtn;
	// ListofGroupNameText
	@FindBy(xpath = "//*[@class='multicheck form-control textbox']//div")
	List<WebElement> ListofGroupNameText;
	// CheckboxSelect
	@FindBy(xpath = "//input[@class='form-check-inpu calimg calitem input-group-app end checkboxitem']")
	List<WebElement> checkboxSelect;

	@FindBy(xpath = "//button[@class='btn btn-default btncancel']")
	WebElement cancelBtnUpdateGroup;

	@FindBy(xpath = "//button[@class='btn btn-default btnsave']")
	WebElement saveBtnUpdateGroup;

	public void updateGroupAccess(String[] updategroupsnamedAdd) throws InterruptedException {
		Thread.sleep(4000);
		updateGroupAccessBtn.click();
		// String[] updategroupsnamedAdd = { "Matters Group", "Teams", "Test New group",
		// "Example group" };
		Thread.sleep(4000);
		List<String> updategroupNames = Arrays.asList(updategroupsnamedAdd);
		for (int i = 0; i < ListofGroupNameText.size(); i++) {
			String groupNameText = ListofGroupNameText.get(i).getText();
			if (updategroupNames.contains(groupNameText)) {

				Thread.sleep(3000);
				WebElement checkboxSelectedGroupName = checkboxSelect.get(i);

				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", checkboxSelectedGroupName);

			}
		}
		Actions action = new Actions(driver);

		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(2000);
		saveBtnUpdateGroup.click();
	}

	// Reset Password
	@FindBy(xpath = "(//ul[@class='dropdown-menu custom-dropdown show'])//li[3]")
	WebElement resetPasswordBtn;

	// Alert No
	@FindBy(xpath = "(//button[@class='btn btn-default alertbtn alertbtnno'])[2]")
	WebElement alertpopupResetPasswordNo;

	// Alert Yes
	@FindBy(xpath = "(//button[@class='btn btn-default alertbtn alertbtnyes'])[2]")
	WebElement alertpopupResetPasswordYes;

	// Close button
	@FindBy(xpath = "(//button[@class='btn-close'])[2]")
	WebElement alertpopupResetPasswordClosebtn;

	public void resetPassword() throws InterruptedException {
		Thread.sleep(2000);
		resetPasswordBtn.click();
		alertpopupResetPasswordYes.click();
	}

	// Delete Button
	@FindBy(xpath = "(//ul[@class='dropdown-menu custom-dropdown show'])//li[4]")
	WebElement deleteButton;

	// Alert No
	@FindBy(xpath = "(//button[@class='btn btn-default alertbtn alertbtnno'])[1]")
	WebElement alertpopupDeleteNo;

	// Alert Yes
	@FindBy(xpath = "(//button[@class='btn btn-default alertbtn alertbtnyes'])[1]")
	WebElement alertpopupDeleteYes;

	// Close button
	@FindBy(xpath = "(//button[@class='btn-close'])[1]")
	WebElement alertpopupDeleteClosebtn;

	public void deleteMember() throws InterruptedException {
		Thread.sleep(2000);
		deleteButton.click();
		alertpopupDeleteYes.click();
	}

}
