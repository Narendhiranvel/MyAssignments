package testCase;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class TC_001 extends BaseClass {
	
	@Test
	public void runData() {
		LoginPage lp = new LoginPage();
		lp.enterUserName().enterPassword().clickLoginButton().crmSfaLink().leads().createNewLead()
		.enterFirstName("Miller").enterLastName("David").enterCompanyName().clickCreateLead().verification();
	}

}
