package week4.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Salesforce_TomoDate extends Salesforce_BaseClass{

	@Test
	public void nextDate() throws InterruptedException {
		
		WebElement closeDate = driver.findElement(By.xpath("(//input[@class='slds-input'])[3]"));
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='1']")).click();
		closeDate.click();
		closeDate.sendKeys("5/1/2023");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		
		String message = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
		if(message.contains ("Review the following fields")){
				System.out.println("Error message has appeared: "+"\n"	+message);
		}else {
			System.out.println("Warning has not appeared");
		}

	}

}
