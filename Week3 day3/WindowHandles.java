package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get(" https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath(" //a[text()=' FLIGHTS ']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winhan=new ArrayList<String> (windowHandles);
		driver.switchTo().window(winhan.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(winhan.get(0));
		driver.close();
	}

}
