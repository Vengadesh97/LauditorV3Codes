package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;


public class Sample extends BaseClass {
	
	
	@Test(dataProvider = "getData0", priority = 0)
	public void clientsIndividuals(HashMap<String, String> input) throws InterruptedException {
		
			
				
					try {
						createMatter.leftMatterTab();
						createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
						// Select Groups
						Thread.sleep(1000);
						String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
						createMatter.selecting(groupNames);
						String[] clientNamesIndividuals = { input.get("individualsClientName1"),
								input.get("individualsClientName2") };
						createMatter.selecting(clientNamesIndividuals);
						createMatter.nextPage();
						createMatter.nextPage();
						createMatter.alertPopupYes();
						createMatter.addMatterSuccess();
					} finally {
						createMatter.leftMatterTab();
					}
				
				
	
	}
	
	@Test(dataProvider = "getData1", priority = 1)
	public void clientsIndividualsWithTeamMembers(HashMap<String, String> input) throws InterruptedException {

		
			try {
				createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
				String[] groupNames = { input.get("groupName1"), input.get("groupName2") };
				Thread.sleep(1000);
				createMatter.selecting(groupNames);
				String[] clientNamesIndividuals = { input.get("individualsClientName1"),
						input.get("individualsClientName2") };
				createMatter.selecting(clientNamesIndividuals);
				String[] teamMemberNames = { input.get("memberName1"), input.get("memberName2") };
				createMatter.selecting(teamMemberNames);
				createMatter.nextPage();
				createMatter.alertPopupYes();
				createMatter.addMatterSuccess();
			} finally {
				createMatter.leftMatterTab();
			}
			
	}

	// MandatoryFieldswithGroupsandClientsIndividualsWithTMandDocuments
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(0) } };

	}
	
	// MandatoryFieldswithGroupsandClientsIndividualsWithTMandDocuments
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\MatterModulesData.json");

		return new Object[][] { { data.get(1) } };

	}
	
}
