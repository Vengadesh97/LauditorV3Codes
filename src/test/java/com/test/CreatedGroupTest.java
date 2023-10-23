package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.CreateGroup;
import com.pom.Dashboard;
import com.pom.LoginPage;
import com.pom.ViewGroups;

public class CreatedGroupTest extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void createGroupWithCancelandAlertNo(HashMap<String, String> input) throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.cancelButton();
			createGroup.confirmNoButton();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData1", priority = 1)
	public void createGroupWithCancelandAlertYes(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.cancelButton();
			createGroup.confirmYesButton();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData2", priority = 2)
	public void createGroupWithSaveandAddGroups(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.saveButton();
			createGroup.successAddGroups();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData3", priority = 3)
	public void createGroupWithSaveandViewChanges(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.successViewChanges();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData4", priority = 4)
	public void createGroupWithCheckMemberNamesAreList(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(2000);
			createGroup.verifySelectPageHeading();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData5", priority = 5)
	public void createGroupWithoutAddAnyMemberClickonBack(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.backButton();
			Thread.sleep(1000);
			createGroup.verifyCreatePageHeading();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData6", priority = 6)
	public void createGroupWithSelectTMandCancelandAlertNo(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.cancelButton();
			createGroup.confirmNoButton();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData7", priority = 7)
	public void createGroupWithSelectTMandCancelandAlertYes(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.cancelButton();
			createGroup.confirmYesButton();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData8", priority = 8)
	public void createGroupWithSelectTMandNextVerify(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.nextButton();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData9", priority = 9)
	public void createGroupWithSelectTMandNextandBackVerify(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(2000);
			createGroup.backButton();
			Thread.sleep(2000);
			createGroup.pageUp1();
			Thread.sleep(1000);
			createGroup.verifySelectPageHeading();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData10", priority = 10)
	public void createGroupWithSelectTMandRemoveandCancelandAlertNo(HashMap<String, String> input)
			throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2"), input.get("addMember3"),
					input.get("addMember4") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			String[] removeMembers = { input.get("addMember2"), input.get("addMember3") };
			createGroup.removeMemberInGroups(removeMembers);
			Thread.sleep(1000);
			createGroup.cancelButton();
			createGroup.confirmNoButton();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData11", priority = 11)
	public void createGroupWithSelectTMandRemoveandCancelandAlertYes(HashMap<String, String> input)
			throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2"), input.get("addMember3"),
					input.get("addMember4") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			String[] removeMembers = { input.get("addMember2"), input.get("addMember3") };
			createGroup.removeMemberInGroups(removeMembers);
			Thread.sleep(1000);
			createGroup.cancelButton();
			createGroup.confirmYesButton();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData12", priority = 12)
	public void createGroupWithAddRemoveandBackandVerify(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2"), input.get("addMember3"),
					input.get("addMember4") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			String[] removeMembers = { input.get("addMember2"), input.get("addMember3") };
			createGroup.removeMemberInGroups(removeMembers);
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			createGroup.backButton();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData13", priority = 13)
	public void createGroupWithAddRemoveandCancelandAlertNo(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2"), input.get("addMember3"),
					input.get("addMember4") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			String[] removeMembers = { input.get("addMember2"), input.get("addMember3") };
			createGroup.removeMemberInGroups(removeMembers);
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			createGroup.cancelButton();
			createGroup.confirmNoButton();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData14", priority = 14)
	public void createGroupWithAddRemoveandCancelandAlertYes(HashMap<String, String> input)
			throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2"), input.get("addMember3"),
					input.get("addMember4") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			String[] removeMembers = { input.get("addMember2"), input.get("addMember3") };
			createGroup.removeMemberInGroups(removeMembers);
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			createGroup.cancelButton();
			createGroup.confirmYesButton();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData15", priority = 15)
	public void createGroupWithoneMemberWithAddGroups(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			String[] groupHead = { input.get("addMember2") };
			createGroup.selectOneGroupHead(groupHead);
			createGroup.saveButton();
			Thread.sleep(2000);
			createGroup.successAddGroups();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData16", priority = 16)
	public void createGroupWithTwoMemberWithAddGroups(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2"), input.get("addMember3") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			String[] groupHead = { input.get("addMember2") };
			createGroup.selectOneGroupHead(groupHead);
			createGroup.saveButton();
			Thread.sleep(2000);
			createGroup.successAddGroups();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData17", priority = 17)
	public void createGroupWithThreeMemberWithViewChanges(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2"), input.get("addMember3"),
					input.get("addMember4") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			String[] groupHead = { input.get("addMember2") };
			createGroup.selectOneGroupHead(groupHead);
			createGroup.saveButton();
			Thread.sleep(2000);
			createGroup.successViewChanges();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData18", priority = 18)
	public void createGroupWithNoMemberRemoved(HashMap<String, String> input) throws InterruptedException {
		try {
			createGroup.createGroupTab();
			createGroup.groupName(input.get("groupName"));
			createGroup.groupDescription(input.get("description"));
			createGroup.addGroupMemberButton();
			Thread.sleep(1000);
			String[] addMembers = { input.get("addMember1"), input.get("addMember2"), input.get("addMember3"),
					input.get("addMember4") };
			createGroup.selectMemberInGroups(addMembers);
			createGroup.pageDown();
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			String[] removeMembers = { input.get("addMember2"), input.get("addMember3") };
			createGroup.removeMemberInGroups(removeMembers);
			Thread.sleep(1000);
			createGroup.nextButton();
			Thread.sleep(1000);
			String[] groupHead = { input.get("addMember4") };
			createGroup.selectOneGroupHead(groupHead);
			createGroup.saveButton();
			Thread.sleep(2000);
			createGroup.successViewChanges();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	// ----------------


	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(0) } };
	}

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(1) } };
	}

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(2) } };
	}

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(3) } };
	}

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(4) } };
	}

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(5) } };
	}

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(6) } };
	}

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(7) } };
	}

	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(8) } };
	}

	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(9) } };
	}

	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(10) } };
	}

	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(11) } };
	}

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(12) } };
	}

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(13) } };
	}

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(14) } };
	}

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(15) } };
	}

	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(16) } };
	}

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(17) } };
	}

	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Group\\CreateGroupData.json");

		return new Object[][] { { data.get(18) } };
	}
}
