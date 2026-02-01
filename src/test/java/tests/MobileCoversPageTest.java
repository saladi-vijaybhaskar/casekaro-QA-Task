package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class MobileCoversPageTest extends BaseTest {
	@Test
	public void test() {
		
		
		page.navigate("https://casekaro.com/");
		
		HomePage homepage=new HomePage(page);
		
		homepage.clickMobileCovers();
		
	}
}
