package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
	  @Test
	  public void remo() 
	  {
		 Reporter.log("This is method of remo class",true);
	  }
	  @Test
	  public void remo1()
	  {
		  Reporter.log("This is remo1 mehtod!!!",true);
	  }
	  @Test
	  public void remo2()
	  {
		  
		  Reporter.log("This is remo2 method!",true);
	  }
	}