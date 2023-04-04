package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddAndUpdateCompany {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		WebElement password =  driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Comapany.ltd");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Leaf");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestN");
		
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("AlteredName");
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		driver.close();
		}

}
