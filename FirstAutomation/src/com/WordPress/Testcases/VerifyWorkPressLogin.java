/**
 * 
 */
package com.WordPress.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.WordPress.Pages.LoginPage;

/**
 * @author rajhasum
 *
 */
public class VerifyWorkPressLogin 
{
	
	@Test
	public void verifyValidLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");		// declaration and instantiation of objects/variables
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cspungw01/iM1WS_QO999/#/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		//gives implicit wait of 30 sec-because i have to wait for certain webelement
		
		LoginPage login = new LoginPage(driver);		//calling the loginpage class, now this driver is associated with chrome driver and this driver internally will call the constructor in login page
														//and that constructor driver will associate itself with the global variable driver and you can use the login page class
		login.typeUserName();							//calling all the methods, but we usually do with arguments
		login.typePassword();
		login.clickOnLoginButton();
		
		Assert.assertTrue(driver.findElement(By.className("username ng-binding")).isDisplayed());
		System.out.println("Successfully logged in");
		
		driver.quit();
		
		
	}
	
	
}
