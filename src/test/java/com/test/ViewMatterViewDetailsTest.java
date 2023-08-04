package com.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class ViewMatterViewDetailsTest extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void meetingNameAppearOrNot(HashMap<String, String> input) throws InterruptedException {
		try {
			viewMatters.leftMatterTab();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.scrolldownMatter();
			Thread.sleep(2000);
			viewMatterViewDetail.checkMeetingNameAppear(input.get("meetingName"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData1", priority = 1, enabled = false)
	public void descriptionTextinViewDetails(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewMatterViewDetail.scrolldownMatter();
			Thread.sleep(2000);
			viewMatterViewDetail.viewDetailsleftSide();
			viewMatterViewDetail.meetingEditBtn();
			viewMatterViewDetail.descriptionBox(input.get("descpText"));
			viewMatterViewDetail.saveButton();
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData2", priority = 2)
	public void documentNameCheckingOnDocuments(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.documentNameDisplayorNot(input.get("documentName"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData3", priority = 3)
	public void documentRemoveOnDocuments(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			String[] documentRemoveNames = { input.get("documentRemove1"), input.get("documentRemove2") };
			viewDetailDocuments.documentRemove(documentRemoveNames);

		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData4", priority = 4)
	public void removeDocumentOnLeftSideWithCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.documentSelectedPageDown();
			String[] removedDocument = { input.get("documentRemove1"), input.get("documentRemove2") };
			viewDetailDocuments.removeDocumentButtonOnLeftSide(removedDocument);
			viewDetailDocuments.cancelButtonOnAddExisting();
			Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.leftSideDocumentSelected(input.get("documentRemove1"));
			viewDetailDocuments.leftSideDocumentSelected(input.get("documentRemove2"));

		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData5", priority = 5)
	public void selectDocumentOnRightSideWithCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.leftMatterTab();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.documentSelectedPageDown();
			String[] documentSelect = { input.get("documentSelect1"), input.get("documentSelect2") };
			viewDetailDocuments.selectDocumentOnRightSide(documentSelect);
			viewDetailDocuments.cancelButtonOnAddExisting();
			Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.rightSideDocumentSelected(input.get("documentSelect1"));
			viewDetailDocuments.rightSideDocumentSelected(input.get("documentSelect2"));

		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData6", priority = 6)
	public void selectDocumentOnRightSideWithSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.documentSelectedPageDown();
			String[] documentSelect = { input.get("documentSelect1"), input.get("documentSelect2") };
			viewDetailDocuments.selectDocumentOnRightSide(documentSelect);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.leftSideDocumentSelected(input.get("documentSelect1"));
			viewDetailDocuments.leftSideDocumentSelected(input.get("documentSelect2"));
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData7", priority = 7)
	public void removeDocumentOnLeftSideWithSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.documentSelectedPageDown();
			String[] removedDocument = { input.get("documentRemove1"), input.get("documentRemove2") };
			viewDetailDocuments.removeDocumentButtonOnLeftSide(removedDocument);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.rightSideDocumentSelected(input.get("documentRemove1"));
			viewDetailDocuments.rightSideDocumentSelected(input.get("documentRemove2"));

		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData8", priority = 8)
	public void selectAllClickCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.documentSelectedPageDown();
			viewDetailDocuments.selectAllClick();
			viewDetailDocuments.checkRightSideDocumentFieldsareEmpty();
			viewDetailDocuments.cancelButtonOnAddExisting();

		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData9", priority = 9)
	public void selectAllClickSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.documentSelectedPageDown();
			viewDetailDocuments.selectAllClick();
			viewDetailDocuments.checkRightSideDocumentFieldsareEmpty();
			viewDetailDocuments.nextButtonOnAddExisting();

		} finally {
			viewMatters.leftMatterTab();
		}
	}


	@Test(dataProvider = "getData10", priority = 10)
	public void unSelectAllClickCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.documentSelectedPageDown();
			viewDetailDocuments.checkSelectAllCheckboxIsUnSelected();
			viewDetailDocuments.selectAllClick();
			viewDetailDocuments.cancelButtonOnAddExisting();

		} finally {
			viewMatters.leftMatterTab();
		}
	}
	
	@Test(dataProvider = "getData11", priority = 11)
	public void unSelectAllClickSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.documentSelectedPageDown();
			viewDetailDocuments.checkSelectAllCheckboxIsUnSelected();
			viewDetailDocuments.checkRightSideDocumentFieldsareEmpty();
			viewDetailDocuments.selectAllClick();
			viewDetailDocuments.nextButtonOnAddExisting();

		} finally {
			viewMatters.leftMatterTab();
		}
	}
	

	@Test(dataProvider = "getData12", priority = 12)
	public void browseAndUploadFilesAndCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			viewDetailDocuments.cancelButtonOnAddExisting();

		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData13", priority = 13)
	public void browseandUploadFilesandRemoveDocumentWithCancelButton(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(2000);
			String[] uploadFiles = { input.get("removeFile1"), input.get("removeFile2") };
			viewDetailDocuments.dragAndDropDocumentRemove(uploadFiles);
			viewDetailDocuments.cancelButtonOnAddExisting();

		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData14", priority = 14)
	public void browseandUploadFilesandRemoveDocumentWithNext(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(2000);
			String[] uploadFiles = { input.get("removeFile1"), input.get("removeFile2") };
			viewDetailDocuments.dragAndDropDocumentRemove(uploadFiles);
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			viewDetailDocuments.nextButtonOnAddExisting();

		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData15", priority = 15)
	public void uploadFilesAndEnableWithSave(HashMap<String, String> input) throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName3"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName4"));
	*/
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData16", priority = 16)
	public void uploadFilestAndEnableWithCancel(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData17", priority = 17)
	public void uploadFilestAndDisableWithSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
			/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName3"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName4"));
*/
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData18", priority = 18)
	public void uploadFilestAndDisableWithCancel(HashMap<String, String> input) throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData19", priority = 19)
	public void uploadFilesandRemoveMultipleDocumentAndEnableWithSave(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(2000);
			String[] uploadFiles = { input.get("removeFile1"), input.get("removeFile2"), input.get("removeFile3") };
			viewDetailDocuments.dragAndDropDocumentRemove(uploadFiles);
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
*/
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData20", priority = 20)
	public void uploadFilesandRemoveMultipleDocumentAndEnableWithCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(2000);
			String[] uploadFiles = { input.get("removeFile1"), input.get("removeFile2") };
			viewDetailDocuments.dragAndDropDocumentRemove(uploadFiles);
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();

		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData21", priority = 21)
	public void uploadFilesandRemoveMultipleDocumentAndDisableWithSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(2000);
			String[] uploadFiles = { input.get("removeFile1"), input.get("removeFile2") };
			viewDetailDocuments.dragAndDropDocumentRemove(uploadFiles);
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData22", priority = 22)
	public void uploadFilesandRemoveMultipleDocumentAndDisableWithCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(2000);
			String[] uploadFiles = { input.get("removeFile1"), input.get("removeFile2") };
			viewDetailDocuments.dragAndDropDocumentRemove(uploadFiles);
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();

		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData23", priority = 23)
	public void uploadFilesandEnableWithEditAllandSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 1, 3 };

			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editAllField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData24", priority = 24)
	public void uploadFilesandEnableWithEditAllandCancel(HashMap<String, String> input) throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editAllField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData25", priority = 25)
	public void uploadFilesandEnableWithEditDocumNameFieldOnlyandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 1 };

			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editDocumentNameField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData26", priority = 26)
	public void uploadFilesandEnableWithEditDocumNameFieldOnlyandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();

			Integer[] intArray1 = new Integer[] { 3, 2, 1 };

			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editDocumentNameField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData27", priority = 27, enabled = false)
	public void uploadFilesandEnableWithEditDescriptionFieldOnlyandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();

			Integer[] intArray1 = new Integer[] { 3, 2, 1 };

			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "descp";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editDocumentNameField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData28", priority = 28)
	public void uploadFilesandEnableWithEditDescriptionFieldOnlyandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "descp";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editDocumentNameField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData29", priority = 29)
	public void uploadFilesandEnableWithexpirateDateFieldOnlyandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "date";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editExpirateField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData30", priority = 30)
	public void uploadFilesandEnableWithexpirateDateFieldOnlyandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "date";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editExpirateField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData31", priority = 31)
	public void uploadFilesandEnableWithcombinedDocumentNamesandDateandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 2, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData32", priority = 32)
	public void uploadFilesandEnableWithcombinedDocumentNamesandDateandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData33", priority = 33)

	public void uploadFilesandEnableWithcombinedDocumentNamesandDescriptionandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 2, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName3"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData34", priority = 34)

	public void uploadFilesandEnableWithcombinedDocumentNamesandDescriptionandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 1, 2, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData35", priority = 35)

	public void uploadFilesandEnableWithcombinedDateandDescriptionandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDescriptionandExpirateDateFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData36", priority = 36)

	public void uploadFilesandEnableWithcombinedDateandDescriptionandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDescriptionandExpirateDateFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData37", priority = 37)
	public void uploadFilesandDisableWithEditAllandSave(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.leftMatterTab();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editAllField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		} finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData38", priority = 38)
	public void uploadFilesandDisableWithEditAllandCancel(HashMap<String, String> input) throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editAllField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData39", priority = 39)
	public void uploadFilesandDisableWithEditDocumNameFieldOnlyandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editDocumentNameField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData40", priority = 40)
	public void uploadFilesandDisableWithEditDocumNameFieldOnlyandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 3, 2, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editDocumentNameField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData41", priority = 41)
	public void uploadFilesandDisableWithEditDescriptionFieldOnlyandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 3, 2, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "descp";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editDocumentNameField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName3"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData42", priority = 42)
	public void uploadFilesandDisableWithEditDescriptionFieldOnlyandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "descp";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editDocumentNameField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData43", priority = 43)
	public void uploadFilesandDisableWithexpirateDateFieldOnlyandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "date";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editExpirateField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData44", priority = 44)
	public void uploadFilesandDisableWithexpirateDateFieldOnlyandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "date";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}
			viewDetailDocuments.editExpirateField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData45", priority = 45)
	public void uploadFilesandDisableWithcombinedDocumentNamesandDateandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 2, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData46", priority = 46)
	public void uploadFilesandDisableWithcombinedDocumentNamesandDateandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData47", priority = 47)

	public void uploadFilesandDisableWithcombinedDocumentNamesandDescriptionandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 2, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName3"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData48", priority = 48)

	public void uploadFilesandDisableWithcombinedDocumentNamesandDescriptionandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 1, 2, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData49", priority = 49)

	public void uploadFilesandDisableWithcombinedDateandDescriptionandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDescriptionandExpirateDateFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
		/*	Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData50", priority = 50)

	public void uploadFilesandDisableWithcombinedDateandDescriptionandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editDescriptionandExpirateDateFields(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData51", priority = 51)
	public void uploadFilesandEnableWithMultipleAddTagsandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 0 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAdd(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData52", priority = 52)
	public void uploadFilesandEnableWithMultipleAddTagsandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 0 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAdd(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData53", priority = 53)
	public void uploadFilesandEnableWithAddTagsSelectAllandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			viewDetailDocuments.selectAllClk();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.pageDown();
			Thread.sleep(2000);
			viewDetailDocuments.tagsFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData54", priority = 54)
	public void uploadFilesandEnableWithAddTagsSelectAllandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			viewDetailDocuments.selectAllClk();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.pageDown();
			Thread.sleep(2000);
			viewDetailDocuments.tagsFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData55", priority = 55)
	public void uploadFilesandEnableWithAddTagsSelectAllandRemoveAndCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			viewDetailDocuments.selectAllClk();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.pageDown();
			Thread.sleep(2000);
			viewDetailDocuments.removedTags();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.tagsFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData56", priority = 56)
	public void uploadFilesandEnableWithAddTagsSelectAllandRemoveAndSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			viewDetailDocuments.selectAllClk();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.pageDown();
			Thread.sleep(2000);
			viewDetailDocuments.removedTags();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.tagsFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData57", priority = 57)
	public void uploadFilesandEnableWithMultipleAddTagsandRemoveAndSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 1 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAddAndRemove(intArray1, desc);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData58", priority = 58)
	public void uploadFilesandEnableWithMultipleAddTagsandRemoveAndCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 1 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAddAndRemove(intArray1, desc);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData59", priority = 59)
	public void uploadFilesandEnableWithMultipleAddTagsandAddTagsAndRemoveAndSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 0,1 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAddandRemoveaddedText(intArray1, desc);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData60", priority = 60)
	public void uploadFilesandEnableWithMultipleAddTagsandAddTagsAndRemoveAndCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 1 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAddandRemoveaddedText(intArray1, desc);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData61", priority = 61)
	public void uploadFilesandDisableWithMultipleAddTagsandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.leftMatterTab();
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 1 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAdd(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData62", priority = 62)
	public void uploadFilesandDisableWithMultipleAddTagsandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {

			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 0 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAdd(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData63", priority = 63)
	public void uploadFilesandDisableWithAddTagsSelectAllandSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.addTagsTabBtn();
			viewDetailDocuments.selectAllClk();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.pageDown();
			Thread.sleep(2000);
			viewDetailDocuments.tagsFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData64", priority = 64)
	public void uploadFilesandDisableWithAddTagsSelectAllandCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.addTagsTabBtn();
			viewDetailDocuments.selectAllClk();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.pageDown();
			Thread.sleep(2000);
			viewDetailDocuments.tagsFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData65", priority = 65)
	public void uploadFilesandDisableWithAddTagsSelectAllandRemoveAndCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.addTagsTabBtn();
			viewDetailDocuments.selectAllClk();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.pageDown();
			Thread.sleep(2000);
			viewDetailDocuments.removedTags();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.tagsFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();

		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData66", priority = 66)
	public void uploadFilesandDisableWithAddTagsSelectAllandRemoveAndSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.addTagsTabBtn();
			viewDetailDocuments.selectAllClk();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.pageDown();
			Thread.sleep(2000);
			viewDetailDocuments.removedTags();
			viewDetailDocuments.addButtonAddTags();
			viewDetailDocuments.tagsFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData67", priority = 67)
	public void uploadFilesandDisableWithMultipleAddTagsandRemoveAndSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 0,1 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAddAndRemove(intArray1, desc);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
		*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData68", priority = 68)
	public void uploadFilesandDisableWithMultipleAddTagsandRemoveAndCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 1 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAddAndRemove(intArray1, desc);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData69", priority = 69)
	public void uploadFilesandDisableWithMultipleAddTagsandAddTagsAndRemoveAndSave(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 1,2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAddandRemoveaddedText(intArray1, desc);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName2"));
		*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData70", priority = 70)
	public void uploadFilesandDisableWithMultipleAddTagsandAddTagsAndRemoveAndCancel(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray1 = new Integer[] { 1 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.tagsAddandRemoveaddedText(intArray1, desc);
			viewDetailDocuments.cancelButtonOnAddExisting();
			viewDetailDocuments.textNameUploadnewAttachDocum();
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData71", priority = 71)
	public void uploadFilesandEnableAndEditFirstDocumentsOnly(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editAllField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData72", priority = 72)
	public void uploadFilesandEnableAndEditSecondDocumentsOnly(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editAllField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
	*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData73", priority = 73)
	public void uploadFilesandDisableAndEditFirstDocumentsOnly(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editAllField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
		*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData74", priority = 74)
	public void uploadFilesandDisableAndEditSecondDocumentsOnly(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editAllField(intArray1, desc);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
		*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData75", priority = 75)
	public void uploadFilesandEnableAndRemoveFiles(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			String[] numbers = { input.get("removeFile1"), input.get("removeFile2"), input.get("removeFile3") };
			viewDetailDocuments.removeFiles(numbers);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
		*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData76", priority = 76)
	public void uploadFilesandDisableAndRemoveFiles(HashMap<String, String> input) throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			String[] numbers = { input.get("removeFile1"), input.get("removeFile2"), input.get("removeFile3") };
			viewDetailDocuments.removeFiles(numbers);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
		/*	Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
		*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData77", priority = 77)
	public void uploadFilesandEnableAndEditAllFieldsAndEditTags(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editAllField(intArray1, desc);
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray2 = new Integer[] { 0 };
			int count1 = Integer.parseInt(input.get("count1"));
			String[][] desc1 = new String[count1][2];
			String[] dn1 = { "addtags", "tags" };
			for (int ii = 0; ii < count1; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc1[ii][jj] = input.get(dn1[jj] + ii);
			}
			viewDetailDocuments.tagsAdd(intArray2, desc1);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
		*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	@Test(dataProvider = "getData78", priority = 79)
	public void uploadFilesandDisableAndEditAllFieldsAndEditTags(HashMap<String, String> input)
			throws InterruptedException {

		try {
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.addNewBtn();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.uploadNewBtn();
			viewDetailDocuments.browseAndUploadDoc();
			viewDetailDocuments.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			viewDetailDocuments.nextButtonOnAddExisting();
			Thread.sleep(3000);
			viewDetailDocuments.disableTabBtn();
			Thread.sleep(1000);
			viewDetailDocuments.editMetaDataTabBtn();
			Integer[] intArray1 = new Integer[] { 0 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			viewDetailDocuments.editAllField(intArray1, desc);
			Thread.sleep(3000);
			viewDetailDocuments.addTagsTabBtn();
			Integer[] intArray2 = new Integer[] { 0 };
			int count1 = Integer.parseInt(input.get("count1"));
			String[][] desc1 = new String[count1][2];
			String[] dn1 = { "addtags", "tags" };
			for (int ii = 0; ii < count1; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc1[ii][jj] = input.get(dn1[jj] + ii);
			}
			viewDetailDocuments.tagsAdd(intArray2, desc1);
			Thread.sleep(2000);
			viewDetailDocuments.nextButtonOnAddExisting();
			viewDetailDocuments.confirmationYesBtn();
			viewDetailDocuments.alertClose();
	/*		Thread.sleep(2000);
			viewMatters.leftMatterTab();
			Thread.sleep(2000);
			viewMatters.searchBarFieldsandActionBtn(input.get("matterName"));
			viewMatterViewDetail.viewDetailsBtn();
			viewDetailDocuments.documentTab();
			viewDetailDocuments.pageMiddle();
			viewDetailDocuments.existingAddedDocumentVerifyAssert(input.get("documentName1"));
		*/
		}

		finally {
			viewMatters.leftMatterTab();
		}
	}

	

	// 0. meetingNameAppearOrNot

	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(0) } };

	}

	// 1. descriptionTextinViewDetails

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(1) } };

	}

	// 2. documentNameCheckingOnDocuments

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(2) } };

	}

	// 3. documentRemoveOnDocuments

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(3) } };

	}

	// 4. removeDocumentOnLeftSideWithCancel

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(4) } };

	}

	// 5. selectDocumentOnRightSideWithCancel

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(5) } };

	}

	// 6.selectDocumentOnRightSideWithSave

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(6) } };

	}

	// 7.removeDocumentOnLeftSideWithSave

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(7) } };

	}

	// 8.selectAllClickCancel

	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(8) } };

	}

	// 9.selectAllClickSave

	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(9) } };

	}

	// 10. unSelectAllClickSave

	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(10) } };

	}

	// 11. unSelectAllClickCancel

	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(11) } };

	}

	// 12. browseAndUploadFiles

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(12) } };

	}

	// 13. browseandUploadFilesandRemoveDocumentWithCancelButton

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(13) } };

	}

	// 14. browseandUploadFilesandRemoveDocument

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(14) } };

	}

	// 15.browseandUploadFilesandRemoveDocumentAndEnableWithSave

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(15) } };

	}

	// 16.browseandUploadFilestAndEnableWithCancel

	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(16) } };

	}

	// 17. browseandUploadFilestAndDisableWithSave

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(17) } };

	}

	// 18.browseandUploadFilestAndDisableWithCancel

	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(18) } };

	}

	// 19.uploadFilesandRemoveMultipleDocumentAndEnableWithSave

	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(19) } };

	}

	// 20.uploadFilesandRemoveMultipleDocumentAndEnableWithCancel

	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(20) } };

	}

	// 21.uploadFilesandRemoveMultipleDocumentAndDisableWithSave

	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(21) } };

	}

	// 22. uploadFilesandRemoveMultipleDocumentAndDisableWithCancel

	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(22) } };

	}

	// 23. uploadFilesandEnableWithEditAllandSave

	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(23) } };

	}

	// 24.uploadFilesandEnableWithEditAllandCancel

	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(24) } };

	}

	// 25.uploadFilesandEnableWithEditDocumNameFieldOnlyandSave

	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(25) } };

	}
	// 26.uploadFilesandEnableWithEditDocumNameFieldOnlyandCancel

	@DataProvider
	public Object[][] getData26() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(26) } };

	}

	// 27.uploadFilesandEnableWithEditDescriptionFieldOnlyandSave

	@DataProvider
	public Object[][] getData27() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(27) } };

	}
	// 28.uploadFilesandEnableWithEditDescriptionFieldOnlyandCancel

	@DataProvider
	public Object[][] getData28() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(28) } };

	}

	// 29.uploadFilesandEnableWithexpirateDateFieldOnlyandSave

	@DataProvider
	public Object[][] getData29() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(29) } };

	}
	// 30.uploadFilesandEnableWithexpirateDateFieldOnlyandCancel

	@DataProvider
	public Object[][] getData30() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(30) } };

	}

	// 31.uploadFilesandEnableWithcombinedDocumentNamesandDateandSave

	@DataProvider
	public Object[][] getData31() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(31) } };

	}

	// 32.uploadFilesandEnableWithcombinedDocumentNamesandDateandCancel

	@DataProvider
	public Object[][] getData32() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(32) } };

	}

	// 33.uploadFilesandEnableWithcombinedDocumentNamesandDescriptionandSave

	@DataProvider
	public Object[][] getData33() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(33) } };

	}

	// 34.uploadFilesandEnableWithcombinedDocumentNamesandDescriptionandCancel

	@DataProvider
	public Object[][] getData34() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(34) } };

	}

	// 35. uploadFilesandEnableWithcombinedDateandDescriptionandSave

	@DataProvider
	public Object[][] getData35() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(35) } };

	}

	// 36.uploadFilesandEnableWithcombinedDateandDescriptionandCancel

	@DataProvider
	public Object[][] getData36() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(36) } };

	}

	// 37.uploadFilesandDisableWithEditAllandSave

	@DataProvider
	public Object[][] getData37() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(37) } };

	}

	// 38.uploadFilesandDisableWithEditAllandCancel

	@DataProvider
	public Object[][] getData38() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(38) } };

	}

	// 39.uploadFilesandDisableWithEditDocumNameFieldOnlyandSave

	@DataProvider
	public Object[][] getData39() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(33) } };

	}

	// 40.uploadFilesandDisableWithEditDocumNameFieldOnlyandCancel

	@DataProvider
	public Object[][] getData40() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(40) } };

	}

	// 41.uploadFilesandDisableWithEditDescriptionFieldOnlyandSave

	@DataProvider
	public Object[][] getData41() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(41) } };

	}

	// 42.uploadFilesandDisableWithEditDescriptionFieldOnlyandCancel

	@DataProvider
	public Object[][] getData42() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(42) } };

	}

	// 43.uploadFilesandDisableWithexpirateDateFieldOnlyandSave

	@DataProvider
	public Object[][] getData43() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(43) } };

	}

	// 44.uploadFilesandDisableWithexpirateDateFieldOnlyandCancel

	@DataProvider
	public Object[][] getData44() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(44) } };

	}

	// 45.uploadFilesandDisableWithcombinedDocumentNamesandDateandSave

	@DataProvider
	public Object[][] getData45() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(45) } };

	}

	// 46.uploadFilesandDisableWithcombinedDocumentNamesandDateandCancel

	@DataProvider
	public Object[][] getData46() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(46) } };

	}

	// 47.uploadFilesandDisableWithcombinedDocumentNamesandDescriptionandSave

	@DataProvider
	public Object[][] getData47() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(47) } };

	}

	// 48.uploadFilesandDisableWithcombinedDocumentNamesandDescriptionandCancel

	@DataProvider
	public Object[][] getData48() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(48) } };

	}

	// 49.uploadFilesandDisableWithcombinedDateandDescriptionandSave

	@DataProvider
	public Object[][] getData49() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(49) } };

	}

	// 50.uploadFilesandDisableWithcombinedDateandDescriptionandCancel

	@DataProvider
	public Object[][] getData50() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(50) } };

	}

	// 51.uploadFilesandEnableWithMultipleAddTagsandSave

	@DataProvider
	public Object[][] getData51() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(51) } };

	}

	// 52.uploadFilesandEnableWithMultipleAddTagsandCancel

	@DataProvider
	public Object[][] getData52() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(52) } };

	}

	// 53.uploadFilesandEnableWithAddTagsSelectAllandSave

	@DataProvider
	public Object[][] getData53() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(53) } };

	}

	// 54.uploadFilesandEnableWithAddTagsSelectAllandCancel

	@DataProvider
	public Object[][] getData54() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(54) } };

	}

	// 55.uploadFilesandEnableWithAddTagsSelectAllandRemoveAndCancel

	@DataProvider
	public Object[][] getData55() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(55) } };

	}

	// 56.uploadFilesandEnableWithAddTagsSelectAllandRemoveAndSave

	@DataProvider
	public Object[][] getData56() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(56) } };

	}

	// 57.uploadFilesandEnableWithMultipleAddTagsandRemoveAndSave

	@DataProvider
	public Object[][] getData57() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(57) } };

	}

	// 58.uploadFilesandEnableWithMultipleAddTagsandRemoveAndCancel

	@DataProvider
	public Object[][] getData58() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(58) } };

	}

	// 59.uploadFilesandEnableWithMultipleAddTagsandAddTagsAndRemoveAndSave

	@DataProvider
	public Object[][] getData59() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(59) } };

	}

	// 60.uploadFilesandEnableWithMultipleAddTagsandAddTagsAndRemoveAndCancel

	@DataProvider
	public Object[][] getData60() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(60) } };

	}

	// 61.uploadFilesandDisableWithMultipleAddTagsandSave

	@DataProvider
	public Object[][] getData61() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(61) } };

	}

	// 62.uploadFilesandDisableWithMultipleAddTagsandCancel

	@DataProvider
	public Object[][] getData62() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(62) } };

	}

	// 63.uploadFilesandDisableWithAddTagsSelectAllandSave

	@DataProvider
	public Object[][] getData63() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(63) } };

	}

	// 64.uploadFilesandDisableWithAddTagsSelectAllandCancel

	@DataProvider
	public Object[][] getData64() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(64) } };

	}

	// 65.uploadFilesandDisableWithAddTagsSelectAllandRemoveAndCancel

	@DataProvider
	public Object[][] getData65() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(65) } };

	}

	// 66.uploadFilesandDisableWithAddTagsSelectAllandRemoveAndSave

	@DataProvider
	public Object[][] getData66() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(66) } };

	}

	// 67.uploadFilesandDisableWithMultipleAddTagsandRemoveAndSave

	@DataProvider
	public Object[][] getData67() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(67) } };

	}

	// 68.uploadFilesandDisableWithMultipleAddTagsandRemoveAndCancel

	@DataProvider
	public Object[][] getData68() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(68) } };

	}

	// 69.uploadFilesandDisableWithMultipleAddTagsandAddTagsAndRemoveAndSave

	@DataProvider
	public Object[][] getData69() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(69) } };

	}

	// 70.uploadFilesandDisableWithMultipleAddTagsandAddTagsAndRemoveAndCancel

	@DataProvider
	public Object[][] getData70() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(70) } };

	}

	// 71.uploadFilesandEnableAndUpdateTagsandEditFirstDocumentsOnly

	@DataProvider
	public Object[][] getData71() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(71) } };

	}

	// 72.uploadFilesandEnableAndUpdateTagsandEditSecondDocumentsOnly

	@DataProvider
	public Object[][] getData72() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(72) } };

	}

	// 73. uploadFilesandDisableAndUpdateTagsandEditFirstDocumentsOnly

	@DataProvider
	public Object[][] getData73() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(73) } };

	}

	// 74. uploadFilesandDisableAndUpdateTagsandEditSecondDocumentsOnly

	@DataProvider
	public Object[][] getData74() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(74) } };

	}

	// 75.uploadFilesandEnableAndRemoveFiles
	@DataProvider
	public Object[][] getData75() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(75) } };

	}

	// 76.uploadFilesandDisableAndRemoveFiles
	@DataProvider
	public Object[][] getData76() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(76) } };

	}

	// 77.uploadFilesandEnableAndEditAllFieldsAndEditTags
	@DataProvider
	public Object[][] getData77() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(77) } };

	}

	// 78.uploadFilesandDisableAndEditAllFieldsAndEditTags
	@DataProvider
	public Object[][] getData78() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\Matter\\ViewMatterViewDetailsData.json");

		return new Object[][] { { data.get(78) } };

	}

}
