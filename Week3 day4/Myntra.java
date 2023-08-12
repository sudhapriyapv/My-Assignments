package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions opt=new ChromeOptions() ;
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		Actions action=new Actions(driver);
		action.moveToElement(
				driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[@class='desktop-main']"))).perform();
		
		driver.findElement(By.xpath("//ul[@class='desktop-navBlock']//a[text()='Jackets']")).click();
		
		String count = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		int count1 = Integer.parseInt(count.replaceAll("[^0-9]", ""));
		System.out.println("Total no of Jackets available " +count1);
		
		List<WebElement> category = driver.findElements(By.xpath("//ul[@class='categories-list']//label"));
		int catcount=0;
		for(int i=1;i<=category.size();i++) {
			String textname = driver.findElement(By.xpath("(//ul[@class='categories-list']//label)["+i+"]")).getText();
			String textcount = driver.findElement(By.xpath("(//ul[@class='categories-list']//label)["+i+"]/span")).getText();
			int count2 = Integer.parseInt(textcount.replaceAll("[^0-9]", ""));
			System.out.println(textname);
			catcount=catcount+count2;
		}
		System.out.println("Sum of categories amount " +catcount);
		
		if(count1==catcount)
			System.out.println("Both are same");
		else
			System.out.println("Both are different");
		
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
		driver.findElement(By.xpath("//ul[@class='FilterDirectory-list']/li[2]//div")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		List<WebElement> brandname = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3"));
		Set<String> bname=new LinkedHashSet<String>();
		Thread.sleep(2000);
		for (int x=1;x<=brandname.size();x++) {
			String text = driver.findElement(By.xpath("(//div[@class='product-productMetaInfo']/h3)["+x+"]")).getText();
			bname.add(text);
		}
		if(bname.size()==1)
			System.out.println("All items belongs to Duke brand");
		else
			System.out.println("We have other item than Duke brand");
		
		action.moveToElement(driver.findElement(By.xpath("//div[@class='sort-sortBy']"))).perform();
		driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
		String price = driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
		int price1 = Integer.parseInt(price.replaceAll("[^0-9]", ""));
		System.out.println("Total no of Jackets available " +price1);
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		Set<String> fp = driver.getWindowHandles();
		List<String> list= new ArrayList<String>(fp);
		driver.switchTo().window(list.get(1));
		Thread.sleep(1000);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dest= new File("./snap/myntrashot.jpg");
		FileUtils.copyFile(screenshotAs, dest);
		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		driver.quit();
	}

}
