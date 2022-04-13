package Assigement;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public WebDriver driver;

	public WebDriver LaunchBrowser(String broswerName) {

		System.out.println("browser name is:" + " " + broswerName);

		if (broswerName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (broswerName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.out.println("pass the crct browserName" + " " + broswerName);
		}
		return driver;

	}

	public WebDriver launchUrl(String Url) {

		if (Url == null) {
			System.out.println("pass the correct url");
		}
		if (Url.contains("http") || Url.contains("https")) {
			driver.get(Url);
		} else {
			driver.close();
		}
		try {
			throw new Exception("INAVLIDNULLEXCEPTION-pass crct URL");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}
//	
//public void launchUrl(URL url){
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
