package selenoimsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsAlterPopUp {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//driver.findElement(By.name("proceed")).click();
		
		//if alert is not there:NoAlertPresentException:no such alert
		
		Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println(text);
		
		//alert.sendKeys("testing");
		
		Thread.sleep(3000);
		
		
		
		alert.accept();//click on ok button
		
		driver.close();
		
		//alert.dismiss();//click on cancel button
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
