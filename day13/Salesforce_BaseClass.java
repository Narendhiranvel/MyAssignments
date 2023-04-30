package week4.day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Salesforce_BaseClass {
	public EdgeDriver driver;
	public EdgeOptions eo;
	
	@BeforeMethod
	public void preCondition() throws InterruptedException {
		eo = new EdgeOptions();
		eo.addArguments("--disable-notifications");
		driver = new EdgeDriver(eo);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		
		WebElement Opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click()", Opportunities);
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}

}
