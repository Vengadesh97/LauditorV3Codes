package com.test;


import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestMatter extends BaseClass{

	@Test
	public void allDays() throws InterruptedException
	{
		Thread.sleep(2000);
		//Left side
		driver.findElement(By.xpath("//span[text()='Meetings']")).click();
		
		//Scroll up
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)");
		
		Thread.sleep(3000);
		
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 0");
		
		Thread.sleep(3000);
		List<WebElement>  allMeetingNames= driver.findElements(By.xpath("//div[@class='cal-all-day-events'] //div[@class='cal-event']"));
	
		String names ="Legal Case 5 - Hearing";
		
		for(int i=0;i<allMeetingNames.size();i++)
		{
			String text = allMeetingNames.get(i).getText();
			System.out.println("All meeting names "+text);
			if(names.equals(text))
			{
				WebElement clickOnMeeting = allMeetingNames.get(i);
				
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", clickOnMeeting);
			}
			
		}
	
	}
	
	
	
	
	}
	




	
	
	

