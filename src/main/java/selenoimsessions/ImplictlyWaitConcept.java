package selenoimsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplictlyWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//script--->app
		//Thread.sleep(5000);-->//if ele is coming in 2s then 3s will be waste ,so should not use
		
		
		//dynamic wait:
		
		//implicaity wait:
		//global wait: it will be applicable fot the web element
		//FE:implicaity wait will be applied by default
		//it works only for web elements
		//it does not work for non web elements:alerts,url,title
		//we avoid implicity wait in framework design
		
		
		
		/**
		 * 
		 * Specifies the amount of time the driver should wait
		 *  when searching for an element if it is not immediately present.

			When searching for a single element, 
			the driver should poll the page until the element has been found, 
			or this timeout expires before throwing a NoSuchElementException. 
			
			When searching for multiple elements, 
			the driver should poll the page until at least one element has been found
			 or this timeout has expired.

			Increasing the implicit wait timeout should be used judiciously 
			as it will have an adverse effect on test run time, 
			especially when used with slower location strategies like XPath.
		 */
		
		
		
		
		
		
		
	
		
		//timeout = 10sec-->ele is coming in 2sec--->8 sec is igonred
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By email = By.id("input-email11");
		driver.findElement(email).sendKeys("test@123.com");
		//e3 e4 
		
		
		//home page:
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//e5 e6
		//logout:
		//login page:it will e applied 5 sec so override to 10s
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on register:
		//register page requires 15sec so again override
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//e9 e10
		//product page: 0 secs-nullify implicaity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//



		
		
		
		
		
		
		
	}

}
