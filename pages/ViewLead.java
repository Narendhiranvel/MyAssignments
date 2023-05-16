package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class ViewLead extends BaseClass {
	 
	public ViewLead verification() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("IPL")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		
		return this;
	}

}
