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

	// Main Searchbar
	@FindBy(xpath = "//input[@placeholder='Search Group']")
	WebElement viewgroupSearchbar;

	// Action
	@FindBy(xpath = "//button[@data-bs-toggle='dropdown']")
	WebElement actionbtn1;

	public void viewgroupSearchbar(String GroupName) throws InterruptedException {
		Thread.sleep(1000);
		viewgroupSearchbar.clear();
		Thread.sleep(1000);
		viewgroupSearchbar.sendKeys(GroupName);
		Thread.sleep(1000);
		actionbtn1.click();

	}

	// Group name verify
	@FindBy(xpath = "//tr//td[1]")
	private List<WebElement> groupNamesTextVerify;

	public boolean textVerifyGroupName(String groupsName) throws InterruptedException {
		Thread.sleep(3000);
		Boolean match = groupNamesTextVerify.stream()
				.anyMatch(groupNameCheck -> groupNameCheck.getText().equalsIgnoreCase(groupsName));
		return match;
	}

	
	//Group head verify 
	@FindBy(xpath="//tr//td[3]")
	private List<WebElement> groupHeadNameTextVerify;
	
	public boolean textVerifyGroupHeadName(String groupHeadName) throws InterruptedException {
		Thread.sleep(3000);
		Boolean match1 = groupHeadNameTextVerify.stream()
				.anyMatch(groupHeadNameCheck -> groupHeadNameCheck.getText().equalsIgnoreCase(groupHeadName));
		return match1;
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
		
	@FindBy(xpath="//div//button[@type='reset']")
	WebElement editgroupCancel;
	
	public void editGroupInfoBtn() throws InterruptedException
	{
		Thread.sleep(1000);
		selectAction(actionAllBoxSize, editGroupinfoBtn);
	}
	
	
	public void editGroupName(String RenameGroup) throws InterruptedException {
		// Rename groupName
		visibilityOfAllElements(reNameGroup);
		reNameGroup.clear();
		reNameGroup.sendKeys(RenameGroup);
	}

	
	public void editDescp(String Descp) throws InterruptedException {
		// Rename Description
		visibilityOfAllElements(reNameDescp);
		reNameDescp.clear();
		reNameDescp.sendKeys(Descp);
	}
	
	public void editGroupInfoSave() throws InterruptedException {

		visibilityOfAllElements(editgroupinfoSave);
		editgroupinfoSave.click();
		visibilityOfAllElements(editgroupinfoAlertOk);
		Thread.sleep(1000);
		editgroupinfoAlertOk.click();
	}
	
	public void editGroupCancel()
	{
		visibilityOfAllElements(editgroupCancel);
		editgroupCancel.click();
	}
	
	// Update Group Members List

	@FindBy(xpath = "(//ul[@class='dropdown-menu custom-dropdown show'])//li[2]")
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

	// Cancel Button
	@FindBy(xpath="//div[@class='btnbox'] //button[1]")
	WebElement cancelButtonUpdateGroupMember;
	
	//Remove all 
	@FindBy(xpath="//div //button[text()='Remove All']")
	WebElement removeAllBtn;
	
	public void removeAllButton()
	{
		visibilityOfAllElements(removeAllBtn);
		removeAllBtn.click();
	}
	
	public void updateGroupMembersList() throws InterruptedException
	{
		Thread.sleep(1000);
		selectAction(actionAllBoxSize, updategroupMemberlistBtn);
	}
	
	public void selectTeamMember(String[] names) throws InterruptedException
	{
		Thread.sleep(1000);
		selectNameorRemoveName(names, selectMemberNameText, selectMemberButton);
	}
	
	public void removeTeamMember(String[] names) throws InterruptedException
	{
		Thread.sleep(1000);
		selectNameorRemoveName(names, selectedMemberNameText, removeButtonMember);
	}
	
	public void saveButtonUpdateGroupMembers() throws InterruptedException
	{
		Thread.sleep(1000);
		visibilityOfAllElements(updateGroupMemberSaveBtn);
		updateGroupMemberSaveBtn.click();
	}
	
	public void cancelButtonUpdateGroupMembers() throws InterruptedException
	{
		Thread.sleep(1000);
		visibilityOfAllElements(cancelButtonUpdateGroupMember);
		cancelButtonUpdateGroupMember.click();
	}
	
	
	public void okButtonSuccessPopupUpdateGroupMembers() throws InterruptedException
	{
		Thread.sleep(1000);
		visibilityOfAllElements(updateGroupMemberalertOk);
		updateGroupMemberalertOk.click();
	}
	
	
	public void pageUpViewGroups() throws InterruptedException
	{
		actionPageUp();
	}
	
	public void pageDownViewGroups() throws InterruptedException
	{
		actionPageDown();
	}
	
	// Alert Yes
	
	@FindBy(xpath="//div //button[text()='Yes']")
	WebElement alertYesBtn;
	
	@FindBy(xpath="//div //button[text()='No']")
	WebElement alertNoBtn;
	
	public void alertYesButton() throws InterruptedException
	{
		Thread.sleep(2000);
		visibilityOfAllElements(alertYesBtn);
		alertYesBtn.click();
	}
	
	public void alertNoButton() throws InterruptedException
	{
		Thread.sleep(2000);
		visibilityOfAllElements(alertNoBtn);
		alertNoBtn.click();
	}
	

	// UpdateGroupHead
	@FindBy(xpath = "(//ul[@class='dropdown-menu custom-dropdown show'])//li[3]")
	WebElement updategroupheadBtn;

	// Searchbox
	@FindBy(xpath = "//input[@placeholder='Search member']")
	WebElement searchBoxGH;

	// GroupheadNameText
	@FindBy(xpath = "//label[@class='callselect float-left']")
	List<WebElement> groupheadNameText;

	// GroupheadName Select
	@FindBy(xpath = "(//div[@class='multicheck form-control textbox selmember'])//label")
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

	
	
	public void updateGroupHeadButton() throws InterruptedException
	{
		Thread.sleep(1000);
		selectAction(actionAllBoxSize, updategroupheadBtn);
	}
	
	public void selectGroupHeads(String[] names) throws InterruptedException
	{
		Thread.sleep(1000);
		selectNameorRemoveName(names, groupheadNameText, selectbuttonGroupHead);
	}
	
	
	@FindBy(xpath = "(//ul[@class='dropdown-menu custom-dropdown show'])//li[4]")
	WebElement deleteBtn;

	// Assign to another groupName text
	@FindBy(xpath = "//label[@class='callselect float-left']")
	List<WebElement> assignGroupNameText;

	// Select button
	@FindBy(xpath = "//div[@class='multicheck form-control textbox']")
	List<WebElement> selectBtnAssignGroup;

	// Delete
	@FindBy(xpath = "//button[@data-bs-target='#confirmModal']")
	WebElement assigndeleteBtn;

	@FindBy(xpath = "(//button[@aria-label='Close'])[3]")
	WebElement assignAlertYesBtn;

	// SearchBox
	@FindBy(xpath = "//input[@placeholder='Search group']")
	WebElement searchboxName;

	// Single Name Select Button
	@FindBy(xpath = "//div[@class='multicheck form-control textbox']")
	WebElement assignGroupBtn;
	
	
	@FindBy(xpath="(//div//button[text()='OK'])[1]")
	WebElement successOK;
	
	public void deleteGroupButton() throws InterruptedException
	{
		Thread.sleep(1000);
		selectAction(actionAllBoxSize, deleteBtn);
	}
	
	public void selectDeleteGroup(String[] names) throws InterruptedException
	{
		Thread.sleep(1000);
		selectNameorRemoveName(names, assignGroupNameText, selectBtnAssignGroup);
	}
	
	public void successPopUpOK() throws InterruptedException
	{
		Thread.sleep(1000);
		successOK.click();
	}
	
	

}
