package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TableRowandColumn {

	public static void main(String[] args) {

		ChromeOptions opt=new ChromeOptions() ;
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Actions act =new Actions(driver);
		act.scrollByAmount(0,1300).perform();
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='render']/table//tr"));
		List<WebElement> column = driver.findElements(By.xpath("//div[@class='render']/table/thead/tr/th"));
		System.out.println("No of rows in table " +row.size());
		System.out.println("No of columns in table " +column.size());
		driver.close();
	}

}
