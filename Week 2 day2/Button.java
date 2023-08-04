package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Button {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']")).click();
		String pgname = driver.getTitle();
		System.out.println("Page name is " +pgname);
		driver.findElement(By.xpath("//i[@class='pi pi-align-left']")).click();
		driver.findElement(By.xpath("//span[text()='Element']")).click();
		driver.findElement(By.xpath("//span[text()='Button']")).click();
		boolean enabled = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		if(enabled) { 
			System.out.println("Checkbox is Enabled");
		} else {
			System.out.println("Checkbox is disabled");
		}
		WebElement element = driver.findElement(By.className("ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left mr-2"));
		Point location = element.getLocation();
		System.out.println("Position is " +location);
		
		
	}

}
