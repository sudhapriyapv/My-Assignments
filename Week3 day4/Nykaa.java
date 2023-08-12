package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.nykaa.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='brands']"))).perform();
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'Paris')]"));
		String text1 = findElement.getText();
		System.out.println(text1);
		findElement.click();
		String text = driver.getTitle();
		System.out.println(text);
		if (text.contains(text1)) {
			System.out.println("L'Oreal Paris products are displayed");
		} else
			System.out.println("Other products are displayed");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='customer top rated']/following::div")).click();
		Thread.sleep(8000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='customer top rated']")));
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		Thread.sleep(8000);
		String shampoo = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
		if(shampoo.equalsIgnoreCase("Shampoo"))
			System.out.println("Shampoo is applied in filter");
		else
			System.out.println("Shampoo is not applied in filter");
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		Set<String> windowHandles = driver.getWindowHandles(); 
		List<String> winhan=new ArrayList<String>(windowHandles);
		driver.switchTo().window(winhan.get(1));
		driver.findElement(By.xpath(" //span[@class=' css-d3w64v']")).click(); 
		String price = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText(); 
		price=price.replaceAll("^[0-9]", "");
		System.out.println("Shampoo price: "+price);
		driver.findElement(By.xpath("(//span[@class='btn-text'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click(); 
		driver.switchTo().frame(0);
		String gtotal = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText(); 
		gtotal = gtotal.replaceAll("^[0-9]", "");
		System.out.println("Grand Total: "+gtotal);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("//p[text()='New Address']/../preceding-sibling::div/span")).click();
		driver.findElement(By.xpath("//p[text()='Price Details']")).click();
		String gtotal1 = driver.findElement(By.xpath("//p[text()='You Pay']//following::p")).getText();
		gtotal1 = gtotal.replaceAll("^[0-9]", "");
		System.out.println("Amount need to pay" +gtotal1);
		
		if(gtotal1.equals(gtotal))
			System.out.println("Both are same");
		
		driver.quit();
	}

}
