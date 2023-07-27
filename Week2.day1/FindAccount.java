package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Acc')]")).click();
		//driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		//Thread.sleep(4000);
		WebElement aname = driver.findElement(By.xpath("(//input[@name='accountName'])[2]"));
		aname.sendKeys("Credit Limited Account");
		System.out.println(aname);
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-groupName']/a[@class='linktext']")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		String text2 = driver.findElement(By.xpath("//input[@id='accountName']")).getText();
		System.out.println(text2);
		
		/*if(text1.equals(text2)) 
		{
			System.out.println("Text are same");
			} else
			{
				System.out.println("Text are different");
			}*/
		
		
		driver.close();

	}

}
