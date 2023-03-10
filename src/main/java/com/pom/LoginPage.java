package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abst.Reusable;

public class LoginPage extends Reusable{
	
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="id_email")
	WebElement email;
	
	@FindBy(id="id_password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	

	public Dashboard loginApplication(String emailId,String pass)
	{
		email.sendKeys(emailId);
		password.sendKeys(pass);
		login.click();
		Dashboard 	dashboard = new Dashboard(driver);
		return dashboard;
	}
	
	public void goTo()
	{
		driver.get("https://app.lauditor.com/login");
	}
	

}
