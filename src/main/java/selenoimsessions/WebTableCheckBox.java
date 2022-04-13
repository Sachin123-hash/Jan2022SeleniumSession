package selenoimsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckBox {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(
				"https://selectorshub.com/xpath-practice-page/");
		selectUsername("Joe.Root");
	}

	public static void selectUsername(String name) {
		
		driver.findElement(By.xpath("//a[contains(text(),'Joe.Root')]/parent::td/preceding-sibling::td/child::input[@type='checkbox']")).click();
		
	}
}
