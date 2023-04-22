package week4.day11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nyakka {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nykaa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        WebElement brands = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
        Actions brand = new Actions(driver);
        brand.moveToElement(brands).perform();
        driver.findElement(By.xpath("(//li[@class='brand-logo menu-links']/a)[5]")).click();
        
        Thread.sleep(1000);
        String title  = driver.getTitle();
        boolean t1 = title.contains("L'Oreal Paris");
        if(t1 == true) {
        	System.out.println("Page title is correct ");
        }
        else {
        	System.out.println("Page title is not correct ");
        }
        driver.findElement(By.xpath("//span[@class='sort-name']")).click();
        driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
        driver.findElement(By.xpath("(//div[@class='css-xdicx1'])[1]")).click();
        driver.findElement(By.xpath("(//span[@class='side-count'])[2]")).click();
        driver.findElement(By.xpath("(//span[@class='side-count'])[2]")).click();
        driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='css-xdicx1'])[6]")).click();
        driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[11]")).click();
        
        String filter = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
        if(filter.equals("Shampoo")) {
        	System.out.println("Shampoo filter applied ");
        }
        driver.findElement(By.xpath("//div[@class='css-43m2vm']")).click();
        
        Thread.sleep(2000);
        //Window Handle
  		
        		Set<String> windowHandle = driver.getWindowHandles();
        		for(String eachWindow : windowHandle) {
        			System.out.println(eachWindow);
        		}
        		List<String> allLinks = new ArrayList<String>(windowHandle);
        		driver.switchTo().window(allLinks.get(1));
        		String title2 = driver.getTitle();
        		System.out.println(title2);
        		
        		driver.findElement(By.xpath("//span[text()='180ml']")).click();
        		String mrp = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
        		String ReMrp = mrp.replaceAll("₹", "");
        		System.out.println("MRP: "+ReMrp);
        		
        		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
        		Thread.sleep(1000);
        		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
        	
        		Thread.sleep(2000);
        		driver.switchTo().frame(0);
        		String grandTotal = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
        		String gt = grandTotal.replaceAll("₹", "");
        		System.out.println("Grand Total: "+gt);
        		
        		Thread.sleep(2000);
  			driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]")).click();
  			Thread.sleep(2000);
  			driver.switchTo().defaultContent();
  			driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]")).click();
  			driver.findElement(By.xpath("(//img[@class='css-16z7tzi ek8d9s80'])[2]")).click();
  			driver.findElement(By.xpath("(//span[@class='css-1b232xc ehes2bo3']//img)[2]")).click();
  			String paying = driver.findElement(By.xpath("(//div[@class='css-vlqrtx e1d9ugpt3']/p)[3]")).getText();
  			System.out.println(paying);
  				if(paying.equals(grandTotal)) {
  					System.out.println("The grand total is the same");
  				}else {
  					System.out.println("Grand total value has changed");
  				}
  			driver.quit();
	}

}
