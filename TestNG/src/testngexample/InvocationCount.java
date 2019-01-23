package testngexample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=3)
	public void  testA() {
		Reporter.log("Run TestA",true);
		
	}
}
