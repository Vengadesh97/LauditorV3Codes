package com.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.base.BaseClass;

public class CreateMatterTest extends BaseClass {

	
	
	@Test(dataProvider = "getData12", priority = 0)
	public void MandatoryFieldswithGroupsandClientsIndividuals(HashMap<String, String> input) throws InterruptedException {
		createMatter.leftMatterTab();
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"),input.get("groupName2"),input.get("groupName3"),input.get("groupName4"),input.get("groupName5")};
		//System.out.println(Arrays.deepToString(groupNames));
		Thread.sleep(3000);
		createMatter.selecting(groupNames);
		String[] clientNamesIndividuals = { input.get("clientName1"),input.get("clientName2"),input.get("clientName3")};
		createMatter.selecting(clientNamesIndividuals);
		createMatter.nextPage();
		createMatter.nextPage();
		createMatter.alertPopupYes();
		createMatter.viewMatterListSuccess();
	}
	
	
	// MandatoryFieldswithGroupsandClientsIndividuals
	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\sample.json");

		return new Object[][] { { data.get(0) } };

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
/*	
	
	@Test(dataProvider = "getData12", priority = 0)
	public void MandatoryFieldswithGroupsandClientsIndividuals(HashMap<String, String> input) throws InterruptedException {
		createMatter.leftMatterTab();
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		String[] groupNames = { input.get("groupName1"),input.get("groupName2"),input.get("groupName3")};
		Thread.sleep(5000);
		createMatter.selecting(groupNames);
//		String[] clientNames = { input.get("clientName1"), input.get("clientName2")};
//		Thread.sleep(2000);
//		createMatter.selecting(clientNames);
//		Thread.sleep(2000);
//		String[] memberNames = { input.get("memberName1")};
//		createMatter.selecting(memberNames);
//		String[] documentNames = { input.get("documentName1")};
//		createMatter.selecting(documentNames);
//		Thread.sleep(2000);
//		createMatter.documentPageSaveandSuccessPopup();
	}
	

	
	@Test(dataProvider = "getData", priority = 0)
	public void MandatoryFieldSelectNames(HashMap<String, String> input) throws InterruptedException {
		createMatter.leftMatterTab();
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		Thread.sleep(2000);
		String[] groupNames = { input.get("groupName1"), input.get("groupName2"), input.get("groupName3") };
		Thread.sleep(2000);
		System.out.println(Arrays.deepToString(groupNames));
		createMatter.selecting(groupNames);
//		String[] clientNames = { input.get("clientName1"), input.get("clientName2"), input.get("clientName3") };
//		Thread.sleep(2000);
//		System.out.println(Arrays.deepToString(clientNames));
//		createMatter.selecting(clientNames);
//		Thread.sleep(2000);
//		String[] memberNames = { input.get("memberName1"), input.get("memberName2") };
//		createMatter.selecting(memberNames);
//		String[] documentNames = { input.get("documentName1"), input.get("documentName2"), input.get("documentName3") };
//		createMatter.selecting(documentNames);
//		Thread.sleep(2000);
//		createMatter.documentPageSaveandSuccessPopup();
	}

	@Test(dataProvider = "getData1", priority = 1,enabled=false)
	public void withoutTeamMemberandDocument(HashMap<String, String> input) throws InterruptedException {
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		Thread.sleep(2000);
		String[] groupNames = { input.get("groupName1"), input.get("groupName2"), input.get("groupName3") };
		Thread.sleep(2000);
		createMatter.selecting(groupNames);
		String[] clientNames = { input.get("clientName1"), input.get("clientName2") };
		createMatter.selecting(clientNames);
		// Team Member Page
		createMatter.nextPage();
		// Document Page
		createMatter.nextPage();
		createMatter.documentPageSaveandSuccessPopup();

	}

	@Test(dataProvider = "getData2", priority = 2,enabled=false)
	public void withoutTeamMember(HashMap<String, String> input) throws InterruptedException {
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		Thread.sleep(2000);
		String[] groupNames = { input.get("groupName1"), input.get("groupName2"), input.get("groupName3") };
		Thread.sleep(2000);
		createMatter.selecting(groupNames);
		String[] clientNames = { input.get("clientName1"), input.get("clientName2"), input.get("clientName3") };
		createMatter.selecting(clientNames);
		// Team Member Page
		createMatter.nextPage();
		Thread.sleep(2000);
		String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}

	@Test(dataProvider = "getData3", priority = 3,enabled=false)
	public void withoutDocument(HashMap<String, String> input) throws InterruptedException {
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		Thread.sleep(2000);
		String[] groupNames = { input.get("groupName1"), input.get("groupName2"), input.get("groupName3") };
		Thread.sleep(2000);
		createMatter.selecting(groupNames);
		String[] clientNames = { input.get("clientName1"), input.get("clientName2"), input.get("clientName3") };
		createMatter.selecting(clientNames);
		Thread.sleep(2000);
		String[] memberNames = { input.get("memberName1"), input.get("memberName2") };
		createMatter.selecting(memberNames);
		// Document Page
		createMatter.nextPage();
		createMatter.documentPageSaveandSuccessPopup();

	}

	// All Fields are entry

	@Test(dataProvider = "getData4", priority = 4,enabled=false)
	public void allFieldsEnteredandSelectNames(HashMap<String, String> input) throws InterruptedException {
		createMatter.leftMatterTab();
		createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"), input.get("caseType"),
				input.get("courtName"), input.get("judges"), input.get("date"), input.get("prioritySelect"),
				input.get("description"), input.get("advocateName"), input.get("advocateEmail"),
				input.get("advocatePhone"));
		Thread.sleep(2000);
		String[] groupNames = { input.get("groupName1"), input.get("groupName2"), input.get("groupName3") };
		Thread.sleep(2000);
		createMatter.selecting(groupNames);
		String[] clientNames = { input.get("clientName1"), input.get("clientName2"), input.get("clientName3") };
		createMatter.selecting(clientNames);
		Thread.sleep(2000);
		String[] memberNames = { input.get("memberName1"), input.get("memberName2") };
		createMatter.selecting(memberNames);
		String[] documentNames = { input.get("documentName1"), input.get("documentName2"), input.get("documentName3") };
		createMatter.selecting(documentNames);
		Thread.sleep(2000);
		createMatter.documentPageSaveandSuccessPopup();
	}

	@Test(dataProvider = "getData5", priority = 5,enabled=false)
	public void allFieldsWithoutTeamMemberandDocument(HashMap<String, String> input) throws InterruptedException {
		
		createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"), input.get("caseType"),
				input.get("courtName"), input.get("judges"), input.get("date"), input.get("prioritySelect"),
				input.get("description"), input.get("advocateName"), input.get("advocateEmail"),
				input.get("advocatePhone"));
		Thread.sleep(2000);
		String[] groupNames = { input.get("groupName1"), input.get("groupName2"), input.get("groupName3") };
		Thread.sleep(2000);
		createMatter.selecting(groupNames);
		String[] clientNames = { input.get("clientName1"), input.get("clientName2") };
		createMatter.selecting(clientNames);
		// Team Member Page
		createMatter.nextPage();
		// Document Page
		createMatter.nextPage();
		createMatter.documentPageSaveandSuccessPopup();

	}

	@Test(dataProvider = "getData6", priority = 6,enabled=false)
	public void allFieldsWithoutTeamMember(HashMap<String, String> input) throws InterruptedException {
		createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"), input.get("caseType"),
				input.get("courtName"), input.get("judges"), input.get("date"), input.get("prioritySelect"),
				input.get("description"), input.get("advocateName"), input.get("advocateEmail"),
				input.get("advocatePhone"));
		Thread.sleep(2000);
		String[] groupNames = { input.get("groupName1"), input.get("groupName2"), input.get("groupName3") };
		Thread.sleep(2000);
		createMatter.selecting(groupNames);
		String[] clientNames = { input.get("clientName1"), input.get("clientName2"), input.get("clientName3") };
		createMatter.selecting(clientNames);
		// Team Member Page
		createMatter.nextPage();
		Thread.sleep(2000);
		String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}

	@Test(dataProvider = "getData7", priority = 7,enabled=false)
	public void allFieldsWithoutDocument(HashMap<String, String> input) throws InterruptedException {
		createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"), input.get("caseType"),
				input.get("courtName"), input.get("judges"), input.get("date"), input.get("prioritySelect"),
				input.get("description"), input.get("advocateName"), input.get("advocateEmail"),
				input.get("advocatePhone"));
		Thread.sleep(2000);
		String[] groupNames = { input.get("groupName1"), input.get("groupName2"), input.get("groupName3") };
		Thread.sleep(2000);
		createMatter.selecting(groupNames);
		String[] clientNames = { input.get("clientName1"), input.get("clientName2"), input.get("clientName3") };
		createMatter.selecting(clientNames);
		Thread.sleep(2000);
		String[] memberNames = { input.get("memberName1"), input.get("memberName2") };
		createMatter.selecting(memberNames);
		// Document Page
		createMatter.nextPage();
		createMatter.documentPageSaveandSuccessPopup();

	}

	// MandatoryFieldSelectNames
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterData.json");

		return new Object[][] { { data.get(0) } };

	}

	// withoutTeamMemberandDocument
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\WithoutTeamMemberandDocument.json");

		return new Object[][] { { data.get(0) } };

	}

	// withoutTeamMember
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\WithoutTeamMember.json");

		return new Object[][] { { data.get(0) } };
	}

	// withoutDocument
	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\WithoutDocument.json");

		return new Object[][] { { data.get(0) } };
	}

	// All Fields scenario
	// allFieldsEnteredandSelectNames
	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\allFieldsEnteredandSelectNames.json");

		return new Object[][] { { data.get(0) } };

	}

	// AllFieldsWithoutTeamMemberandDocument
	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\AllFieldsWithoutTeamMemberandDocument.json");

		return new Object[][] { { data.get(0) } };

	}

	// AllFieldsWithoutTeamMember
	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\AllFieldsWithoutTeamMember.json");

		return new Object[][] { { data.get(0) } };

	}

	// AllFieldsWithoutDocument
	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\AllFieldsWithoutDocument.json");

		return new Object[][] { { data.get(0) } };

	}

	
	*/
}
