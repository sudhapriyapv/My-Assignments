package week3.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws IOException {

		ChromeOptions opt=new ChromeOptions() ;
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		String price1 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		String count1=price1.replaceAll("[^0-9]", "");
		System.out.println("First product price is " +count1);
		String cusrating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("No of customer rated for first prodcut is " +cusrating);
		
		//String windowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list= new ArrayList<String> (windowHandles);
		driver.switchTo().window(list.get(1));
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dest= new File("./snap/amazonshot.png");
		FileUtils.copyFile(screenshotAs, dest);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.switchTo().window(list.get(1));
		String price2 = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		
		System.out.println("Subtotal price is " +price2);
		driver.quit();		
	}
}
