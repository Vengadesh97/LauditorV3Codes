package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class ViewMembersTest extends BaseClass {

	@Test(dataProvider = "getData", priority = 0)
	public void viewMemberEditGroup(HashMap<String, String> input) throws InterruptedException {

		dashBoard.groupsMenuClick();
		viewMembers.viewMemberTab(input.get("memberEmailId"));
		viewMembers.renameeditmemberinfo(input.get("changedName"), input.get("changedDesignation"),
				input.get("changedDefaultRate"), input.get("changedEmail"), input.get("changedConfirmEmail"),
				input.get("currencyNames"));
	}

	@Test(dataProvider = "getData1", priority = 1)
	public void viewMemberUpdateGroupAccess(HashMap<String, String> input) throws InterruptedException {

		viewMembers.viewMemberTab(input.get("memberEmailId1"));

		String[] updategroupsnamedAdd = { input.get("UpdateGroup1"), input.get("UpdateGroup2"),
				input.get("UpdateGroup3") };
		viewMembers.updateGroupAccess(updategroupsnamedAdd);

	}

	@Test(dataProvider = "getData2", priority = 2)
	public void newRestPasswords(HashMap<String, String> input) throws InterruptedException {
		viewMembers.viewMemberTab(input.get("memberEmailId2"));
		viewMembers.resetPassword();

	}

	@Test(dataProvider = "getData3", priority = 3)
	public void newdeleteMemberAccount(HashMap<String, String> input) throws InterruptedException {
		viewMembers.viewMemberTab(input.get("memberEmailId3"));
		viewMembers.deleteMember();
	}

	// viewMemberEditGroup
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewMemberEditMemberData.json");

		return new Object[][] { { data.get(0) } };

	}

	// viewMemberUpdateGroupAccess
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewMemberUpdateGroupData.json");

		return new Object[][] { { data.get(0) } };

	}

	// restPasswords
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewMemberResetPasswordData.json");

		return new Object[][] { { data.get(0) } };

	}

	// deleteMemberAccount
	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewMemberDeleteMemberData.json");

		return new Object[][] { { data.get(0) } };

	}

}
