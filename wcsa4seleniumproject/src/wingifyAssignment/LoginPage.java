package wingifyAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	@FindBy(id="username") private WebElement UsernameTB;
	@FindBy(id="password") private WebElement PasswordTB;
	@FindBy(id="log-in")   private WebElement LoginButton;
	@FindBy(xpath="input[@class='form-check-input']/ancestor::label[@class='form-check-label']") private WebElement CheckBox;

	// intilization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);

	}


	// utilization
	public WebElement getUsernameTB() {
		return UsernameTB;
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}


	// operational method
	public void validLogin(String validusername,String validpassword) throws InterruptedException 
	{
		if(UsernameTB.isDisplayed())
		{
			UsernameTB.sendKeys(validusername);
		}
		else
		{
            System.out.println("We get the Exception"); 
		}

		Thread.sleep(2000);
		if(PasswordTB.isDisplayed())
		{
		PasswordTB.sendKeys(validpassword);
		}
		else
		{
			 System.out.println("We get the Exception"); 
		}
		Thread.sleep(2000);
		if(LoginButton.isEnabled())
		{
		LoginButton.click();
		}
		
		else 
		{
			System.out.println("it will print false");
		}

	}

	public void invalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		UsernameTB.sendKeys(invalidUsername);
		Thread.sleep(2000);
		PasswordTB.sendKeys(invalidPassword);
		Thread.sleep(2000);
		LoginButton.click();
	}

	public void verifyChkBox() throws InterruptedException
	{
		boolean status = CheckBox.isSelected();
		System.out.println(status);
		Thread.sleep(1000);
		CheckBox.click();
		boolean status2 = CheckBox.isSelected();
		System.out.println(status2);

	}


}
