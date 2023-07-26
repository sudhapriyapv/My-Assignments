package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("http://leaftaps.com/opentaps/control/main");

		driver1.manage().window().maximize();

		driver1.close();
	}

}
