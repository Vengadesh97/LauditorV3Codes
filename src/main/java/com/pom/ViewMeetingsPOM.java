package com.pom;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;

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
	
	@FindBy(xpath="//div //a[text()='Month']")
	WebElement monthbtn;
	
	public void monthTab()
	{
		visibilityOfAllElements(monthbtn);
		monthbtn.click();
	}
	
	@FindBy(xpath="//img[@class='lefticon']")
	WebElement leftArrow;
	
	@FindBy(xpath="//img[@class='righticon']")
	WebElement rightArrow;
	
	public static String dateTrim(String text)
	{
		String string = text.split(",")[1].substring(1)+","+text.split(",")[2];
		return string;
	}
	
	public static LocalDate dateParse(String text)
	{
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
	        LocalDate date = LocalDate.parse(text, formatter);
	        return date;
	}
	
	public void viewDay(String string) throws InterruptedException
	{
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//label[@class='tdate']")).getText();
		LocalDate date = dateParse(dateTrim(text));
		LocalDate date1 = dateParse(string);

		long diff = ChronoUnit.DAYS.between(date, date1);
		int flag=1;
		int dd=(int) diff;
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
	
	// All days Meeting
	
	@FindBy(xpath="//div[@class='cal-all-day-events'] //div[@class='cal-event']")
	List<WebElement>  allDayMeetingNames;
	
	public void alldaysMeetingCheck(String number,String names) throws InterruptedException
	{
		Thread.sleep(2000);
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		
		//int num = 7;
		
		int num = Integer.parseInt(number);
		
		if(num>=2)
		{
			eventFiringWebDriver.executeScript("document.querySelector('.mainmargin.scroll-container').scrollTop = 0");
		}
		
		// all day meeting name select
		
		//String names ="Legal Case 5 - Hearing";
		Thread.sleep(2000);
		for(int i=0;i<allDayMeetingNames.size();i++)
		{
			String text = allDayMeetingNames.get(i).getText();
			System.out.println("All meeting names "+text);
			if(names.equals(text))
			{
				WebElement clickOnMeeting = allDayMeetingNames.get(i);
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
		if(!actual.equals(""))
		{
		//String actual ="Legal Case 5 - Creating legal briefs";
		String expMatterName = matterNameText.getText();
		assertEquals(actual, expMatterName);
	}
	}
	
	// Month and Time verify
	@FindBy(xpath="//div //p[@class='monthtitle']")
	WebElement monthTimeText;
	
	public void assertMonthandTime(String name) throws InterruptedException
	{
		if(!name.equals(""))
		{
			String monthIndex[]= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			Thread.sleep(2000);
			//String [] name1 = {"Sun","Mon","","","","",""};
			String text = monthTimeText.getText();
			String substring = text.substring(4);
			System.out.println("name"+substring);
			Thread.sleep(2000);
			assertEquals(name, substring);
		}
	}
	
	public void assertMonthandTime1(String date, int month, String year,String name) throws InterruptedException
	{
		if(!name.equals(""))
		{
			String monthIndex[]= {"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			String name1 = monthIndex[month]+" "+date+" "+year+name;
			Thread.sleep(2000);
			//String [] name1 = {"Sun","Mon","","","","",""};
			String text = monthTimeText.getText();
			String substring = text.substring(4);
			System.out.println("name"+substring);
			Thread.sleep(2000);
			assertEquals(name1, substring);
	}
	}
	
	//Meeting Agenda
	@FindBy(xpath="//div[@class='col-sm-7'] //p[1]")
	WebElement meetingAgendaText;
	
	public void assertMeetingAgenda(String actMeetingAgenda)
	{
		if(!actMeetingAgenda.equals(""))
		{
			String expMeetingAgenda = meetingAgendaText.getText();
			assertEquals(actMeetingAgenda, expMeetingAgenda);
		}
		//String actMeetingAgenda ="Join the call";
				
		
	}
	
	//Meeting Link
	@FindBy(xpath="(//div //p[@class='meetingitem itemFlex'])[1]")
	WebElement meetingLinkText;
	
	public void assertMeetingLink(String actMeetinglink)
	{
		if(!actMeetinglink.equals(""))
		{
		//String actMeetinglink ="https:///zoom.com";
		String expMeetinglink = meetingLinkText.getText();	
		assertEquals(actMeetinglink, expMeetinglink);
	}
	}
	
	//Phone number
	@FindBy(xpath="(//div //p[@class='meetingitem itemFlex'])[2]")
	WebElement phoneNumberText;
	
	public void assertPhoneNumber(String actNumber)
	{
		if(!actNumber.equals(""))
		{
		//String actNumber ="9876543210";
		String expNumber = phoneNumberText.getText();
		assertEquals(actNumber, expNumber);
	}
	}
	//Document
	@FindBy(xpath="//div[@class='documentbox']//p")
	List<WebElement> documentText;
	
	public void assertDocuments(String names) throws InterruptedException
	{		
		if(!names.equals(""))
		{
			Thread.sleep(2000);
			boolean nameDocumentMatched = documentText.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
			assertTrue(nameDocumentMatched);
	}
	}
	
	//Team Member
	@FindBy(xpath="(//div[2]) //label[2]")
	List<WebElement> teamMemberNameSelected;
	
	public void assertTeamMember(String names) throws InterruptedException
	{		
		if(!names.equals(""))
		{
			Thread.sleep(2000);
			boolean nameTeamMatched = teamMemberNameSelected.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
			assertTrue(nameTeamMatched);
	}}
	
	// Entity and Individuals
	@FindBy(xpath="(//div[2]) //label[2]")
	List<WebElement> entityandIndividualSelected;
	
	public void assertEntityandIndividual(String names) throws InterruptedException
	{		
		if(!names.equals(""))
		{
			Thread.sleep(2000);
			boolean nameMatched = entityandIndividualSelected.stream().anyMatch(selectedAllName-> selectedAllName.getText().equalsIgnoreCase(names));
			assertTrue(nameMatched);
	}}

	
	//---------------------------------------------------------------------------
	
	//Month 
	
	//Daily 
	
	
	@FindBy(xpath="//div[@role='row'] //span[@class='cal-day-number']")
	List<WebElement> listOfallDateName;
	
	@FindBy(xpath="//div[@role='row'] //td")
	List<WebElement> allCells;
	
	@FindBy(xpath="//td //span //label[@class='lbltime']")
	List<WebElement> allmeetingLabelText;
		
	// Daily , Week , Bi-Weekly
	public void reptitionTextVerify1(String day1,String year1,String month1,String repeat1,String nameVerify,String meetName,String monthTime,String meetingAgen,String meetingLink,String PhoneNum,String Docum,String TM,String EntityFirm,String EntityMemb,String Individual) throws InterruptedException
	{

		int dateOneLoc;
		//int day = 3; int year = 2023; int month = 8,repeat=1;
		int monthDayCount;
		
		int day =Integer.parseInt(day1);
		int year =Integer.parseInt(year1);
		int month =Integer.parseInt(month1);
		int cmonth = month;
		int rpt =Integer.parseInt(repeat1);
		int repeatCount[]= {1,7,14};
		int repeat;
		
		
		
		if(rpt<3) //Daily, Weekly, BiWeek
		{
			repeat = repeatCount[rpt];
			int week = 0, vCount=0;
			for (int j=0; j<1; j++)
			{
				int i,timeLabelCount = 0;
				//Finding total days of the month provided
				YearMonth ym = YearMonth.of(year,month);
				monthDayCount = ym.lengthOfMonth();
			    System.out.println("Month : "+month+"\tmonthDayCount : "+monthDayCount); 
			    
				// Day one count
				// dateOneLoc--> Cell Location of day 1 of current month
				dateOneLoc = findDateOneLoc(listOfallDateName);
				Thread.sleep(2000);
				int monthStart = dateOneLoc;
				monthStart = (j==0) ? (dateOneLoc+day-1) : monthStart+week;
				
			//	System.out.println("Week : "+week+" MonthStart : "+monthStart);
				
				for(i=0; i<(dateOneLoc+monthDayCount);i++)
				{
					if(i==monthStart)
					{
						String[] oneCell = allCells.get(i).getText().split("[\\r\\n]+");
						//r --> split with enter
					//	System.out.println("Date "+oneCell[0]);
			
						int flag = 0;
						for(int k = 0; k<oneCell.length;k++)
						{
							String a = oneCell[k];
							//System.out.println("a : "+a+" nameVerify : "+nameVerify);
							//11:30 AM Legal Case 5 - Case filling
							if(a.equals(nameVerify))
							{
								//System.out.println("Matched :  "+a);
								flag = 1;
								if(vCount<7)
								{
								//	System.out.println("Matched :  "+a+" vCount : "+vCount+"k: "+k+"TimeLoc : "+(timeLabelCount+k-1));
									Thread.sleep(2000);
									WebElement clickOnMeeting = allmeetingLabelText.get(timeLabelCount+k-1);
									JavascriptExecutor executor = (JavascriptExecutor) driver;
									executor.executeScript("arguments[0].click();", clickOnMeeting);
									Thread.sleep(2000);
									scrollUp();
									Thread.sleep(2000);
									assertMeetingName(meetName);
									assertMonthandTime1(day1,month,year1,monthTime);
									assertMeetingAgenda(meetingAgen);
									assertMeetingLink(meetingLink);
								    assertPhoneNumber(PhoneNum);
									assertDocuments(Docum);
									assertTeamMember(TM);
									assertEntityandIndividual(EntityFirm);
									assertEntityandIndividual(EntityMemb);
									assertEntityandIndividual(Individual);
									Thread.sleep(2000);
									driver.navigate().back();
									Thread.sleep(4000);
									for(int z = cmonth;z<month;z++)
									{
										rightArrow.click();
										Thread.sleep(4000);
									}
									
								}
							
							}
						}
						if(flag==0)
						{
							System.out.println("flag is  "+flag);
							//assertion fail
							assertFalse(true);
						}
						
						
						if((i+repeat)<(dateOneLoc+monthDayCount))
						{
							monthStart = i + repeat;
						//	System.out.println("i = "+i+" repeat = "+ monthStart);
						}
						else
						{
							week = i+repeat-(dateOneLoc+monthDayCount);
						}
						vCount++;	
						
					}
					
					String[] cellOne = allCells.get(i).getText().split("[\\r\\n]+");
			//		System.out.println("x = "+i+"Data : " + allCells.get(i).getText() + "Length : "+ cellOne.length);
					timeLabelCount =timeLabelCount + (cellOne.length-1);
			//		System.out.println("Cell : "+i+"Length : "+ cellOne.length + "Total Count : "+timeLabelCount);
						
				}
				
			//	System.out.println("week : "+week);
				rightArrow.click();
				month = month +1;
				Thread.sleep(5000);
				if(month==13)
				{
					year++;
					month = 1;
				}
			}	
		}
		else // Month, year
		{
			
		}
	
	}
	
	// Daily , Week , Bi-Weekly
	public void reptitionTextVerify2(String day1,String year1,String month1,String repeat1,String nameVerify,String meetName,String monthTime,String meetingAgen,String meetingLink,String PhoneNum,String Docum,String TM,String EntityFirm,String EntityMemb,String Individual) throws InterruptedException
	{

		int dateOneLoc;
		//int day = 3; int year = 2023; int month = 8,repeat=1;
		int monthDayCount;
		int day =Integer.parseInt(day1);
		int year =Integer.parseInt(year1);
		int month =Integer.parseInt(month1);
		int cmonth = month;
		int rpt =Integer.parseInt(repeat1);
		int repeatCount[]= {1,7,14};
		int repeat;	
		int week = 0, vCount=0;
		int monthLoop = (rpt<4)?1:12;
		int monthInc= (rpt<4)?1:0;
		int yearInc= (rpt<4)?0:1;
		
		for (int j=0; j<2; j++)
		{
			int i,timeLabelCount = 0;
			//Finding total days of the month provided
			YearMonth ym = YearMonth.of(year,month);
			monthDayCount = ym.lengthOfMonth();
		    System.out.println("Month : "+month+"\tmonthDayCount : "+monthDayCount); 
		    if((rpt>2) && (day>monthDayCount))
			{
		    	for(int l = 0; l<monthLoop;l++)
				{
					rightArrow.click();
					Thread.sleep(2000);
				}
					month = month +monthInc;
					year = year + yearInc;
					if(month==13)
					{
						year++;
						month = 1;
					}
		    	continue;
			}
		    
			// Day one count
			// dateOneLoc--> Cell Location of day 1 of current month
			dateOneLoc = findDateOneLoc(listOfallDateName);
			Thread.sleep(2000);
			int monthStart = dateOneLoc;
			monthStart = (j==0) ? (dateOneLoc+day-1) : monthStart+week;
			
		//	System.out.println("Week : "+week+" MonthStart : "+monthStart);
			
			for(i=0; i<(dateOneLoc+monthDayCount);i++)
			{
				if(i==monthStart)
				{
					String[] oneCell = allCells.get(i).getText().split("[\\r\\n]+");
					//r --> split with enter
				//	System.out.println("Date "+oneCell[0]);
		
					int flag = 0;
					for(int k = 0; k<oneCell.length;k++)
					{
						String a = oneCell[k];
						//System.out.println("a : "+a+" nameVerify : "+nameVerify);
						//11:30 AM Legal Case 5 - Case filling
						if(a.equals(nameVerify))
						{
							//System.out.println("Matched :  "+a);
							flag = 1;
							if(vCount<7)
							{
							//	System.out.println("Matched :  "+a+" vCount : "+vCount+"k: "+k+"TimeLoc : "+(timeLabelCount+k-1));
								Thread.sleep(2000);
								WebElement clickOnMeeting = allmeetingLabelText.get(timeLabelCount+k-1);
								JavascriptExecutor executor = (JavascriptExecutor) driver;
								executor.executeScript("arguments[0].click();", clickOnMeeting);
								Thread.sleep(2000);
								scrollUp();
								Thread.sleep(2000);
								assertMeetingName(meetName);
								assertMonthandTime1(day1,month,year1,monthTime);
								assertMeetingAgenda(meetingAgen);
								assertMeetingLink(meetingLink);
							    assertPhoneNumber(PhoneNum);
								assertDocuments(Docum);
								assertTeamMember(TM);
								assertEntityandIndividual(EntityFirm);
								assertEntityandIndividual(EntityMemb);
								assertEntityandIndividual(Individual);
								Thread.sleep(2000);
								driver.navigate().back();
								Thread.sleep(4000);
								for(int z = cmonth;z<month;z++)
								{
									rightArrow.click();
									Thread.sleep(4000);
								}
								
							}
						break;
						}
					}
						if(flag==0)
						{
							System.out.println("flag is  "+flag);
							//assertion fail
							assertFalse(true);
						}
						vCount++;
						if(rpt<3) //Daily, Weekly, BiWeek
						{
							repeat = repeatCount[rpt];
							if((i+repeat)<(dateOneLoc+monthDayCount))
							{
								monthStart = i + repeat;
							//	System.out.println("i = "+i+" repeat = "+ monthStart);
							}
							else
							{
								week = i+repeat-(dateOneLoc+monthDayCount);
								break;
							}
						}
						
						else // Monthly & Yearly
						{
							week = day -1;
							break;
						}
					}
						
						String[] cellOne = allCells.get(i).getText().split("[\\r\\n]+");
				//		System.out.println("x = "+i+"Data : " + allCells.get(i).getText() + "Length : "+ cellOne.length);
						timeLabelCount =timeLabelCount + (cellOne.length-1);
				//		System.out.println("Cell : "+i+"Length : "+ cellOne.length + "Total Count : "+timeLabelCount);
							
					}
				
			//	System.out.println("week : "+week);
			
			for(int l = 0; l<monthLoop;l++)
			{
				rightArrow.click();
				Thread.sleep(2000);
			}
				month = month +monthInc;
				year = year + yearInc;
				Thread.sleep(5000);
				if(month==13)
				{
					year++;
					month = 1;
				}
			}	
	
	}
	
	
	
	
	public int findDateOneLoc(List<WebElement> allDates) {

	int temp = 36;
	// Date one Found
	for (int i = 0; i < allDates.size(); i++) {
		if (allDates.get(i).getText().equals("1")) {
			System.out.println("location of 1 : " + i);
			temp = i;
			break;
		}
	}
	return temp;
}
	
	
	
	
	

	
	
}

