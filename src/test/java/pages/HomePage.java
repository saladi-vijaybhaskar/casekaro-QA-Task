package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {
	private final Page page;
//	private final String Mobilecovers="getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(\"Mobile Cases & Covers\"))";
//	
	public HomePage(Page page) {
		this.page=page;
	}
	
	public void clickMobileCovers() {
		page.getByRole(AriaRole.LINK,
                new Page.GetByRoleOptions().setName("Mobile Cases & Covers"))
            .click();
	}
}
