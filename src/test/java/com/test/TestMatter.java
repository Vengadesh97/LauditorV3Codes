package com.test;


import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestMatter extends BaseClass{

	
	@Test(enabled=false)
	public void resourced() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Meetings']")).click();

		Thread.sleep(2000);
		
		String meetingNames ="1:15 PM Legal Case 5 - Creating legal briefs";
		
		List<WebElement> allCalendarName = driver.findElements(By.xpath("//div //div[@class='cal-event']"));
		
		for (int i = 0; i < allCalendarName.size(); i++) {
			Thread.sleep(5000);
			String	allCalendarTextName = allCalendarName.get(i).getText();
			Thread.sleep(5000);
			System.out.println("All Group Name Text "+allCalendarTextName);
			if(meetingNames.equals(allCalendarTextName))
			{
				Thread.sleep(5000);
				WebElement clickOnMeeting = allCalendarName.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				Thread.sleep(5000);
				executor.executeScript("arguments[0].click();", clickOnMeeting);
				assertTrue(true);
			}
			
		}
		/*
		Thread.sleep(2000);
		//Matter Name Match
		String actual ="Legal Case 5 - Creating legal briefs";
		
		String expMatterName = driver.findElement(By.xpath("//div //p[@class='casestudy1']")).getText();
		
		assertEquals(actual, expMatterName);
		
		//Document name match
		
		String actDocumName ="FileTime1254";
		
		String expDocumName = driver.findElement(By.xpath("//div[@class='documentbox']//p")).getText();
		
		assertEquals(actDocumName, expDocumName);
		
		// Meeting Agenda
		
		String actMeetingAgenda ="Join the call";
		
		String expMeetingAgenda = driver.findElement(By.xpath("//div[@class='col-sm-7'] //p[1]")).getText();
		
		assertEquals(actMeetingAgenda, expMeetingAgenda);
		
		//Meeting link
		
		String actMeetinglink ="https:///zoom.com";
		String expMeetinglink = driver.findElement(By.xpath("(//div //p[@class='meetingitem itemFlex'])[1]")).getText();
		
		assertEquals(actMeetinglink, expMeetinglink);
		
		//phone number
		
		String actNumber ="9876543210";
		String expNumber = driver.findElement(By.xpath("(//div //p[@class='meetingitem itemFlex'])[2]")).getText();
		
		assertEquals(actNumber, expNumber);
	/*
		//
		Thread.sleep(2000);
		String names ="Donald Carpenter";
		
		List<WebElement> teamMemberNameSelected = driver.findElements(By.xpath("(//div[@class='col-xs-12 col-sm-6'])[1] //label[@class='usernamelist']"));

			Thread.sleep(2000);
			boolean anyMatch = teamMemberNameSelected.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
			Assert.assertTrue(anyMatch);
		*/
		}
		
	@Test()
	public void textVerify() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Meetings']")).click();

		Thread.sleep(2000);
		
		String meetingNames ="3:00 PM Legal Case 5 - Creating legal briefs";
		
		List<WebElement> allMeeetingNames = driver.findElements(By.xpath("//div[@class='cal-event']"));
		
		for (int i = 0; i < allMeeetingNames.size(); i++) {
			Thread.sleep(5000);
			String text = allMeeetingNames.get(i).getText();
			Thread.sleep(5000);
			System.out.println("All Group Name Text "+text);
			if(meetingNames.equals(text))
			{
				Thread.sleep(5000);
				WebElement clickOnMeeting = allMeeetingNames.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				Thread.sleep(5000);
				executor.executeScript("arguments[0].click();", clickOnMeeting);
				//assertTrue(true);
			}
			
		}
	}
	
	
	
	
	
	
	}
	




	
	
	

