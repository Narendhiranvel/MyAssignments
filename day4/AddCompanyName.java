package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddCompanyName {

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
		driver.findElement(By.linkText("My Leads")).click();
		driver.findElement(By.id("ext-gen499")).sendKeys("Genrol");
		driver.findElement(By.id("ext-gen501")).sendKeys("Naren");
		driver.findElement(By.id("ext-gen503")).sendKeys("M");
		driver.findElement(By.id("ext-gen511")).sendKeys("44");
		driver.findElement(By.id("ext-gen515")).sendKeys("524");
		driver.findElement(By.id("ext-gen519")).sendKeys("908765");
		driver.findElement(By.id("ext-gen529")).sendKeys("narge@gmail.com");
		driver.findElement(By.id("ext-gen545")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
