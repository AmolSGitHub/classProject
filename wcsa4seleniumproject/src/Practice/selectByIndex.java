package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByIndex {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("file:///C:/Users/HP/Desktop/New%20folder/Multiselectdropdown.html");
	     WebElement dropDownElement = driver.findElement(By.id("menu"));
	     Select sel = new Select (dropDownElement);
	     sel.selectByIndex(5);
	     Thread.sleep(2000);
	     

	}

}
