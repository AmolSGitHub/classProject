package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/search?q=gmail+login&oq=&aqs=chrome.0.35i39i362l7j69i59i450.1188184439j0j15&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("//h3[.='Gmail - Google']")).click();
		driver.findElement(By.xpath("//a[.='Sign in']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("amolsarode363@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
	}

}
