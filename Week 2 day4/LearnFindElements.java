package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

		public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones");		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> pricelist = new ArrayList<Integer>();
			
		for (int i=0;i<price.size();i++) {
			String text = price.get(i).getText();
			String replace = text.replaceAll(",", "");
			int parseint = Integer.parseInt(replace);
			pricelist.add(parseint);
		}
		Collections.sort(pricelist);
		System.out.println(pricelist);
		System.out.println(pricelist.get(0));
		driver.close();
	}

}
