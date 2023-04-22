package week4.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDraggable {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement draggable = driver.findElement(By.id("draggable"));
		Actions drag = new Actions(driver);
		drag.dragAndDropBy(draggable, 155, 120).perform();
	}

}
