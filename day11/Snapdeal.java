package week4.day11;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.snapdeal.com/");
        
        WebElement hoverMens = driver.findElement(By.xpath("(//span[contains(text(),'Me')])[1]"));
        Actions mens = new Actions(driver);
        mens.moveToElement(hoverMens).perform();
        
        driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
        WebElement shoeCount = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]"));
        String count = shoeCount.getText();
        System.out.println("Number of men's Sports shoe: "+count);
        WebElement tS = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
        String trainingShoes = tS.getText();
        tS.click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
        driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
        
        Thread.sleep(1000);
        
        String firstPrice = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]")).getText();
        String r1 = firstPrice.replaceAll("Rs. ", "");
        String secondPrice = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[2]")).getText();
        String s1 = secondPrice.replaceAll("Rs. ", "");
        int fp = Integer.parseInt(r1);
        int sp = Integer.parseInt(s1);
        if(fp<sp) {
        	System.out.println("Sorted as expected from low to high");
        }
        else {
        	System.out.println("Not sorted as expected");
        }
        
        Thread.sleep(1000);
        
        WebElement priceScroll = driver.findElement(By.xpath("//div[@class='filter-inner']//a[1]"));
        Actions priceRange = new Actions(driver);
        priceRange.dragAndDropBy(priceScroll, 41, 0).perform();
        
        Thread.sleep(1000);
        
        WebElement priceScroll2 = driver.findElement(By.xpath("//div[@class='filter-inner']//a[2]"));
        Actions priceRangeEnd = new Actions(driver);
        priceRangeEnd.dragAndDropBy(priceScroll2, -78, 0).perform();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list ']//label)[2]")).click();
        String trainShoeFilter = driver.findElement(By.xpath("//div[text()='Training Shoes']")).getText();
        if(trainingShoes.equals(trainShoeFilter)) {
        	System.out.println("Training shoe filter applied");
        }
        
        String startPrice = driver.findElement(By.xpath("//span[@class='from-price-text']")).getText();
        String spParse = startPrice.replaceAll("Rs ", "");
        String toPrice = driver.findElement(By.xpath("//span[@class='to-price-text']")).getText();
        String toParse = toPrice.replaceAll("Rs ", "");
        if(spParse.equals("500") && toParse.equals("550")) {
        	System.out.println("Price filter applied");
        }
        
        WebElement shoeHover = driver.findElement(By.xpath("//picture[@class='picture-elem']"));
        Actions shoeHo = new Actions(driver);
        shoeHo.moveToElement(shoeHover).perform();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
        String selectedSp = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
        String selectedDp = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
        System.out.println("Shoe Price: "+selectedSp+" Shoe Discount: "+selectedDp);
        Thread.sleep(2000);
        
        // Screen Shot
        File scr = driver.getScreenshotAs(OutputType.FILE);
     	File dst = new File("./ScreenShots/shoe.png");
     	FileUtils.copyFile(scr, dst);
     	Thread.sleep(1000);
     	
     	driver.findElement(By.xpath("//div[@class='close close1 marR10']/i")).click();
        
	}

}
