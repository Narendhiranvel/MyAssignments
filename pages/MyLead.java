package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class MyLead extends BaseClass {
	
	public CreateLead createNewLead() {
		driver.findElement(By.linkText("Create Lead")).click();
//		CreateLead cL = new CreateLead();
//		return cL;
		
		return new CreateLead();
	}

}
