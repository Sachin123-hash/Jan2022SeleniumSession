package Assigement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	public static void main(String[] args) {

		Browser b = new Browser();
		WebDriver driver = b.LaunchBrowser("chrome");

		b.launchUrl("https://fasttest.cs.ciena.com/");

		String title = b.getPageTitle();
		System.out.println(title);

		System.out.println(b.getPageUrl());

//		By firstname = By.id("input-firstname");
//		By lastname = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By confirmpswd = By.id("input-confirm");
		
		//By firstname = By.className("firstname");
		By lastname = By.xpath("//*[@id=\"input-lastname\"]");
		By email = By.cssSelector("#input-email");
		By phone = By.id("input-telephone");
		

		Element e = new Element(driver);

//		e.doSendKeys(firstname, "Sachin");
//		e.doSendKeys(lastname, "Patil");
//		e.doSendKeys(email, "patil4.sp@gmail.com");
//		e.doSendKeys(telephone, "9738023024");
//		e.doSendKeys(password, "test@123");
//		e.doSendKeys(confirmpswd, "test@123");
		
		By preference = By.xpath("//p[contains(text(),'or, a Ciena employee unable to')]");
		e.doClick(preference);
		
		

	}

}
