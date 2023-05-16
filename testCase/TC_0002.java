package testCase;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class TC_0002 extends BaseClass {
	@Test
	public void runDataTwo() {
		LoginPage lp = new LoginPage();
		lp.enterUserName().enterPassword().clickLoginButton();
	}

}
