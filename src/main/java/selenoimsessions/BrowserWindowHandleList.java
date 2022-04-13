package selenoimsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleList {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		
		Set<String>handels=driver.getWindowHandles();
		
		List<String> handlesList = new ArrayList<String>(handels);
		
//		for(String e:handlesList) {
//			System.out.println(e);
//		}
		
		String parentWindowID=handlesList.get(0);
		String childWindowID=handlesList.get(1);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}

