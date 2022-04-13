package selenoimsessions;

import java.net.URI;

public class AmazonTest {

	public static void main(String[] args) {

		
		BrowserUtil br = new BrowserUtil();
		
		br.launchBrowser("chrome");
		br.launchUrl("https://fasttest.cs.ciena.com/");
		//br.launchUrl(new URI("http://www.amazon.com"));
		String title =br.getPageTitle();
		System.out.println(title);
		
//		if(title.contains("Amazon")) {
//			System.out.println("correct tittle");
//		}else {
//			System.out.println(" in correct tittle");

			
		//}
		System.out.println(br.getPageUrl());
		br.closeBrowser();
	}

}
