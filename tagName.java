package  Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class tagName
{
	static WebDriver driver;

	@Test
	public void Test2() throws Exception {
	
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  Thread.sleep(2000);
		
		
		List<WebElement> links=  driver.findElements(By.tagName("div"));	
		int links_count= links.size();
		
		System.out.println("Number of hyperlinks : "+links_count);
	
		
		
	}
	
	
	

public  WebElement findElement(By by) throws Exception 
{

	WebElement elem = driver.findElement(by);  
	
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 
	}
	return elem;
}

	
	
}











