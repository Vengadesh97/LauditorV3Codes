package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class CreateMeetingTest1 extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void mandatoryFieldsAllAndLocationWithMeetingAgenda(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData1", priority = 1)
	public void mandatoryFieldsAllAndLocationWithAddTeamMember(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData2", priority = 2)
	public void mandatoryFieldsAllAndLocationWithAddEntity(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData3", priority = 3)
	public void mandatoryFieldsAllAndLocationWithAddDocument(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertDocuments(input.get("document1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData4", priority = 4)
	public void mandatoryFieldsAllAndLocationWithAddIndividuals(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	// -----

	@Test(dataProvider = "getData5", priority = 5)
	public void mandatoryFieldsAllAndMeetingAgendaWithAddTeamMember(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData6", priority = 6)
	public void mandatoryFieldsAllAndMeetingAgendaWithAddEntity(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData7", priority = 7)
	public void mandatoryFieldsAllAndMeetingAgendaWithAddDocument(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertDocuments(input.get("document1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData8", priority = 8)
	public void mandatoryFieldsAllAndMeetingAgendaWithAddIndividuals(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	// -----------

	@Test(dataProvider = "getData9", priority = 9)
	public void mandatoryFieldsAndAddTeamMemberWithAddEntity(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			Thread.sleep(1000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData10", priority = 10)
	public void mandatoryFieldsAllAndAddTeamMemberWithAddDocument(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			Thread.sleep(1000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertDocuments(input.get("document1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData11", priority = 11)
	public void mandatoryFieldsAllAndAddTeamMemberWithAddIndividuals(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			Thread.sleep(1000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));

		} finally {

			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData12", priority = 12)
	public void mandatoryFieldsAllAndAddEntityWithAddDocument(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
			viewMeeting.assertDocuments(input.get("document1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData13", priority = 13)
	public void mandatoryFieldsAllAndAddEntityWithAddIndividuals(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData14", priority = 14)
	public void mandatoryFieldsAllAndAddDocumentWithAddIndividuals(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertDocuments(input.get("document1"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData15", priority = 15)
	public void mandatoryFieldsAllAndMDLMWithAddTM(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData16", priority = 16)
	public void mandatoryFieldsAllAndMDLMWithAddEntity(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData17", priority = 17)
	public void mandatoryFieldsAllAndMDLMWithAddDocum(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertDocuments(input.get("document1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData18", priority = 18)
	public void mandatoryFieldsAllAndMDLMWithAddIndividual(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData19", priority = 19)
	public void mandatoryFieldsAllAndMDLMAddTMWithAddEntity(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData20", priority = 20)
	public void mandatoryFieldsAllAndMDLMAddTMWithAddDocum(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertDocuments(input.get("document1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData21", priority = 21)
	public void mandatoryFieldsAllAndMDLMAddTMWithAddIndividual(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData22", priority = 22)
	public void mandatoryFieldsAllAndMDLMAddTMAddEntityWithAddIndividuals(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData23", priority = 23)
	public void mandatoryFieldsAllAndMDLMAddTMAddEntityWithAddDocum(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
			viewMeeting.assertDocuments(input.get("document1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData24", priority = 24)
	public void mandatoryFieldsAllAndMDLMAddTMAddEntityAddIndividualWithAddDocum(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.alldaysMeetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));
			viewMeeting.assertDocuments(input.get("document1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData25", priority = 25)
	public void mandatoryFieldsMeetingLinkDialNumLocation(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData26", priority = 26)
	public void mandatoryFieldsMeetingLinkDialNumWithMeetingAgenda(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData27", priority = 27)
	public void mandatoryFieldsMeetingLinkDialNumWithAddTM(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData28", priority = 28)
	public void mandatoryFieldsMeetingLinkDialNumWithAddEntity(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData29", priority = 29)
	public void mandatoryFieldsMeetingLinkDialNumWithDocum(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertDocuments(input.get("document1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData30", priority = 30)
	public void mandatoryFieldsMeetingLinkDialNumWithAddIndividuals(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData31", priority = 31)
	public void mandatoryFieldsMeetingLinkDialNumLocationWithMeetingAgenda(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData32", priority = 32)
	public void mandatoryFieldsMeetingLinkDialNumLocationWithAddTM(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData33", priority = 33)
	public void mandatoryFieldsMeetingLinkDialNumLocationWithAddEntity(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData34", priority = 34)
	public void mandatoryFieldsMeetingLinkDialNumLocationWithAddDocum(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertDocuments(input.get("document1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData35", priority = 35)
	public void mandatoryFieldsMeetingLinkDialNumLocationWithAddIndividuals(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData36", priority = 36)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaWithAddTM(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData37", priority = 37)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaWithAddEntity(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData38", priority = 38)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaWithAddDocum(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertDocuments(input.get("document1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData39", priority = 39)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaWithAddIndividual(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData40", priority = 40)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaLocationWithAddTM(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData41", priority = 41)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaLocationWithAddEntity(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData42", priority = 42)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaLocationWithAddDocum(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertDocuments(input.get("document1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData43", priority = 43)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaLocationWithAddIndividuals(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData44", priority = 44)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaLocationAddTMWithAddEntity(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData45", priority = 45)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaLocationAddTMWithAddDocum(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertDocuments(input.get("document1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData46", priority = 46)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaLocationAddTMWithAddIndividuals(
			HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData47", priority = 47)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaLocationAddTMAddEntityWithAddDocum(
			HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
			viewMeeting.assertDocuments(input.get("document1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData48", priority = 48)
	public void mandatoryFieldsMeetingLinkDialNumMeetingAgendaLocationAddTMAddEntityWithAddIndividuals(
			HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData49", priority = 49)
	public void allFieldsEntered(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLinks"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingAgenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingName1"));
			viewMeeting.assertMeetingLink(input.get("meetingLinks"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingAgenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));
			viewMeeting.assertDocuments(input.get("document1"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	// 0.mandatoryFieldsAllAndLocationWithMeetingAgenda
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(0) } };

	}

	// 1.mandatoryFieldsAllAndLocationWithAddTeamMember

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(1) } };

	}
	// 2.mandatoryFieldsAllAndLocationWithAddEntity

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(2) } };

	}
	// 3.mandatoryFieldsAllAndLocationWithAddDocument

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(3) } };

	}
	// 4.mandatoryFieldsAllAndLocationWithAddIndividuals

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(4) } };

	}
	// 5.mandatoryFieldsAllAndMeetingAgendaWithAddTeamMember

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(5) } };

	}
	// 6.mandatoryFieldsAllAndMeetingAgendaWithAddEntity

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(6) } };

	}
	// 7.mandatoryFieldsAllAndMeetingAgendaWithAddDocument

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(7) } };

	}
	// 8.mandatoryFieldsAllAndMeetingAgendaWithAddIndividuals

	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(8) } };

	}
	// 9.mandatoryFieldsAndAddTeamMemberWithAddEntity

	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(9) } };

	}
	// 10.mandatoryFieldsAllAndAddTeamMemberWithAddDocument

	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(10) } };

	}
	// 11.mandatoryFieldsAllAndAddTeamMemberWithAddIndividuals

	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(11) } };

	}
	// 12.mandatoryFieldsAllAndAddEntityWithAddDocument

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(12) } };

	}
	// 13.mandatoryFieldsAllAndAddEntityWithAddIndividuals

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(13) } };

	}
	// 14.mandatoryFieldsAllAndAddDocumentWithAddIndividuals

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(14) } };

	}
	// 15.mandatoryFieldsAllAndMDLMWithAddTM

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(15) } };

	}

	// 16.mandatoryFieldsAllAndMDLMWithAddEntity

	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(16) } };

	}
	// 17.mandatoryFieldsAllAndMDLMWithAddDocum

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(17) } };

	}
	// 18.mandatoryFieldsAllAndMDLMWithAddIndividual

	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(18) } };

	}
	// 19.mandatoryFieldsAllAndMDLMAddTMWithAddEntity

	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(19) } };

	}
	// 20.mandatoryFieldsAllAndMDLMAddTMWithAddDocum

	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(20) } };

	}

	// 21.mandatoryFieldsAllAndMDLMAddTMWithAddIndividual
	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(21) } };

	}
	// 22.mandatoryFieldsAllAndMDLMAddTMAddEntityWithAddIndividuals

	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(22) } };

	}
	// 23.mandatoryFieldsAllAndMDLMAddTMAddEntityWithAddDocum

	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(23) } };

	}
	// 24.mandatoryFieldsAllAndMDLMAddTMAddEntityAddIndividualWithAddDocum

	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(24) } };

	}
	//

	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(25) } };

	}

	//

	@DataProvider
	public Object[][] getData26() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(26) } };

	}//

	@DataProvider
	public Object[][] getData27() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(27) } };

	}//

	@DataProvider
	public Object[][] getData28() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(28) } };

	}//

	@DataProvider
	public Object[][] getData29() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(29) } };

	}//

	@DataProvider
	public Object[][] getData30() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(30) } };

	}//

	@DataProvider
	public Object[][] getData31() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(31) } };

	}//

	@DataProvider
	public Object[][] getData32() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(32) } };

	}//

	@DataProvider
	public Object[][] getData33() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(33) } };

	}//

	@DataProvider
	public Object[][] getData34() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(34) } };

	}//

	@DataProvider
	public Object[][] getData35() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(35) } };

	}//

	@DataProvider
	public Object[][] getData36() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(36) } };

	}//

	@DataProvider
	public Object[][] getData37() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(37) } };

	}//

	@DataProvider
	public Object[][] getData38() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(38) } };

	}//

	@DataProvider
	public Object[][] getData39() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(39) } };

	}//

	@DataProvider
	public Object[][] getData40() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(40) } };

	}//

	@DataProvider
	public Object[][] getData41() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(41) } };

	}//

	@DataProvider
	public Object[][] getData42() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(42) } };

	}//

	@DataProvider
	public Object[][] getData43() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(43) } };

	}//

	@DataProvider
	public Object[][] getData44() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(44) } };

	}//

	@DataProvider
	public Object[][] getData45() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(45) } };

	}//

	@DataProvider
	public Object[][] getData46() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(46) } };

	}//

	@DataProvider
	public Object[][] getData47() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(47) } };

	}//

	@DataProvider
	public Object[][] getData48() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(48) } };

	}//

	@DataProvider
	public Object[][] getData49() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdata1.json");

		return new Object[][] { { data.get(49) } };

	}//

}
