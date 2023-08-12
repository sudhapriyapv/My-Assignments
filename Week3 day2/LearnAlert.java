package week3.day2;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		

		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//span[@id='simple_result']")).getText());
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		System.out.println(driver.findElement(By.xpath("//span[@id='result']")).getText());
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(), 'You have clicked')]")).getText());
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(), 'Unless you close this')]")).getText());
		driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();
				
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		alert.sendKeys("Sudha");
		Thread.sleep(1000);
		alert.accept();
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String text2 = driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//span[text()='Yes']"));
		
		driver.close();
		
	}

}
