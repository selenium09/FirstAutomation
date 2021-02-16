package Package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class FourthTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		
		//driver.findElement(By.xpath("//*[@name='q']")).sendKeys("tutorials");
		//driver.findElement(By.linkText("Google Search")).click();
		//driver.findElement(By.xpath("//*[text()='Google Search']")).click();
		
		//new url
		//driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		driver.navigate().to("https://dhtmlx.com/docs/products/dhtmlxList/");
		
		
		//drop downs
		//Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		//dropdown.selectByVisibleText("Database Testing");
		//dropdown.selectByIndex(1);
		//dropdown.selectByValue("Manual");
		
		
		//Actions act = new Actions(driver);
		//WebElement from = driver.findElement(By.xpath("//*[@id='sourceImage']"));
		//WebElement to = driver.findElement(By.xpath("//*[@id='targetDiv']"));
		//act.pause(Duration.ofSeconds(2));
		//act.clickAndHold().dragAndDrop(from, to).build().perform();
		//act.dragAndDrop(from,to).build().perform();
		
		Actions act = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//div[text()='Learning DHTMLX Suite UI']"));
		WebElement to = driver.findElement(By.xpath("//li[text()='dhx_list-item dhx_list-item--selected dhx_list-item--focus dhx_list-item--drag']"));
		act.dragAndDrop(from,to).build().perform();
		
		//div[text()='Hadoop in Practice, Second Edition']
		
		 //Handling alert boxes  
        //Click on generate alert button  
        driver.findElement(By.linkText("Generate Alert Box")).click();  
          
        //Using Alert class to first switch to or focus to the alert box  
        Alert alert = (Alert) driver.switchTo().alert();  
          
        //Using accept() method to accept the alert box  
        alert.accept();  
          
        //Handling confirm box  
        //Click on Generate Confirm Box  
        driver.findElement(By.linkText("Generate Confirm Box")).click();  
          
          
        Alert confirmBox = (Alert) driver.switchTo().alert();  
          
        //Using dismiss() command to dismiss the confirm box  
        //Similarly accept can be used to accept the confirm box  
        ((Alert) confirmBox).dismiss();  
        
        //Scroll down the webpage by 4500 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 4500)");  
  
		
		    
		
		
		//driver.close();
		
		

	}

}
