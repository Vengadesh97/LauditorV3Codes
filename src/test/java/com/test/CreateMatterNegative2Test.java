package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class CreateMatterNegative2Test extends BaseClass {

	// Enter the All Details and Click on Cancel button

	@Test(dataProvider = "getData0", priority = 0,enabled=false)
	public void enterDetailsandClickCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			createMatter.leftMatterTab();
			createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"),
					input.get("caseType"), input.get("courtName"), input.get("judges"), input.get("date"),
					input.get("prioritySelect"), input.get("description"), input.get("advocateName"),
					input.get("advocateEmail"), input.get("advocatePhone"));
			createMatter.cancelButton();
			createMatter.checkAllFieldsareEmptyinMatterinfoPage();
		} finally {
			createMatter.leftMatterTab();
		}

	}

	// Select the Groups and Click on Cancel

	@Test(dataProvider = "getData1", priority = 1,enabled=false)
	public void selectGroupsandClickCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"),
					input.get("caseType"), input.get("courtName"), input.get("judges"), input.get("date"),
					input.get("prioritySelect"), input.get("description"), input.get("advocateName"),
					input.get("advocateEmail"), input.get("advocatePhone"));
			createMatter.nextPage();
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			createMatter.selecting(groupNames);
			createMatter.cancelButton();
			createMatter.checkLeftSideSelectedNameareEmpty();
		} finally {
			createMatter.leftMatterTab();
		}

	}

	// Select the Groups and Select All Click on Cancel

	@Test(dataProvider = "getData2", priority = 2,enabled=false)
	public void selectGroupSeletAllandClickCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"),
					input.get("caseType"), input.get("courtName"), input.get("judges"), input.get("date"),
					input.get("prioritySelect"), input.get("description"), input.get("advocateName"),
					input.get("advocateEmail"), input.get("advocatePhone"));
			createMatter.nextPage();
			createMatter.selectAllBtn();
			createMatter.cancelButton();
			createMatter.checkLeftSideSelectedNameareEmpty();
			createMatter.checkSelectAllCheckboxIsUnSelected();
		} finally {

			createMatter.leftMatterTab();
		}

	}

	// Select the Clients and Click on Cancel

	@Test(dataProvider = "getData3", priority = 3,enabled=false)
	public void selectClientsandClickCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"),
					input.get("caseType"), input.get("courtName"), input.get("judges"), input.get("date"),
					input.get("prioritySelect"), input.get("description"), input.get("advocateName"),
					input.get("advocateEmail"), input.get("advocatePhone"));
			createMatter.nextPage();
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			createMatter.selecting(groupNames);
			createMatter.nextPage();
			String[] clientNamesIndividuals = { input.get("individualsClientName1"),
					input.get("individualsClientName2") };
			createMatter.selecting(clientNamesIndividuals);
			createMatter.cancelButton();
			createMatter.checkLeftSideSelectedNameareEmpty();
		} finally {

			createMatter.leftMatterTab();
		}

	}

	// Select the Clients and Select All Click on Cancel

	@Test(dataProvider = "getData4", priority = 4,enabled=false)
	public void selectClientsSeletAllandClickCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"),
					input.get("caseType"), input.get("courtName"), input.get("judges"), input.get("date"),
					input.get("prioritySelect"), input.get("description"), input.get("advocateName"),
					input.get("advocateEmail"), input.get("advocatePhone"));
			createMatter.nextPage();
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			createMatter.selecting(groupNames);
			createMatter.nextPage();
			createMatter.selectAllBtn();
			createMatter.cancelButton();
			createMatter.checkLeftSideSelectedNameareEmpty();
			createMatter.checkSelectAllCheckboxIsUnSelected();
		} finally {

			createMatter.leftMatterTab();
		}

	}

	// enterTempClientIndividualandClickCancel

	@Test(dataProvider = "getData5", priority = 5)
	public void enterTempClientIndividualandClickCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			createMatter.leftMatterTab();
			createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"),
					input.get("caseType"), input.get("courtName"), input.get("judges"), input.get("date"),
					input.get("prioritySelect"), input.get("description"), input.get("advocateName"),
					input.get("advocateEmail"), input.get("advocatePhone"));
			createMatter.nextPage();
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			createMatter.selecting(groupNames);
			createMatter.nextPage();
			createMatter.tempClientIndividuals(input.get("searchTextIndividuals"), input.get("firstName"),
					input.get("lastName"), input.get("email"), input.get("confirmEmail"), input.get("country"),
					input.get("phoneNumber"));
			createMatter.cancelTempClientBtn();
			createMatter.checkAllFieldsareEmptyinTempClients();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// enterTempClientEntityandClickCancel

	@Test(dataProvider = "getData6", priority = 6)
	public void enterTempClientEntityandClickCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"),
					input.get("caseType"), input.get("courtName"), input.get("judges"), input.get("date"),
					input.get("prioritySelect"), input.get("description"), input.get("advocateName"),
					input.get("advocateEmail"), input.get("advocatePhone"));
			createMatter.nextPage();
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			createMatter.selecting(groupNames);
			createMatter.nextPage();
			createMatter.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"),
					input.get("contactPerson"), input.get("emailId"), input.get("confirmEmailId"),
					input.get("countryEntitys"), input.get("mobileNumber"));
			createMatter.cancelTempClientBtn();
			createMatter.checkAllFieldsareEmptyinTempEntity();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// Enter the All Details and Click on Cancel button

	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(0) } };

	}

	// Select the Groups and Click on Cancel

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(1) } };

	}

	// Select the Groups and Select All Click on Cancel

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(2) } };

	}

	// Select the Clients and Click on Cancel

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(3) } };

	}

//  Select the Clients and Select All Click on Cancel 

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(4) } };

	}

	// enterTempClientIndividualandClickCancel

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(5) } };

	}

//  enterTempClientEntityandClickCancel

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(6) } };

	}

}
