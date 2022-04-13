package selenoimsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitWithPolling {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailid = By.id("input-email11");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		waitForElementPresent(emailid, 10, 2000);
		

		
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @param pollingTime
	 * @return
	 */
	public static WebElement waitForElementPresent(By locator, int timeout,int pollingTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofMillis(pollingTime));// sel 4.x
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public static WebElement waitForElementToBeVisible(By locator, int timeout,int pollingTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofMillis(pollingTime));// sel 4.x
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}

}
