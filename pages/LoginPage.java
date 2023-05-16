package pages;

import org.openqa.selenium.By;
import baseClass.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Method 1
		//HomePage hp = new HomePage();
		//return hp;
		
		// Method 2
		return new HomePage();
	}

}
