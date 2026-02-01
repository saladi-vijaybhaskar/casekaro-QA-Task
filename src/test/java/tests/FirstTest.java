//package tests;
//
//import com.microsoft.playwright.*;
//
//public class FirstTest {
//	
//	public static void main(String[] args) {
//		try(Playwright playwright=Playwright.create()){
//			Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//			Page page=browser.newPage();
//			page.navigate("https://google.com");
//			System.out.println("The page Title is : "+page.title());
//			browser.close();
//		}
//	}
//
//}

package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import base.BaseTest;

public class FirstTest extends BaseTest {

	@Test  // TestNG annotation
	public void verifyTitle() {
		page.navigate("https://google.com/ncr");

		// to handle cookie popup

		if (page.isVisible("butto:has-text('Accept all')")) {
			page.click("butto:has-text('Accept all')");
		}

		System.out.println("Google NCR opened successfully...!");
		System.out.println("The page Title is : " + page.title());

	}

//	public static void main(String[] args) {
//		try (Playwright playwright = Playwright.create()) {
//			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//			Page page = browser.newPage();
//			page.navigate("https://google.com");
//			System.out.println("The page Title is : " + page.title());
//			browser.close();
//		}
//	}

}
