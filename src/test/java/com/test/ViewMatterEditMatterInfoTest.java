package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pom.ViewMatterUpdateGroupsPOM;

public class ViewMatterEditMatterInfoTest extends BaseClass {

	// Mandatory Fields with Date of Filling

	@Test(dataProvider = "getData0", priority = 0)
	public void editMatterInfoMandatoryWithDOF(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.leftMatterTab();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.scrollDown();
			Thread.sleep(2000);
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields with Description

	@Test(dataProvider = "getData1", priority = 1)
	public void editMatterInfoMandatoryWithDescription(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(1000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields with Case Type

	@Test(dataProvider = "getData2", priority = 2)
	public void editMatterInfoMandatoryWithCaseType(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields with Court

	@Test(dataProvider = "getData3", priority = 3)
	public void editMatterInfoMandatoryWithCourt(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields with Judge

	@Test(dataProvider = "getData4", priority = 4)
	public void editMatterInfoMandatoryWithJudge(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			Thread.sleep(1000);
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields with Priority

	@Test(dataProvider = "getData5", priority = 5)
	public void editMatterInfoMandatoryWithPriority(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields with Status

	@Test(dataProvider = "getData6", priority = 6)
	public void editMatterInfoMandatoryWithStatus(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.statusPending();
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields with Opponent Advocate

	@Test(dataProvider = "getData7", priority = 7)
	public void editMatterInfoMandatoryWithOpponentAdvocate(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.opponentAd(input.get("name"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , DOF with Description

	@Test(dataProvider = "getData8", priority = 8)
	public void editMatterInfoMandatoryWithDOFandDescription(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , DOF with Case Type

	@Test(dataProvider = "getData9", priority = 9)
	public void editMatterInfoMandatoryWithDOFandCasetype(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , DOF with Court

	@Test(dataProvider = "getData10", priority = 10)
	public void editMatterInfoMandatoryWithDOFandCourt(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , DOF with Judge

	@Test(dataProvider = "getData11", priority = 11)
	public void editMatterInfoMandatoryWithDOFandJudge(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , DOF with Priority

	@Test(dataProvider = "getData12", priority = 12)
	public void editMatterInfoMandatoryWithDOFandPriority(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , DOF with Status

	@Test(dataProvider = "getData13", priority = 13)
	public void editMatterInfoMandatoryWithDOFandStatus(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.statusActive();
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));

		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , DOF with Opponent Advocates

	@Test(dataProvider = "getData14", priority = 14)
	public void editMatterInfoMandatoryWithDOFandOpponentAdvocates(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.scrollDown();
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.opponentAd(input.get("name"));
			
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Description with Case Type

	@Test(dataProvider = "getData15", priority = 15)
	public void editMatterInfoMandatoryWithDescriptionandCaseType(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Description with Court

	@Test(dataProvider = "getData16", priority = 16)
	public void editMatterInfoMandatoryWithDescriptionandCourt(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Description with Judge

	@Test(dataProvider = "getData17", priority = 17)
	public void editMatterInfoMandatoryWithDescriptionandJudge(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Description with Priority

	@Test(dataProvider = "getData18", priority = 18)
	public void editMatterInfoMandatoryWithDescriptionandPriority(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Description with Status

	@Test(dataProvider = "getData19", priority = 19)
	public void editMatterInfoMandatoryWithDescriptionandStatus(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.statusActive();
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Description with Opponent Advocates

	@Test(dataProvider = "getData20", priority = 20)
	public void editMatterInfoMandatoryWithDescriptionandOpponentAdvocates(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Case Type with Court

	@Test(dataProvider = "getData21", priority = 21)
	public void editMatterInfoMandatoryWithCaseTypeandCourt(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Case Type with Judge

	@Test(dataProvider = "getData22", priority = 22)
	public void editMatterInfoMandatoryWithCaseTypeandJudge(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.judgesVerifyAssert(input.get("judges"));

			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Case Type with Priority

	@Test(dataProvider = "getData23", priority = 23)
	public void editMatterInfoMandatoryWithCaseTypeandPriority(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Case Type with Status

	@Test(dataProvider = "getData24", priority = 24)
	public void editMatterInfoMandatoryWithCaseTypeandStatus(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.statusPending();
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Case Type with Opponent Advocates

	@Test(dataProvider = "getData25", priority = 25)
	public void editMatterInfoMandatoryWithCaseTypeandOpponentAdvocates(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.scrollDown();
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.opponentAd(input.get("name"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Court with Judge

	@Test(dataProvider = "getData26", priority = 26)
	public void editMatterInfoMandatoryWithCourtandJudge(HashMap<String, String> input) throws InterruptedException {
		try {
			
			viewMatters.scrollUp();
			Thread.sleep(2000);
			viewMatters.leftMatterTab();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Court with Priority

	@Test(dataProvider = "getData27", priority = 27)
	public void editMatterInfoMandatoryWithCourtandPriority(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Court with Status

	@Test(dataProvider = "getData28", priority = 28)
	public void editMatterInfoMandatoryWithCourtandStatus(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.statusActive();
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Court with Opponent Advocates

	@Test(dataProvider = "getData29", priority = 29)
	public void editMatterInfoMandatoryWithCourtandOpponentAdvocates(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.scrollDown();
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.opponentAd(input.get("name"));
			
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Judge with Priority

	@Test(dataProvider = "getData30", priority = 30)
	public void editMatterInfoMandatoryWithJudgeandPriority(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Judge with Status

	@Test(dataProvider = "getData31", priority = 31)
	public void editMatterInfoMandatoryWithJudgeandStatus(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.statusPending();
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.judgesVerifyAssert(input.get("judges"));

			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Judge with Opponent Advocates

	@Test(dataProvider = "getData32", priority = 32)
	public void editMatterInfoMandatoryWithJudgeandOpponentAdvocates(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.opponentAd(input.get("name"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Priority with Status

	@Test(dataProvider = "getData33", priority = 33)
	public void editMatterInfoMandatoryWithPriorityandStatus(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.statusActive();
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Priority with Opponent Advocates

	@Test(dataProvider = "getData34", priority = 34)
	public void editMatterInfoMandatoryWithPriorityandOpponentAdvocates(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.opponentAd(input.get("name"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Status with Opponent Advocates

	@Test(dataProvider = "getData35", priority = 35)
	public void editMatterInfoMandatoryWithStatusandOpponentAdvocates(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.statusPending();
			viewMatters.scrollDown();
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.opponentAd(input.get("name"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description & Case Type

	@Test(dataProvider = "getData36", priority = 36)
	public void editMatterInfoMandatoryWithDOFDescriptionandCaseType(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description & Court

	@Test(dataProvider = "getData37", priority = 37)
	public void editMatterInfoMandatoryWithDOFDescriptionandCourt(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description & Judge

	@Test(dataProvider = "getData38", priority = 38)
	public void editMatterInfoMandatoryWithDOFDescriptionandJudge(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description & Priority

	@Test(dataProvider = "getData39", priority = 39)
	public void editMatterInfoMandatoryWithDOFDescriptionandPriority(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description & Status

	@Test(dataProvider = "getData40", priority = 40)
	public void editMatterInfoMandatoryWithDOFDescriptionandStatus(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.statusActive();
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description & Opponent Advocates

	@Test(dataProvider = "getData41", priority = 41)
	public void editMatterInfoMandatoryWithDOFDescriptionandOpponentAdvocates(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type & Court

	@Test(dataProvider = "getData42", priority = 42)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeandCourt(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
					
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type & Judge

	@Test(dataProvider = "getData43", priority = 43)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeandJudge(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
		
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type & Priority

	@Test(dataProvider = "getData44", priority = 44)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeandPriority(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type & Status

	@Test(dataProvider = "getData45", priority = 45)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeandStatus(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.statusPending();
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type & Opponent
	// advocates
	@Test(dataProvider = "getData46", priority = 46)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeandOpponent(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type , Court & Judge

	@Test(dataProvider = "getData47", priority = 47)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeCourtandJudge(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type , Court &
	// Priority

	@Test(dataProvider = "getData48", priority = 48)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeCourtandPriority(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type , Court & Status

	@Test(dataProvider = "getData49", priority = 49)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeCourtandStatus(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.statusActive();
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type , Court &
	// Opponent advocates

	@Test(dataProvider = "getData50", priority = 50)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeCourtandOpponent(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.scrollDown();
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type , Court , Judge
	// & Priority
	@Test(dataProvider = "getData51", priority = 51)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeCourtJugeandPriority(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type , Court , Judge
	// & Status

	@Test(dataProvider = "getData52", priority = 52)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeCourtJugeandStatus(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.statusPending();
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields , Date of Filling , Description , Case Type , Court , Judge
	// & Opponent Advocates

	@Test(dataProvider = "getData53", priority = 53)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeCourtJugeandOpponent(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editDescription(input.get("description"));
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			Thread.sleep(1000);
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields Description , Case Type & Court

	@Test(dataProvider = "getData54", priority = 54)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeandCourt(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.scrollDown();
			Thread.sleep(2000);
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields Description , Case Type & Judge

	@Test(dataProvider = "getData55", priority = 55)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeandJudge(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields Description , Case Type & Priority

	@Test(dataProvider = "getData56", priority = 56)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeandPriority(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields Description , Case Type & Status
	@Test(dataProvider = "getData57", priority = 57)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeandStatus(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.statusActive();
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// Mandatory Fields Description , Case Type & Opponent Advocates

	@Test(dataProvider = "getData58", priority = 58)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeandOpponent(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

// Mandatory Fields  Description ,  Case Type , Court & Judge

	@Test(dataProvider = "getData59", priority = 59)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeCourtandJudge(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

// Mandatory Fields  Description ,  Case Type , Court & Priority

	@Test(dataProvider = "getData60", priority = 60)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeCourtandPriority(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

// Mandatory Fields  Description ,  Case Type , Court & Status

	@Test(dataProvider = "getData61", priority = 61)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeCourtandStatus(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.statusPending();
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

// Mandatory Fields  Description ,  Case Type , Court & Opponent Advocates
	@Test(dataProvider = "getData62", priority = 62)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeCourtandOpponent(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

// Mandatory Fields  Description , Case Type , Court , Judge & Priority

	@Test(dataProvider = "getData63", priority = 63)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeCourtJudgeandPriority(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

//Mandatory Fields  Description , Case Type , Court , Judge & Status

	@Test(dataProvider = "getData64", priority = 64)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeCourtJudgeandStatus(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.statusActive();
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

//Mandatory Fields  Description , Case Type , Court , Judge & Opponent advocates

	@Test(dataProvider = "getData65", priority = 65)
	public void editMatterInfoMandatoryWithDescriptionCaseTypeCourtJudgeandOpponent(HashMap<String, String> input)
			throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
			
			
			
			
			
			
		} finally {
			viewMatters.leftMatterTab();
		}
	}

//Mandatory Fields , Date of Filling , Description , Case Type , Court , Judge , Priority & Status

	@Test(dataProvider = "getData66", priority = 66)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeCourtJudgePriorityandStatus(
			HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.statusPending();
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

//Mandatory Fields , Date of Filling , Description , Case Type , Court , Judge , Priority & Opponent Advocates
	@Test(dataProvider = "getData67", priority = 67)
	public void editMatterInfoMandatoryWithDOFDescriptionCaseTypeCourtJudgePriorityandOpponent(
			HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(1000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

// all Fields Entered
	@Test(dataProvider = "getData68", priority = 68)
	public void editMatterInfoAllFieldsEntered(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.statusActive();
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			//Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			Thread.sleep(2000);
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
		
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// all Fields Entered and Cancel
	@Test(dataProvider = "getData69", priority = 69)
	public void editMatterInfoAllFieldEnteredandCancel(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.scrollUp();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.editCaseTitle(input.get("caseTitle"));
			viewMatters.editCaseNumber(input.get("caseNumber"));
			viewMatters.editCaseType(input.get("caseType"));
			viewMatters.editCourtName(input.get("courtName"));
			viewMatters.editJudges(input.get("judges"));
			viewMatters.priorityChange(input.get("priority"));
			viewMatters.statusPending();
			viewMatters.dateOfFilling(input.get("dateofFilling"));
			viewMatters.scrollDown();
			viewMatters.editDescription(input.get("description"));
			viewMatters.addOpponentAdv(input.get("name"), input.get("email"), input.get("number"));
			viewMatters.scrollDown();
			viewMatters.editMatterCancel();
	
		} finally {
			viewMatters.leftMatterTab();
		}
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

	// Mandatory Fields , Case Type with Court
	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(21) } };

	}

	// Mandatory Fields , Case Type with Judge
	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(22) } };

	}

	// Mandatory Fields , Case Type with Priority
	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(23) } };

	}

	// Mandatory Fields , Case Type with Status
	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(24) } };

	}

	// Mandatory Fields , Case Type with Opponent Advocates
	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(25) } };

	}

// Mandatory Fields , Court with Judge
	@DataProvider
	public Object[][] getData26() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(26) } };

	}

// Mandatory Fields , Court  with Priority
	@DataProvider
	public Object[][] getData27() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(27) } };

	}

// Mandatory Fields , Court  with Status
	@DataProvider
	public Object[][] getData28() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(28) } };

	}

// Mandatory Fields , Court  with Opponent Advocates
	@DataProvider
	public Object[][] getData29() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(29) } };

	}

// Mandatory Fields , Judge with Priority
	@DataProvider
	public Object[][] getData30() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(30) } };

	}

// Mandatory Fields , Judge with Status
	@DataProvider
	public Object[][] getData31() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(31) } };
	}

// Mandatory Fields , Judge with Opponent Advocates
	@DataProvider
	public Object[][] getData32() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(32) } };

	}

// Mandatory Fields , Priority with Status
	@DataProvider
	public Object[][] getData33() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(33) } };

	}

// Mandatory Fields , Priority with Opponent Advocates
	@DataProvider
	public Object[][] getData34() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(34) } };

	}

// Mandatory Fields , Status with Opponent Advocates
	@DataProvider
	public Object[][] getData35() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(35) } };

	}

	// Mandatory Fields , Date of Filling , Description & Case Type
	@DataProvider
	public Object[][] getData36() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(36) } };

	}

	// Mandatory Fields , Date of Filling , Description & Court
	@DataProvider
	public Object[][] getData37() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(37) } };
	}

	// Mandatory Fields , Date of Filling , Description & Judge
	@DataProvider
	public Object[][] getData38() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(38) } };

	}

	// Mandatory Fields , Date of Filling , Description & Priority
	@DataProvider
	public Object[][] getData39() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(39) } };

	}

	// Mandatory Fields , Date of Filling , Description & Status
	@DataProvider
	public Object[][] getData40() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(40) } };

	}

	// Mandatory Fields , Date of Filling , Description & Opponent Advocates
	@DataProvider
	public Object[][] getData41() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(41) } };

	}

	// Mandatory Fields , Date of Filling , Description , Case Type & Court
	@DataProvider
	public Object[][] getData42() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(42) } };

	}

	// Mandatory Fields , Date of Filling , Description , Case Type & Judge
	@DataProvider
	public Object[][] getData43() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(43) } };
	}

	// Mandatory Fields , Date of Filling , Description , Case Type & Priority
	@DataProvider
	public Object[][] getData44() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(44) } };

	}

	// Mandatory Fields , Date of Filling , Description , Case Type & Status
	@DataProvider
	public Object[][] getData45() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(45) } };

	}

	// Mandatory Fields , Date of Filling , Description , Case Type & Opponent
	// advocates
	@DataProvider
	public Object[][] getData46() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(46) } };

	}

	// Mandatory Fields , Date of Filling , Description , Case Type , Court & Judge
	@DataProvider
	public Object[][] getData47() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(47) } };

	}

// Mandatory Fields , Date of Filling , Description , Case Type , Court & Priority
	@DataProvider
	public Object[][] getData48() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(48) } };

	}

// Mandatory Fields , Date of Filling , Description , Case Type , Court & Status
	@DataProvider
	public Object[][] getData49() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(49) } };
	}

// Mandatory Fields , Date of Filling , Description , Case Type , Court & Opponent advocates
	@DataProvider
	public Object[][] getData50() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(50) } };

	}

// Mandatory Fields , Date of Filling , Description , Case Type , Court , Judge & Priority
	@DataProvider
	public Object[][] getData51() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(51) } };

	}

// Mandatory Fields , Date of Filling , Description , Case Type , Court , Judge & Status
	@DataProvider
	public Object[][] getData52() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(52) } };

	}

	// Mandatory Fields , Date of Filling , Description , Case Type , Court , Judge
	// & Opponent Advocates
	@DataProvider
	public Object[][] getData53() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(53) } };

	}

	// Mandatory Fields Description , Case Type & Court
	@DataProvider
	public Object[][] getData54() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(54) } };
	}

	// Mandatory Fields Description , Case Type & Judge
	@DataProvider
	public Object[][] getData55() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(55) } };

	}

	// Mandatory Fields Description , Case Type & Priority
	@DataProvider
	public Object[][] getData56() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(56) } };

	}

	// Mandatory Fields Description , Case Type & Status
	@DataProvider
	public Object[][] getData57() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(57) } };

	}

	// Mandatory Fields Description , Case Type & Opponent Advocates
	@DataProvider
	public Object[][] getData58() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(58) } };

	}

	// Mandatory Fields Description , Case Type , Court & Judge
	@DataProvider
	public Object[][] getData59() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(59) } };
	}

	// Mandatory Fields Description , Case Type , Court & Priority
	@DataProvider
	public Object[][] getData60() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(60) } };

	}

	// Mandatory Fields Description , Case Type , Court & Status
	@DataProvider
	public Object[][] getData61() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(61) } };

	}

	// Mandatory Fields Description , Case Type , Court & Opponent Advocates
	@DataProvider
	public Object[][] getData62() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(62) } };

	}

	// Mandatory Fields Description , Case Type , Court , Judge & Priority
	@DataProvider
	public Object[][] getData63() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(63) } };
	}

	// Mandatory Fields Description , Case Type , Court , Judge & Status
	@DataProvider
	public Object[][] getData64() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(64) } };

	}

	// Mandatory Fields Description , Case Type , Court , Judge & Opponent advocates
	@DataProvider
	public Object[][] getData65() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(65) } };

	}

	// Mandatory Fields , Date of Filling , Description , Case Type , Court , Judge
	// , Priority & Status
	@DataProvider
	public Object[][] getData66() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(66) } };

	}

// Mandatory Fields , Date of Filling , Description , Case Type , Court , Judge , Priority & Opponent Advocates
	@DataProvider
	public Object[][] getData67() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(67) } };

	}

// All Fields Enter
	@DataProvider
	public Object[][] getData68() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(68) } };

	}

	// All Fields Enter and click on Cancel
	@DataProvider
	public Object[][] getData69() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterEditMatterInfoData.json");

		return new Object[][] { { data.get(69) } };

	}

}
