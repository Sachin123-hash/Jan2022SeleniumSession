package selenoimsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {

		// windows
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bgh55100\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// launch chrome -- 123
		driver.get("https://www.google.com");//enter url
		String title = driver.getTitle(); //get thte page title -- Google
		System.out.println(title);
		
		//driver.quit();//quit browser--sid = null  //NoSuchSessionException: Session ID is null   NoSuchSessionException: Session ID is null
		driver.close();//close browser
		System.out.println(driver.getTitle());//?  //NoSuchSessionException: invalid session id
		//NoSuchSessionException: invalid session id

		//re-initialization of the driver
//		driver = new ChromeDriver();//launch chrome -- 456
//		driver.get("https://www.google.com");//enter url
//		title = driver.getTitle(); //get thte page title -- Google
//		System.out.println(title);

	}

}
