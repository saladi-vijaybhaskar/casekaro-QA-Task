package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class IphonePage {

	private final Page page;

	public IphonePage(Page page) {
		this.page = page;
	}

	public void chooseoptions() {
		page.getByRole(AriaRole.BUTTON,
				new Page.GetByRoleOptions().setName("Choose options BMW Stripes Pattern iPhone 16 Pro Back Cover")).click();;
	}
	
	
	public void pickhard() {
		page.getByText("Hard Variant sold out or").click();
	}
	
	public void addtocart() {
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to cart")).click();
	}
	
	public void exitcrossforcart() {
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
	}
	
	public void picksoft() {
		page.getByText("Soft Variant sold out or unavailable", new Page.GetByTextOptions().setExact(true)).click();
	}
	public void pickglass() {
		page.getByText("Glass Variant sold out or").click();
	}
	
	
	
	
	
}
