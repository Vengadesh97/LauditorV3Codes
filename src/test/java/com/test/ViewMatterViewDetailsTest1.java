package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class ViewMatterViewDetailsTest1 extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void teamMemberSelectingAndSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.leftMatterTab();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.scrolldownTeamMemberSelect();
			String[] memberNames = { input.get("Member1"), input.get("Member2"), input.get("Member3") };
			Thread.sleep(2000);
			viewMatterViewDetail.selectTeamMembers(memberNames);
			viewMatterViewDetail.saveButtonOnAddMembers();
			viewMatterViewDetail.closeButtonSuccess();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.teamMemberorClientVerify(input.get("Member1"));
			viewMatterViewDetail.teamMemberorClientVerify(input.get("Member2"));
			viewMatterViewDetail.teamMemberorClientVerify(input.get("Member3"));

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData1", priority = 1)
	public void teamMemberSelectingAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.scrolldownTeamMemberSelect();
			String[] memberNames = { input.get("Member1"), input.get("Member2") };
			Thread.sleep(2000);
			viewMatterViewDetail.selectTeamMembers(memberNames);
			viewMatterViewDetail.cancelButtonOnAddMembers();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.scrolldownTeamMemberSelect();
			viewMatterViewDetail.belowUnselectTeamMemberorClientVerify(input.get("Member1"));
			viewMatterViewDetail.belowUnselectTeamMemberorClientVerify(input.get("Member2"));

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData2", priority = 2)
	public void removeTeamMemberAndYes(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			String[] memberNames = { input.get("removeMember1"), input.get("removeMember2") };
			Thread.sleep(2000);
			viewMatterViewDetail.deleteTeamMember(memberNames);
			viewMatterViewDetail.cancelButtonOnAddMembers();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember1"));
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember2"));
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData3", priority = 3)
	public void removeTeamMemberAndNo(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			Thread.sleep(2000);
			String[] memberNames = { input.get("removeMember1"), input.get("removeMember2") };
			viewMatterViewDetail.deleteTeamMemberWithNo(memberNames);
			viewMatterViewDetail.cancelButtonOnAddMembers();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember1"));
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember2"));
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData4", priority = 4)
	public void removeTeamMemberAndClose(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			Thread.sleep(2000);
			String[] memberNames = { input.get("removeMember1"), input.get("removeMember2") };
			viewMatterViewDetail.deleteTeamMemberWithClose(memberNames);
			viewMatterViewDetail.cancelButtonOnAddMembers();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember1"));
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember2"));
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData5", priority = 5)
	public void removeTeamMemberAndYesAndSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			String[] memberNames = { input.get("removeMember1"), input.get("removeMember2") };
			Thread.sleep(2000);
			viewMatterViewDetail.deleteTeamMember(memberNames);
			viewMatterViewDetail.saveButtonOnAddMembers();
			viewMatterViewDetail.closeButtonSuccess();
			// Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.scrolldownTeamMemberSelect();
			viewMatterViewDetail.belowUnselectTeamMemberorClientVerify(input.get("removeMember1"));
			viewMatterViewDetail.belowUnselectTeamMemberorClientVerify(input.get("removeMember2"));
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData6", priority = 6)
	public void searchAndSelectNamesAndSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.pageDown();
			Thread.sleep(1000);
			viewMatterViewDetail.searchNames(input.get("names1"));
			viewMatterViewDetail.searchAndSelectTeamMember(input.get("names1"));
			viewMatterViewDetail.saveButtonOnAddMembers();
			viewMatterViewDetail.closeButtonSuccess();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.teamMemberorClientVerify(input.get("names1"));

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData7", priority = 7)
	public void searchAndSelectNamesAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.pageDown();
			Thread.sleep(1000);
			viewMatterViewDetail.searchNames(input.get("names1"));
			viewMatterViewDetail.searchAndSelectTeamMember(input.get("names1"));
			viewMatterViewDetail.cancelButtonOnAddMembers();
			// Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.scrolldownTeamMemberSelect();
			viewMatterViewDetail.belowUnselectTeamMemberorClientVerify(input.get("names1"));

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData8", priority = 8)
	public void selectAllTeamMemberAndSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			viewMatterViewDetail.selectAllBtn();
			viewMatterViewDetail.textsCheck();
			viewMatterViewDetail.saveButtonOnAddMembers();
			viewMatterViewDetail.closeButtonSuccess();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData8", priority = 9)
	public void unselectAllTeamMemberAndSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.pageDown();
			Thread.sleep(2000);
			viewMatterViewDetail.selectAllBtn();
			viewMatterViewDetail.saveButtonOnAddMembers();
			viewMatterViewDetail.closeButtonSuccess();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData9", priority = 10, enabled = false)
	public void selectedNameisDisplayorNot(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			viewMatterViewDetail.teamMemberBtn();
			String[] memberNames = { input.get("memberName1"), input.get("memberName2") };
			viewMatterViewDetail.checkSelectedNameAppear(memberNames);
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData10", priority = 11)
	public void editMatterInfoWithTeamMembers(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			viewMatterViewDetail.teamMemberBtn();
			viewMatterViewDetail.editBtn();
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
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			// Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	// -------------------------- Clients

	@Test(dataProvider = "getData11", priority = 12)
	public void clientSelectingAndSave(HashMap<String, String> input) throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrolldownTeamMemberSelect();
			String[] memberNames = { input.get("Member1"), input.get("Member2"), input.get("Member3") };
			Thread.sleep(2000);
			viewMatterViewDetail.selectTeamMembers(memberNames);
			viewMatterViewDetail.saveButtonOnAddMembers();
			viewMatterViewDetail.closeButtonSuccess();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.teamMemberorClientVerify(input.get("Member1"));
			viewMatterViewDetail.teamMemberorClientVerify(input.get("Member2"));
			viewMatterViewDetail.teamMemberorClientVerify(input.get("Member3"));

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData12", priority = 13)
	public void clientSelectingAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrolldownTeamMemberSelect();
			String[] memberNames = { input.get("Member1"), input.get("Member2") };
			Thread.sleep(2000);
			viewMatterViewDetail.selectTeamMembers(memberNames);
			viewMatterViewDetail.cancelButtonOnAddMembers();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrolldownTeamMemberSelect();
			viewMatterViewDetail.belowUnselectTeamMemberorClientVerify(input.get("Member1"));
			viewMatterViewDetail.belowUnselectTeamMemberorClientVerify(input.get("Member2"));

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData13", priority = 14)
	public void removeClientsAndYes(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			String[] memberNames = { input.get("removeMember1"), input.get("removeMember2") };
			Thread.sleep(2000);
			viewMatterViewDetail.deleteTeamMember(memberNames);
			viewMatterViewDetail.cancelButtonOnAddMembers();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember1"));
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember2"));

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData14", priority = 15)
	public void removeClientsAndNo(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			Thread.sleep(2000);
			String[] memberNames = { input.get("removeMember1"), input.get("removeMember2") };
			viewMatterViewDetail.deleteTeamMemberWithNo(memberNames);
			viewMatterViewDetail.cancelButtonOnAddMembers();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember1"));
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember2"));
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData15", priority = 16)
	public void removeClientsAndClose(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			Thread.sleep(2000);
			String[] memberNames = { input.get("removeMember1"), input.get("removeMember2") };
			viewMatterViewDetail.deleteTeamMemberWithClose(memberNames);
			viewMatterViewDetail.cancelButtonOnAddMembers();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember1"));
			viewMatterViewDetail.teamMemberorClientVerify(input.get("removeMember2"));
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData16", priority = 17)
	public void removeClientsAndYesAndSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			String[] memberNames = { input.get("removeMember1"), input.get("removeMember2") };
			Thread.sleep(2000);
			viewMatterViewDetail.deleteTeamMember(memberNames);
			viewMatterViewDetail.saveButtonOnAddMembers();
			viewMatterViewDetail.closeButtonSuccess();
			// Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrolldownTeamMemberSelect();
			viewMatterViewDetail.belowUnselectTeamMemberorClientVerify(input.get("removeMember1"));
			viewMatterViewDetail.belowUnselectTeamMemberorClientVerify(input.get("removeMember2"));
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData17", priority = 18)
	public void searchAndSelectClientsNamesAndSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrollDownSearchClient();
			Thread.sleep(1000);
			viewMatterViewDetail.searchClientNames(input.get("names1"));
			viewMatterViewDetail.searchAndSelectTeamMember(input.get("names1"));
			viewMatterViewDetail.saveButtonOnAddMembers();
			viewMatterViewDetail.closeButtonSuccess();
			Thread.sleep(2000);
			// Assertion
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.teamMemberorClientVerify(input.get("names1"));
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData18", priority = 19)
	public void searchAndSelectClientsNamesAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrollDownSearchClient();
			Thread.sleep(1000);
			viewMatterViewDetail.searchClientNames(input.get("names1"));
			viewMatterViewDetail.searchAndSelectTeamMember(input.get("names1"));
			viewMatterViewDetail.cancelButtonOnAddMembers();
			// Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrolldownTeamMemberSelect();
			viewMatterViewDetail.belowUnselectTeamMemberorClientVerify(input.get("names1"));

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData19", priority = 20)
	public void selectAllClientsAndSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.scrollDownSearchClient();
			Thread.sleep(1000);
			viewMatterViewDetail.selectAllClientBtn();
			viewMatterViewDetail.textsCheck();
			viewMatterViewDetail.saveButtonOnAddMembers();
			viewMatterViewDetail.closeButtonSuccess();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData20", priority = 21)
	public void unselectAllClientsAndSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.pageDown();
			Thread.sleep(2000);
			viewMatterViewDetail.selectAllClientBtn();
			viewMatterViewDetail.saveButtonOnAddMembers();
			viewMatterViewDetail.closeButtonSuccess();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData21", priority = 22, enabled = false)
	public void selectedNameisDisplayorNotInClients(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			viewMatterViewDetail.clientBtn();
			String[] memberNames = { input.get("memberName1"), input.get("memberName2") };
			viewMatterViewDetail.checkSelectedNameAppear(memberNames);
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData22", priority = 23)
	public void editMatterInfoWithClients(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			viewMatterViewDetail.clientBtn();
			viewMatterViewDetail.editBtn();
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
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			// Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData23", priority = 24)
	public void leftAndRightArrow(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.scrollDownSearchClient();
			viewMatterViewDetail.arrowClick();
			Thread.sleep(3000);
			viewMatterViewDetail.arrowClick();

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData23", priority = 25)
	public void eyeCheckinViewDetail(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.scrolldownMatter();
			Thread.sleep(3000);
			viewMatterViewDetail.eyes();
			viewMatterViewDetail.eyesActives();

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData24", priority = 26)
	public void editMatterInfoWithViewDetails(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.leftMatterTab();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			viewMatterViewDetail.editBtn();
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
			viewMatters.editMatterSave();
			viewMatters.successPopupEditMatterInfo();
			// Assertion
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("caseTitle"));
			viewMatters.editMatterInfoPageBtn();
			viewMatters.caseTitleVerifyAssert(input.get("caseTitle"));
			viewMatters.caseNumberVerifyAssert(input.get("caseNumber"));
			viewMatters.caseTypeVerifyAssert(input.get("caseType"));
			viewMatters.courtNameVerifyAssert(input.get("courtName"));
			viewMatters.judgesVerifyAssert(input.get("judges"));
			viewMatters.pageDown();
			Thread.sleep(2000);
			viewMatters.descriptionVerifyAssert(input.get("description"));
			viewMatters.opponentAd(input.get("name"));
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test()
	public void testMembers() throws InterruptedException {

		try {
			viewMatters.leftMatterTab();
			viewMatters.searchBarFieldsandActionBtn("Contract Breach");
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.teamMemberAndClientsBtn();
			viewMatterViewDetail.scrollUpnearbyMattername();
			Thread.sleep(2000);
			viewMatterViewDetail.teamMemberBtn();
			// viewMatterViewDetail.teamMemberVerify("Donald Carpenter");
			// viewMatterViewDetail.teamMemberVerify("Susan Walsh");
			// viewMatterViewDetail.teamMemberVerify("Jason Gifford");
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	// 0. teamMemberSelectingAndSave

	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(0) } };

	}

	// 1. teamMemberSelectingAndCancel

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(1) } };

	}

	// 2. removeTeamMemberAndYes

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(2) } };

	}

	// 3. removeTeamMemberAndNo

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(3) } };

	}

	// 4. removeTeamMemberAndClose

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(4) } };

	}

	// 5. removeTeamMemberAndYesAndSave

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(5) } };

	}

	// 6.searchAndSelectNamesAndSave

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(6) } };

	}

	// 7.searchAndSelectNamesAndCancel

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(7) } };

	}

	// 8.selectAllTeamMemberAndSave

	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(8) } };

	}

	// 9.selectedNameisDisplayorNot

	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(9) } };

	}

	// 10.editMatterInfoWithTeamMembers

	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(10) } };

	}

	// -------------

	// 11.clientSelectingAndSave

	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(11) } };

	}

	// 12.clientSelectingAndCancel

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(12) } };

	}
	// 13.removeClientsAndYes

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(13) } };

	}
	// 14.removeClientsAndNo

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(14) } };

	}
	// 15.removeClientsAndNo

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(15) } };

	}

	// 16.removeClientsAndYesAndSave
	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(16) } };

	}
	// 17.searchAndSelectClientsNamesAndSave

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(17) } };

	}
	// 18.searchAndSelectClientsNamesAndCancel

	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(18) } };

	}
	// 19.selectAllClientsAndSave

	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(19) } };

	}
	// 20.unselectAllClientsAndSave

	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(20) } };

	}
	// 21.selectedNameisDisplayorNotInClients

	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(21) } };

	}
	// 22.editMatterInfoWithClients

	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(22) } };

	}

	// 23.leftAndRightArrow

	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(23) } };

	}

	// 24.editMatterInfoWithViewDetails

	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData1.json");

		return new Object[][] { { data.get(24) } };

	}

}
