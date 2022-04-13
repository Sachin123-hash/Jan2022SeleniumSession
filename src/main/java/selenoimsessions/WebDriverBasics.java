package selenoimsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// windows
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bgh55100\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// mac:
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");

		//Top casting
		WebDriver driver = new ChromeDriver(); // launch chrome
		
		driver.get("https://google.com");  //enter url
		
		String title=driver.getTitle();   //get the page title
		 
		System.out.println(title);
		
		//validation point/ checkpoint/ act vs exp result / assertions
		
		if(title.equalsIgnoreCase("Google")) {
			System.out.println("correct title");
		}else {
			System.out.println("in correct title");
			
		}
		
		System.out.println(driver.getCurrentUrl().contains("google"));
		
		System.out.println(driver.getPageSource().contains("Copyright The Closure Library Authors"));
		
		//automation steps + //validation point/ checkpoint/ act vs exp result / assertions
		//Automation Testing
		
		driver.quit();  //close browser
		
		
		
		

	}

}
