package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class ViewMatterTest extends BaseClass {

	// Mandatory Fields with Date of Filling

	@Test(dataProvider = "getData0", priority = 0)
	public void editMatterInfoMandatoryWithDOF(HashMap<String, String> input) throws InterruptedException {
		viewMatters.leftMatterTab();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.dateOfFilling(input.get("dateofFilling"));
		viewMatters.scrollDown();
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields with Description

	@Test(dataProvider = "getData1", priority = 1)
	public void editMatterInfoMandatoryWithDescription(HashMap<String, String> input) throws InterruptedException {
		viewMatters.scrollUp();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.scrollDown();
		viewMatters.editDescription(input.get("description"));
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields with Case Type

	@Test(dataProvider = "getData2", priority = 2)
	public void editMatterInfoMandatoryWithCaseType(HashMap<String, String> input) throws InterruptedException {
		viewMatters.scrollUp();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.editCaseType(input.get("caseType"));
		viewMatters.scrollDown();
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields with Court

	@Test(dataProvider = "getData3", priority = 3)
	public void editMatterInfoMandatoryWithCourt(HashMap<String, String> input) throws InterruptedException {
		viewMatters.scrollUp();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.editCourtName(input.get("courtName"));
		viewMatters.scrollDown();
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields with Judge

	@Test(dataProvider = "getData4", priority = 4)
	public void editMatterInfoMandatoryWithJudge(HashMap<String, String> input) throws InterruptedException {
		viewMatters.scrollUp();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.editJudges(input.get("judges"));
		viewMatters.scrollDown();
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields with Priority

	@Test(dataProvider = "getData5", priority = 5)
	public void editMatterInfoMandatoryWithPriority(HashMap<String, String> input) throws InterruptedException {
		viewMatters.scrollUp();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.priorityChange(input.get("priority"));
		viewMatters.scrollDown();
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields with Status

	@Test(dataProvider = "getData6", priority = 6)
	public void editMatterInfoMandatoryWithStatus(HashMap<String, String> input) throws InterruptedException {
		viewMatters.scrollUp();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.statusPending();
		viewMatters.scrollDown();
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields with Opponent Advocate

	@Test(dataProvider = "getData7", priority = 7)
	public void editMatterInfoMandatoryWithOpponentAdvocate(HashMap<String, String> input) throws InterruptedException {
		viewMatters.scrollUp();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.scrollDown();
		viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields , DOF with Description

	@Test(dataProvider = "getData8", priority = 8)
	public void editMatterInfoMandatoryWithDOFandDescription(HashMap<String, String> input)
			throws InterruptedException {
		viewMatters.leftMatterTab();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.dateOfFilling(input.get("dateofFilling"));
		viewMatters.scrollDown();
		viewMatters.editDescription(input.get("description"));
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields , DOF with Case Type

	@Test(dataProvider = "getData9", priority = 9)
	public void editMatterInfoMandatoryWithDOFandCasetype(HashMap<String, String> input) throws InterruptedException {
		viewMatters.scrollUp();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.dateOfFilling(input.get("dateofFilling"));
		viewMatters.editCaseType(input.get("caseType"));
		viewMatters.scrollDown();
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields , DOF with Court

	@Test(dataProvider = "getData10", priority = 10)
	public void editMatterInfoMandatoryWithDOFandCourt(HashMap<String, String> input) throws InterruptedException {
		viewMatters.leftMatterTab();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.dateOfFilling(input.get("dateofFilling"));
		viewMatters.editCourtName(input.get("courtName"));
		viewMatters.scrollDown();
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields , DOF with Judge

	@Test(dataProvider = "getData11", priority = 11)
	public void editMatterInfoMandatoryWithDOFandJudge(HashMap<String, String> input) throws InterruptedException {
		viewMatters.scrollUp();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.dateOfFilling(input.get("dateofFilling"));
		viewMatters.editJudges(input.get("judges"));
		viewMatters.scrollDown();
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields , DOF with Priority

	@Test(dataProvider = "getData12", priority = 12)
	public void editMatterInfoMandatoryWithDOFandPriority(HashMap<String, String> input) throws InterruptedException {
		viewMatters.leftMatterTab();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.dateOfFilling(input.get("dateofFilling"));
		viewMatters.priorityChange(input.get("priority"));
		viewMatters.scrollDown();
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields , DOF with Status

	@Test(dataProvider = "getData13", priority = 13)
	public void editMatterInfoMandatoryWithDOFandStatus(HashMap<String, String> input) throws InterruptedException {
		viewMatters.scrollUp();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.dateOfFilling(input.get("dateofFilling"));
		viewMatters.statusPending();
		viewMatters.scrollDown();
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	// Mandatory Fields , DOF with Opponent Advocates

	@Test(dataProvider = "getData14", priority = 14)
	public void editMatterInfoMandatoryWithDOFandOpponentAdvocates(HashMap<String, String> input)
			throws InterruptedException {
		viewMatters.leftMatterTab();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.dateOfFilling(input.get("dateofFilling"));
		viewMatters.scrollDown();
		viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	//Mandatory Fields , Description with Case Type

	@Test(dataProvider = "getData15", priority = 15)
	public void editMatterInfoMandatoryWithDescriptionandCaseType(HashMap<String, String> input) throws InterruptedException {
		viewMatters.scrollUp();
		viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
		viewMatters.editCaseTitle(input.get("caseTitle"));
		viewMatters.editCaseNumber(input.get("caseNumber"));
		viewMatters.editCaseType(input.get("caseType"));
		viewMatters.scrollDown();
		viewMatters.editDescription(input.get("description"));
		viewMatters.editMatterSave();
		viewMatters.successPopupEditMatterInfo();
	}

	
	// Mandatory Fields , Description with Court

		@Test(dataProvider = "getData16", priority = 16)
		public void editMatterInfoMandatoryWithDescriptionandCourt(HashMap<String, String> input) throws InterruptedException {
			viewMatters.leftMatterTab();
			viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
		}

		// Mandatory Fields , Description with Judge

		@Test(dataProvider = "getData17", priority = 17)
		public void editMatterInfoMandatoryWithDescriptionandJudge(HashMap<String, String> input) throws InterruptedException {
			viewMatters.scrollUp();
			viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
		}

		// Mandatory Fields , Description with Priority

		@Test(dataProvider = "getData18", priority = 18)
		public void editMatterInfoMandatoryWithDescriptionandPriority(HashMap<String, String> input) throws InterruptedException {
			viewMatters.leftMatterTab();
			viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
		}

		// Mandatory Fields , Description with Status

		@Test(dataProvider = "getData19", priority = 19)
		public void editMatterInfoMandatoryWithDescriptionandStatus(HashMap<String, String> input) throws InterruptedException {
			viewMatters.scrollUp();
			viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.statusPending();
			viewMatters.editDescription(input.get("description"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
		}

		// Mandatory Fields , Description with Opponent Advocates

		@Test(dataProvider = "getData20", priority = 20)
		public void editMatterInfoMandatoryWithDescriptionandOpponentAdvocates(HashMap<String, String> input)
				throws InterruptedException {
			viewMatters.leftMatterTab();
			viewMatters.searchInputandEditMatterInfo(input.get("matterName"));
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
		}

		
	
	
	
	
	// Mandatory Fields with Date of Filling
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(0) } };

	}

	// Mandatory Fields with Description
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(1) } };

	}

	// Mandatory Fields with Case Type
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(2) } };

	}

	// Mandatory Fields with Court
	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(3) } };

	}

	// Mandatory Fields with Judge
	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(4) } };

	}

	// Mandatory Fields with Priority
	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(5) } };

	}

	// Mandatory Fields with Status
	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(6) } };

	}

	// Mandatory Fields with Opponent Advocate
	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(7) } };

	}

	// Mandatory Fields , DOF with Description
	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(8) } };

	}

	// Mandatory Fields , DOF with Case Type
	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(9) } };

	}

	// Mandatory Fields , DOF with Court
	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(10) } };

	}

	// Mandatory Fields , DOF with Judge
	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(11) } };

	}

	// Mandatory Fields , DOF with Priority
	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(12) } };

	}

	// Mandatory Fields , DOF with Status
	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(13) } };

	}

	// Mandatory Fields , DOF with Opponent Advocates
	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(14) } };

	}

	// Mandatory Fields , Description with Case Type
	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(15) } };

	}

	// Mandatory Fields , Description with Court
	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(16) } };

	}

	// Mandatory Fields , Description with Judge
	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(17) } };

	}

	// Mandatory Fields , Description with Priority
	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(18) } };

	}

	// Mandatory Fields , Description with Status
	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(19) } };

	}

	// Mandatory Fields , Description with Opponent Advocates
	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(20) } };

	}

}
