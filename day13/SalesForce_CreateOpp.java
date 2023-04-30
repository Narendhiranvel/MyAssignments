package week4.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesForce_CreateOpp extends Salesforce_BaseClass {

	@Test
	public void CreateOpp() throws InterruptedException {
		
		
		WebElement oppName = driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']//input)[3]"));
		oppName.sendKeys("Salesforce Automation by Narendhiran");
		oppName.getText();
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='30']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		String OppNameFinal = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
			if(OppNameFinal.equals("Salesforce Automation by Narendhiran")) {
				System.out.println("Opportunity Name is verified and is the correct value");
			}else {
				System.out.println("Opportunity Name is wrong, please check");
			}
		Thread.sleep(2000);
	}
}
