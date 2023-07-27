package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CTS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("lasttest");

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1=new Select(source);
		dd1.selectByVisibleText("Employee");
		
		WebElement marketCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));         
        Select dd2=new Select(marketCamp);
        dd2.selectByIndex(7);
        
        WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));         
        Select dd3=new Select(ownership);
        dd3.selectByValue("OWN_CCORP");
        
        WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));         
        Select dd4=new Select(country);
        dd4.selectByVisibleText("India");
        
        driver.findElement(By.name("submitButton")).click();
        
        //Thread.sleep(6000);
        String title1= driver.getTitle();
		System.out.println(title1);
		driver.close();
		

	}

}
