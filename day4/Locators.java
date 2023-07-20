package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(" https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");    
        driver.findElement(By.id("password")).sendKeys("Leaf@1234");
        driver.findElement(By.id("Login")).click();
        
        //Thread.sleep(6000); 
        String title= driver.getTitle();
        System.out.println(title);
        driver.close();
		}
}

