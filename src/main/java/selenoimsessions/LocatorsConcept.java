package selenoimsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// formula
		// WebElement+Perform Actions(click,sendkeys,isDisplayed,getText)

		// 1.id
		// 1.
//		
//		driver.findElement(By.id("input-email")).sendKeys("patil4.sp@gmail.com");
//		
//		driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2.
//		WebElement emailid=driver.findElement(By.id("input-email"));
//		
//		WebElement password=driver.findElement(By.id("input-password"));
//		
//		emailid.sendKeys("patil4.sp@gmail.com");
//		password.sendKeys("test@123");

		// 3.By locator:
//		By email=By.id("input-email");
//		By password=By.id("input-password");
//		
//		WebElement emailId=driver.findElement(email);
//		WebElement pwd=driver.findElement(password);
//		
//		emailId.sendKeys("patil4.sp@gmail.com");
//		pwd.sendKeys("test@123");

		// 4. By locator:generic function
//		
//		By email=By.id("input-email");
//    	By password=By.id("input-password");
//    	
//    	getElement(email).sendKeys("patil4.sp@gmail.com");
//    	getElement(password).sendKeys("test@123");

		// 5.By locator:generic functions(GE,actions)
//
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//
//		doSendKeys(email, "patil4.sp@gmail.com");
//		doSendKeys(password, "test@123");
		
		//6.By locator:generic functions(GE,actions) in a utlity class
		
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		
//		eleUtil.doSendKeys(email, "patil4.sp@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");	
		
		//7:Use BrUtil and EleUtil
		
		//8.String locators--->By locator
		
		String email_id = "input-email";
		String password_id = "input-password";
		
		ElementUtil eleUtil = new ElementUtil(driver);

		By email= eleUtil.getBy("id", email_id);
		By password = eleUtil.getBy("id", password_id);
		
		eleUtil.doSendKeys(email, "test@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
	}

	
		
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
}
