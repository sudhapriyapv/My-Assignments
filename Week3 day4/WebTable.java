package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement from = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		from.clear();
		from.sendKeys("MAS");
		from.sendKeys(Keys.ENTER);
		WebElement to = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		to.clear();
		to.sendKeys("MDU");
		to.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td"));
		System.out.println(column.size());
		
		for (int i = 0; i < column.size(); i++) {
			WebElement Trainname = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]"));
			System.out.println(Trainname);
		}
	
	
	
	}

}
