package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContexClickMethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search?q=instagram&oq=i&aqs=chrome.3.69i57j35i39l2j0i131i433i512j46i131i199i433i465i512j69i61j69i60l2.7338j0j7&sourceid=chrome&ie=UTF-8");
        Thread.sleep(2000);
        WebElement target = driver.findElement(By.xpath("//h3[text()='Instagram']"));
       Actions act = new Actions(driver);
       //act.moveToElement(target).perform();
      // act.contextClick(target).perform();
       act.doubleClick(target).perform();
       
        

	}

}
