package week4.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnDynamicWebTable {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node0lgq11cum8lqi1oiz55h9gk3eg213714.node0");
		String firstName = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[1]")).getText();
		System.out.println(firstName);
		
		List<WebElement> data1 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td[1]"));
		int column = data1.size();
		
		for(int i=1; i<column; i++) {
			String text2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr["+i+"]/td")).getText();
			System.out.println(text2);
		}
	}
}
