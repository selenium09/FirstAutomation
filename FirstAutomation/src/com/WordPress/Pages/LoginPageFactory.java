package com.WordPress.Pages;			//Page factory

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;									//support library contains pagefactory as well
import org.openqa.selenium.support.How;
import org.testng.Assert;


//In order to support PageObject pattern, webdriver's support library contains a factory class
//We have separate method to initialize web element of page object called initElelement
//Important feature of Page factory is cache feature that will store all frequently used WebElement in cache

public class LoginPageFactory												//this is a page object where we will store all the locators 
{

	WebDriver driver;
	
	public LoginPageFactory(WebDriver ldriver)		
	{
		this.driver = ldriver;												//this driver(in bracket) will come from page factory and we will initialize it to local driver using "this"			
	}
	
	
	@FindBy(id="userName") 													//alternative way to locate element on webpage-will only work with page factory-Import openqa files for both
	@CacheLookup															//given instruction to keep this in cache, so performance will be high-use when you know this webelement will not change
	WebElement username;								
	
	@FindBy(how=How.ID,using="password")									//dynamically-when you write how , it will ask you which locator you want to use-comes from HOW class 
	@CacheLookup
	WebElement password;													//Standard approach : using is a variable so you need to pass exact ID
																			//how is a class here, ID is a separate static variable and using is another variable-specify the value you want to use
																			
	@FindBy(how=How.XPATH,using=".//*[@id='btnLogin']") 
	@CacheLookup
	WebElement submit_button;

	@FindBy(how=How.LINK_TEXT,using="Passwort vergessen?")
	@CacheLookup															//good thing about page factory is- you can store all the webelements in cache memory-it wll not check the webelement each and every time in the webpage
	WebElement forget_password_link;										//it will simply check in the cache memory and start processing			
	
	@FindBy(how=How.XPATH,using=".//*[@id='timeSlot_13_5_08']")
	WebElement time_slot;
	
	@FindBy(how=How.XPATH,using=".//*[@id='btnappointmentCreationOk']")
	WebElement save_button;
	
	@FindBy(how=How.XPATH,using=".//*[@id='appointmentSubject']")
	WebElement appsubject_editbox;
	
	
	public void login_wordpress(String uid, String pass)  
	{
		waitforObject(5000);
		username.sendKeys(uid);
		password.sendKeys(pass);
		waitforObject(5000);
/*		try{																//two methods to handle time exception - method#1
			Thread.sleep(5500);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}*/
		submit_button.click();												//now we need a constructor too
	}																		//this is just a login page, we will create testcase for it
    
	
	public void createAppointment()
	{
			waitforObject(5000);
			//time_slot double click
			Actions a = new Actions(driver);
			a.moveToElement(time_slot).doubleClick().build().perform();
			waitforObject(5000);
			appsubject_editbox.clear();										//clears field			
			appsubject_editbox.sendKeys("Freetext sumit");
			save_button.click();
			waitforObject(2000);
			Assert.assertTrue(driver.getPageSource().contains("Freetext sumit"));		//find how to check content of appointment?
			System.out.println("appointment is created");
	}
		
	
	
	public void waitforObject(int time) 
	{																		//method#2
		try{
			Thread.sleep(time);
			}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}			
	}

}
