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

public class CreateMatterTest extends BaseClass {

	
	
	@Test(dataProvider = "getData1", priority = 0)
	public void clientsIndividuals(HashMap<String, String> input) throws InterruptedException {
		createMatter.leftMatterTab();
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		//Select Groups
		String[] groupNames = { input.get("groupName1"),input.get("groupName2")};
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		//Select Clients Individuals 
		String[] clientNamesIndividuals = { input.get("clientName1"),input.get("clientName2")};
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}
	
	
	
	@Test(dataProvider = "getData2", priority = 1,retryAnalyzer=Retry.class)
	public void clientsIndividualsWithTeamMembers(HashMap<String, String> input) throws InterruptedException {
		//createMatter.leftMatterTab();
		Thread.sleep(5000);
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"),input.get("groupName2")};
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("clientName1"),input.get("clientName2")};
		createMatter.selecting(clientNamesIndividuals);
		String[] teamMemberNames = { input.get("memberName1"),input.get("memberName2")};
		createMatter.selecting(teamMemberNames);
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}
	
	
	@Test(dataProvider = "getData3", priority = 2)
	public void clientsIndividualsWithDocuments(HashMap<String, String> input) throws InterruptedException {
		//createMatter.leftMatterTab();
		Thread.sleep(5000);
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"),input.get("groupName2")};
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("clientName1"),input.get("clientName2")};
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		String[] documentNames = { input.get("documentName1"),input.get("documentName2")};
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}
	
	

	@Test(dataProvider = "getData4", priority = 3)
	public void clientsIndividualsWithTMandDocuments(HashMap<String, String> input) throws InterruptedException {
		//createMatter.leftMatterTab();
		Thread.sleep(5000);
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"),input.get("groupName2")};
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("clientName1"),input.get("clientName2")};
		createMatter.selecting(clientNamesIndividuals);
		String[] teamMemberNames = { input.get("memberName1"),input.get("memberName2")};
		createMatter.selecting(teamMemberNames);
		String[] documentNames = { input.get("documentName1"),input.get("documentName2")};
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}
	
		
	// MandatoryFieldswithGroupsandClientsIndividuals
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(0) } };

	}
	

	// MandatoryFieldswithGroupsandClientsIndividualsWithTeamMembers
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(1) } };

	}
	
	
	// MandatoryFieldswithGroupsandClientsIndividualsWithDocuments
	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(2) } };

	}
	
	
	// MandatoryFieldswithGroupsandClientsIndividualsWithTMandDocuments
	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(3) } };

	}
	
	
	
	
}
