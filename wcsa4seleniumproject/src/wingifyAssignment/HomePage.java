package wingifyAssignment;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage {

	@FindBy(id="amount") private WebElement amountElement;
	@FindBy(xpath = "//td[@class='text-right bolder nowrap']") private List<WebElement> sortTheAmount;

	// intilization

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}




	// utilization

	public WebElement getAmountElement() {
		return amountElement;
	}

	public List<WebElement> getSortTheAmount(){
		return sortTheAmount;
	}

	// operation
	public void clickOnAmount()
	{
		amountElement.click();
	}

	public void sortTheAmounts()
	{
		for(int i=0;i<sortTheAmount.size();i++)
		{
			WebElement amount = sortTheAmount.get(i);
			String sortedAmounts = amount.getText();
			Reporter.log(sortedAmounts,true);
		}

	}



}