package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "drivers/chromedirver.exe");
	              WebDriver driver=new ChromeDriver();
	              driver.manage().window().maximize();
	              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	              Thread.sleep(2000);
	              driver.get("https://jqueryui.com/droppable/");
	             driver.findElement(By.xpath("a[.='Droppable']")).click();
	             WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	            WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
	            Actions act=new Actions(driver);
	            act.dragAndDrop(src, target);
	            
	              
	}

}
