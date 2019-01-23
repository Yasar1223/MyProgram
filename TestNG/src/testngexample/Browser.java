package testngexample;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser {
	@Parameters({ "road", "area" })
	@Test
	public void testA(@Optional("chrome") String b) {
		Reporter.log(b, true);

	}
}
