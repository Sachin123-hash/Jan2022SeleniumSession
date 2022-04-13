package selenoimsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMElementHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//driver.findElement(By.id("tea")).sendKeys("masal tea");   //NoSuchElementException

		//Br----page---iFrame---ShadowDOM--input
		
		driver.switchTo().frame("pact");
		
		
		//document.querySelector("#snacktime").shadowRoot.querySelector("#tea")
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement tea=(WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		
		tea.sendKeys("Masala tea");
		
		
		

		
		
		
		
		
		
		
		
	}

}
