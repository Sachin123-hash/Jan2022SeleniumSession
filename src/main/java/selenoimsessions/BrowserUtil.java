package selenoimsessions;

import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	/**
	 * This mehtod is used to initialize the driver on the basis of given browser
	 * 
	 * @param browserName
	 * @return This returns the driver
	 */

	public WebDriver driver;

	public WebDriver launchBrowser(String browserName) {

		System.out.println("broswer name is:" + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();

			//System.setProperty("webdriver.chrome.driver",
				//	"C:\\Users\\bgh55100\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();

			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\bgh55100\\Downloads\\geckodriver-v0.30.0-win32");

			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {

			driver = new SafariDriver();
		}

		else {
			System.out.println("please pass the correct browsr" + browserName);
		}

		return driver;
	}

	public void launchUrl(String url) {

		if (url == null) {
			System.out.println("please pass the right url");
		}
		

			if (url.contains("https") || url.contains("http")) {
				driver.get(url);
			} else {
				driver.close();
			try {
				throw new Exception("INVALIDURLEXCEPTION - please pass the right url");
			}
			catch(Exception e ) {
				e.printStackTrace();
			}
		}

	}
	
	
//	public void launchUrl(URL url){
//		
//		driver.navigate().to(url);
//		
//		
//	}
		
	

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
