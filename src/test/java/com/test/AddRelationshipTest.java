package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class AddRelationshipTest extends BaseClass {

	// Individual with Invite and Request

	@Test(dataProvider = "getData0", priority = 0)
	public void individualEnterAllDetailsWithCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			addRelationship.addRelationShipTab();
			addRelationship.indivdualsTab();
			addRelationship.inputSearchBox(input.get("text"));
			addRelationship.searchButton();
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.addRelationship(input.get("firstName"), input.get("lastName"), input.get("confirmEmail"),
					input.get("country"), groupNames);
			addRelationship.cancelBtn();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData1", priority = 1)
	public void individualEnterAllDetailsWithConfirmNo(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.addRelationShipTab();
			addRelationship.indivdualsTab();
			addRelationship.inputSearchBox(input.get("text"));
			addRelationship.searchButton();
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.addRelationship(input.get("firstName"), input.get("lastName"), input.get("confirmEmail"),
					input.get("country"), groupNames);
			addRelationship.sendRequestBtn();
			addRelationship.alertNoBtn();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData2", priority = 2)
	public void individualEnterAllDetailsWithConfirmYesAndAddRelationships(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.addRelationShipTab();
			addRelationship.indivdualsTab();
			addRelationship.inputSearchBox(input.get("text"));
			addRelationship.searchButton();
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.addRelationship(input.get("firstName"), input.get("lastName"), input.get("confirmEmail"),
					input.get("country"), groupNames);
			addRelationship.sendRequestBtn();
			addRelationship.alertYesBtn();
			addRelationship.addRelationshipBtn();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData3", priority = 3)
	public void individualEnterAllDetailsWithConfirmYesAndViewChanges(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.addRelationShipTab();
			addRelationship.indivdualsTab();
			addRelationship.inputSearchBox(input.get("text"));
			addRelationship.searchButton();
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.addRelationship(input.get("firstName"), input.get("lastName"), input.get("confirmEmail"),
					input.get("country"), groupNames);
			addRelationship.sendRequestBtn();
			addRelationship.alertYesBtn();
			addRelationship.viewChangesBtn();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	// Entity with Invite and Request

	@Test(dataProvider = "getData4", priority = 4)
	public void entityEnterAllDetailsWithCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			addRelationship.addRelationShipTab();
			addRelationship.entitySearchBox(input.get("text"));
			Thread.sleep(1000);
			String[] firmNames = { input.get("firmName") };
			addRelationship.entityNameSelect(firmNames);
			addRelationship.searchButton();
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.entityInvitation(input.get("entityName"), input.get("contactPerson"), input.get("email"),
					input.get("contactNumber"), input.get("cEmail"), input.get("country"), groupNames);
			addRelationship.cancelBtn();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData5", priority = 5)
	public void entityEnterAllDetailsWithConfirmNo(HashMap<String, String> input) throws InterruptedException {

		try {

			addRelationship.addRelationShipTab();
			addRelationship.entitySearchBox(input.get("text"));
			Thread.sleep(2000);
			addRelationship.searchButton();
			String[] firmNames = { input.get("firmName") };
			addRelationship.entityNameSelect(firmNames);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.entityInvitation(input.get("entityName"), input.get("contactPerson"), input.get("email"),
					input.get("contactNumber"), input.get("cEmail"), input.get("country"), groupNames);
			addRelationship.sendRequestBtn();
			addRelationship.alertNoBtn();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData6", priority = 6)
	public void entityEnterAllDetailsWithConfirmYesAndAddRelationships(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.addRelationShipTab();
			addRelationship.entitySearchBox(input.get("text"));
			Thread.sleep(2000);
			addRelationship.searchButton();
			String[] firmNames = { input.get("firmName") };
			addRelationship.entityNameSelect(firmNames);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.entityInvitation(input.get("entityName"), input.get("contactPerson"), input.get("email"),
					input.get("contactNumber"), input.get("cEmail"), input.get("country"), groupNames);
			addRelationship.sendRequestBtn();
			addRelationship.alertYesBtn();
			addRelationship.addRelationshipBtn();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData7", priority = 7)
	public void entityEnterAllDetailsWithConfirmYesAndViewChanges(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.addRelationShipTab();
			addRelationship.entitySearchBox(input.get("text"));
			Thread.sleep(2000);
			addRelationship.searchButton();
			String[] firmNames = { input.get("firmName") };
			addRelationship.entityNameSelect(firmNames);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.entityInvitation(input.get("entityName"), input.get("contactPerson"), input.get("email"),
					input.get("contactNumber"), input.get("cEmail"), input.get("country"), groupNames);
			addRelationship.sendRequestBtn();
			addRelationship.alertYesBtn();
			addRelationship.viewChangesBtn();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	// Individuals

	@Test(dataProvider = "getData8", priority = 8)
	public void individualSelectGroupAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.cancelBtnModifyGroup();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData9", priority = 9)
	public void individualSelectGroupAndClickSaveAndAlertNo(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData10", priority = 10)
	public void individualSelectGroupAndClickSaveAndAlertYes(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertYesUpdate();
			addRelationship.successCloseUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData11", priority = 11)
	public void individualUnSelectGroupAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.cancelBtnModifyGroup();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData12", priority = 12)
	public void individualUnSelectGroupAndClickSaveAndAlertNo(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData13", priority = 13)
	public void individualUnSelectGroupAndClickSaveAndAlertYes(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertYesUpdate();
			addRelationship.successCloseUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	// Businesses

	@Test(dataProvider = "getData14", priority = 14)
	public void businessesSelectGroupAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.businessesTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.cancelBtnModifyGroup();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData15", priority = 15)
	public void businessesSelectGroupAndClickSaveAndAlertNo(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.businessesTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData16", priority = 16)
	public void businessesSelectGroupAndClickSaveAndAlertYes(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.businessesTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertYesUpdate();
			addRelationship.successCloseUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData17", priority = 17)
	public void businessesUnSelectGroupAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.businessesTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.cancelBtnModifyGroup();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData18", priority = 18)
	public void businessesUnSelectGroupAndClickSaveAndAlertNo(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.businessesTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData19", priority = 19)
	public void businessesUnSelectGroupAndClickSaveAndAlertYes(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.businessesTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertYesUpdate();
			addRelationship.successCloseUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	// Corporate
	@Test(dataProvider = "getData20", priority = 20)
	public void corporateSelectGroupAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.corporateTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.cancelBtnModifyGroup();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData21", priority = 21)
	public void corporateSelectGroupAndClickSaveAndAlertNo(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.corporateTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData22", priority = 22)
	public void corporateSelectGroupAndClickSaveAndAlertYes(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.corporateTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertYesUpdate();
			addRelationship.successCloseUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData23", priority = 23)
	public void corporateUnSelectGroupAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.corporateTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.cancelBtnModifyGroup();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData24", priority = 24)
	public void corporateUnSelectGroupAndClickSaveAndAlertNo(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.corporateTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData25", priority = 25)
	public void corporateUnSelectGroupAndClickSaveAndAlertYes(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.corporateTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.individualsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertYesUpdate();
			addRelationship.successCloseUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	// Temp Clients

	@Test(dataProvider = "getData26", priority = 26)
	public void tempClientSelectGroupAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.temporaryTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.tempclientsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.cancelBtnModifyGroup();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData27", priority = 27)
	public void tempClientSelectGroupAndClickSaveAndAlertNo(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.temporaryTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.tempclientsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData28", priority = 28)
	public void tempClientSelectGroupAndClickSaveAndAlertYes(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.temporaryTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.tempclientsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertYesUpdate();
			addRelationship.successCloseUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData29", priority = 29)
	public void tempClientUnSelectGroupAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.temporaryTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.tempclientsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.cancelBtnModifyGroup();

		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData30", priority = 30)
	public void tempClientUnSelectGroupAndClickSaveAndAlertNo(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.temporaryTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.tempclientsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData31", priority = 31)
	public void tempClientUnSelectGroupAndClickSaveAndAlertYes(HashMap<String, String> input)
			throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.temporaryTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.tempclientsModifyGroupAccessBtn();
			Thread.sleep(2000);
			String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
			addRelationship.updateAndModifyGroupAccess(groupNames);
			addRelationship.saveBtnModifyGroup();
			addRelationship.alertYesUpdate();
			addRelationship.successCloseUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	// SendInvite on Temp Clients

	@Test(dataProvider = "getData32", priority = 32)
	public void tempClientSendInviteAndAlertNoIndividuals(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.temporaryTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.tempclientsSendInviteBtn();
			Thread.sleep(2000);
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData33", priority = 33)
	public void tempClientSendInviteAndAlertYesIndividuals(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.temporaryTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.tempclientsSendInviteBtn();
			Thread.sleep(2000);
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData34", priority = 34)
	public void tempClientSendInviteAndAlertNoEntity(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.temporaryTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.tempclientsSendInviteBtn();
			Thread.sleep(2000);
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	@Test(dataProvider = "getData35", priority = 35)
	public void tempClientSendInviteAndAlertYesEntity(HashMap<String, String> input) throws InterruptedException {

		try {
			addRelationship.leftSideRelationshipTab();
			Thread.sleep(2000);
			addRelationship.temporaryTabBtn();
			Thread.sleep(2000);
			addRelationship.searchInput(input.get("name"));
			Thread.sleep(2000);
			addRelationship.tempclientsSendInviteBtn();
			Thread.sleep(2000);
			addRelationship.alertNoUpdate();
		} finally {
			addRelationship.leftSideRelationshipTab();
		}
	}

	// enterAllDetailsWithCancel
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(0) }, { data.get(1) } };
	}

	// enterAllDetailsWithConfirmNo
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(2) }, { data.get(3) } };
	}

	// enterAllDetailsWithConfirmYesAndAddRelationships
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(4) }, { data.get(5) } };
	}

	// enterAllDetailsWithConfirmYesAndViewChanges
	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(6) }, { data.get(7) } };
	}

	// entityEnterAllDetailsWithCancel

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(8) }, { data.get(9) } };
	}

	// entityEnterAllDetailsWithConfirmNo

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(10) }, { data.get(11) } };
	}

	// entityEnterAllDetailsWithConfirmYesAndAddRelationships

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(12) }, { data.get(13) } };
	}

	// entityEnterAllDetailsWithConfirmYesAndViewChanges

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(14) }, { data.get(15) } };
	}

	// individualSelectGroupAndCancel
	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(16) } };
	}

	// individualSelectGroupAndClickSaveAndAlertNo
	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(17) } };
	}

	// individualSelectGroupAndClickSaveAndAlertYes
	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(18) } };
	}

	// individualUnSelectGroupAndCancel
	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(19) } };
	}

	// individualUnSelectGroupAndClickSaveAndAlertNo
	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(20) } };
	}

	// individualUnSelectGroupAndClickSaveAndAlertYes
	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(21) } };
	}

	// businessesSelectGroupAndCancel
	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(22) } };
	}

	// businessesSelectGroupAndClickSaveAndAlertNo
	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(23) } };
	}

	// businessesSelectGroupAndClickSaveAndAlertYes
	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(24) } };
	}

	// businessesUnSelectGroupAndCancel
	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(25) } };
	}

	// businessesUnSelectGroupAndClickSaveAndAlertNo
	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(26) } };
	}

	// businessesUnSelectGroupAndClickSaveAndAlertYes
	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(27) } };
	}

	// corporateSelectGroupAndCancel
	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(28) } };
	}

	// corporateSelectGroupAndClickSaveAndAlertNo
	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(29) } };
	}

	// corporateSelectGroupAndClickSaveAndAlertYes
	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(30) } };
	}

	// corporateUnSelectGroupAndCancel
	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(31) } };
	}

	// corporateUnSelectGroupAndClickSaveAndAlertNo
	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(32) } };
	}

	// corporateUnSelectGroupAndClickSaveAndAlertYes
	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(33) } };
	}

	// tempClientSelectGroupAndCancel
	@DataProvider
	public Object[][] getData26() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(34) } };
	}

	// tempClientSelectGroupAndClickSaveAndAlertNo
	@DataProvider
	public Object[][] getData27() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(35) } };
	}

	// tempClientSelectGroupAndClickSaveAndAlertYes
	@DataProvider
	public Object[][] getData28() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(36) } };
	}

	// tempClientUnSelectGroupAndCancel
	@DataProvider
	public Object[][] getData29() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(37) } };
	}

	// tempClientUnSelectGroupAndClickSaveAndAlertNo
	@DataProvider
	public Object[][] getData30() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(38) } };
	}

	// tempClientUnSelectGroupAndClickSaveAndAlertYes
	@DataProvider
	public Object[][] getData31() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(39) } };
	}

	// tempClientSendInviteAndAlertNoIndividuals
	@DataProvider
	public Object[][] getData32() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(40) } };
	}

	// tempClientSendInviteAndAlertYesIndividuals
	@DataProvider
	public Object[][] getData33() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(41) } };
	}

	// tempClientSendInviteAndAlertNoEntity
	@DataProvider
	public Object[][] getData34() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(42) } };
	}

	// tempClientSendInviteAndAlertYesEntity
	@DataProvider
	public Object[][] getData35() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Relationship\\addRelationship.json");

		return new Object[][] { { data.get(43) } };
	}

}
