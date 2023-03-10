package com.pom;

import java.util.Arrays;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class CreateGroup extends Reusable {

	WebDriver driver;

	public CreateGroup(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Create Group']")
	WebElement createGroupTab;

	@FindBy(id = "caseTitle")
	WebElement groupName;

	@FindBy(name = "description")
	WebElement groupDescription;

	@FindBy(xpath = "//i[@class='fa fa-solid fa-plus calimg calitem input-group-append sgroup']")
	WebElement addGroupMem;

	// Add Member
	@FindBy(xpath = "//div[@class='callselect']")
	List<WebElement> membersName;

	@FindBy(xpath = "//div /input[@type='checkbox']")
	List<WebElement> memberSelectCheckbox;

	@FindBy(xpath = "//button[@class='btn btn-default btnsave']")
	WebElement addmemberNext;

	// Remove Member
	@FindBy(xpath = "//div[@class='input-group multicheck court']")
	List<WebElement> removeMemberName;

	@FindBy(xpath = "//div /i")
	List<WebElement> clickRemovebtn;

	@FindBy(xpath = "//button[@class='btn btn-default btnsave']")
	WebElement selectedDoneBtn;

	// GroupHead
	@FindBy(xpath = "//div[@class='multicheck form-control textbox']")
	List<WebElement> groupheadLabel;

	@FindBy(xpath = "//div /input[@name='member']")
	List<WebElement> selectGroupHeadCheckbox;

	@FindBy(xpath = "(//button[@class='btn btn-default btnsave'])[2]")
	WebElement groupheadSave;

	@FindBy(xpath = "(//button[@class='btn btn-default alertbtn'])[2]")
	WebElement alertViewChanges;

	// View Groups

	@FindBy(xpath = "driver.findElements(By.xpath(\"//tr /td[1]\"))")
	List<WebElement> groupNameCheck;

	public ViewGroups createGroups(String gName, String gDesc, String[] addMembers, String removedMembers, String groupHead)
			throws InterruptedException {
		
		createGroupTab.click();
		groupName.sendKeys(gName);
		groupDescription.sendKeys(gDesc);
		addGroupMem.click();
		// String[] teams = {"Rossy","Vengadesh RSB Associates","Susan","Miranda
		// Williams","Ananth-Admin"};

		// Add Team Member
		Thread.sleep(3000);
		List<String> nameSelect = Arrays.asList(addMembers);

		int j = 0;
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		for (int i = 0; i < membersName.size(); i++) {
			String name = membersName.get(i).getText();

			Thread.sleep(200);
			if (nameSelect.contains(name)) {
			j++;
				Thread.sleep(2000);

				WebElement selectMember = memberSelectCheckbox.get(i);

				executor.executeScript("arguments[0].click();", selectMember);

				if (j == nameSelect.size()) {
					break;

			}
			}
		}
		Thread.sleep(200);
		executor.executeScript("arguments[0].click();", addmemberNext);

		// Remove Team member Name

		int y = 0;

		for (int k = 0; k < removeMemberName.size(); k++) {
			String removename = removeMemberName.get(k).getText();
			Thread.sleep(2000);
			if (removedMembers.contains(removename)) {
				y++;

				Thread.sleep(2000);

				WebElement namesremove = clickRemovebtn.get(k);

				executor.executeScript("arguments[0].click();", namesremove);

				if (y == removedMembers.length()) {
					break;

				}
			}

		}

		// SelectedGroupMember - Done Button

		executor.executeScript("arguments[0].click();", selectedDoneBtn);

		// SelectGroupHead

		int z = 0;
		for (int h = 0; h < groupheadLabel.size(); h++) {

			String groupheadName = groupheadLabel.get(h).getText();
			Thread.sleep(2000);
			if (groupHead.contains(groupheadName)) {
				z++;
				Thread.sleep(2000);

				WebElement selectGroupHead = selectGroupHeadCheckbox.get(h);

				executor.executeScript("arguments[0].click();", selectGroupHead);
				if (z == groupHead.length()) {
					break;

				}

			}

		}

		Thread.sleep(1000);
		// Group Head - Done

		executor.executeScript("arguments[0].click();", groupheadSave);

		Thread.sleep(1000);

		// View Changes
		alertViewChanges.click();
		ViewGroups viewGroups = new ViewGroups(driver);
		return viewGroups;

	}

	public boolean viewScreen(String groupsName) {
		return groupNameCheck.stream()
				.anyMatch(groupNameCheck -> groupNameCheck.getText().equalsIgnoreCase(groupsName));

	}

}
