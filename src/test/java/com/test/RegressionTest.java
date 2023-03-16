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

public class RegressionTest extends BaseClass {

	@Test(dataProvider = "getData")
	public void regressionCreateGroups(HashMap<String, String> input) throws IOException, InterruptedException {

		dashboard.groupsMenuClick();
		String[] addMembers = { input.get("addMember1"), input.get("addMember2"), input.get("addMember3"),
				input.get("addMember4"), input.get("addMember5") };
		creategroup.createGroups(input.get("groupname"), input.get("description"), addMembers,
				input.get("membernameremoved"), input.get("groupHeadNames"));
		// EditGroupInfo
		viewGroups.viewGroupAction(input.get("GroupNameText"));
		viewGroups.editGroupInfo(input.get("RenameGroupName"), input.get("RenameDescriptionChange"));
		// UpdateTeamMember
		viewGroups.viewGroupAction(input.get("GroupNameText1"));
		String[] removedMemberName = { input.get("RemoveMember1") };
		String[] selectedMemberNames = { input.get("AddMember1"), input.get("AddMember2") };
		viewGroups.updateGroupMemberList(removedMemberName, selectedMemberNames);
		// UpdateGroupHead
		viewGroups.viewGroupAction(input.get("GroupNameText1"));
		viewGroups.updateGroupHead(input.get("GroupHeadChage"));
		// DeleteGroup
		viewGroups.viewGroupAction(input.get("GroupNameText1"));
		viewGroups.deleteAssigntoAnotherGroup(input.get("DeleteAssignAnother"));

	}

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\RegressionData.json");

		return new Object[][] { { data.get(0) } };

		// return new Object[][] { { data.get(0) }, { data.get(1) } };
	}

}
