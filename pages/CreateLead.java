package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class CreateLead extends BaseClass {
	
	public CreateLead enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
		
	}
    public CreateLead enterLastName(String lName) {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
    public CreateLead enterCompanyName() {
    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IPL");
		return this;
	}
    public ViewLead clickCreateLead() {
    	driver.findElement(By.name("submitButton")).click();
//    	ViewLead vL = new ViewLead();
//    	return vL;
    	
    	return new ViewLead();
    }

}
