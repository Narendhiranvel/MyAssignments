package week4.day11;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class ClassRoom1 {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement source = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		source.clear();
		source.sendKeys("ms");
		source.sendKeys(Keys.ENTER);
		
		WebElement desti = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		desti.clear();
		desti.sendKeys("mumbai");
		desti.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> trains = driver.findElements(By.xpath("//div[@id ='divMainWrapper']//table//tr//td[2]"));
		int column = trains.size();
		for(int i=1; i<column; i++) {
			String text2 = driver.findElement(By.xpath("//div[@id ='divMainWrapper']//table//tr["+i+"]/td[2]")).getText();
			System.out.println(text2);
		}
	}

}
