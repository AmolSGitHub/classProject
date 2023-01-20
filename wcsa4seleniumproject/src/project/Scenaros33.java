package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenaros33 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://jqueryui.com/droppable/");
		 
		 Thread.sleep(5000);
		   //driver.findElement(By.xpath("a[.='Droppable']")).click();
		 WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		 Thread.sleep(5000);
		 WebElement target = driver.findElement(By.xpath("(//div[@id='droppable']"));
		 Thread.sleep(5000);
		 Actions act = new Actions(driver);
		 Thread.sleep(5000);
		 act.dragAndDrop(src, target).perform();
	}

}