package project;
                                                              //popup//span[@id='denyBtn']
import java.time.Duration;                                   //  ring (//a[@title='Rings'])[1]
                                                             //move to dimond//a[.='DIAMOND RINGS']
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@id='denyBtn']")).click();//handle popup
	Actions act =new Actions(driver);
	WebElement ring = driver.findElement(By.xpath("(//a[@title='Rings'])[1]"));//move to Ring webElement
	Thread.sleep(2000);
	act.moveToElement(ring).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Diamond Rings ']")).click();
}
}
