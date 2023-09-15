package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class EditMeetingTest extends BaseClass {
	
	
	@Test(dataProvider = "getData0", priority = 0)
	public void editMeetingWithReptition(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.leftMeetingTab();
			Thread.sleep(3000);
			createMeeting.viewDayTab();
			viewMeeting.viewDay(input.get("date1"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingnameAssert"));
			viewMeeting.editMeetingBtn();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(3000);
			viewMeeting.editRecurringEventBtn();
			Thread.sleep(3000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(3000);
			viewMeeting.monthTab();
			Thread.sleep(5000);
			viewMeeting.reptitionTextVerify2(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingnameAssert"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));
			
		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	
	
	@Test(dataProvider = "getData1", priority = 1)
	public void editMeeting(HashMap<String, String> input) throws InterruptedException {

		try {
			createMeeting.leftMeetingTab();
			Thread.sleep(3000);
			createMeeting.viewDayTab();
			viewMeeting.viewDay(input.get("date1"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingnameAssert"));
			viewMeeting.editMeetingBtn();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.meetingLink(input.get("meetingLink"));
			createMeeting.dialNumber(input.get("dialNumber"));
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.addTeamMember(input.get("teamMember1"));
			createMeeting.addEntityFirmSelect(input.get("entityFirmName"));
			createMeeting.addEntityMemberSelect(input.get("entityMember1"));
			Thread.sleep(2000);
			createMeeting.addIndividuals(input.get("individualMember1"));
			Thread.sleep(2000);
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(3000);
			viewMeeting.editRecurringEventBtn();
			Thread.sleep(3000);
			createMeeting.viewChangesButton();
			Thread.sleep(1000);
			viewMeeting.scrollUp();
			Thread.sleep(3000);
			viewMeeting.viewDay(input.get("date1"));
			Thread.sleep(1000);
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(1000);
			viewMeeting.assertMeetingName(input.get("meetingnameAssert"));
			viewMeeting.assertMonthandTime1(input.get("date"),input.get("month"),input.get("year"),input.get("monthAndTime"));
			viewMeeting.assertMeetingLink(input.get("meetingLink"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingagenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmName1"));
			viewMeeting.assertEntityandIndividual(input.get("entityMember1"));
			viewMeeting.assertDocuments(input.get("document1"));
			viewMeeting.assertEntityandIndividual(input.get("individualsAssert"));
			
		} finally {
			createMeeting.leftMeetingTab();
		}
	}
	
	
	
	
	
	//
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\editMeeting.json");
		
		return new Object[][] { { data.get(0) }, { data.get(1) }, { data.get(2) }, { data.get(3) }, { data.get(4) },
			{ data.get(5) }, { data.get(6) }, { data.get(7) }, { data.get(8) }, { data.get(9) }, { data.get(10) },
			{ data.get(11) }, { data.get(12) }, { data.get(13) }, { data.get(14) }, { data.get(15) },
			{ data.get(16) }, { data.get(17) }, { data.get(18) }, { data.get(19) }, { data.get(20) },
			{ data.get(21) }, { data.get(22) }, { data.get(23) }, { data.get(24) }, { data.get(25) },
			{ data.get(26) }, { data.get(27) }, { data.get(28) }, { data.get(29) }, { data.get(30) },
			{ data.get(31) }, { data.get(32) }, { data.get(33) }, { data.get(34) }, { data.get(35) },
			{ data.get(36) }, { data.get(37) }, { data.get(38) }, { data.get(39) }, { data.get(40) },
			{ data.get(41) }, { data.get(42) }, { data.get(43) }, { data.get(44) }, { data.get(45) },
			{ data.get(46) }, { data.get(47) }, { data.get(48) }, { data.get(49) }, { data.get(50) },
			{ data.get(51) }, { data.get(52) }, { data.get(53) }, { data.get(54) }};

	}
	
	//
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\editMeeting.json");
		
		return new Object[][] { { data.get(55) }, { data.get(56) }, { data.get(57) }, { data.get(58) }, { data.get(59) },
			{ data.get(60) }, { data.get(61) }, { data.get(62) }, { data.get(63) }, { data.get(64) }, { data.get(65) }};
	}
	
	
	
	
	

}
