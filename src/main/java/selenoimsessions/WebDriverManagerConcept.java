package selenoimsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriverManager.chromedriver().browserVersion("89.0").setup();
		
		//WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		

		
	}

}
