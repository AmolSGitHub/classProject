package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import Practice.xpath;

public class Scenarios4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/search?q=Ebay&oq=Ebay&aqs=chrome..69i57.2378j0j7&sourceid=chrome&ie=UTF-8");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Apple Watches");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='gh-sb ']")).click();
		driver.findElement(By.xpath("//option[@value='281']")).click();
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	}

}
