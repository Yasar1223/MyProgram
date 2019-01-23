package testngexample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priorty {
	@Test(priority=2)
	public void  registerUser() {
		Reporter.log("registerUser",true);
		
	}
	final int i=2;
	@Test(priority=1)
	public void  registerUser1() {
		Reporter.log("deleteUser",true);
		
	}
}
