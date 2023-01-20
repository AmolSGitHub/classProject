package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() 
  {
	 Reporter.log("This is method of demo class",true);
  }
  @Test
  public void demo1()
  {
	  Reporter.log("This is demo1 mehtod!!!",true);
  }
  @Test
  public void demo2()
  {
	  int a=12/0;
	  Reporter.log("a");
  }
}
