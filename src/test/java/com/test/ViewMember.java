package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class ViewMember extends BaseClass {

	@Test(dataProvider = "getData")
	public void viewMemberEditGroup(HashMap<String, String> input) throws InterruptedException {

		dashBoard.groupsMenuClick();
		viewMembers.viewMemberTab(input.get("memberEmailId"));
		viewMembers.renameeditmemberinfo(input.get("changedName"), input.get("changedDesignation"), input.get("changedDefaultRate"), input.get("changedEmail"), input.get("changedConfirmEmail"), input.get("currencyNames"));
	}

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\ViewMemberEditMember.json");

		return new Object[][] { { data.get(0) } };

	}

}
