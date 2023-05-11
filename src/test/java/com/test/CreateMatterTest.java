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

	// Mandatory Fields with Groups and Clients [Individuals]

	@Test(dataProvider = "getData1", priority = 0)
	public void clientsIndividuals(HashMap<String, String> input) throws InterruptedException {
		createMatter.leftMatterTab();
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		// Select Groups
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		Thread.sleep(3000);
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("individualsClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}

	@Test(dataProvider = "getData2", priority = 1, retryAnalyzer = Retry.class)
	public void clientsIndividualsWithTeamMembers(HashMap<String, String> input) throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("individualsClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
		createMatter.selecting(teamMemberNames);
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}

	@Test(dataProvider = "getData3", priority = 2)
	public void clientsIndividualsWithDocuments(HashMap<String, String> input) throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("individualsClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}

	@Test(dataProvider = "getData4", priority = 3)
	public void clientsIndividualsWithTMandDocuments(HashMap<String, String> input) throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("individualsClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
		createMatter.selecting(teamMemberNames);
		String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}

	// Mandatory Fields with Groups and Clients [Entity]

	@Test(dataProvider = "getData5", priority = 4)
	public void clientsEntity(HashMap<String, String> input) throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		// Select Groups
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		// Select Clients Individuals
		String[] clientNamesIndividuals = { input.get("entityClientName1"), input.get("entityClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}

	@Test(dataProvider = "getData6", priority = 5)
	public void clientsEntityWithTeamMembers(HashMap<String, String> input) throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("entityClientName1"), input.get("entityClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
		createMatter.selecting(teamMemberNames);
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}

	@Test(dataProvider = "getData7", priority = 6)
	public void clientsEntityWithDocuments(HashMap<String, String> input) throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("entityClientName1"), input.get("entityClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}

	@Test(dataProvider = "getData8", priority = 7)
	public void clientsEntityWithTMandDocuments(HashMap<String, String> input) throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("entityClientName1"), input.get("entityClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
		createMatter.selecting(teamMemberNames);
		String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}

	// Mandatory Fields with Groups and Clients [Individuals and Entity]

	@Test(dataProvider = "getData9", priority = 8)
	public void clientsIndividualsandEntity(HashMap<String, String> input) throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		// Select Groups
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		// Select Clients Individuals
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}

	@Test(dataProvider = "getData10", priority = 9)
	public void clientsIndividualsandEntityWithTeamMembers(HashMap<String, String> input) throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
		createMatter.selecting(clientNamesIndividuals);
		String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
		createMatter.selecting(teamMemberNames);
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}

	@Test(dataProvider = "getData11", priority = 10)
	public void clientsIndividualsandEntityWithDocuments(HashMap<String, String> input) throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}

	@Test(dataProvider = "getData12", priority = 11)
	public void clientsIndividualsandEntityWithTMandDocuments(HashMap<String, String> input)
			throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("entityClientName1") };
		createMatter.selecting(clientNamesIndividuals);
		String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
		createMatter.selecting(teamMemberNames);
		String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}

	///////////// Mandatory Fields , Groups, Clients [Individuals] and TempClients[IndividualsandEntity]

	@Test(dataProvider = "getData13", priority = 12)
	public void clientsIndividualsandTempClients(HashMap<String, String> input) throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		// Select Groups
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		// Temp Client Individuals
		createMatter.tempClientIndividuals(input.get("searchTextIndividuals"), input.get("firstName"),
				input.get("lastName"), input.get("email"), input.get("confirmEmail"), input.get("country"),
				input.get("phoneNumber"));
		// Temp Client Entity
		Thread.sleep(3000);
		createMatter.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"), input.get("contactPerson"),
				input.get("emailId"), input.get("confirmEmailId"), input.get("countryEntitys"),
				input.get("mobileNumber"));
		Thread.sleep(3000);
		// Select Clients Individuals
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("individualsClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}

	@Test(dataProvider = "getData14", priority = 13)
	public void clientsIndividualsandTempClientsWithTeamMembers(HashMap<String, String> input)
			throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		// Temp Client Individuals
		createMatter.tempClientIndividuals(input.get("searchTextIndividuals"), input.get("firstName"),
				input.get("lastName"), input.get("email"), input.get("confirmEmail"), input.get("country"),
				input.get("phoneNumber"));
		// Temp Client Entity
		Thread.sleep(3000);
		createMatter.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"), input.get("contactPerson"),
				input.get("emailId"), input.get("confirmEmailId"), input.get("countryEntitys"),
				input.get("mobileNumber"));
		Thread.sleep(3000);
		// Select Clients Individuals
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("individualsClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
		createMatter.selecting(teamMemberNames);
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}

	@Test(dataProvider = "getData15", priority = 14)
	public void clientsIndividualsandTempClientsWithDocuments(HashMap<String, String> input)
			throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		// Temp Client Individuals
		createMatter.tempClientIndividuals(input.get("searchTextIndividuals"), input.get("firstName"),
				input.get("lastName"), input.get("email"), input.get("confirmEmail"), input.get("country"),
				input.get("phoneNumber"));
		// Temp Client Entity
		Thread.sleep(3000);
		createMatter.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"), input.get("contactPerson"),
				input.get("emailId"), input.get("confirmEmailId"), input.get("countryEntitys"),
				input.get("mobileNumber"));
		Thread.sleep(3000);
		// Select Clients Individuals
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("individualsClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}

	@Test(dataProvider = "getData16", priority = 15)
	public void clientsIndividualsandTempClientsWithTMandDocuments(HashMap<String, String> input)
			throws InterruptedException {

		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		// Temp Client Individuals
		createMatter.tempClientIndividuals(input.get("searchTextIndividuals"), input.get("firstName"),
				input.get("lastName"), input.get("email"), input.get("confirmEmail"), input.get("country"),
				input.get("phoneNumber"));
		// Temp Client Entity
		Thread.sleep(3000);
		createMatter.tempClientEntity(input.get("searchTextEntity"), input.get("firmName"), input.get("contactPerson"),
				input.get("emailId"), input.get("confirmEmailId"), input.get("countryEntitys"),
				input.get("mobileNumber"));
		Thread.sleep(3000);
		// Select Clients Individuals
		String[] clientNamesIndividuals = { input.get("individualsClientName1"), input.get("individualsClientName2") };
		createMatter.selecting(clientNamesIndividuals);
		String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
		createMatter.selecting(teamMemberNames);
		String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
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

	// Mandatory Fields with Groups and Clients [Entity]
	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(4) } };

	}

	// Mandatory Fields , Groups , Clients[Entity] with Team Members
	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(5) } };

	}

	// Mandatory Fields , Groups , Clients[Entity] with Documents
	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(6) } };

	}

	// Mandatory Fields , Groups, Clients[Entity] and TM with Documents
	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(7) } };

	}

	// Mandatory Fields with Groups and Clients [Individuals and Entity]
	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(8) } };

	}

	// Mandatory Fields with Groups and Clients [Individuals and Entity] with Team
	// Members
	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(9) } };

	}

	// Mandatory Fields with Groups and Clients [Individuals and Entity] with
	// Documents
	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(10) } };

	}

	// Mandatory Fields with Groups and Clients [Individuals and Entity] and TM with
	// Documents
	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(11) } };

	}

	// Mandatory Fields , Groups, Clients [Individuals] and TempClients[IndividualsandEntity]
	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(12) } };

	}

	// Mandatory Fields , Groups, Clients and TempClients with TM
	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(13) } };

	}

	// Mandatory Fields , Groups, Clients and TempClients with Document

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(14) } };

	}

	// Mandatory Fields , Groups, Clients and TempClients with TM and Document

	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(15) } };

	}

}
