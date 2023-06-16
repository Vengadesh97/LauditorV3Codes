package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class ViewMatterDeleteMatterTest extends BaseClass {

	
	// DeleteMatterCancelTest
	@Test(dataProvider = "getData0", priority = 0)
	public void deleteMatterCancelTest(HashMap<String, String> input) throws InterruptedException
	{
		viewMatters.leftMatterTab();
		viewMatters.searchBarFieldsandActionBtn(input.get("MatterName"));
		viewMatterDeleteMatter.deleteMatterCancelBtn();
	}
	
	// DeleteMatterTest
	@Test(dataProvider = "getData1", priority = 1)
	public void deleteMatterTest(HashMap<String, String> input) throws InterruptedException
	{
		viewMatters.searchBarFieldsandActionBtn(input.get("MatterName"));
		viewMatterDeleteMatter.deleteMatter();
	}
	

	// DeleteMatterCancelTest
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterDeleteMatterData.json");

		return new Object[][] { { data.get(0)} };

	}
	

	// DeleteMatterTest
	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterDeleteMatterData.json");

		return new Object[][] { { data.get(1)}};

	}
	
	
	
	
}
