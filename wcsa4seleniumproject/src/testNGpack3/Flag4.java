package testNGpack3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {//depends on flag
	//
  @Test
  public void logInMethod()
  {
	  Reporter.log("Log in is done!!",true);
  }
  @Test(dependsOnMethods = "logInMethod")
  public void createUser()
  {
	  Reporter.log("User Created",true);
  }
  @Test(dependsOnMethods = "createUser")
  public void logOutMehtod()
  {
	  Reporter.log("Log Out Done!!",true);
  }
}
