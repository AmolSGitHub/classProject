package testNGpack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2{
	static WebDriver driver;
	  @Test(enabled = true)//enabled flag it is used to disable or enable particular test case
	  public void manul() // if the enabled is false then manual 
	                      //test case will not displayed in test report
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.google.com");
		  driver.switchTo().activeElement().sendKeys("manul");
		  
	  }
	}
