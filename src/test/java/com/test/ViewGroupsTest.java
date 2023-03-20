package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pom.CreateGroup;
import com.pom.Dashboard;
import com.pom.LoginPage;
import com.pom.ViewGroups;

public class ViewGroupsTest extends BaseClass {

	@Test(priority = 0)
	public void viewGroupTabMenu() throws IOException, InterruptedException {
		dashBoard.groupsMenuClick();
	}

	@Test(dataProvider = "getData", priority = 1)
	public void viewgroupEditGroupInfo(HashMap<String, String> input) throws InterruptedException {
		viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
		viewGroups.editGroupInfo(input.get("RenameGroupName"), input.get("RenameDescriptionChange"));
	}

	@Test(dataProvider = "getData1", priority = 2)
	public void viewgroupUpdateGroupMember(HashMap<String, String> input) throws InterruptedException {
		viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
		String[] removedMemberName = { input.get("RemoveMember1") };
		String[] selectedMemberNames = { input.get("AddMember1"), input.get("AddMember2") };
		viewGroups.updateGroupMemberList(removedMemberName, selectedMemberNames);
	}

	@Test(dataProvider = "getData2", priority = 3)
	public void viewgroupUpdateGroupHead(HashMap<String, String> input) throws InterruptedException {
		viewGroups.viewgroupSearchbar(input.get("GroupNameText1"));
		viewGroups.updateGroupHead(input.get("UpdateGroupHead1"));
	}

	@Test(dataProvider = "getData3", priority = 4)
	public void viewgroupAssignDeleteGroup(HashMap<String, String> input) throws InterruptedException {
		viewGroups.viewgroupSearchbar(input.get("DeleteGroupName"));
		viewGroups.deleteAssigntoAnotherGroup(input.get("AssginAnotherGroupName"));
	}

	// viewgroupEditGroupInfo
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewGroupsEditGroupData.json");

		return new Object[][] { { data.get(0) } };

	}

	// viewgroupUpdateGroupMember
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewGroupUpdateMemberData.json");

		return new Object[][] { { data.get(0) } };

		// return new Object[][] {{data.get(0)},{data.get(1)}};
	}

	// viewgroupUpdateGroupHead
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewGroupUpdateGroupHeadData.json");

		return new Object[][] { { data.get(0) } };

	}

	// viewgroupAssignDeleteGroup
	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewGroupDeleteGroupData.json");

		return new Object[][] { { data.get(0) } };

	}

}
