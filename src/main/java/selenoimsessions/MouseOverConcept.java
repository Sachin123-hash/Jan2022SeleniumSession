package selenoimsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		WebElement parentMenu=driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a"));
		Actions act = new Actions(driver);
		
		act.moveToElement(parentMenu).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navBarMegaNav\"]/li[4]/a")).click();
	}
	
	}

		
		
//		
////		WebElement contentEle=driver.findElement(By.className("menulink"));
////		
////		Actions act = new Actions(driver);
////		
////		act.moveToElement(contentEle).perform();
////		
////		Thread.sleep(2000);
////		
////		driver.findElement(By.linkText("COURSES")).click();
//		Thread.sleep(2000);
//		
////		By parentMenu = By.className("menulink");
////		By childMenu = By.linkText("COURSES");
//		
//		By parentMenu= By.linkText("#");
//		Thread.sleep(2000);
//		
//		By childMenu= By.className("ng-binding active");
//		
//		By subChildMenu = By.className("ng-binding l2select");
//		
//		//selectSubMenu(parentMenu, childMenu);
//		selectSubMenuLevel(parentMenu, childMenu, subChildMenu);
//		
//		
//		
//		
//		
//		
//		}
//	
//	public static WebElement getelement(By locator) {
//		return driver.findElement(locator);
//	}
//	public static void selectSubMenu(By parentMenu,By childMenu) throws InterruptedException {
//		getelement(parentMenu);
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(getelement(parentMenu)).perform();
//		Thread.sleep(2000);
//		
//		getelement(childMenu).click();
//		
//		
//		
//	}
//	
//	public static void selectSubMenuLevel(By parentMenu,By childMenu,By subChildMenu) throws InterruptedException {
//		getelement(parentMenu);
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(getelement(parentMenu)).perform();
//		Thread.sleep(2000);
//		act.moveToElement(getelement(childMenu)).perform();
//		Thread.sleep(2000);
//
//		getelement(subChildMenu).click();
//
//}
//	
//	public static void selectSubMenuLevel(By parentMenu,By childMenu,By subChildMenu1,By subChildmenu2,By subChildMenu3) throws InterruptedException {
//		getelement(parentMenu);
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(getelement(parentMenu)).perform();
//		Thread.sleep(2000);
//		act.moveToElement(getelement(childMenu)).perform();
//		Thread.sleep(2000);
//		act.moveToElement(getelement(subChildMenu1)).perform();
//		Thread.sleep(2000);
//		act.moveToElement(getelement(subChildmenu2)).perform();
//		Thread.sleep(2000);
//		
//		getelement(subChildMenu3).click();
//	}
//}

