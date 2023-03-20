package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class ViewMember extends BaseClass {

	@Test(dataProvider = "getData",enabled=false)
	public void viewMemberEditGroup(HashMap<String, String> input) throws InterruptedException {

		dashBoard.groupsMenuClick();
		viewMembers.viewMemberTab(input.get("memberEmailId"));
		viewMembers.renameeditmemberinfo(input.get("changedName"), input.get("changedDesignation"),
				input.get("changedDefaultRate"), input.get("changedEmail"), input.get("changedConfirmEmail"),
				input.get("currencyNames"));
	}

	@Test
	public void viewMemberUpdateGroupAccess() throws InterruptedException {
		dashBoard.groupsMenuClick();
		viewMembers.viewMemberTab("vengadeshw45@gmail.com");

		String[] updategroupsnamedAdd = { "Family-Law-Ananth", "Family law", "Immigartion", "Corporate Law" };
		viewMembers.updateGroupAccess(updategroupsnamedAdd);

	}

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewMemberEditMember.json");

		return new Object[][] { { data.get(0) } };

	}

}
