package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ThirdTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		//by name
		driver.findElement(By.name("firstName")).sendKeys("Sumit Rajhans");
		
		//by link text
		driver.findElement(By.linkText("This is a link")).click();
		driver.navigate().back();
		
		//by partial link text
		driver.findElement(By.partialLinkText("This is")).click();
		driver.navigate().back();
		
		//by tag name and clear text
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.tagName("input")).sendKeys("C++ Tutorials");
		driver.findElement(By.tagName("Button")).click();
		
		
		//by class name
		driver.findElement(By.className("Automation")).click();
		//by id
		driver.findElement(By.id("male")).click();
		
		//by css tag and id
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.cssSelector("input#fname")).sendKeys("CSS locator id/tag");
		//driver.findElement(By.cssSelector("input#button")).click();
		//driver.close();
		
		//by css tag and class
		driver.findElement(By.cssSelector("input.Performance")).click();
		
		//by css tag and attributes
		driver.findElement(By.cssSelector("input[id=fname]")).clear();
		driver.findElement(By.cssSelector("input[id=fname]")).sendKeys("Have I made it large");
		driver.findElement(By.cssSelector("button[id=idOfButton]")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Manual Testing");
		
		//not working contains command
		driver.findElement(By.cssSelector("button:contains('Generate Alert Box')")).click();
		
		//sub string not working
		driver.findElement((By.cssSelector("button[onclick*='alert('hi, JavaTpoint Testing')']"))).click();
		
		driver.navigate().to("http://www.google.com");
		
		//driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		
		//by tag, class and attribute
		
		driver.findElement(By.cssSelector("input.gsfi[name=q]")).sendKeys("javaTpoint tutorials");
		driver.findElement(By.cssSelector("input.gNO89b[name=btnK]")).click();		
		driver.close();
		
		
	}

}
