package week3.day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement search = driver.findElement(By.xpath("//div[contains(@class,'nav-search-field ')]/input"));
		search.sendKeys("Bags");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='left-pane-results-container']/div[6]")).click();
		
		WebElement results = driver.findElement(By.xpath("//div[contains(@class,'sg-col-inner')]//span[contains(text(),'50,000')]"));
		String result = results.getText();
		System.out.println(result);
		
		driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i[contains(@class,'a-icon')])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i[contains(@class,'a-icon')])[4]")).click();
		
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		driver.findElement(By.xpath("//div[@class='a-popover-inner']/ul/li[5]")).click();
		
		WebElement bagName = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]"));
		WebElement bagPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));

		String bgName = bagName.getText();
		String bgPrice = bagPrice.getText();
		System.out.println("Bag Name: "+bgName);
		System.out.println("Bag Price: "+bgPrice);
		
		String title = driver.getTitle();
		System.out.println("Title :"+title);
		driver.close();
	}

}
