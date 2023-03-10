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

public class ViewGroups extends Reusable {

	WebDriver driver;

	public ViewGroups(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//tr /td[1]")
	List<WebElement> groupNameText;

	@FindBy(xpath = "//div[@class='dropdown']")
	List<WebElement> actions;

	@FindBy(xpath = "//button[text()=' Action ']")
	List<WebElement> actionBtnClick;

	@FindBy(xpath = "//button[text()='View Group']")
	WebElement viewGroupHeading;

	public void viewGroupHeader() {
		viewGroupHeading.click();
	}

	public void viewGroupAction(String name) throws InterruptedException {

		Thread.sleep(2000);
		int j = 0;
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		for (int i = 0; i < groupNameText.size(); i++) {
			String grouptextcomp = groupNameText.get(i).getText();

			Thread.sleep(200);
			if (name.contains(grouptextcomp)) {
				j++;
				Thread.sleep(2000);

				WebElement actionMenu = actionBtnClick.get(i);

				executor.executeScript("arguments[0].click();", actionMenu);

				if (j == name.length()) {
					break;
				}
			}
		}
	}

	// EditGroupInfo [Positive]

	@FindBy(xpath = "//ul[@class='dropdown-menu custom-dropdown show']")
	WebElement actionAllBoxSize;

	@FindBy(xpath = "(//ul[@class=\"dropdown-menu custom-dropdown show\"])//li[1]")
	WebElement editGroupinfoBtn;

	@FindBy(id = "caseTitle")
	WebElement reNameGroup;

	@FindBy(name = "description")
	WebElement reNameDescp;

	@FindBy(xpath = "//button[@class='btn btn-default btnsave']")
	WebElement editgroupinfoSave;

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[4]")
	WebElement editgroupinfoAlertOk;

	public void editGroupInfo(String RenameGroup, String Descp) throws InterruptedException {
		Thread.sleep(5000);
		Actions action = new Actions(driver);

		action.moveToElement(actionAllBoxSize).build().perform();

		Thread.sleep(5000);
		action.moveToElement(editGroupinfoBtn).click().perform();

		// Rename groupName
		reNameGroup.clear();
		reNameGroup.sendKeys(RenameGroup);

		// Rename Description
		reNameDescp.clear();
		reNameDescp.sendKeys(Descp);

		editgroupinfoSave.click();

		Thread.sleep(1000);
		editgroupinfoAlertOk.click();

	}

	// Update Group Members List

	@FindBy(xpath = "(//ul[@class=\"dropdown-menu custom-dropdown show\"])//li[2]")
	WebElement updategroupMemberlistBtn;

	// LeftSide Selected TeamMember Name text
	@FindBy(xpath = "(//div[@class='col-6'])[1]//div[@class='form-control textbox']")
	List<WebElement> selectedMemberNameText;

	// RightSide Selected TeamMember Name text
	@FindBy(xpath = "(//div[@class='col-6'])[4]//div[@class='form-control textbox']")
	List<WebElement> selectMemberNameText;

	// Remove Button
	@FindBy(xpath = "//i[@class='fa fa-regular fa-circle-xmark calimg calitem input-group-append sgroup']")
	List<WebElement> removeButtonMember;

	// Select Button
	@FindBy(xpath = "//i[@class='fa a-solid fa-minus calimg calitem input-group-append sgroup']")
	List<WebElement> selectMemberButton;

	// Save Button [updateGroupMemberList]
	@FindBy(xpath = "//button[@class='btn btn-default btnsave']")
	WebElement updateGroupMemberSaveBtn;

	// Alert ok
	@FindBy(xpath = "(//div[@class='center'])[3]")
	WebElement updateGroupMemberalertOk;

	public void updateGroupMemberList(String[] removeNameGroupMember, String[] MembernamedAdd)
			throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		Thread.sleep(5000);
		Actions action = new Actions(driver);

		action.moveToElement(actionAllBoxSize).build().perform();

		Thread.sleep(5000);
		action.moveToElement(updategroupMemberlistBtn).click().perform();

		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_UP).build().perform();

		// Remove listname
		// String[] removeNameGroupMember= {"Miranda Williams","Susan"};
		Thread.sleep(5000);
		List<String> removeNameUpdateGroupMember = Arrays.asList(removeNameGroupMember);

		// Left Side Remove Member Scenario
		Thread.sleep(5000);
		for (int i = 0; i < selectedMemberNameText.size(); i++) {
			String removedname = selectedMemberNameText.get(i).getText();

			Thread.sleep(2000);
			if (removeNameUpdateGroupMember.contains(removedname)) {
				Thread.sleep(2000);

				WebElement removeMembclick = removeButtonMember.get(i);

				executor.executeScript("arguments[0].click();", removeMembclick);
			}
		}

		// Right Side Select Member Scenario

		// Add member
		// String[] MembernamedAdd = {"Neela C RSB Associates","Ananth-TM"};

		Thread.sleep(8000);
		List<String> memberNameAdded = Arrays.asList(MembernamedAdd);

		for (int j = 0; j < selectMemberNameText.size(); j++) {
			String nameSelect = selectMemberNameText.get(j).getText();
			Thread.sleep(2000);
			if (memberNameAdded.contains(nameSelect)) {
				Thread.sleep(2000);

				WebElement memberSelect = selectMemberButton.get(j);

				executor.executeScript("arguments[0].click();", memberSelect);
			}

		}

		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		// Save
		Thread.sleep(5000);
		updateGroupMemberSaveBtn.click();
		Thread.sleep(3000);
		updateGroupMemberalertOk.click();

	}

	@FindBy(xpath = "(//ul[@class=\"dropdown-menu custom-dropdown show\"])//li[3]")
	WebElement updategroupheadBtn;

	// GroupheadNameText
	@FindBy(xpath = "//label[@class='callselect float-left']")
	List<WebElement> groupheadNameText;

	// GroupheadName Select
	@FindBy(xpath = "//div[@class=\"multicheck form-control textbox selmember\"]")
	List<WebElement> selectbuttonGroupHead;

	// UpdateGroupHead Save Button
	@FindBy(xpath = "//button[@data-bs-target='#exampleModal']")
	WebElement groupHeadSaveBtn;

	// AlertYes button
	@FindBy(xpath = "(//button[@data-bs-dismiss=\"modal\"])[6]")
	WebElement alertYesButton;

	// Ok button
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
	WebElement okButton;

	// UpdateGroupHead Scenario
	public void updateGroupHead(String groupheadname) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		Thread.sleep(5000);
		Actions action = new Actions(driver);

		action.moveToElement(actionAllBoxSize).build().perform();
		Thread.sleep(5000);
		action.moveToElement(updategroupheadBtn).click().perform();

		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).build().perform();

		Thread.sleep(5000);
		for (int i = 0; i < groupheadNameText.size(); i++) {
			String totalGroupheadname = groupheadNameText.get(i).getText();

			Thread.sleep(200);
			if (groupheadname.contains(totalGroupheadname)) {
				Thread.sleep(2000);

				WebElement selectedGroupHead = selectbuttonGroupHead.get(i);

				executor.executeScript("arguments[0].click();", selectedGroupHead);
			}
		}

		// save
		groupHeadSaveBtn.click();
		Thread.sleep(1000);
		// Yes
		alertYesButton.click();

		Thread.sleep(1000);
		// ok
		okButton.click();

	}

	
	
	@FindBy(xpath="(//ul[@class=\"dropdown-menu custom-dropdown show\"])//li[4]")
	WebElement deleteBtn;
	
	// Assign to another groupName text
	@FindBy(xpath="//label[@class='callselect float-left']")
	List<WebElement> assignGroupNameText;
	
	// Select button
	@FindBy(xpath="//div[@class='multicheck form-control textbox']")
	List<WebElement> selectBtnAssignGroup;

	//Delete
	@FindBy(xpath="//button[@data-bs-target='#confirmModal']")
	WebElement assigndeleteBtn;
	
	@FindBy(xpath="(//button[@aria-label='Close'])[3]")
	WebElement assignAlertYesBtn;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
	WebElement successOkbtn;
	
	
	
	// DeleteComplete Group
	public void deleteAssigntoAnotherGroup(String assignGroupname) throws InterruptedException {

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		Thread.sleep(5000);
		Actions action = new Actions(driver);

		action.moveToElement(actionAllBoxSize).build().perform();
		Thread.sleep(5000);
		action.moveToElement(deleteBtn).click().perform();

		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(5000);
		for (int i = 0; i < assignGroupNameText.size(); i++) {
			
			String selectAssignGroup = assignGroupNameText.get(i).getText();
			if (assignGroupname.contains(selectAssignGroup)) {
				Thread.sleep(2000);

				WebElement selectedAssignGroup = selectBtnAssignGroup.get(i);

				executor.executeScript("arguments[0].click();", selectedAssignGroup);
			}
		}
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		// Delete
		assigndeleteBtn.click();

		// Yes
		Thread.sleep(1000);
		assignAlertYesBtn.click();

		//ok
		Thread.sleep(1000);
		successOkbtn.click();
		
	}

}
