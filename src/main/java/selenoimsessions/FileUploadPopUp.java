package selenoimsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//input type==file is mandatory, if not avavible ask developer to add
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\bgh55100\\OneDrive - Capgemini\\Desktop\\Desktop\\Image/1.JPG");
		
		
		//autoit---only for Windows OS
		
		
		
		

		
	}

}
