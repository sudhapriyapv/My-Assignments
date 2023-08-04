package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inputPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("Sudha");
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']")).sendKeys("-India");
		boolean enabled = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']")).isEnabled();
		if(enabled) { 
			System.out.println("Checkbox is Enabled");
		} else {
			System.out.println("Checkbox is disabled");
		}
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		WebElement retrive = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		String text=retrive.getAttribute("value");
		System.out.println(text);
		WebElement email = driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]"));
		email.sendKeys("test@gmail.com");
		email.sendKeys(Keys.TAB);
		WebElement enter = driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']"));
		enter.sendKeys(Keys.ENTER);
		String error= driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		System.out.println(error);
		WebElement name = driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']"));
		name.sendKeys("Priya");
		name.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-item-label='Priya2']")).click();
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).sendKeys("03/28/1988");
		driver.findElement(By.xpath("//input[@class='ui-spinner-input ui-inputfield ui-state-default ui-corner-all']")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("25");
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).click();
		
	}

}
