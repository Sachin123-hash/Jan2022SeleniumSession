package selenoimsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");  //parent window
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();//child window
		
		Set<String>handles=driver.getWindowHandles();
		
		Iterator<String>it=handles.iterator();
		String parentwindowID=it.next();
		
		System.out.println("parent window id:" +parentwindowID);
		
		String childWindowId=it.next();
		System.out.println("child window id:"+ childWindowId);
		
		
		driver.switchTo().window(childWindowId);
		
		String childWindowTitle=driver.getTitle();
		
		System.out.println("child windows title:"+ childWindowTitle);
		
		driver.close();//close the child window---driver is lost
		//once driver is lost or close---if we don't switch back after closing the child window we get NoSuchWindowException: no such window
		
		driver.switchTo().window(parentwindowID);
		//if we don't switch back after closing the child window we get NoSuchWindowException: no such window
		
		String partenWindowTitle=driver.getTitle();
		
		System.out.println("parent window title:"+partenWindowTitle);
		
		driver.quit();
		
		
		
		

		
		
		
		
		
		
		
	}

}
