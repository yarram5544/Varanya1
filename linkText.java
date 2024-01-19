package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class linkText {
	WebDriver driver;
  @Test
  public void LocatorsID() throws Exception {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  
  }
}
