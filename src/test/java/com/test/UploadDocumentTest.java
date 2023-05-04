package com.test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class UploadDocumentTest extends BaseClass{

	@Test(dataProvider = "getData")
	public void uploadDocumentWithEdit(HashMap<String, String> input) throws InterruptedException, AWTException
	{
		uploadDocuments.leftsideDocument();
		Thread.sleep(2000);
		Integer[] intArray1 = new Integer[] { 0, 2,3 };
		Thread.sleep(4000);
		String path ="C:\\Users\\Vengadesh\\Documents\\Image";
		Thread.sleep(4000);
		uploadDocuments.uploadDocumentWithEdit(input.get("ClientName"),path, intArray1,input.get("DocumentName"),input.get("Description"),input.get("DocumentName1"),input.get("Description1"),input.get("DocumentName2"),input.get("Description2"),input.get("DocumentName3"),input.get("Description3"));
	}
	
	
	// uploadDocumentWithEdit
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Document\\uploadDocumentWithEditData.json");

		return new Object[][] { { data.get(0) } };

	}
	
}
