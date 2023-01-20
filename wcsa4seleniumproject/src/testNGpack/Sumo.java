package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
	  @Test
	  public void sumo() 
	  {
		 Reporter.log("This is method of sumo class",true);
	  }
	  @Test
	  public void sumo1()
	  {
		  Reporter.log("This is sumo1 mehtod!!!",true);
	  }
	  @Test
	  public void sumo2()
	  {
		  
		  Reporter.log("This is sumo2 method!",true);
	  }
	}