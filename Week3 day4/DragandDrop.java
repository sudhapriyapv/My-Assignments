package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions() ;
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement move = driver.findElement(By.xpath("//div[@id='form:conpnl_header']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(move, 200, 0).perform();
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		act.dragAndDrop(drag, drop).perform();
		
		WebElement col1 = driver.findElement(By.xpath("(//span[text()='Category'])[1]"));
		WebElement col2 = driver.findElement(By.xpath("(//span[text()='Quantity'])[1]"));
		act.dragAndDrop(col2, col1).perform();
		
		WebElement row1 = driver.findElement(By.xpath("(//td[text()='Black Watch'])[2]"));
		WebElement row2 = driver.findElement(By.xpath("(//td[text()='Game Controller'])[2]"));
		act.dragAndDrop(row2, row1).perform();
		driver.close();
	}

}
