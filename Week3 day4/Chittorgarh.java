package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chittorgarh {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		List<WebElement> securityname = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//td"));
		
		List<String> list=new ArrayList<String>();
		for(int i=0; i<securityname.size(); i++) {
			list.add(securityname.get(i).getText());
		}
		Set<String> set= new HashSet<String>(list);
		if(set.size()==list.size())
			System.out.println("Duplicates are not removed");
		else
			System.out.println("Duplicates are removed");
		driver.close();
	}

}
