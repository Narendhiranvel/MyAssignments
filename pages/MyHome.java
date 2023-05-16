package pages;

import org.openqa.selenium.By;
import baseClass.BaseClass;

public class MyHome extends BaseClass {

	public MyLead leads() {
		driver.findElement(By.linkText("Leads")).click();
//		MyLead mL = new MyLead();
//		return mL;
		
		return new MyLead();
	}

}
