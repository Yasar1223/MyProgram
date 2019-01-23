package testngexample;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuiteFile {
	@Parameters("area")
	@Test
	public void testA(String a) {
		Reporter.log(a, true);

	}
}
