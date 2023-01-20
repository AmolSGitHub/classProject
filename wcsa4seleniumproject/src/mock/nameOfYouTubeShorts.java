package mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameOfYouTubeShorts {
           public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.instagram.com/");
			 Thread.sleep(2000);
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.quit();
		}
	}


