package com.WordPress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.WordPress.Pages.LoginPageFactory;

import helper.BrowserFactory;

public class VerifyValidLogin 					//we will create a helper/utility to call start browser for code redundancy will be less
{
	@Test								
	public void checkValidUser()
	{
		//in 3 lines of code, we covered our functionality
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://cspungw01/iM1WS_QO999/#/login");			//it will return you web driver reference
		
		//created page object using page factory
		LoginPageFactory login = PageFactory.initElements(driver, LoginPageFactory.class);		//will only replace the fields of an already instantiated page object-page we created is "LoginPageFactory"
																								//.class will return the byte code of this loginpagefactory-it will return you the page object of that particular page/class
		//LoginPage login_page_old = PageFactory.initElements(driver,LoginPage.class);			//login page will return page object of loginpage class
		
		//call the method
		login.login_wordpress("sumit_GRM", "isaplim");
		
		login.createAppointment();
		
		
	}	
	
	
}
