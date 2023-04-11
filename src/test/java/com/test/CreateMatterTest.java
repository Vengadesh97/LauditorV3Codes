package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class CreateMatterTest extends BaseClass {

	@Test(dataProvider = "getData")
	public void MandatoryFieldSelectNames(HashMap<String, String> input) throws InterruptedException {
		createMatter.leftMatterTab();
		createMatter.createMatter(input.get("caseTitle"), input.get("caseNumber"));
		Thread.sleep(2000);
		String[] groupNames = {input.get("groupName1"), input.get("groupName2"), input.get("groupName3")};
		Thread.sleep(2000);
		createMatter.selecting(groupNames);
		String[] clientNames = {input.get("clientName1"), input.get("clientName2"), input.get("clientName3")};
		createMatter.selecting1(clientNames);
		Thread.sleep(2000);
		String[] memberNames = {input.get("memberName1"), input.get("memberName2")};
		createMatter.selecting(memberNames);
		String[] documentNames = {input.get("documentName1"), input.get("documentName2"), input.get("documentName3")};
		createMatter.selecting1(documentNames);
		Thread.sleep(2000);
		createMatter.documentPageSaveandSuccessPopup();
		//createMatter.documentPageSave();
//		Thread.sleep(2000);
//		createMatter.alertPopupYes();
//		Thread.sleep(2000);
//		createMatter.viewMatterListSuccess();
	}

	
	@Test(enabled=false)
	public void MandatoryFieldSelectNames() throws InterruptedException {
		createMatter.leftMatterTab();
		createMatter.createMatterAllFieldEnter("Custody Case","F342","Individuals","Madras High Court","Mukesh"," 7 ", "Medium", "Legal Summary Case New", "Rajesh","Rajesh@yh.com","7474141411");
	//	createMatter.createMatter("Criminal Custody Case Filling 1","N987");
		String[] groupNames = {"Group Modules Test","Corporative Law","Common Law"};
		createMatter.selecting(groupNames);
		String[] clientNames = {"Mani R","Vengadesh R","Vengadesh RSB Firm"};
		createMatter.selecting(clientNames);
		String[] memberNames = {"Susan","Karthick RSB TM"};
		createMatter.selecting(memberNames);
		String[] documentNames = {"DevOps_running-containerized-microservices-on-aws","Spell check the hint name (1) fgr","TM Firm PnG Files"};
		createMatter.selecting(documentNames);
		createMatter.documentPageSaveandSuccessPopup();
	}

	
	
	//
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\CreateMatterData.json");

		return new Object[][] { { data.get(0) } };

		// return new Object[][] { { data.get(0) }, { data.get(1) } };
	}

}
