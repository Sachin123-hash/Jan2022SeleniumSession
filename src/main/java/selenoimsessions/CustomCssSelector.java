package selenoimsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelector {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		//css selector
		
		//id--->#id--------------->#input-email
		//class--->.class--------------->.form-control
		
		
		//#input-email.form-control
		//tag#id
		//input#input-email
		
		//tag.class
		//input.form-control-->tag and class
		//.form-control#input-email-->combing class and id
		
		//.c1.c2.c3......cn
		
		
		//.nav-input.nav-progressive-attribute
		
		//input.form-control#input-email
		
		//a.btn-orange.contact-ohrm --->using a tag
		
		
		//form-control private-form__control login-email
		
		//form-control private-form__control login-password m-bottom-3
		
		
		//cssSelector//input.form-control.private-form__control.login-email
		
		//xpath//input[@class='form-control private-form__control login-email']
		
		//className("login-email")
		
		//input.form-control.login-password 
		
		
		//cssSelector//buttton.login-submit
		
		//xpath//button[@class,'login-submit']---->not valid
		
		//xpath////button[contains(@class,'login-submit')]
		
		
		
		
		//how to find the unique value using css
		
		
		//htmltag[atrr1=value]
		
		//css//input[type='submit']
		
		//xpath//input[@type='submit']
		
		//multiple atrr
		
		//htmltag[atrr1=value] [atrr2=value] [atrr3=value]
		
		//css//input[type='submit'][value='Login']
		
		//xpath//input[@type='submit' and @value='Login']
		
		//contains
		//input[id*='email']--->contains
		
		//starts-with
		//button[data-test-id^='password']-->starts-with
		
		//ends-with
		//button[data-test-id$='button']-->ends-with
		
		
		//parent to child --
		//div.private-form__input-wrapper>input#username  ------->direct child
		
		//direct+indirect
		//div.private-form__input-wrapper input#username
		
		
		//form#hs-login div--->20(direct+indirect child)
		//form#hs-login> div--->(direct)
		
		
		//child to parent: not available
		
		//back ward travesing is not allowed in css
		
		
		//following sibling
		//label.control-label + input#input-email
		
		//preceding sibling:not available
		
		
		//not in css
		
		//form-control private-form__control login-email
		
		//form-control private-form__control login-password m-bottom-3
		
		//input.form-control.private-form__control.login-password.m-bottom-3
		
		//input.form-control.private-form__control:not(#username)--->using not
		
		//input.form-control:not(.input-lg)
		
		//comma in css:
		//input#username,input#password,button#loginBtn
		
		//we can't use text based in css--no text support in css
		
		//nth-of-type
		//ul.footer-nav li:nth-of-type(5) >a-->for 5th index
		//ul.footer-nav li:nth-of-type(n) >a--->for all elements
		
		
		          //xpath                                                               CssSelector
		//1.syntax:   hard                                                                simple
		//2.backward: possible                                                             NA
		//3.perform:  same                                                                 same
		//4.comma,not: NA                                                                  Available
		//5.text:      available                                                           Na
		//6.sibling:   available                                                           only forward-sibling
		//7.indexing:   better functions                                                    available --but not simple
		//8.dynamic ele: yes                                                               yes
		
		
		//We are using both combination of Xpath and CSS, most of times we are using Xpath, we have many web tables
		//webtables - preceding, following , checkbox
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
