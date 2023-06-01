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
}
