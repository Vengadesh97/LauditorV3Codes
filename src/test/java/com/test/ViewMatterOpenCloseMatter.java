package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class ViewMatterOpenCloseMatter extends BaseClass {

	// CloseMatterwithCancelTest
	@Test(dataProvider = "getData0", priority = 0)
	public void closeMatterwithCancelTest(HashMap<String, String> input) throws InterruptedException {

	
			try {
				viewMatters.leftMatterTab();
				viewMatters.searchBarFieldsandActionBtn(input.get("MatterName"));
				viewMatterOpenCloseMatter.closeMatterWithCancel();
			} finally {
				viewMatters.leftMatterTab();
			}

	}

	// CloseMattersTest
	@Test(dataProvider = "getData0", priority = 1)
	public void closeMattersTest(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("MatterName"));
			viewMatterOpenCloseMatter.closeMatter();
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// ReOpenMatterwithCancelTest
	@Test(dataProvider = "getData0", priority = 2)
	public void reOpenMatterwithCancelTest(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("MatterName"));
			viewMatterOpenCloseMatter.reOpenMatterWithCancel();
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// ReOpenMatterTest
	@Test(dataProvider = "getData0", priority = 3)
	public void reOpenMatterTest(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("MatterName"));
			viewMatterOpenCloseMatter.reOpenMatter();
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	// closeMatterwithCancelTest
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterOpenCloseMatterData.json");

		return new Object[][] { { data.get(0) } };

	}
	
	
	/*
	 * 
	 * // closeMattersTest
	 * 
	 * @DataProvider public Object[][] getData1() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterOpenCloseMatterData.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(0) } };
	 * 
	 * }
	 * 
	 * // reOpenMatterwithCancelTest
	 * 
	 * @DataProvider public Object[][] getData2() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterOpenCloseMatterData.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(0) } };
	 * 
	 * }
	 * 
	 * // reOpenMatterTest
	 * 
	 * @DataProvider public Object[][] getData3() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterOpenCloseMatterData.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(0) } };
	 * 
	 * }
	 */
}
