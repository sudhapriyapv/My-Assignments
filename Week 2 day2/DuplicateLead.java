package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sub");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		WebElement name1 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String fname1= name1.getText();
		System.out.println("First name captured is " +fname1);
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String text = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		System.out.println("Page name is "+text);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement name2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String fname2= name2.getText();
		System.out.println("Duplicate First name captured is " +fname2);
		if(fname1.equals(fname2)) {
			System.out.println("Both first name are same");
		}else {
			System.out.println("Both first name are different");
		}
		driver.close();
		

	}

}
