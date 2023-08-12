package week3.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions opt=new ChromeOptions() ;
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@class='catText']"))).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
		String noofitem = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		String count=noofitem.replaceAll("[^0-9]", "");
		System.out.println("No of Products are " +count);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<Integer> pricelist = new ArrayList<Integer>();
		
		for (int i=0;i<price.size();i++) {
			String text = price.get(i).getText();
			String replace = text.replaceAll("Rs. ", "");
			int parseint = Integer.parseInt(replace);
			pricelist.add(parseint);
		}
		Collections.sort(pricelist);
		System.out.println("Available product are " +pricelist);
		
		act.scrollByAmount(0,500).perform();
		
		WebElement price1 = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll')][1]"));
		Thread.sleep(3000);
		act.dragAndDropBy(price1, 15, 0).release().perform();
		
		WebElement price2 = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll')][2]"));
		Thread.sleep(3000);
		act.dragAndDropBy(price2, -45, 0).release().perform();
		
		act.scrollByAmount(0,500).perform();
		
		driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
		String amount = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Price of the product is " +amount);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount Price of the product is " +discount);
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dest= new File("./snap/snapdealshoy.jpg");
		FileUtils.copyFile(screenshotAs, dest);
		driver.close();
	}
}
