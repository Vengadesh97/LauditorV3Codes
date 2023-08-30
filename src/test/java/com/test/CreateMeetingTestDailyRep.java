package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class CreateMeetingTestDailyRep extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void mandatoryFieldsWithRepetition(HashMap<String, String> input) throws InterruptedException {

		
		try {
			createMeeting.leftMeetingTab();
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify2(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}

	}

	@Test(dataProvider = "getData1", priority = 1)
	public void mandatoryFieldsWithAllDays(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.leftMeetingTab();
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}

	}

	@Test(dataProvider = "getData2", priority = 2)
	public void mandatoryFieldsWithMeetingLink(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.leftMeetingTab();
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify2(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData3", priority = 3)
	public void mandatoryFieldsWithDialNum(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData4", priority = 4)
	public void mandatoryFieldsWithLocation(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData5", priority = 5)
	public void mandatoryFieldsWithMeetingAgenda(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData6", priority = 6)
	public void mandatoryFieldsWithAddTeamMember(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData7", priority = 7)
	public void mandatoryFieldsWithAddEntity(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData8", priority = 8)
	public void mandatoryFieldsWithAddDocument(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData9", priority = 9)
	public void mandatoryFieldsWithAddIndividuals(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData10", priority = 10)
	public void mandatoryFieldsandAllDaysWithNotify(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}

	}

	@Test(dataProvider = "getData11", priority = 11)
	public void mandatoryFieldsandAllDaysWithMeetingLink(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData12", priority = 12)
	public void mandatoryFieldsandAllDaysWithDialNum(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData13", priority = 13)
	public void mandatoryFieldsandAllDaysWithLocation(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData14", priority = 14)
	public void mandatoryFieldsandAllDaysWithMeetingAgenda(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData15", priority = 15)
	public void mandatoryFieldsandAllDaysWithAddTeamMember(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData16", priority = 16)
	public void mandatoryFieldsandAllDaysWithAddEntity(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData17", priority = 17)
	public void mandatoryFieldsandAllDaysWithAddDocument(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData18", priority = 18)
	public void mandatoryFieldsandAllDaysWithAddIndividuals(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData19", priority = 19)
	public void mandatoryFieldsAndMeetingLinkWithDialNum(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData20", priority = 20)
	public void mandatoryFieldsAndMeetingLinkWithLocation(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData21", priority = 21)
	public void mandatoryFieldsAndMeetingLinkWithMeetingAgenda(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData22", priority = 22)
	public void mandatoryFieldsAndMeetingLinkWithAddTeamMember(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData23", priority = 23)
	public void mandatoryFieldsAndMeetingLinkWithAddEntity(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData24", priority = 24)
	public void mandatoryFieldsAndMeetingLinkWithAddDocument(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData25", priority = 25)
	public void mandatoryFieldsAndMeetingLinkWithAddIndividuals(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData26", priority = 26)
	public void mandatoryFieldsAndDialNumWithLocation(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData27", priority = 27)
	public void mandatoryFieldsAndDialNumWithMeetingAgenda(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData28", priority = 28)
	public void mandatoryFieldsAndDialNumWithAddTeamMember(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData29", priority = 29)
	public void mandatoryFieldsAndDialNumWithAddEntity(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
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
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData30", priority = 30)
	public void mandatoryFieldsAndDialNumWithAddDocument(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData31", priority = 31)
	public void mandatoryFieldsAndDialNumWithAddIndividuals(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData32", priority = 32)
	public void mandatoryFieldsAndLocationWithMeetingAgenda(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData33", priority = 33)
	public void mandatoryFieldsAndLocationWithAddTeamMember(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
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
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData34", priority = 34)
	public void mandatoryFieldsAndLocationWithAddEntity(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
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
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData35", priority = 35)
	public void mandatoryFieldsAndLocationWithAddDocument(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
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
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData36", priority = 36)
	public void mandatoryFieldsAndLocationWithAddIndividuals(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
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
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData37", priority = 37)
	public void mandatoryFieldsAndMeetingAgendaWithAddTeamMember(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData38", priority = 38)
	public void mandatoryFieldsAndMeetingAgendaWithAddEntity(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData39", priority = 39)
	public void mandatoryFieldsAndMeetingAgendaWithAddDocument(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData40", priority = 40)
	public void mandatoryFieldsAndMeetingAgendaWithAddIndividuals(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData41", priority = 41)
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
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
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
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData42", priority = 42)
	public void mandatoryFieldsAndAddTeamMemberWithAddDocument(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
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
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData43", priority = 43)
	public void mandatoryFieldsAndAddTeamMemberWithAddIndividuals(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
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
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {

			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData44", priority = 44)
	public void mandatoryFieldsAndAddEntityWithAddDocument(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.startTime(input.get("startTime"));
			createMeeting.repetition(input.get("repetition"));
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
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData45", priority = 45)
	public void mandatoryFieldsAndAddEntityWithAddIndividuals(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
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
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData46", priority = 46)
	public void mandatoryFieldsAndAddDocumentWithAddIndividuals(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData47", priority = 47)
	public void mandatoryFieldsAllDaysMeetingLinkWithDialNum(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData48", priority = 48)
	public void mandatoryFieldsAllDaysMeetingLinkWithLocation(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData49", priority = 49)
	public void mandatoryFieldsAllDaysMeetingLinkWithMeetingAgenda(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData50", priority = 50)
	public void mandatoryFieldsAllDaysMeetingLinkWithAddTM(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData51", priority = 51)
	public void mandatoryFieldsAllDaysMeetingLinkWithAddEntity(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData52", priority = 52)
	public void mandatoryFieldsAllDaysMeetingLinkWithAddDocum(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData53", priority = 53)
	public void mandatoryFieldsAllDaysMeetingLinkWithAddIndividual(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData54", priority = 54)
	public void mandatoryFieldsAllDaysDialNumberWithLocation(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData55", priority = 55)
	public void mandatoryFieldsAllDaysDialNumberWithMeetingAgenda(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData56", priority = 56)
	public void mandatoryFieldsAllDaysDialNumberWithAddTM(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.legalEvent();
			createMeeting.scrollDown1();
			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.allDays();
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData57", priority = 57)
	public void mandatoryFieldsAllDaysDialNumberWithAddEntity(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
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
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData58", priority = 58)
	public void mandatoryFieldsAllDaysDialNumberWithAddDocum(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	@Test(dataProvider = "getData59", priority = 59)
	public void mandatoryFieldsAllDaysDialNumberWithAddIndividual(HashMap<String, String> input)
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
			createMeeting.repetition(input.get("repetition"));
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify1(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	// 0.mandatoryFieldsOnly

	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(0) } };

	}

	// 1.mandatoryFieldsWithAllDays
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(1) } };

	}

	// 2.mandatoryFieldsWithMeetingLink
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(2) } };

	}

	// 3.mandatoryFieldsWithDialNum
	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(3) } };

	}

	// 4.mandatoryFieldsWithLocation
	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(4) } };

	}

	// 5.mandatoryFieldsWithMeetingAgenda
	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(5) } };

	}

	// 6.mandatoryFieldsWithAddTeamMember
	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(6) } };

	}

	// 7.mandatoryFieldsWithAddEntity
	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(7) } };

	}

	// 8.mandatoryFieldsWithAddDocument
	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(8) } };

	}

	// 9.mandatoryFieldsWithAddIndividuals
	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(9) } };

	}

	// 10.mandatoryFieldsWithAllDays
	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(10) } };

	}

	// 11.mandatoryFieldsandAllDaysWithMeetingLink
	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(11) } };

	}

	// 12.mandatoryFieldsandAllDaysWithDialNum
	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(12) } };

	}

	// 13.mandatoryFieldsandAllDaysWithLocation
	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(13) } };

	}

	// 14.mandatoryFieldsandAllDaysWithMeetingAgenda
	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(14) } };

	}

	// 15.mandatoryFieldsandAllDaysWithAddTeamMember
	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(15) } };

	}

	// 16.mandatoryFieldsandAllDaysWithAddEntity
	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(16) } };

	}

	// 17.mandatoryFieldsandAllDaysWithAddDocument
	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(17) } };

	}

	// 18.mandatoryFieldsandAllDaysWithAddIndividuals
	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(18) } };

	}

	// 19.mandatoryFieldsAndMeetingLinkWithDialNum
	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(19) } };

	}

	// 20.mandatoryFieldsAndMeetingLinkWithLocation
	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(20) } };

	}

	// 21.mandatoryFieldsAndMeetingLinkWithMeetingAgenda
	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(21) } };

	}

	// 22.mandatoryFieldsAndMeetingLinkWithAddTeamMember
	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(22) } };

	}

	// 23.mandatoryFieldsAndMeetingLinkWithAddEntity
	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(23) } };

	}

	// 24.mandatoryFieldsAndMeetingLinkWithAddDocument
	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(24) } };

	}

	// 25.mandatoryFieldsAndMeetingLinkWithAddIndividuals
	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(25) } };

	}

	// 26.mandatoryFieldsAndDialNumWithLocation
	@DataProvider
	public Object[][] getData26() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(26) } };

	}

	// 27.mandatoryFieldsAndDialNumWithMeetingAgenda
	@DataProvider
	public Object[][] getData27() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(27) } };

	}

	// 28.mandatoryFieldsAndDialNumWithAddTeamMember
	@DataProvider
	public Object[][] getData28() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(28) } };

	}

	// 29.mandatoryFieldsAndDialNumWithAddEntity
	@DataProvider
	public Object[][] getData29() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(29) } };

	}

	// 30.mandatoryFieldsAndDialNumWithAddDocument
	@DataProvider
	public Object[][] getData30() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(30) } };

	}

	// 31.mandatoryFieldsAndDialNumWithAddIndividuals
	@DataProvider
	public Object[][] getData31() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(31) } };

	}

	// 32.mandatoryFieldsAndLocationWithMeetingAgenda
	@DataProvider
	public Object[][] getData32() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(32) } };

	}

	// 33.mandatoryFieldsAndLocationWithAddTeamMember
	@DataProvider
	public Object[][] getData33() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(33) } };

	}

	// 34.mandatoryFieldsAndLocationWithAddEntity
	@DataProvider
	public Object[][] getData34() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(34) } };

	}

	// 35.mandatoryFieldsAndLocationWithAddDocument
	@DataProvider
	public Object[][] getData35() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(35) } };

	}

	// 36.mandatoryFieldsAndLocationWithAddIndividuals
	@DataProvider
	public Object[][] getData36() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(36) } };

	}

	// 37.mandatoryFieldsAndMeetingAgendaWithAddTeamMember
	@DataProvider
	public Object[][] getData37() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(37) } };

	}

	// 38.mandatoryFieldsAndMeetingAgendaWithAddEntity
	@DataProvider
	public Object[][] getData38() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(38) } };

	}

	// 39.mandatoryFieldsAndMeetingAgendaWithAddDocument
	@DataProvider
	public Object[][] getData39() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(39) } };

	}

	// 40.mandatoryFieldsAndMeetingAgendaWithAddIndividuals
	@DataProvider
	public Object[][] getData40() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(40) } };

	}

	// 41.mandatoryFieldsAndTeamMemberWithAddEntity
	@DataProvider
	public Object[][] getData41() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(41) } };

	}

	// 42.mandatoryFieldsAndTeamMemberWithAddDocument
	@DataProvider
	public Object[][] getData42() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(42) } };

	}

	// 43.mandatoryFieldsAndTeamMemberWithAddIndividuals
	@DataProvider
	public Object[][] getData43() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(43) } };

	}

	// 44.mandatoryFieldsAndAddEntityWithAddDocument
	@DataProvider
	public Object[][] getData44() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(44) } };

	}

	// 45.mandatoryFieldsAndAddEntityWithAddIndividuals
	@DataProvider
	public Object[][] getData45() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(45) } };

	}

	// 46.mandatoryFieldsAndAddDocumentWithAddIndividuals
	@DataProvider
	public Object[][] getData46() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(46) } };

	}

	// 47.mandatoryFieldsAllDaysMeetingLinkWithDialNum
	@DataProvider
	public Object[][] getData47() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(47) } };

	}

	// 48.mandatoryFieldsAllDaysMeetingLinkWithLocation
	@DataProvider
	public Object[][] getData48() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(48) } };

	}

	// 49.mandatoryFieldsAllDaysMeetingLinkWithMeetingAgenda
	@DataProvider
	public Object[][] getData49() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(49) } };

	}

	// 50.mandatoryFieldsAllDaysMeetingLinkWithAddTM
	@DataProvider
	public Object[][] getData50() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(50) } };

	}

	// 51.mandatoryFieldsAllDaysMeetingLinkWithAddEntity
	@DataProvider
	public Object[][] getData51() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(51) } };

	}

	// 52.mandatoryFieldsAllDaysMeetingLinkWithAddDocum
	@DataProvider
	public Object[][] getData52() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(52) } };

	}

	// 53.mandatoryFieldsAllDaysMeetingLinkWithAddIndividual
	@DataProvider
	public Object[][] getData53() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(53) } };

	}

	// 54.mandatoryFieldsAllDaysDialNumberWithLocation
	@DataProvider
	public Object[][] getData54() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(54) } };

	}

	// 55.mandatoryFieldsAllDaysDialNumberWithMeetingAgenda
	@DataProvider
	public Object[][] getData55() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(55) } };

	}

	// 56.mandatoryFieldsAllDaysDialNumberWithAddTM
	@DataProvider
	public Object[][] getData56() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(56) } };

	}

	// 57.mandatoryFieldsAllDaysDialNumberWithAddEntity
	@DataProvider
	public Object[][] getData57() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(57) } };

	}

	// 58.mandatoryFieldsAllDaysDialNumberWithAddDocum
	@DataProvider
	public Object[][] getData58() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(58) } };

	}

	// 59.mandatoryFieldsAllDaysDialNumberWithAddIndividual
	@DataProvider
	public Object[][] getData59() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily.json");

		return new Object[][] { { data.get(59) } };

	}
}
