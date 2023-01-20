package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@class ]")).click();
	Thread.sleep(2000);
 //   driver.findElement(By.xpath("//input[@class ]")).click();
    Thread.sleep(2000);
	}

}
