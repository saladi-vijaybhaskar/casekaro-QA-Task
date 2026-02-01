package pages;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class CartPage {

    private final Page page;

    public CartPage(Page page) {
        this.page = page;
    }
    
    public void opencart() {
    	page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Cart 3 items")).click();
    }

    public void validateItems() {
    	Locator cartItems = page.locator(".cart-item");

    	assertThat(cartItems).hasCount(3);
    	assertThat(cartItems).containsText("BMW Stripes Pattern");

    }
}
