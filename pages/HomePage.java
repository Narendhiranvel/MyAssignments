package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class HomePage extends BaseClass {
	
	public MyHome crmSfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Method 1
//		MyHome mH = new MyHome();
//		return mH;
		
		//Method 2
		return new MyHome();
	}

}
