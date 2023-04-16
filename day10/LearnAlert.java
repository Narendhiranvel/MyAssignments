package week3.day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01uldk3u7t5e7hdxth038g3740205018.node0");
		
		//1. Simple Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
        Alert click = driver.switchTo().alert();
        Thread.sleep(1000);
        //click.sendKeys("Testing");
        click.accept();
        
        //2. Confirm Alert
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
        Alert click2 = driver.switchTo().alert();
        Thread.sleep(1000);
        //click.sendKeys("Testing");
        click2.dismiss();
        
      //3. Sweet Alert
        driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
        //Alert click3 = driver.switchTo().alert();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
        
      //4. Sweet Model Dialog
        driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
        //Alert click3 = driver.switchTo().alert();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
        
      //5. Sweet Model Dialog
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        Alert click4 = driver.switchTo().alert();
        click4.sendKeys("checkBox");
        click4.accept();
	}

}
