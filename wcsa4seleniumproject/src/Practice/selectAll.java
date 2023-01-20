package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectAll {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("file:///C:/Users/HP/Desktop/New%20folder/MultiSelectDropdown2.html");
	     WebElement dropDownElement = driver.findElement(By.id("menu multiple"));
	     Select sel = new Select (dropDownElement);
	     for(int i=0;i<6;i++)
	     {
	     sel.selectByIndex(i);
	    Thread.sleep(2000);
	     

	 }
	}
}

