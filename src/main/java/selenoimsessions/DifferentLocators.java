package selenoimsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Assigement.Element;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentLocators {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.opencart.com/index.php?route=account/login");

		//ElementUtil e = new ElementUtil(driver);

		// 1.id-unique-- same element cannot be used for multiple--I

		// 2.name:can be duplicate--II

		// driver.findElement(By.name("email")).sendKeys("test@gmail.com");

//		By emailid = By.name("email");
//		e.doSendKeys(emailid, "test@gmail.com");
		
		//3.className:can be same for the different element--III
		
//		By ele=By.className("form-control");
//		driver.findElement(ele).sendKeys("tesr");
		
		//4.xpath: is not an attribute.this is the address of the element in html dom
//		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		
//		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//		
//		By loginBtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		e.doClick(loginBtn);
		
		//5.css selector:is not an attribute.
		
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		
		
		//6.link text:only for links:
		//html tag:<a>
		
//	By registerLink=	By.linkText("Register");
//		e.doClick(registerLink);
		
		//7.partialLinkText: only for links
		
//		By forgotPwdLink=By.partialLinkText("Forgotten ");
//		e.doClick(forgotPwdLink);
//		
		//8.tagName: html tag,not the  attribute
		
//		String text=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(text);
		
//		By header=By.tagName("h2");
//		By register=By.linkText("Register");
//		
//		String text =e.doElementgetText(header);
//		System.out.println(text);
//		
//		String regText=e.doElementgetText(register);
//		System.out.println(regText);
		
		

		driver.get("https://cappstest.ciena.com/fastweb");

		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://cappstest.ciena.com/fastweb");
		
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("div.col-xs-12:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.id("UserName")).sendKeys("sacpatil");
		driver.findElement(By.id("Password")).sendKeys("Wel@2come");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);

//Project search
		
		driver.findElement(By.id("txtGlobalSearch")).sendKeys("630374");
		Thread.sleep(3000);
		driver.findElement(By.id("btnGlobalSearch")).click();
		
//Dashboard
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//i[@class='fa fa-folder-open-o']")).click();
		
		

	}

}
