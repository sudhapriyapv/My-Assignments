package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 		
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sudha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@test.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9845612378");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	}

}
