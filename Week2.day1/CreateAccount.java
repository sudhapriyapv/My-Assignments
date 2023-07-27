package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account New");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Sudha");
		driver.findElement(By.xpath("//input[contains(@id,'officeSiteName')]")).sendKeys("CTS");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("35000");


		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select dd1 = new Select(industry);
		dd1.selectByValue("IND_SOFTWARE");

		WebElement OwnerShip = driver.findElement(By.name("ownershipEnumId"));
		Select dd2 = new Select(OwnerShip);
		dd2.selectByVisibleText("S-Corporation");


		WebElement Source = driver.findElement(By.name("dataSourceId"));
		Select dd3 = new Select(Source);
		dd3.selectByValue("LEAD_EMPLOYEE");


		WebElement MarketingCampaign  = driver.findElement(By.name("marketingCampaignId"));
		Select dd4 = new Select(MarketingCampaign );
		dd4.selectByIndex(5);

		WebElement StateProvince = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd5 = new Select( StateProvince );
		dd5.selectByValue("TX");

		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}
}

