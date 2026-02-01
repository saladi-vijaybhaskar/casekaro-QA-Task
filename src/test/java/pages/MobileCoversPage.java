package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class MobileCoversPage {
	private final Page page;
//	private final String Mobilecovers="getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(\"Mobile Cases & Covers\"))";
//	
	public MobileCoversPage(Page page) {
		this.page=page;
	}
	
	public void fillsearchbox() {
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search your phone model…")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search your phone model…")).fill("iPhone");
		
		
	}
	
	public void searchforIphone() {
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("iPhone 16 Pro").setExact(true)).click();;
	}
	
	
	
	
	
}
