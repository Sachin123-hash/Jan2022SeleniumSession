package selenoimsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2);
		
		//driver.switchTo().frame("main");
		//frame is also a web element
		//html tags:frame,iframe
		//frame is overloaded method
		//NoSuchFrameException: no such frame : In case frame is not present
		
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		
		String header=driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);
		
		//driver.switchTo().parentFrame();  //selenium 4
		
		driver.switchTo().defaultContent();//main page
		
		
		//SalesForce UI
		
		         //random pop up: limitation,can't handle
				//QA : disable adv. pop ups
		
		
		
	}

}
