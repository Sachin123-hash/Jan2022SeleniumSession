package selenoimsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FEAndFEsException {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");

		//driver.findElement(By.linkText("Customers1111")).click();
		//NoSuchElementException
		
		List<WebElement> footerList = driver.findElements(By.xpath("//ul[@class='footer-nav']//a111"));//if wrong xpath or element no found it will not throw any expection it returns 0
		System.out.println(footerList.size());//0
		
		if(footerList.size()>0) {
			System.out.println("footers are preset in page...");
			for(WebElement e:footerList) {
				String text=e.getText();
				System.out.println(text);
				
				
			}
		}

		//
//		if(driver.findElements(By.linkText("Customers")).size() > 0) {
//			System.out.println("customer link is presetn on page");
//		}
		
		System.out.println(isElementPresent(By.linkText("Customers")));
	}
	
		public static boolean isElementPresent(By locator) {
			if(getElements(locator).size()>0) {
				return true;
			}
			return false;
		}
		
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		
		
		
		
		
		
		
	}

}
