package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver dr=new EdgeDriver();
		
		//ChromeDriver dr=new ChromeDriver();	
		dr.get("https://login.salesforce.com/");
		dr.manage().window().maximize();
		dr.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement password = dr.findElement(By.id("password"));
		password.sendKeys("Leaf@123");
		dr.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		dr.close();
		}

}
