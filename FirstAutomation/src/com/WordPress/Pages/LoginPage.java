/**
 * 
 */
package com.WordPress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author rajhasum
 *This class will store all the locators and methods of login page
 *
 */
public class LoginPage 
{
	WebDriver driver;
	
	By username = By.id("userName");		//it will return as by object 	
	By password = By.xpath("//*[@id='password']");
	By loginButton = By.id("btnLogin");

	public LoginPage(WebDriver driver)			//this constructor will accept one argument called webdriver
		{
			this.driver=driver;					//we will be calling this constructor from our testcases, its task is to initialize the upper side driver(click it)
		}										//this driver will call the bracket one and initialise the global(upper one)

	public void typeUserName(String uid) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton()			//3 Methods to use the constructor
	{
		driver.findElement(loginButton).click();
	}
	
	public void loginTOWordPress(String userid, String pass)		//directly parameterizing will help you reuse the code and direcly calling this will reduce no. of lines
	{
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}

	
	 
}