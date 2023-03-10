package com.test;

import java.io.IOException;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pom.LoginPage;

public class LoggedPage extends BaseClass {
	
	
	@Test()
	public void loginCheck() throws IOException, InterruptedException
	{
		 //launchApplication();
		LoginPage loginPage = new LoginPage(driver); 
	   loginPage.loginApplication("coffersuperuser@gmail.com","Test@123");
	}

}
