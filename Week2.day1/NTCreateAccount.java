package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NTCreateAccount {

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
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account NRI");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		
		WebElement prefcurrency = driver.findElement(By.xpath("//select[@id='currencyUomId']"));
		Select dd1 = new Select(prefcurrency);
		dd1.selectByValue("INR");

		
		driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[contains(@id,'officeSiteName')]")).sendKeys("CTS");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("30000");


		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select dd2 = new Select(industry);
		dd2.selectByValue("IND_SOFTWARE");

		WebElement OwnerShip = driver.findElement(By.name("ownershipEnumId"));
		Select dd3 = new Select(OwnerShip);
		dd3.selectByVisibleText("S-Corporation");


		WebElement Source = driver.findElement(By.name("dataSourceId"));
		Select dd4 = new Select(Source);
		dd4.selectByValue("LEAD_EMPLOYEE");


		WebElement MarketingCampaign  = driver.findElement(By.name("marketingCampaignId"));
		Select dd5 = new Select(MarketingCampaign );
		dd5.selectByIndex(5);

		WebElement StateProvince = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd6 = new Select( StateProvince );
		dd6.selectByValue("TX");

		driver.findElement(By.className("smallSubmit")).click();
		
		String errormsg = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		System.out.println(errormsg);
		
		driver.close(); 

	}

}
