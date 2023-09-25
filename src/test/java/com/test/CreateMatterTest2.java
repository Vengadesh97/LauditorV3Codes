package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class CreateMatterTest2 extends BaseClass {

	// Enter the All Details and Click on Cancel button

	@Test(dataProvider = "getData0", priority = 0)
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

	@Test(dataProvider = "getData1", priority = 1)
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
			createMatter.checkLeftSidegroupsSelectedNameareEmpty();
		} finally {
			createMatter.leftMatterTab();
		}

	}

	// Select the Groups and Select All Click on Cancel

	@Test(dataProvider = "getData2", priority = 2)
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

	@Test(dataProvider = "getData3", priority = 3)
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

	@Test(dataProvider = "getData4", priority = 4)
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
	
	// selectTeamMemberandClickCancel

	@Test(dataProvider = "getData5", priority = 5)
	public void selectTeamMemberandClickCancel(HashMap<String, String> input) throws InterruptedException {
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
			createMatter.nextPage();
			String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
			createMatter.selecting(teamMemberNames);
			createMatter.cancelButton();
			createMatter.checkLeftSideSelectedNameareEmpty();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// selectTeamMeberSeletAllandClickCancel

	@Test(dataProvider = "getData6", priority = 6)
	public void selectTeamMeberSeletAllandClickCancel(HashMap<String, String> input) throws InterruptedException {
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
			createMatter.nextPage();
			createMatter.scrollUpnearbySearchbox();
			createMatter.selectAllBtn();
			createMatter.cancelButton();
			createMatter.checkLeftSideSelectedNameareEmpty();
			createMatter.checkSelectAllCheckboxIsUnSelected();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// selectDocumentandClickCancel

	@Test(dataProvider = "getData7", priority = 7)
	public void selectDocumentandClickCancel(HashMap<String, String> input) throws InterruptedException {
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
			createMatter.nextPage();
			String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
			createMatter.selecting(teamMemberNames);
			createMatter.nextPage();
			String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
			createMatter.selecting(documentNames);
			createMatter.cancelButton();
			createMatter.checkLeftSideSelectedNameareEmpty();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// selectDocumentsSeletAllandClickCancel

	@Test(dataProvider = "getData8", priority = 8)
	public void selectDocumentsSeletAllandClickCancel(HashMap<String, String> input) throws InterruptedException {
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
			createMatter.nextPage();
			String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
			createMatter.selecting(teamMemberNames);
			createMatter.nextPage();
			createMatter.selectAllBtn();
			createMatter.cancelButton();
			createMatter.checkLeftSideSelectedNameareEmpty();
			createMatter.checkSelectAllCheckboxIsUnSelected();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// enterAllDetailsandConfirmPopupClickNO

	@Test(dataProvider = "getData9", priority = 9)
	public void enterAllDetailsandConfirmPopupClickNO(HashMap<String, String> input) throws InterruptedException {
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
			createMatter.nextPage();
			String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
			createMatter.selecting(teamMemberNames);
			createMatter.nextPage();
			String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
			createMatter.selecting(documentNames);
			createMatter.nextPage();
			createMatter.alertPopupNo();
			createMatter.selectedDocumentNameTextVerification();

		} finally {

			createMatter.leftMatterTab();
		}

	}
	// enterAllDetailsandViewMatter

	@Test(dataProvider = "getData10", priority = 10)
	public void enterAllDetailsandViewMatterPopup(HashMap<String, String> input) throws InterruptedException {
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
			createMatter.nextPage();
			String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
			createMatter.selecting(teamMemberNames);
			createMatter.nextPage();
			String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
			createMatter.selecting(documentNames);
			createMatter.nextPage();
			createMatter.alertPopupYes();
			createMatter.viewMatterListSuccess();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// enterAllDetailsWithoutTeamMemberandViewMatterPopup

	@Test(dataProvider = "getData11", priority = 11)
	public void enterAllDetailsWithoutTeamMemberandViewMatterPopup(HashMap<String, String> input)
			throws InterruptedException {
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
			createMatter.nextPage();
			createMatter.nextPage();
			String[] documentNames = { input.get("documentName1"), input.get("documentName2") };
			createMatter.selecting(documentNames);
			createMatter.nextPage();
			createMatter.alertPopupYes();
			createMatter.viewMatterListSuccess();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// enterAllDetailsWithoutDocumentandViewMatterPopup

	@Test(dataProvider = "getData12", priority = 12)
	public void enterAllDetailsWithoutDocumentandViewMatterPopup(HashMap<String, String> input)
			throws InterruptedException {
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
			createMatter.nextPage();
			String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
			createMatter.selecting(teamMemberNames);
			createMatter.nextPage();
			createMatter.nextPage();
			createMatter.alertPopupYes();
			createMatter.viewMatterListSuccess();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// enterAllDetailsWithoutTMandDocumentandViewMatterPopup

	@Test(dataProvider = "getData13", priority = 13)
	public void enterAllDetailsWithoutTMandDocumentandViewMatterPopup(HashMap<String, String> input)
			throws InterruptedException {
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
			createMatter.nextPage();
			createMatter.nextPage();
			createMatter.nextPage();
			createMatter.alertPopupYes();
			createMatter.viewMatterListSuccess();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// enterAllDetailsandSelectAllNames

	@Test(dataProvider = "getData14", priority = 14)
	public void enterAllDetailsandSelectAllNames(HashMap<String, String> input) throws InterruptedException {
		try {
			createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"),
					input.get("caseType"), input.get("courtName"), input.get("judges"), input.get("date"),
					input.get("prioritySelect"), input.get("description"), input.get("advocateName"),
					input.get("advocateEmail"), input.get("advocatePhone"));
			createMatter.nextPage();
			createMatter.selectAllBtn();
			createMatter.nextPage();
			createMatter.selectAllBtn();
			createMatter.nextPage();
			createMatter.scrollUpnearbySearchbox();
			createMatter.selectAllBtn();
			createMatter.nextPage();
			createMatter.selectAllBtn();
			createMatter.nextPage();
			createMatter.alertPopupYes();
			createMatter.viewMatterListSuccess();

		} finally {

			createMatter.leftMatterTab();
		}

	}

/*	
	// selectTempClientIndividualsandClickCancel

	@Test(dataProvider = "getData15", priority = 15)
	public void selectTempClientIndividualsandClickCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			
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
			createMatter.scrollUpnearbySearchbox();
			createMatter.InputSearchBoxTempClients(input.get("searchTextIndividuals"));
			createMatter.checkAllFieldsareEmptyinTempClients();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// selectTempClientEntityandClickCancel

	@Test(dataProvider = "getData16", priority = 16)
	public void selectTempClientEntityandClickCancel(HashMap<String, String> input) throws InterruptedException {
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
			createMatter.scrollUpnearbySearchbox();
			createMatter.InputSearchBoxTempClients(input.get("searchTextEntity"));
			createMatter.checkAllFieldsareEmptyinTempEntity();

		} finally {

			createMatter.leftMatterTab();
		}

	}

	// unselectAllandSearchNameandSelect

	@Test(dataProvider = "getData17", priority = 17,enabled=false)
	public void unselectAllandSearchNameandSelect(HashMap<String, String> input) throws InterruptedException {
		try {
			createMatter.createMatterAllFieldEnter(input.get("caseTitle"), input.get("caseNumber"),
					input.get("caseType"), input.get("courtName"), input.get("judges"), input.get("date"),
					input.get("prioritySelect"), input.get("description"), input.get("advocateName"),
					input.get("advocateEmail"), input.get("advocatePhone"));
			createMatter.nextPage();
			//Groups
			createMatter.selectAllBtn();
			createMatter.selectAllBtn();
			createMatter.InputSearchBox(input.get("searchTextIndividuals"));
			

		} finally {

			createMatter.leftMatterTab();
		}

	}
*/
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

	// selectTeamMemberandClickCancel

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(5) } };

	}

//   selectTeamMeberSeletAllandClickCancel

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(6) } };

	}

//  selectDocumentandClickCancel

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(7) } };

	}
//  selectDocumentsSeletAllandClickCancel

	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(8) } };

	}
//  enterAllDetailsandConfirmPopupClickNO

	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(9) } };

	}
//  enterAllDetailsandViewMatter

	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(10) } };

	}
//  enterAllDetailsWithoutTeamMemberandViewMatterPopup

	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(11) } };

	}
//  enterAllDetailsWithoutDocumentandViewMatterPopup

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(12) } };

	}
//  enterAllDetailsWithoutTMandDocumentandViewMatterPopup

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(13) } };

	}
//  enterAllDetailsandSelectAllNames

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(14) } };

	}
//  selectTempClientIndividualsandClickCancel

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(15) } };

	}
//  selectTempClientEntityandClickCancel

	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(16) } };

	}
//  unselectAllandSearchNameandSelect

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\CreateMatterNegative2Data.json");

		return new Object[][] { { data.get(17) } };

	}

}
