package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class CreateMeetingTest1 extends BaseClass {
	

	@Test(dataProvider = "getData0", priority = 0)
	public void createNewMeetingWithAllDays(HashMap<String, String> input) throws InterruptedException {

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
			createMeeting.addIndividuals(input.get("individualMember1"));
			createMeeting.addDocument(input.get("document1"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			viewMeeting.viewDay(input.get("date1"));
			viewMeeting.meetingCheck(input.get("scrollTime"), input.get("meetingName"));
			viewMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.assertMeetingName(input.get("meetingnameAssert"));
			viewMeeting.assertMeetingLink(input.get("meetingLink"));
			viewMeeting.assertPhoneNumber(input.get("dialNumber"));
			viewMeeting.assertMeetingAgenda(input.get("meetingagenda"));
			viewMeeting.assertTeamMember(input.get("teamMember1"));
			viewMeeting.assertEntityandIndividual(input.get("entityFirmAssert1"));
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
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataNew1.json");

		return new Object[][] { { data.get(0) }, { data.get(1) }, { data.get(2) }, { data.get(3) }, { data.get(4) },
			{ data.get(5) }, { data.get(6) }, { data.get(7) }, { data.get(8) }, { data.get(9) }, { data.get(10) },
			{ data.get(11) }, { data.get(12) }, { data.get(13) }, { data.get(14) }, { data.get(15) },
			{ data.get(16) }, { data.get(17) }, { data.get(18) }, { data.get(19) }, { data.get(20) },
			{ data.get(21) }, { data.get(22) }, { data.get(23) }, { data.get(24) }, { data.get(25) },
			{ data.get(26) }, { data.get(27) }, { data.get(28) }, { data.get(29) }, { data.get(30) },
			{ data.get(31) }, { data.get(32) }, { data.get(33) }, { data.get(34) }, { data.get(35) },
			{ data.get(36) }, { data.get(37) }, { data.get(38) }, { data.get(39) }, { data.get(40) },
			{ data.get(41) }, { data.get(42) }, { data.get(43) }, { data.get(44) }, { data.get(45) },
			{ data.get(46) }, { data.get(47) } };
	}

	
	
}
