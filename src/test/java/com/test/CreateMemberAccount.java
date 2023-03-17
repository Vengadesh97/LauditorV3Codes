package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class CreateMemberAccount extends BaseClass {

	@Test(dataProvider = "getData")
	public void createMemberAccountCreate(HashMap<String, String> input) throws InterruptedException {
		String[] selectGroups = { input.get("addGroups1"), input.get("addGroups2"), input.get("addGroups3") };
		dashboard.groupsMenuClick();
		createmember.createMemberTab();
		createmember.createTeamMemberInfo(input.get("Name"), input.get("Designation"), input.get("DefaultRate"),
				input.get("Email"), input.get("ConfirmEmail"), input.get("CurrencyName"), selectGroups);

	}

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\createdMemberData.json");

		return new Object[][] { { data.get(0) } };

	}

}
