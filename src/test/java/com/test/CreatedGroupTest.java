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

	@Test(dataProvider = "getData")
	public void createdGroup(HashMap<String, String> input) throws InterruptedException {
		dashBoard.groupsMenuClick();
		String[] addMembers = { input.get("addMember1"), input.get("addMember2"), input.get("addMember3"),
				input.get("addMember4"), input.get("addMember5") };
		createGroup.createGroups(input.get("groupname"), input.get("description"), addMembers,
				input.get("membernameremoved"), input.get("groupHeadNames"));
		Boolean match = viewGroups.textVerifyGroupName(input.get("groupname"));
		Assert.assertTrue(match);
	
		//Boolean match1 = viewGroups.textVerifyGroupHeadName(input.get("groupHeadNames"));
		//Assert.assertTrue(match1);
	}

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\CreateGroupData.json");

		return new Object[][] { { data.get(0) } };

		// return new Object[][] { { data.get(0) }, { data.get(1) } };
	}

}
