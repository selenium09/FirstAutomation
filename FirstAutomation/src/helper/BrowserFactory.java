package helper;											//just pass the browser and url and it will start your application 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
	static WebDriver driver;								//it will accept the browser name in a parameter, it will trigger the respective browser
	
	public static WebDriver startBrowser(String browserName, String url)	//we need to return this driver, so changing void to WebDriver-changed method to static as well
	{
		
	if (browserName.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("chrome"))	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("IE"))
	{
		driver = new InternetExplorerDriver();
	}
	
	driver.manage().window().maximize();
	driver.get(url);
	
	return driver;
}
	
}
