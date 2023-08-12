package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		System.out.println(driver.findElement(By.xpath("//button[@id='Click']")).getText());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);		
		System.out.println(driver.findElement(By.xpath("//button[text()='Count Frames']")).getText());
		driver.switchTo().defaultContent();
		
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		System.out.println(findElements.size());
		
		driver.switchTo().frame(2);//outer frame
		driver.switchTo().frame(0);//inner frame -->index starts with zero
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		 
		
		driver.close();
		

	}

}
