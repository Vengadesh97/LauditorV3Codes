package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class TimesheetNotSubmittedTest extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0, enabled = false)
	public void timesheetAdd(HashMap<String, String> input) throws InterruptedException {

		try {
			timesheets.leftTimesheetsTab();
			// timesheets.leftArrow();
//			timesheets.projectSelect(input.get("projectName"));
//			timesheets.taskSelect(input.get("taskName"));
//			timesheets.statusSelect(input.get("statusName"));
//			timesheets.dateSelect(input.get("date"));
//			timesheets.hourSelect(input.get("hour"));
//			timesheets.minuteSelect(input.get("minute"));
//			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(3000);
//			timesheets.editTiming(input.get("projectName1"), input.get("taskName"), input.get("date1"),
//					input.get("hour1"), input.get("minute1"));
			// timesheets.removeTimes(input.get("projectName1"), input.get("taskName"),
			// input.get("date1"),input.get("time1"));
			timesheets.verifyText(input.get("projectName1"), input.get("taskName"), input.get("date1"),
					input.get("time1"));
		} finally {
			// timesheets.leftTimesheetsTab();
		}
	}

	// Legal
	@Test(dataProvider = "getData1", priority = 1)
	public void sameProjectLegalDifferentTask1(HashMap<String, String> input) throws InterruptedException {

		try {
			timesheets.leftTimesheetsTab();
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));
		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData2", priority = 2)
	public void sameProjectLegalDifferentTask2(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData3", priority = 3)
	public void sameProjectLegalDifferentTask3(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData4", priority = 4)
	public void sameProjectLegalDifferentTask4(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData5", priority = 5)
	public void sameProjectLegalDifferentTask5(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	// General
	@Test(dataProvider = "getData6", priority = 6)
	public void sameProjectGeneralDifferentTask1(HashMap<String, String> input) throws InterruptedException {

		try {
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData7", priority = 7)
	public void sameProjectGeneralDifferentTask2(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData8", priority = 8)
	public void sameProjectGeneralDifferentTask3(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData9", priority = 9)
	public void sameProjectGeneralDifferentTask4(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData10", priority = 10)
	public void sameProjectGeneralDifferentTask5(HashMap<String, String> input) throws InterruptedException {

		try {
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	// Overhead

	@Test(dataProvider = "getData11", priority = 11)
	public void sameProjectOverheadDifferentTask1(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));
		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData12", priority = 12)
	public void sameProjectOverheadDifferentTask2(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData13", priority = 13)
	public void sameProjectOverheadDifferentTask3(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData14", priority = 14)
	public void sameProjectOverheadDifferentTask4(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData15", priority = 15)
	public void sameProjectOverheadDifferentTask5(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	// Others

	@Test(dataProvider = "getData16", priority = 16)
	public void sameProjectOthersDifferentTask1(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));
		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData17", priority = 17)
	public void sameProjectOthersDifferentTask2(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData18", priority = 18)
	public void sameProjectOthersDifferentTask3(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData19", priority = 19)
	public void sameProjectOthersDifferentTask4(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData20", priority = 20)
	public void sameProjectOthersDifferentTask5(HashMap<String, String> input) throws InterruptedException {

		try {

			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData21", priority = 21)
	public void legalWithBillableandNonBillable(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));
			Thread.sleep(2000);
			timesheets.scrollUpTime();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName2"));
			timesheets.taskSelect(input.get("taskName2"));
			timesheets.statusSelect(input.get("statusName2"));
			timesheets.dateSelect(input.get("date2"));
			timesheets.hourSelect(input.get("hour2"));
			timesheets.minuteSelect(input.get("minute2"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName3"), input.get("taskName3"), input.get("date3"),
					input.get("time3"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData22", priority = 22)
	public void generalWithBillableandNonBillable(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));
			Thread.sleep(2000);
			timesheets.scrollUpTime();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName2"));
			timesheets.taskSelect(input.get("taskName2"));
			timesheets.statusSelect(input.get("statusName2"));
			timesheets.dateSelect(input.get("date2"));
			timesheets.hourSelect(input.get("hour2"));
			timesheets.minuteSelect(input.get("minute2"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName3"), input.get("taskName3"), input.get("date3"),
					input.get("time3"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData23", priority = 23)
	public void overheadWithBillableandNonBillable(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));
			Thread.sleep(2000);
			timesheets.scrollUpTime();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName2"));
			timesheets.taskSelect(input.get("taskName2"));
			timesheets.statusSelect(input.get("statusName2"));
			timesheets.dateSelect(input.get("date2"));
			timesheets.hourSelect(input.get("hour2"));
			timesheets.minuteSelect(input.get("minute2"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName3"), input.get("taskName3"), input.get("date3"),
					input.get("time3"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData24", priority = 24)
	public void othersWithBillableandNonBillable(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));
			Thread.sleep(2000);
			timesheets.scrollUpTime();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName2"));
			timesheets.taskSelect(input.get("taskName2"));
			timesheets.statusSelect(input.get("statusName2"));
			timesheets.dateSelect(input.get("date2"));
			timesheets.hourSelect(input.get("hour2"));
			timesheets.minuteSelect(input.get("minute2"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName3"), input.get("taskName3"), input.get("date3"),
					input.get("time3"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData25", priority = 25)
	public void differentLegalWithBillableandNonBillable(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));
			Thread.sleep(2000);
			timesheets.scrollUpTime();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName2"));
			timesheets.taskSelect(input.get("taskName2"));
			timesheets.statusSelect(input.get("statusName2"));
			timesheets.dateSelect(input.get("date2"));
			timesheets.hourSelect(input.get("hour2"));
			timesheets.minuteSelect(input.get("minute2"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName3"), input.get("taskName3"), input.get("date3"),
					input.get("time3"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData26", priority = 26)
	public void differentGeneralWithBillableandNonBillable(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));
			Thread.sleep(2000);
			timesheets.scrollUpTime();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName2"));
			timesheets.taskSelect(input.get("taskName2"));
			timesheets.statusSelect(input.get("statusName2"));
			timesheets.dateSelect(input.get("date2"));
			timesheets.hourSelect(input.get("hour2"));
			timesheets.minuteSelect(input.get("minute2"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName3"), input.get("taskName3"), input.get("date3"),
					input.get("time3"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData27", priority = 27)
	public void differentOverheadWithBillableandNonBillable(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));
			Thread.sleep(2000);
			timesheets.scrollUpTime();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName2"));
			timesheets.taskSelect(input.get("taskName2"));
			timesheets.statusSelect(input.get("statusName2"));
			timesheets.dateSelect(input.get("date2"));
			timesheets.hourSelect(input.get("hour2"));
			timesheets.minuteSelect(input.get("minute2"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName3"), input.get("taskName3"), input.get("date3"),
					input.get("time3"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData28", priority = 28)
	public void differentOthersWithBillableandNonBillable(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date1"),
					input.get("time1"));
			Thread.sleep(2000);
			timesheets.scrollUpTime();
			Thread.sleep(2000);
			timesheets.projectSelect(input.get("projectName2"));
			timesheets.taskSelect(input.get("taskName2"));
			timesheets.statusSelect(input.get("statusName2"));
			timesheets.dateSelect(input.get("date2"));
			timesheets.hourSelect(input.get("hour2"));
			timesheets.minuteSelect(input.get("minute2"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.verifyText(input.get("projectName3"), input.get("taskName3"), input.get("date3"),
					input.get("time3"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData29", priority = 29)
	public void legalWithBillableUpdate(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.editTiming(input.get("projectName1"), input.get("taskName1"), input.get("date2"),
					input.get("date3"), input.get("hour1"), input.get("minute1"));
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date4"),
					input.get("time2"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData30", priority = 30)
	public void legalWithNonBillableUpdate(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.editTiming(input.get("projectName1"), input.get("taskName1"), input.get("date2"),
					input.get("date3"), input.get("hour1"), input.get("minute1"));
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date4"),
					input.get("time2"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData31", priority = 31)
	public void generalWithBillableUpdate(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.editTiming(input.get("projectName1"), input.get("taskName1"), input.get("date2"),
					input.get("date3"), input.get("hour1"), input.get("minute1"));
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date4"),
					input.get("time2"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData32", priority = 32)
	public void generalWithNonBillableUpdate(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.editTiming(input.get("projectName1"), input.get("taskName1"), input.get("date2"),
					input.get("date3"), input.get("hour1"), input.get("minute1"));
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date4"),
					input.get("time2"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData33", priority = 33)
	public void othersWithBillableUpdate(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.editTiming(input.get("projectName1"), input.get("taskName1"), input.get("date2"),
					input.get("date3"), input.get("hour1"), input.get("minute1"));
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date4"),
					input.get("time2"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData34", priority = 34)
	public void othersWithNonBillableUpdate(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.editTiming(input.get("projectName1"), input.get("taskName1"), input.get("date2"),
					input.get("date3"), input.get("hour1"), input.get("minute1"));
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date4"),
					input.get("time2"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData35", priority = 35)
	public void overheadWithBillableUpdate(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.editTiming(input.get("projectName1"), input.get("taskName1"), input.get("date2"),
					input.get("date3"), input.get("hour1"), input.get("minute1"));
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date4"),
					input.get("time2"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData36", priority = 36)
	public void overheadWithNonBillableUpdate(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.projectSelect(input.get("projectName"));
			timesheets.taskSelect(input.get("taskName"));
			timesheets.statusSelect(input.get("statusName"));
			timesheets.dateSelect(input.get("date"));
			timesheets.hourSelect(input.get("hour"));
			timesheets.minuteSelect(input.get("minute"));
			timesheets.addButton();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.editTiming(input.get("projectName1"), input.get("taskName1"), input.get("date2"),
					input.get("date3"), input.get("hour1"), input.get("minute1"));
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			timesheets.verifyText(input.get("projectName1"), input.get("taskName1"), input.get("date4"),
					input.get("time2"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	
	@Test(dataProvider = "getData37", priority = 37)
	public void legalWithBillableRemove(HashMap<String, String> input) throws InterruptedException {
		try {

			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.removeTimes(input.get("projectName"), input.get("taskName"), input.get("date"),
					input.get("time"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	@Test(dataProvider = "getData38", priority = 38)
	public void legalWithNonBillableRemove(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.removeTimes(input.get("projectName"), input.get("taskName"), input.get("date"),
					input.get("time"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}
	
	@Test(dataProvider = "getData39", priority = 39)
	public void generalWithBillableRemove(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.removeTimes(input.get("projectName"), input.get("taskName"), input.get("date"),
					input.get("time"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}
	
	
	@Test(dataProvider = "getData40", priority = 40)
	public void generalWithNonBillableRemove(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.removeTimes(input.get("projectName"), input.get("taskName"), input.get("date"),
					input.get("time"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}
	
	@Test(dataProvider = "getData41", priority = 41)
	public void overheadWithBillableRemove(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.removeTimes(input.get("projectName"), input.get("taskName"), input.get("date"),
					input.get("time"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}
	
	
	@Test(dataProvider = "getData42", priority = 42)
	public void overheadlWithNonBillableRemove(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.removeTimes(input.get("projectName"), input.get("taskName"), input.get("date"),
					input.get("time"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}
	
	@Test(dataProvider = "getData43", priority = 43)
	public void othersWithBillableRemove(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.removeTimes(input.get("projectName"), input.get("taskName"), input.get("date"),
					input.get("time"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}
	
	
	@Test(dataProvider = "getData44", priority = 44)
	public void othersWithNonBillableRemove(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.removeTimes(input.get("projectName"), input.get("taskName"), input.get("date"),
					input.get("time"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}
	
	
	

	@Test(dataProvider = "getData45", priority = 45)
	public void legalWithBillableEmptyFieldUpdate(HashMap<String, String> input) throws InterruptedException {
		try {
			timesheets.leftTimesheetsTab();
			timesheets.rightArrow();
			Thread.sleep(2000);
			timesheets.scrollDownTime();
			Thread.sleep(2000);
			timesheets.newTimeAdd(input.get("projectName"), input.get("taskName"), input.get("date"),
					input.get("hours"),input.get("minutes"));

		} finally {
			timesheets.leftTimesheetsTab();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	//
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(0) } };

	}

	// sameProjectLegalDifferentTask1
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(1) } };

	}

	// sameProjectLegalDifferentTask2
	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(2) } };

	}

	// sameProjectLegalDifferentTask3
	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(3) } };

	}

	// sameProjectLegalDifferentTask4
	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(4) } };

	}

	// sameProjectLegalDifferentTask5
	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(5) } };

	}

	// sameProjectGeneralDifferentTask1
	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(6) } };

	}

	// sameProjectGeneralDifferentTask2
	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(7) } };

	}

	// sameProjectGeneralDifferentTask3
	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(8) } };

	}

	// sameProjectGeneralDifferentTask4
	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(9) } };

	}

	// sameProjectGeneralDifferentTask5
	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(10) } };

	}

	// overhead
	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(11) } };

	}

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(12) } };

	}

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(13) } };

	}

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(14) } };

	}

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(15) } };

	}

	// others
	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(16) } };

	}

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(17) } };

	}

	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(18) } };

	}

	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(19) } };

	}

	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(20) } };

	}

	// legalWithBillableandNonBillable
	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(21) } };

	}

	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(22) } };

	}

	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(23) } };

	}

	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(24) } };
	}

	// differentLegalWithBillableandNonBillable
	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(25) } };

	}

	@DataProvider
	public Object[][] getData26() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(26) } };

	}

	//27.differentOverheadWithBillableandNonBillable
	@DataProvider
	public Object[][] getData27() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(27) } };

	}

	//28.differentOthersWithBillableandNonBillable
	@DataProvider
	public Object[][] getData28() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(28) } };
	}

	//29.legalWithBillableUpdate
	@DataProvider
	public Object[][] getData29() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(29) } };

	}
	//30.legalWithNonBillableUpdate
	@DataProvider
	public Object[][] getData30() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(30) } };

	}
	//31.generalWithBillableUpdate
	@DataProvider
	public Object[][] getData31() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(31) } };

	}
	//32.generalWithNonBillableUpdate
	@DataProvider
	public Object[][] getData32() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(32) } };
	}
	//33.othersWithBillableUpdate
	@DataProvider
	public Object[][] getData33() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(33) } };

	}
	//34.othersWithNonBillableUpdate
	@DataProvider
	public Object[][] getData34() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(34) } };

	}
	//35.overheadWithBillableUpdate
	@DataProvider
	public Object[][] getData35() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(35) } };

	}

	//36.overheadWithNonBillableUpdate
	@DataProvider
	public Object[][] getData36() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(36) } };
	}

	@DataProvider
	public Object[][] getData37() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(37) } };
	}
	
	@DataProvider
	public Object[][] getData38() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(38) } };
	}
	
	@DataProvider
	public Object[][] getData39() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(39) } };
	}
	
	
	@DataProvider
	public Object[][] getData40() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(40) } };
	}
	
	
	
	@DataProvider
	public Object[][] getData41() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(41) } };
	}
	
	
	@DataProvider
	public Object[][] getData42() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(42) } };
	}
	
	
	@DataProvider
	public Object[][] getData43() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(43) } };
	}
	
	
	@DataProvider
	public Object[][] getData44() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(44) } };
	}
	
	@DataProvider
	public Object[][] getData45() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(45) } };
	}
	
	@DataProvider
	public Object[][] getData46() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(46) } };
	}
	
	@DataProvider
	public Object[][] getData47() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(47) } };
	}
	
	
	@DataProvider
	public Object[][] getData48() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(48) } };
	}
	
	@DataProvider
	public Object[][] getData49() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(49) } };
	}
	
	@DataProvider
	public Object[][] getData50() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(50) } };
	}
	
	@DataProvider
	public Object[][] getData51() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\timesheet\\TimesheetData.json");

		return new Object[][] { { data.get(51) } };
	}
}
