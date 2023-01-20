package testNGpack3;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAnnotation {
  @Test
  public void test()
  {
	  Reporter.log("@Test Annotation",true);
  }
  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("@beforeSuite",true);
  }
  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("@afterSuite",true);
  }
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("@beforeClass",true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("@beforeMethod",true);
  }
  @AfterTest
  public void afterTest()
  {
	  Reporter.log("@afterTest",true);
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("@afterMethod",true);
  }
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("@afterClass",true);
  }
  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("@beforeTest",true);
  }
  @Test
  public void test1()
  {
	  Reporter.log("@Test1 Annotation",true);
  }
  
  
}
