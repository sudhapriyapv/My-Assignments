package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt=new ChromeOptions() ;
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag, 150, 70).perform();
		driver.close();

	}

}
