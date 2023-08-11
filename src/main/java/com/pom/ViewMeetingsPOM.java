package com.pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.abst.Reusable;

public class ViewMeetingsPOM extends Reusable {

	WebDriver driver;

	public ViewMeetingsPOM(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	
	public void scrollUp() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}
	
	@FindBy(xpath="//img[@class='lefticon']")
	WebElement leftArrow;
	
	@FindBy(xpath="//img[@class='righticon']")
	WebElement rightArrow;
	
	
	public void viewDay(String newDate) throws InterruptedException
	{
	Thread.sleep(3000);
	int gd =Integer.parseInt(newDate);	
	String text = driver.findElement(By.xpath("//label[@class='tdate']")).getText();
	String date1 = text.split(",")[1];
	String date2 = date1.substring(Math.max(date1.length() - 2, 0));
	String date3 = date2.trim();
	System.out.println("date format " +date3);
	int ed =Integer.parseInt(date3);
	int dd = gd-ed;
	int flag=1;
	if(dd<0)
	{
		flag =0;
		dd = -1 * dd;
	}
	
	for(int i=0;i<dd;i++)
	{
		if(flag==0)
		{
			Thread.sleep(1000);
			leftArrow.click();
		}
		else
		{
			Thread.sleep(1000);
			rightArrow.click();
		}
	}
	
	}
	
	@FindBy(xpath="//div //div[@class='cal-event']")
	List<WebElement> allCalendarName; 
	
	
	public void meetingCheck(String number,String meetingNames ) throws InterruptedException
	{
		Thread.sleep(2000);
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		
		//int num = 7;
		
		int num = Integer.parseInt(number);
		
		if(num>=2)
		{
			eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 0");
		}
		
		if(num>=6)
		{
			eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 150");
		}
		if(num>=10)
		{
			eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 400");
		}
		if(num>=14)
		{
			eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 650");
		}
		if(num>=18)
		{
			eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 900");
		}
		if(num>=23)
		{
			eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 1150");
		}
	
	//	String meetingNames ="7:30 PM Contract Breach - Creating legal briefs";
		
		Thread.sleep(1000);
		
		for (int i = 0; i < allCalendarName.size(); i++) {
			String	allCalendarTextName = allCalendarName.get(i).getText();
			Thread.sleep(1000);
			//System.out.println("All Group Name Text "+allCalendarTextName);
			if(meetingNames.equals(allCalendarTextName))
			{
				Thread.sleep(2000);
				WebElement clickOnMeeting = allCalendarName.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", clickOnMeeting);
			}
			
		}
		
	}
	
	//--------------------------------------------------------------------------------------------------------
	
	// Assert Validation
	
	//Meeting name assert
	@FindBy(xpath="//div //p[@class='casestudy1']")
	WebElement matterNameText;
	
	public void assertMeetingName(String actual)
	{
		//String actual ="Legal Case 5 - Creating legal briefs";
		String expMatterName = matterNameText.getText();
		assertEquals(actual, expMatterName);
	}
	
	// Month and Time verify
	@FindBy(xpath="//div //p[@class='monthtitle']")
	WebElement monthTimeText;
	
	public void assertMonthandTime(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		String text = monthTimeText.getText();
		String[] name2 = text.split("Fri");
		System.out.println("name"+name2[1]);
		Thread.sleep(2000);
		assertEquals(name, name2[1]);
	}
	
	
	
	
	
	//Meeting Agenda
	@FindBy(xpath="//div[@class='col-sm-7'] //p[1]")
	WebElement meetingAgendaText;
	
	public void assertMeetingAgenda(String actMeetingAgenda)
	{
		
		//String actMeetingAgenda ="Join the call";
				
		String expMeetingAgenda = meetingAgendaText.getText();
				
		assertEquals(actMeetingAgenda, expMeetingAgenda);
	}
	
	//Meeting Link
	@FindBy(xpath="(//div //p[@class='meetingitem itemFlex'])[1]")
	WebElement meetingLinkText;
	
	public void assertMeetingLink(String actMeetinglink)
	{
		//String actMeetinglink ="https:///zoom.com";
		String expMeetinglink = meetingLinkText.getText();
		
		assertEquals(actMeetinglink, expMeetinglink);
	}
	
	//Phone number
	@FindBy(xpath="(//div //p[@class='meetingitem itemFlex'])[2]")
	WebElement phoneNumberText;
	
	public void assertPhoneNumber(String actNumber)
	{
		//String actNumber ="9876543210";
		String expNumber = phoneNumberText.getText();
		assertEquals(actNumber, expNumber);
	}
	
	//Document
	@FindBy(xpath="//div[@class='documentbox']//p")
	List<WebElement> documentText;
	
	public void assertDocuments(String names) throws InterruptedException
	{		
			Thread.sleep(2000);
			boolean nameDocumentMatched = documentText.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
			assertTrue(nameDocumentMatched);
	}
	
	//Team Member
	@FindBy(xpath="(//div[@class='col-xs-12 col-sm-6'])[1] //label[@class='usernamelist']")
	List<WebElement> teamMemberNameSelected;
	
	public void assertTeamMember(String names) throws InterruptedException
	{		
			Thread.sleep(2000);
			boolean nameTeamMatched = teamMemberNameSelected.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
			assertTrue(nameTeamMatched);
	}
	
	// Entity and Individuals
	@FindBy(xpath="(//div[@class='col-xs-12 col-sm-6'])[2] //label[2]")
	List<WebElement> entityandIndividualSelected;
	
	public void assertEntityandIndividual(String names) throws InterruptedException
	{		
			Thread.sleep(2000);
			boolean nameMatched = entityandIndividualSelected.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
			assertTrue(nameMatched);
	}
	
	
	
	
	
	
	
	
}
	
	


