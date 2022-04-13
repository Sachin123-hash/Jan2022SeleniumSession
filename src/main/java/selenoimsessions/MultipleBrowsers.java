package selenoimsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowsers {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String parentWindowId=driver.getWindowHandle();
		
		//switiching the domain:
		
		
//		WebDriver driver1 = new ChromeDriver();
//		driver.get("https://google.com");
//		
//		driver1.close();
		
		//switch to a different domain:
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://amazon.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
