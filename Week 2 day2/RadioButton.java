package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		Thread.sleep(1000);
		boolean enabled = driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-blank']")).isSelected();
		if(enabled==true) { 
			System.out.println("Checkbox is Enabled");
		} else {
			System.out.println("Checkbox is disabled");
		}
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]/span"));
		boolean selected = element.isSelected();
		System.out.println("Browser enabled is "+selected);
		
		
		
	}

}
