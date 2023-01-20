package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiA2L-dBhACEiwAu8Q9YLYqp6YXoVzUoswJBDhuc4wPBoDn_MDXKiEXffGiaDPq6F_i2cMXIhoCLhcQAvD_BwE");
	driver.findElement(By.xpath("//span[@id='denyBtn']")).click();//handle popup
    WebElement allj	=driver.findElement(By.xpath("//a[@title='Jewellery']"));//move on je
    WebElement kadas=driver.findElement(By.xpath("(//span[normalize-space()='Kadas'])[1]"));//move on kadas
    Actions act =new Actions(driver);
    act.moveToElement(allj).moveToElement(kadas).click().perform();
    driver.findElement(By.xpath("(//a[@id='pid_5676'])[1]")).click();//click on kadas
    Thread.sleep(5000);
    WebElement buy = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
    Thread.sleep(2000);
    buy.click();
    Thread.sleep(2000);
    driver.quit();
    
    
	
}
}
