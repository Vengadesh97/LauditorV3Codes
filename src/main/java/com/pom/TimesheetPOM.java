package com.pom;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.abst.Reusable;

public class TimesheetPOM extends Reusable {

	WebDriver driver;

	public TimesheetPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Timesheets']")
	WebElement timeSheetLeft;

	public void leftTimesheetsTab() throws InterruptedException {
		Thread.sleep(2000);
		scrollUps();
		Thread.sleep(2000);
		visibilityOfAllElements(timeSheetLeft);
		timeSheetLeft.click();
	}

	@FindBy(xpath = "//i[@class='fa fa-thin fa-chevron-left']")
	WebElement leftArrows;

	public void leftArrow() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(leftArrows);
		leftArrows.click();
	}
	
	@FindBy(xpath = "//i[@class='fa fa-thin fa-chevron-right']")
	WebElement rightArrows;
	
	public void rightArrow() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(rightArrows);
		rightArrows.click();
	}
	
	
	public void scrollUps() throws InterruptedException
	{
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)");
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)");
	}

	@FindBy(xpath = "//select[@formcontrolname='matter_type']")
	WebElement projectList;

	public void projectSelect(String projectName) throws InterruptedException {
		visibilityOfAllElements(projectList);
		projectList.click();
		// Thread.sleep(2000);
		Select projecNames = new Select(projectList);
		projecNames.selectByVisibleText(projectName);
		projectList.click();
	}

	@FindBy(xpath = "//select[@formcontrolname='title']")
	WebElement taskList;

	public void taskSelect(String taskName) throws InterruptedException {
		visibilityOfAllElements(taskList);
		taskList.click();
		// Thread.sleep(2000);
		Select taskNames = new Select(taskList);
		taskNames.selectByVisibleText(taskName);
		taskList.click();
	}

	@FindBy(xpath = "//select[@formcontrolname='billing']")
	WebElement statusList;

	public void statusSelect(String statusname) throws InterruptedException {
		visibilityOfAllElements(statusList);
		statusList.click();
		// Thread.sleep(2000);
		Select statusNames = new Select(statusList);
		statusNames.selectByVisibleText(statusname);
		statusList.click();
	}

	@FindBy(xpath = "//select[@formcontrolname='date']")
	WebElement datechoose;

	public void dateSelect(String date) throws InterruptedException {
		visibilityOfAllElements(datechoose);
		datechoose.click();
		// Thread.sleep(2000);
		Select dateNames = new Select(datechoose);
		dateNames.selectByVisibleText(date);
		datechoose.click();
	}

	@FindBy(xpath = "//input[@type='number']")
	WebElement hours;

	public void hourSelect(String hourValues) throws InterruptedException {
		visibilityOfAllElements(hours);
		hours.clear();
		hours.sendKeys(hourValues);
	}

	@FindBy(xpath = "//select[@formcontrolname='duration_minutes']")
	WebElement minutesList;

	public void minuteSelect(String minutes) throws InterruptedException {
		visibilityOfAllElements(minutesList);
		minutesList.click();
		// Thread.sleep(2000);
		Select minutesNames = new Select(minutesList);
		minutesNames.selectByVisibleText(minutes);
		minutesList.click();
	}

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement addBtn;

	public void addButton() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(addBtn);
		addBtn.click();
	}

	public void scrollDownTime() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void scrollUpTime() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,200)");
	}

	@FindBy(xpath = "//td[@rowspan='1']")
	List<WebElement> allRowNames1;

	@FindBy(xpath = "//td[@rowspan='2']")
	List<WebElement> allRowNames2;

	@FindBy(xpath = "//td[@rowspan='3']")
	List<WebElement> allRowNames3;

	@FindBy(xpath = "//td[@rowspan='4']")
	List<WebElement> allRowNames4;

	@FindBy(xpath = "//td[@rowspan='5']")
	List<WebElement> allRowNames5;

	@FindBy(xpath = "//tr //td[@class='project']")
	List<WebElement> projectNames;

	@FindBy(xpath = "//tr //td[@class='tasks']")
	List<WebElement> allTaskNames;

	@FindBy(xpath = "//tr //td[@class='billable']")
	List<WebElement> allBillable;

	@FindBy(xpath = "//tr //td[text()='non-billable']")
	List<WebElement> allNonBillable;

	@FindBy(xpath = "//tr //th[@class='date']")
	List<WebElement> allDate;

	@FindBy(xpath = "//table[@class='tsheet-table margin-div']//tr//td//div")
	List<WebElement> allDays;

	@FindBy(xpath = "//td/div/span/i[2]")
	List<WebElement> timeEdit;

	public void editTiming(String projected, String tasked, String dated, String values, String values1,String dated1)
			throws InterruptedException {
		Thread.sleep(2000);
		String[][] Span = new String[20][2];
		int count = 0;

		for (int i = 0; i < allRowNames1.size(); i++) {
			String text = allRowNames1.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "1";
			count++;
		}

		for (int i = 0; i < allRowNames2.size(); i++) {
			String text = allRowNames2.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "2";
			count++;
		}

		for (int i = 0; i < allRowNames3.size(); i++) {
			String text = allRowNames3.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "3";
			count++;
		}

		for (int i = 0; i < allRowNames4.size(); i++) {
			String text = allRowNames4.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "4";
			count++;
		}

		for (int i = 0; i < allRowNames5.size(); i++) {
			String text = allRowNames5.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "5";
			count++;
		}

		Thread.sleep(1000);

		for (int i = 0; i < count; i++) {
			System.out.println(Span[i][0] + "\t" + Span[i][1]);
		}

		int daycount = 0;
		for (int i = 0; i < allDate.size(); i++) {

			if (allDate.get(i).getText().contains(dated)) {
				daycount = i;
				System.out.println("TopDaycount : " + daycount);
				break;
			}
		}

		String text;
		int y = 0, x = 0;
		int totalcount = 0;

		for (int i = 0; i < projectNames.size(); i++) {
			text = projectNames.get(i).getText();
			// System.out.println(text +"\t Projected : "+ projected);
			if (text.contains(projected)) {
				for (int j = 0; j < count; j++) {
					if (Span[j][0].equals(text)) {
						x = Integer.parseInt(Span[j][1]);
						break;
					}
				}
				String task;
				for (int j = y; j < y + x; j++) {
					task = allTaskNames.get(j).getText();
					System.out.println("Task" + task + "\nCount : " + task.length());
					System.out.println("Tasked" + tasked + "\nCount : " + tasked.length());
					if (task.equals(tasked)) {
						System.out.println("Y : " + y);
						System.out.println("j : " + j);
						System.out.println("dayCount : " + daycount);
						totalcount = ((j) * 7) + daycount;
						System.out.println("Count : " + totalcount);
						break;
					}
				}
				break;
			}

			for (int j = 0; j < count; j++) {
				if (Span[j][0].equals(text)) {
					y = y + Integer.parseInt(Span[j][1]);
					System.out.println(Span[j][0] + "==" + text);
					System.out.println("y in loop : " + y);
					break;
				}
			}

		}
		// Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		scrollDownTime();
		Thread.sleep(2000);
		if (allDays.get(totalcount).getText().equals("")) {
			System.out.println("Entering null box click if block");
			Thread.sleep(2000);
			WebElement clickField = allDays.get(totalcount);
			executor.executeScript("arguments[0].click();", clickField);
		} else {
			System.out.println("Entering Time Edit Else block");
			Thread.sleep(2000);

			int editCount = 0;
			for (int i = 0; i < totalcount; i++) {
				// Thread.sleep(2000);
				if (!allDays.get(i).getText().equals("")) {
					editCount++;
				}
			}

			WebElement editField = timeEdit.get(editCount);

			executor.executeScript("arguments[0].click();", editField);
			Thread.sleep(1000);
			scrollUpTime();
			Thread.sleep(1000);
			dateSelect(dated1);
			Thread.sleep(1000);
			hourSelect(values);
			minuteSelect(values1);
			Thread.sleep(2000);
			addButton();

		}

		System.out.println("Completed");
	}

	@FindBy(xpath = "//td/div/span/i[1]")
	List<WebElement> removeTime;

	@FindBy(xpath="//button[text()='Yes']")
	WebElement yesAlertButton;
	
	@FindBy(xpath="//button[text()='No']")
	WebElement noAlertButton;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement okSuccesspop;
	
	public void removeTimes(String projected, String tasked, String dated, String times) throws InterruptedException {

		String[][] Span = new String[15][2];
		int count = 0;

		for (int i = 0; i < allRowNames1.size(); i++) {
			String text = allRowNames1.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "1";
			count++;
		}

		for (int i = 0; i < allRowNames2.size(); i++) {
			String text = allRowNames2.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "2";
			count++;
		}

		for (int i = 0; i < allRowNames3.size(); i++) {
			String text = allRowNames3.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "3";
			count++;
		}

		for (int i = 0; i < allRowNames4.size(); i++) {
			String text = allRowNames4.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "4";
			count++;
		}

		for (int i = 0; i < allRowNames5.size(); i++) {
			String text = allRowNames5.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "5";
			count++;
		}

		Thread.sleep(1000);

		int daycount = 0;
		for (int i = 0; i < allDate.size(); i++) {

			if (allDate.get(i).getText().contains(dated)) {
				daycount = i;
				System.out.println("TopDaycount : " + daycount);
				break;
			}
		}

		String text;
		int y = 0, x = 0;
		int totalcount = 0;

		for (int i = 0; i < projectNames.size(); i++) {
			text = projectNames.get(i).getText();
			System.out.println(text);
			if (text.contains(projected)) {
				Thread.sleep(1000);
				for (int j = 0; j < count; j++) {
					if (Span[j][0].equals(text)) {
						x = Integer.parseInt(Span[j][1]);
						break;
					}
				}
				Thread.sleep(1000);
				String task;
				for (int j = y; j < y + x; j++) {
					task = allTaskNames.get(j).getText();
					System.out.println(task);
					if (task.equals(tasked)) {
						System.out.println("Y : " + y);
						System.out.println("j : " + j);
						System.out.println("dayCount : " + daycount);
						totalcount = ((j) * 7) + daycount;
						System.out.println("Count : " + totalcount);
						break;
					}
				}

				break;
			}

			for (int j = 0; j < count; j++) {
				if (Span[j][0].equals(text)) {
					y = y + Integer.parseInt(Span[j][1]);
					System.out.println("y in loop : " + y);
					break;
				}
			}

		}
		Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		System.out.println(allDays.get(totalcount).getText());
		System.out.println(times);

		if (allDays.get(totalcount).getText().equals(times)) {
			System.out.println("Entered Remove IF Block");
			// System.out.println(allDays.get(totalcount).getText());
			// System.out.println(times);
			int editCount = 0;
			for (int i = 0; i < totalcount; i++) {
				// Thread.sleep(2000);
				if (!allDays.get(i).getText().equals("")) {
					editCount++;
				}
			}
			WebElement clickField = removeTime.get(editCount);
			Thread.sleep(3000);
			executor.executeScript("arguments[0].click();", clickField);
			Thread.sleep(3000);
			visibilityOfAllElements(yesAlertButton);
			yesAlertButton.click();
			Thread.sleep(3000);
			visibilityOfAllElements(okSuccesspop);
			yesAlertButton.click();
			
			
		} else {
			System.out.println("Time Error");
		}
	}
//Assert verify
	
	public void verifyText(String projected, String tasked, String dated, String times) throws InterruptedException
	{
		Thread.sleep(2000);
		String[][] Span = new String[15][2];
		int count = 0;

		for (int i = 0; i < allRowNames1.size(); i++) {
			String text = allRowNames1.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "1";
			count++;
		}

		for (int i = 0; i < allRowNames2.size(); i++) {
			String text = allRowNames2.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "2";
			count++;
		}

		for (int i = 0; i < allRowNames3.size(); i++) {
			String text = allRowNames3.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "3";
			count++;
		}

		for (int i = 0; i < allRowNames4.size(); i++) {
			String text = allRowNames4.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "4";
			count++;
		}

		for (int i = 0; i < allRowNames5.size(); i++) {
			String text = allRowNames5.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "5";
			count++;
		}

		Thread.sleep(1000);

		int daycount = 0;
		for (int i = 0; i < allDate.size(); i++) {

			if (allDate.get(i).getText().contains(dated)) {
				daycount = i;
				System.out.println("TopDaycount : " + daycount);
				break;
			}
		}

		String text;
		int y = 0, x = 0;
		int totalcount = 0;

		for (int i = 0; i < projectNames.size(); i++) {
			text = projectNames.get(i).getText();
			System.out.println(text);
			if (text.contains(projected)) {
				Thread.sleep(1000);
				for (int j = 0; j < count; j++) {
					if (Span[j][0].equals(text)) {
						x = Integer.parseInt(Span[j][1]);
						assertTrue(true);
						break;
					}
				}
				Thread.sleep(1000);
				String task;
				for (int j = y; j < y + x; j++) {
					task = allTaskNames.get(j).getText();
					System.out.println(task);
					if (task.equals(tasked)) {
						assertTrue(true);
						System.out.println("Y : " + y);
						System.out.println("j : " + j);
						System.out.println("dayCount : " + daycount);
						totalcount = ((j) * 7) + daycount;
						System.out.println("Count : " + totalcount);
						break;
					}
				}

				break;
			}

			for (int j = 0; j < count; j++) {
				if (Span[j][0].equals(text)) {
					y = y + Integer.parseInt(Span[j][1]);
					System.out.println("y in loop : " + y);
					break;
				}
			}

		}
		Thread.sleep(2000);
		System.out.println(allDays.get(totalcount).getText());
		System.out.println(times);

		if (allDays.get(totalcount).getText().equals(times)) {
			assertTrue(true);
			}
			 
		else {
			
			System.out.println("Time not match");
			assertTrue(false);
		}
	
	}
	
	public void newTimeAdd(String projected, String tasked, String dated, String values, String values1)
			throws InterruptedException {
		Thread.sleep(2000);
		String[][] Span = new String[20][2];
		int count = 0;

		for (int i = 0; i < allRowNames1.size(); i++) {
			String text = allRowNames1.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "1";
			count++;
		}

		for (int i = 0; i < allRowNames2.size(); i++) {
			String text = allRowNames2.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "2";
			count++;
		}

		for (int i = 0; i < allRowNames3.size(); i++) {
			String text = allRowNames3.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "3";
			count++;
		}

		for (int i = 0; i < allRowNames4.size(); i++) {
			String text = allRowNames4.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "4";
			count++;
		}

		for (int i = 0; i < allRowNames5.size(); i++) {
			String text = allRowNames5.get(i).getText();
			Span[count][0] = text;
			Span[count][1] = "5";
			count++;
		}

		Thread.sleep(1000);

		for (int i = 0; i < count; i++) {
			System.out.println(Span[i][0] + "\t" + Span[i][1]);
		}

		int daycount = 0;
		for (int i = 0; i < allDate.size(); i++) {

			if (allDate.get(i).getText().contains(dated)) {
				daycount = i;
				System.out.println("TopDaycount : " + daycount);
				break;
			}
		}

		String text;
		int y = 0, x = 0;
		int totalcount = 0;

		for (int i = 0; i < projectNames.size(); i++) {
			text = projectNames.get(i).getText();
			 System.out.println(text +"\t Projected : "+ projected);
			if (text.contains(projected)) {
				for (int j = 0; j < count; j++) {
					if (Span[j][0].equals(text)) {
						x = Integer.parseInt(Span[j][1]);
						break;
					}
				}
				String task;
				for (int j = y; j < y + x; j++) {
					task = allTaskNames.get(j).getText();
					System.out.println("Task" + task + "\nCount : " + task.length());
					System.out.println("Tasked" + tasked + "\nCount : " + tasked.length());
					if (task.equals(tasked)) {
						System.out.println("Y : " + y);
						System.out.println("j : " + j);
						System.out.println("dayCount : " + daycount);
						totalcount = ((j) * 7) + daycount;
						System.out.println("Count : " + totalcount);
						break;
					}
				}
				break;
			}

			for (int j = 0; j < count; j++) {
				if (Span[j][0].equals(text)) {
					y = y + Integer.parseInt(Span[j][1]);
					System.out.println(Span[j][0] + "==" + text);
					System.out.println("y in loop : " + y);
					break;
				}
			}

		}
		// Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		scrollDownTime();
		Thread.sleep(2000);
		if (allDays.get(totalcount).getText().equals("")) {
			System.out.println("Entering null box click if block");
			Thread.sleep(2000);
			WebElement clickField = allDays.get(totalcount);
			executor.executeScript("arguments[0].click();", clickField);
			Thread.sleep(1000);
			scrollUpTime();
			Thread.sleep(2000);
			hourSelect(values);
			Thread.sleep(2000);
			minuteSelect(values1);
			Thread.sleep(2000);
			addButton();
		} else {
			System.out.println("Entering Time Edit Else block");
			Thread.sleep(2000);

			int editCount = 0;
			for (int i = 0; i < totalcount; i++) {
				// Thread.sleep(2000);
				if (!allDays.get(i).getText().equals("")) {
					editCount++;
				}
			}

			WebElement editField = timeEdit.get(editCount);
			executor.executeScript("arguments[0].click();", editField);
		}

		System.out.println("Completed");
	}

	
	
}
