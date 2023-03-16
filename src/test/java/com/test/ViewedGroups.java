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

public class ViewedGroups extends BaseClass {

	@Test(priority = 0)
	public void viewGroupTabMenu() throws IOException, InterruptedException {
		dashboard.viewdGroup();
	}

	@Test(dataProvider = "getDatas", priority = 1, enabled = false)
	public void viewgroupEditGroupInfo(HashMap<String, String> input) throws InterruptedException {
		viewGroups.viewGroupAction(input.get("GroupNameText"));
		viewGroups.editGroupInfo(input.get("RenameGroupName"), input.get("RenameDescriptionChange"));
	}

	@Test(dataProvider = "getDatad", priority = 2, enabled = false)
	public void viewgroupUpdateGroupMember(HashMap<String, String> input) throws InterruptedException {
		viewGroups.viewGroupAction(input.get("GroupNameText"));
		String[] removedMemberName = { input.get("RemoveMember1") };
		String[] selectedMemberNames = { input.get("AddMember1"), input.get("AddMember2") };
		viewGroups.updateGroupMemberList(removedMemberName, selectedMemberNames);
	}

	@Test(priority = 3)
	public void viewgroupUpdateGroupHead() throws InterruptedException {
		viewGroups.viewGroupAction("abcd");
		viewGroups.updateGroupHead("Anantha-kumar");
	}

	@Test(priority = 4, enabled = false)
	public void viewgroupAssignDeleteGroup() throws InterruptedException {
		viewGroups.viewGroupAction("@#$%^&");
		viewGroups.deleteAssigntoAnotherGroup("Test gropus creation");
	}

	// viewgroupEditGroupInfo
	@DataProvider
	public Object[][] getDatas() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewGroupsDetails.json");

		return new Object[][] { { data.get(0) } };

	}

	// viewgroupUpdateGroupMember
	@DataProvider
	public Object[][] getDatad() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewGroupUpdateMember.json");

		return new Object[][] { { data.get(0) } };

		// return new Object[][] {{data.get(0)},{data.get(1)}};
	}

}
