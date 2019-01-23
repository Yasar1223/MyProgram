package testngexample;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExamples {
	@DataProvider
	public String[][] getdata() {
		String[][] a = new String[2][3];
		
		a[0][1] = "UserA";
		a[0][2] = "A123";
		a[0][3] = "a123";

		a[1][1] = "UserB";
		a[1][2] = "B123";
		a[1][3] = "b123";
		return a;

	}

	@Test(dataProvider = "getdata")
	public void CreateUser(String un, String pw, String cpw) {
		Reporter.log("un:" + un + "pw:" + pw + "cpw:" + cpw, true);

	}
}
