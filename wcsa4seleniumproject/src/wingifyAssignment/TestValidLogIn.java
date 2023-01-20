package wingifyAssignment;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestValidLogIn extends BaseTest {

	@Test
	public void testCase1() throws InterruptedException, IOException
	{

		SoftAssert sa = new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		sa.assertEquals(actualLoginPageTitle,EXPECTED_TITLE);
		LoginPage lp = new LoginPage(driver);	

		Flib flib = new Flib();
		lp.validLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		Reporter.log("valid Login test is passed!!!",true);
		sa.assertAll();

	}

	@Test
	public void testCase2() throws InterruptedException, IOException
	{
		SoftAssert sa = new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		sa.assertEquals(actualLoginPageTitle,EXPECTED_TITLE);
		LoginPage lp = new LoginPage(driver);	

		Flib flib = new Flib();


		flib.readPropertyData(PROP_PATH, "Password");
		lp.validLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		
		String actualHomePageTitle = driver.getTitle();
		Assert.assertEquals(actualHomePageTitle,EXPECTED_TITLE2);
		HomePage hp = new HomePage(driver);
		
		
		hp.clickOnAmount();
		hp.sortTheAmounts();
		Reporter.log("test case2 passed!!",true);
	}

}