package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LounchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.dirver","./drivers/chromedriver.exe");
		//if we get illegalsatexecption
       // we need set path with the help of System.setProperty method
		
	  WebDriver driver = new ChromeDriver();//create object for chromedriver and upcasted to webdriver
driver.get("https://www.google.com");
	}

}
