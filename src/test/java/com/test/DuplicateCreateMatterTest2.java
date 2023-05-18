package com.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.BaseClass;
import com.base.Retry;

public class DuplicateCreateMatterTest2 extends BaseClass {

	
	/*
	@Test(dataProvider = "getData1", priority = 0)
	public void clientsIndividuals(HashMap<String, String> input) throws InterruptedException {
		createMatter.leftMatterTab();
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		// Select Groups
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		Thread.sleep(3000);
		createMatter.tempClientIndividuals(input.get("searchTextIndividuals"),
		 input.get("firstName"), input.get("lastName"), input.get("email"),
		input.get("confirmEmail"), input.get("country"), input.get("phoneNumber"));
		Thread.sleep(3000);
		createMatter.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"), input.get("contactPerson"),
				input.get("emailId"), input.get("confirmEmailId"), input.get("countryEntitys"),
				input.get("mobileNumber"));
		Thread.sleep(3000);
		// Select Clients Individuals
		String[] clientNamesIndividuals = { input.get("clientName1"), input.get("clientName2") };
		createMatter.selecting(clientNamesIndividuals);

		createMatter.nextPage();
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}
	
	*/
	
	
	@Test(dataProvider = "getData1", priority = 0)
	public void allFieldsClientsIndividuals(HashMap<String, String> input) throws InterruptedException {
		createMatter.leftMatterTab();
		createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"), input.get("caseType"), input.get("courtName"), input.get("judges"), input.get("date"), input.get("prioritySelect"), input.get("description"), input.get("advocateName"), input.get("advocateEmail"), input.get("advocatePhone"));
		// Select Groups
		Thread.sleep(2000);
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		createMatter.selecting(groupNames);
		// Select Clients Individuals
		String[] clientNamesIndividuals = { input.get("clientName1"), input.get("clientName2") };
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.addMatterSuccess();
	}

	@Test(dataProvider = "getData2", priority = 1)
	public void fieldsClientsIndividuals(HashMap<String, String> input) throws InterruptedException {
		createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"), input.get("caseType"), input.get("courtName"), input.get("judges"), input.get("date"), input.get("prioritySelect"), input.get("description"), input.get("advocateName"), input.get("advocateEmail"), input.get("advocatePhone"));
		// Select Groups
		Thread.sleep(2000);
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		createMatter.selecting(groupNames);
		// Select Clients Individuals
		String[] clientNamesIndividuals = { input.get("clientName1"), input.get("clientName2") };
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.addMatterSuccess();
	}

	
	
	
	
	
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\DuplicateMatterModulesData2.json");

		return new Object[][] { { data.get(0) } };

	}

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\DuplicateMatterModulesData2.json");

		return new Object[][] { { data.get(1) } };
	}
	
	
}
