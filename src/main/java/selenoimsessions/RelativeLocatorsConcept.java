package selenoimsessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorsConcept {

	public static void main(String[] args) {

		// sel 4.x

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		WebElement ele = driver.findElement(By.linkText("St.-Albert, Canada"));

		String index = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();

		System.out.println(index);

		String index1 = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();

		System.out.println(index1);

		String index2 = driver.findElement(with(By.tagName("p")).below(ele)).getText();

		System.out.println(index2);
		String index3 = driver.findElement(with(By.tagName("p")).above(ele)).getText();

		System.out.println(index3);
		String index4 = driver.findElement(with(By.tagName("p")).near(ele)).getText();

		System.out.println(index4);
		
		List<WebElement>above=driver.findElements(with(By.tagName("p")).above(ele));
		for(WebElement e:above) {
			System.out.println(e.getText());
		}

	}

}
