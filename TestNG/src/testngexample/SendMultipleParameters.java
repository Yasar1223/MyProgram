package testngexample;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SendMultipleParameters {
	@Parameters({ "road", "area" })
	@Test
	public void testA(String road, String area) {
		Reporter.log(road + area, true);

	}
}
