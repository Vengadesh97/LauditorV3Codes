package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class CreateMeetingTestWeekRep extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void allFieldsEntered(HashMap<String, String> input) throws InterruptedException {

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

	// 0.mandatoryFieldsAllAndLocationWithMeetingAgenda
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataWeekly.json");

		return new Object[][] { { data.get(0)},{ data.get(1)},{ data.get(2)},{ data.get(3)},{ data.get(4)}};

	}

}
