package com.test;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class ViewMatterViewDetailsTest extends BaseClass{

	@Test
	public void viewMatterPage() throws InterruptedException
	{
		viewMatters.leftMatterTab();
		viewMatters.searchBarFieldsandActionBtn("Legal Case 24");
		viewMatterViewDetail.viewDetailsBtn();
		
	}
	
	
	
	
}
