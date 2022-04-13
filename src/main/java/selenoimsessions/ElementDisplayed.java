package selenoimsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		ElementUtil e = new ElementUtil(driver);
		
		By emailId=By.id("input-email1111");
		
		driver.findElement(emailId).sendKeys("test@gmail.com");
		//NoSuchElementException
		//ElementNotFoundException---is not selenium exception
		
		
		
		
		
		
//		boolean flag=driver.findElement(emailId).isDisplayed();
//		System.out.println(flag);
		
//		if(e.doIsDplayed(emailId)) {
//			e.doSendKeys(emailId, "test@gmail.com");
//		}
//		
//		boolean flag=driver.findElement(emailId).isEnabled();
//		
//		System.out.println(flag);

	}

}
