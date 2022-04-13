package selenoimsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/38622/ind-vs-sl-1st-test-sri-lanka-tour-of-india-2022");
		// driver.get("https://www.bigbasket.com/");

		//driver.get("https://demo.opencart.com/index.php?route=account/login");

		// driver.get("https://www.amazon.com");

		// driver.get("https://demo.opencart.com/index.php?route=account/register");

		// formula-------//htmltag[@attribute='value']

		// xpath using id

		// driver.findElement(By.xpath("//input[@id='input']")).sendKeys("tea");

		// xpath using img
		// driver.findElement(By.xpath("//img[@alt='GooglePlay-BB']")).click();

		// xpath using type
		// driver.findElement(By.xpath("//button[@type='submit']")).click();

		// xpath using two attributes
		// driver.findElement(By.xpath("//span[@title='Your Basket' and
		// @class='hidden-xs hidden-sm']")).click();

		// driver.findElement(By.xpath("//input[@type='text' and @id='input'
		// ]")).sendKeys("tea");

		// xpath using * ---when you give * it will search for all the elements

		// driver.findElement(By.xpath("//*[@id='input']")).sendKeys("tea");

		// xpath using contains

		// driver.findElement(By.xpath("//a[contains(@class,'bb-offers-link')]")).click();

		// xpath using two contains

		// driver.findElement(By.xpath("//input[contains(@name,'email')and
		// contains(@id,'input-email')]")).sendkeys("test@123.com");

		// xpath using text();

		// driver.findElement(By.xpath("a[text()='My Account']");
		// driver.findElement(By.xpath("h2[text()='Returning Customer']");

		// using xpath with text() and @attr
		// driver.findElement(By.xpath("a[text()='Buy Again' and
		// @data-csa-c-content-id='nav_cs_buy_again']");

		// using xpath with contains and text

		// driver.findElement(By.xpath(" //a[contains(text(),'Gift') and
		// contains(@href,'gift-cards')]"));

		// using xpath with start-with

		// driver.findElement(By.xpath("//a[starts-with(text(),'Gift')]"));

		// driver.findElement(By.xpath("//a[starts-with(@data-csa-c-type,'link') and
		// contains(text(),'Registry')]"));

		// xpath using indexing

		// driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("test");

		// using position

		// driver.findElement(By.xpath("(//input[@class='form-control'])[position()=1]")).sendKeys("test");

		// driver.findElement(By.xpath("//div[@class='navFooterLinkCol
		// navAccessibility'])[4]//a"));

		// last();

		// driver.findElement(By.xpath("(//input[@type='text' or @type='email' or
		// @type='tel' or @type='password'])[last()]")).sendKeys("1234");

		// ((//div[@class='navFooterLinkCol navAccessibility'])[last()-1]//a)[last()]

		// parent to child
		//driver.findElement(By.xpath("(//div[@class='form-group'])[1]/input[contains(@id,'email')]")).sendKeys("test");

		// (/) --> direct child elements
		// (//) --> direct + indirect child elements
		
		//parent to child
		//form[@id='hs-login']/div -- 8
		 //form[@id='hs-login']//div --20
		
		//div[@class='private-form__input-wrapper']/child::input
		//form[@id='hs-login']//child::div
		
		//child to parent:
			//input[@id='username']/../../../../../../../../../..
			//input[@id='username']/parent::div
			//input[@id='username']/..
			//input[@id='username']/ancestor::div
		
		
		//System.out.println(driver.findElement(By.xpath("//a[contains(text(),' Virat Kohli ')]/parent::div/following-sibling::div/span")).getText());
		
		
		
		List<WebElement> ele=driver.findElements(By.xpath("//a[contains(text(),' Virat Kohli ')]/parent::div/following-sibling::div/span"));
		
		System.out.println(ele);

	}

}
