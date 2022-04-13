package selenoimsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");//launch google
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com/");//go to amazon
		System.out.println(driver.getTitle());
		
		//driver.navigate().to(new URL("https://www.amazon.com"));
		
		driver.navigate().back();  //come back to google
		System.out.println(driver.getTitle());
		
		driver.navigate().forward(); // go to amazon
		System.out.println(driver.getTitle());
		
		driver.navigate().back();  //come back to google
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		driver.quit();
		
		

		
		
		
	}

}
