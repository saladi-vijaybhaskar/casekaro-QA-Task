package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.HomePage;
import pages.IphonePage;
import pages.MobileCoversPage;

public class HomePageTest extends BaseTest {
	
	@Test
	public void test() {
		
		
		page.navigate("https://casekaro.com/");
		
		HomePage homepage=new HomePage(page);
		MobileCoversPage mobilecoverspage=new MobileCoversPage(page);
		IphonePage iphonepage=new IphonePage(page);
		CartPage cartpage=new CartPage(page);
		
		homepage.clickMobileCovers();
		
		mobilecoverspage.fillsearchbox();
		
		mobilecoverspage.searchforIphone();
		
		iphonepage.chooseoptions();
		
		iphonepage.pickhard();
		
		iphonepage.addtocart();
		
		iphonepage.exitcrossforcart();
		
		iphonepage.chooseoptions();
		
		iphonepage.picksoft();
		
		iphonepage.addtocart();
		
		iphonepage.exitcrossforcart();
		
		iphonepage.chooseoptions();
		
		iphonepage.pickglass();
		
		iphonepage.addtocart();		
		
		iphonepage.exitcrossforcart();
		
		cartpage.opencart();
		
		cartpage.validateItems();
		
		
		
		
	
		
	}

}
