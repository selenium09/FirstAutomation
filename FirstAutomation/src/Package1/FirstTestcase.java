package Package1;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");

// declaration and instantiation of objects/variables  
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");  
WebDriver driver=new ChromeDriver();  
  
//Launch website  
driver.navigate().to("http://www.google.com/");  
      
// Click on the search text box and send value  
//driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");  
      
// Click on the search button  
driver.findElement(By.name("btnK")).click();  

	}

}
