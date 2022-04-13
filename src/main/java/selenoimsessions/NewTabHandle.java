package selenoimsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.com");

		String parentWindowID = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		driver.close();// close child window
		
		//back to parent window:
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());

	}

}
