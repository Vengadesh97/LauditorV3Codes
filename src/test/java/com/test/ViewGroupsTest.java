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

	@Test(dataProvider = "getData", priority = 0)
	public void editGroupInfoChangeGroupNameWithCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.editGroupInfoBtn();
			viewGroups.editGroupName(input.get("RenameGroupName"));
			viewGroups.editGroupCancel();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData1", priority = 1)
	public void editGroupInfoChangeDescpWithCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.editGroupInfoBtn();
			viewGroups.editDescp(input.get("RenameDescriptionChange"));
			viewGroups.editGroupCancel();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData2", priority = 2)
	public void editGroupInfoChangeBothNameWithCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.editGroupInfoBtn();
			viewGroups.editGroupName(input.get("RenameGroupName"));
			viewGroups.editDescp(input.get("RenameDescriptionChange"));
			viewGroups.editGroupCancel();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData3", priority = 3)
	public void editGroupInfoChangeGroupNameWithSave(HashMap<String, String> input) throws InterruptedException {
		try {
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.editGroupInfoBtn();
			viewGroups.editGroupName(input.get("RenameGroupName"));
			viewGroups.editGroupInfoSave();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData4", priority = 4)
	public void editGroupInfoChangeDescpWithSave(HashMap<String, String> input) throws InterruptedException {
		try {
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.editGroupInfoBtn();
			viewGroups.editDescp(input.get("RenameDescriptionChange"));
			viewGroups.editGroupInfoSave();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData5", priority = 5)
	public void editGroupInfoChangeBothNameWithSave(HashMap<String, String> input) throws InterruptedException {
		try {
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.editGroupInfoBtn();
			viewGroups.editGroupName(input.get("RenameGroupName"));
			viewGroups.editDescp(input.get("RenameDescriptionChange"));
			viewGroups.editGroupInfoSave();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData6", priority = 6)
	public void updateGroupMembersListAndRemoveAllClickCancel(HashMap<String, String> input)
			throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			viewGroups.removeAllButton();
			viewGroups.alertYesButton();
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.cancelButtonUpdateGroupMembers();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData7", priority = 7)
	public void updateGroupMembersListAndRemoveAllClickSave(HashMap<String, String> input) throws InterruptedException {
		try {

			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			viewGroups.removeAllButton();
			viewGroups.alertYesButton();
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.saveButtonUpdateGroupMembers();
			viewGroups.okButtonSuccessPopupUpdateGroupMembers();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData8", priority = 8)
	public void updateGroupMembersListAndRemoveLeftSideOneTMClickCancel(HashMap<String, String> input)
			throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			String[] removeMemberNames = { input.get("AddMember1"), input.get("AddMember2") };
			viewGroups.removeTeamMember(removeMemberNames);
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.cancelButtonUpdateGroupMembers();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData9", priority = 9)
	public void updateGroupMembersListAndRemoveLeftSideOneTMClickSave(HashMap<String, String> input)
			throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			String[] removeMemberNames = { input.get("AddMember1")};
			viewGroups.removeTeamMember(removeMemberNames);
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.saveButtonUpdateGroupMembers();
			viewGroups.okButtonSuccessPopupUpdateGroupMembers();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData10", priority = 10)
	public void updateGroupMembersListAndSelectRightSideOneTMClickCancel(HashMap<String, String> input)
			throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			String[] selectedMemberNames = { input.get("AddMember1"), input.get("AddMember2") };
			viewGroups.selectTeamMember(selectedMemberNames);
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.cancelButtonUpdateGroupMembers();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData11", priority = 11)
	public void updateGroupMembersListAndSelectRightSideOneTMClickSave(HashMap<String, String> input)
			throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			String[] selectedMemberNames = { input.get("AddMember1"), input.get("AddMember2") };
			viewGroups.selectTeamMember(selectedMemberNames);
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.saveButtonUpdateGroupMembers();
			viewGroups.okButtonSuccessPopupUpdateGroupMembers();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData12", priority = 12)
	public void updateGroupMembersListAndSelectRightSideAndRemoveOneTMClickCancel(HashMap<String, String> input)
			throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			String[] selectedMemberNames = { input.get("AddMember1"), input.get("AddMember2") };
			viewGroups.selectTeamMember(selectedMemberNames);
			Thread.sleep(2000);
			String[] removeMemberNames = { input.get("removeMember1"), input.get("removeMember2") };
			viewGroups.removeTeamMember(removeMemberNames);
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.cancelButtonUpdateGroupMembers();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData13", priority = 13)
	public void updateGroupMembersListAndSelectRightSideAndRemoveOneTMClickSave(HashMap<String, String> input)
			throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			String[] selectedMemberNames = { input.get("AddMember1"), input.get("AddMember2") };
			viewGroups.selectTeamMember(selectedMemberNames);
			Thread.sleep(2000);
			String[] removeMemberNames = { input.get("removeMember1"), input.get("removeMember2") };
			viewGroups.removeTeamMember(removeMemberNames);
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.saveButtonUpdateGroupMembers();
			viewGroups.okButtonSuccessPopupUpdateGroupMembers();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData14", priority = 14)
	public void updateGroupHeadAndCancelAndAlertNo(HashMap<String, String> input) throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			String[] selectedMemberNames = { input.get("SelectGroupHead") };
			viewGroups.selectGroupHeads(selectedMemberNames);
			viewGroups.alertNoButton();
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.cancelButtonUpdateGroupMembers();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData15", priority = 15)
	public void updateGroupHeadAndCancelAndAlertYes(HashMap<String, String> input) throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			String[] selectedMemberNames = { input.get("SelectGroupHead") };
			viewGroups.selectGroupHeads(selectedMemberNames);
			viewGroups.alertYesButton();
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.cancelButtonUpdateGroupMembers();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData16", priority = 16)
	public void updateGroupHeadAndSaveAndAlertNo(HashMap<String, String> input) throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			String[] selectedMemberNames = { input.get("SelectGroupHead") };
			viewGroups.selectGroupHeads(selectedMemberNames);
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.saveButtonUpdateGroupMembers();
			Thread.sleep(1000);
			viewGroups.alertNoButton();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData17", priority = 17)
	public void updateGroupHeadAndSaveAndAlertYes(HashMap<String, String> input) throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.updateGroupMembersList();
			String[] selectedMemberNames = { input.get("SelectGroupHead") };
			viewGroups.selectGroupHeads(selectedMemberNames);
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.saveButtonUpdateGroupMembers();
			Thread.sleep(1000);
			viewGroups.alertYesButton();

		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData18", priority = 18)
	public void deleteGroupSelectGroupAndClickCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.deleteGroupButton();
			String[] deleteGroups = { input.get("SelectAnotherGroup") };
			viewGroups.selectDeleteGroup(deleteGroups);
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.cancelButtonUpdateGroupMembers();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData19", priority = 19)
	public void deleteGroupSelectGroupAndClickSaveClickNo(HashMap<String, String> input) throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.deleteGroupButton();
			String[] deleteGroups = { input.get("SelectAnotherGroup") };
			viewGroups.selectDeleteGroup(deleteGroups);
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.saveButtonUpdateGroupMembers();
			Thread.sleep(1000);
			viewGroups.alertNoButton();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	@Test(dataProvider = "getData20", priority = 20)
	public void deleteGroupSelectGroupAndClickSaveClickYes(HashMap<String, String> input) throws InterruptedException {
		try {
			dashBoard.groupLeftSide();
			viewGroups.viewgroupSearchbar(input.get("GroupNameText"));
			viewGroups.deleteGroupButton();
			String[] deleteGroups = { input.get("SelectAnotherGroup") };
			viewGroups.selectDeleteGroup(deleteGroups);
			viewGroups.pageDown();
			Thread.sleep(2000);
			viewGroups.saveButtonUpdateGroupMembers();
			Thread.sleep(1000);
			viewGroups.alertYesButton();
			Thread.sleep(1000);
			viewGroups.successPopUpOK();
		} finally {
			dashBoard.groupLeftSide();
		}
	}

	// Edit Group Info

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(0) } };

	}

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(1) } };

	}

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(2) } };

	}

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(3) } };

	}

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(4) } };

	}

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(5) } };

	}

	// Update Group Members List

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(6) } };

	}

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(7) } };

	}

	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(8) } };

	}

	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(9) } };

	}

	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(10) } };

	}

	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(11) } };

	}

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(12) } };

	}

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(13) } };

	}

	// Update Group Head

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(14) } };

	}

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(15) } };

	}

	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(16) } };

	}

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(17) } };

	}

	// Delete Group [Assign Another Group]

	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(18) } };

	}

	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(19) } };

	}

	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"/Users/vengadeshwaran/git/LauditorV3Codes/src/test/java/file/data/Group/ViewGroupsData.json");

		return new Object[][] { { data.get(20) } };

	}

}
