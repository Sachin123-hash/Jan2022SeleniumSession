package selenoimsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bgh55100\\Downloads\\geckodriver-v0.30.0-win32");


		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");//enter url
		String title = driver.getTitle(); //get thte page title -- Google
		System.out.println(title);
		
		driver.quit();
	}

}
