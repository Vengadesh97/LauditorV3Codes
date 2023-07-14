package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pom.ViewMatterUpdateGroupsPOM;

public class ViewMatterUpdateGroupsTest extends BaseClass {

	// Select Groups and UnSelect Group and Save
	@Test(dataProvider = "getData0", priority = 0)
	public void selectGroupandUnSelectGroups(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.leftMatterTab();
			viewMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			viewMatterUpdateGroups.pageDownUpdateGroupSearchbar();
			String[] selectGroupNames = { input.get("selectgroupName1"), input.get("selectgroupName2"),
					input.get("selectgroupName3") };
			viewMatterUpdateGroups.selectGrouponRightSide(selectGroupNames);
			viewMatterUpdateGroups.selectedGroupNameIsDisplay(selectGroupNames);
			String[] unSelectgroupNames = { input.get("unSelectgroupName1"), input.get("unSelectgroupName2"),
					input.get("unSelectgroupName3") };
			viewMatterUpdateGroups.unSelectedGroupOnLeftSide(unSelectgroupNames);
			viewMatterUpdateGroups.pageDown();
			viewMatterUpdateGroups.submitUpdateGroup();
			viewMatterUpdateGroups.alertYesButton();
			viewMatterUpdateGroups.viewMatterSuccessPopup();
			
//			List<WebElement> documentVerify = driver.findElements(By.xpath("//div[@id='selectbx '] //div[@id='search']"));
			//	documentVerify.stream().anyMatch(documentVerifys-> documentVerifys.getText().equalsIgnoreCase(documentSelect));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Select Groups and Save
	@Test(dataProvider = "getData1", priority = 1)
	public void selectMultipleGroups(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.leftMatterTab();
			viewMatterUpdateGroups.pageUp();
			viewMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			viewMatterUpdateGroups.pageDownUpdateGroupSearchbar();
			String[] selectGroupNames = { input.get("selectgroupName1"), input.get("selectgroupName2"),
					input.get("selectgroupName3") };
			viewMatterUpdateGroups.selectGrouponRightSide(selectGroupNames);
			//viewMatterUpdateGroups.selectedGroupNameIsDisplay(selectGroupNames);
			viewMatterUpdateGroups.pageDown();
			viewMatterUpdateGroups.submitUpdateGroup();
			viewMatterUpdateGroups.alertYesButton();
			viewMatterUpdateGroups.viewMatterSuccessPopup();
			Thread.sleep(2000);
			viewMatterUpdateGroups.pageUp();
			viewMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			viewMatterUpdateGroups.pageDownUpdateGroupSearchbar();
			viewMatterUpdateGroups.selectedNameMatch(input.get("selectgroupName1"));
			viewMatterUpdateGroups.selectedNameMatch(input.get("selectgroupName2"));
			viewMatterUpdateGroups.selectedNameMatch(input.get("selectgroupName3"));
		
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Unselect Groups and Select another save
	@Test(dataProvider = "getData2", priority = 2)
	public void unSelectGroupandSelectGroups(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatterUpdateGroups.pageUp();
			viewMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			viewMatterUpdateGroups.pageDownUpdateGroupSearchbar();
			String[] unSelectgroupNames = { input.get("unSelectgroupName1"), input.get("unSelectgroupName2"),
					input.get("unSelectgroupName3") };
			viewMatterUpdateGroups.unSelectedGroupOnLeftSide(unSelectgroupNames);
			String[] selectGroupNames = { input.get("selectgroupName1"), input.get("selectgroupName2"),
					input.get("selectgroupName3") };
			viewMatterUpdateGroups.selectGrouponRightSide(selectGroupNames);
			viewMatterUpdateGroups.selectedGroupNameIsDisplay(selectGroupNames);
			viewMatterUpdateGroups.pageDown();
			viewMatterUpdateGroups.submitUpdateGroup();
			viewMatterUpdateGroups.alertYesButton();
			viewMatterUpdateGroups.viewMatterSuccessPopup();
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// UnSelect Groups and Save
	@Test(dataProvider = "getData3", priority = 3)
	public void unSelectMultipleGroups(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatterUpdateGroups.pageUp();
			viewMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			viewMatterUpdateGroups.pageDownUpdateGroupSearchbar();
			String[] unSelectgroupNames = { input.get("unSelectgroupName1"), input.get("unSelectgroupName2"),
					input.get("unSelectgroupName3") };
			viewMatterUpdateGroups.unSelectedGroupOnLeftSide(unSelectgroupNames);
			viewMatterUpdateGroups.pageDown();
			viewMatterUpdateGroups.submitUpdateGroup();
			viewMatterUpdateGroups.alertYesButton();
			viewMatterUpdateGroups.viewMatterSuccessPopup();
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Alert message should display mandatory clients
	@Test(dataProvider = "getData4", priority = 4)
	public void alertMessageDisplayForClients(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatterUpdateGroups.pageUp();
			viewMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			viewMatterUpdateGroups.pageDownUpdateGroupSearchbar();
			viewMatterUpdateGroups.alertIspresent(input.get("groupName"));
			viewMatterUpdateGroups.pageDown();
			viewMatterUpdateGroups.cancelBtnUpdateGroup();
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Check GroupNames are Display Correct or not
	@Test(dataProvider = "getData5", priority = 5)
	public void selectedGroupNamesareDisplay(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatterUpdateGroups.pageUp();
			viewMatterUpdateGroups.searchInputandUpdateGroupsMatter(input.get("CaseName"));
			viewMatterUpdateGroups.pageDownUpdateGroupSearchbar();
			String[] selectGroupNames = { input.get("selectgroupName1"), input.get("selectgroupName2") };
			viewMatterUpdateGroups.selectedGroupNameIsDisplay(selectGroupNames);
			viewMatterUpdateGroups.pageDown();
			viewMatterUpdateGroups.cancelBtnUpdateGroup();
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Select Groups and Save
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterUpdateGroupsData.json");

		return new Object[][] { { data.get(0) } };

	}

	// Unselect Groups and Save
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterUpdateGroupsData.json");

		return new Object[][] { { data.get(1) } };

	}

	// Unselect Groups and Select another save
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterUpdateGroupsData.json");

		return new Object[][] { { data.get(2) } };

	}

	// Select Groups and UnSelect another save
	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterUpdateGroupsData.json");

		return new Object[][] { { data.get(3) } };

	}

	// Alert message should display mandatory clients
	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterUpdateGroupsData.json");

		return new Object[][] { { data.get(4) } };

	}

	// Check GroupNames are Display Correct or not
	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterUpdateGroupsData.json");

		return new Object[][] { { data.get(5) } };

	}

}
