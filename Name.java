package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Name {
	WebDriver driver;
  @Test
  public void LocatorsID() throws Exception {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("email")).sendKeys("8142554433");
	  Thread.sleep(3000);
	  driver.findElement(By.name("pass")).sendKeys("sdfgdzg");
	  
	  
	  
  }
}
