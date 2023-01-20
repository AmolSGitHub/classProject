
package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/login/device-based/regular"
		 		+ "/login/?login_attempt=1&lwv=100");
		 Thread.sleep(4000);
		 driver.findElement (By.xpath("//input[@id='email']")).sendKeys("Admin");
		 Thread.sleep(2000);
	
	     driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Admin123");
	     Thread.sleep(2000);
	     driver.findElement(By.tagName("button")).click();
	     Thread.sleep(4000);
		}
	}