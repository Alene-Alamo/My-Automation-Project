package POMsaucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage {
	@FindBy(css = "#add-to-cart-sauce-labs-backpack")
	WebElement product1;
	@FindBy(css = ".inventory_container #item_4_title_link>.inventory_item_name")
	WebElement InterToBackPack;
	@FindBy(css = "#add-to-cart-sauce-labs-onesie")
	WebElement product2;
	@FindBy(css = "#add-to-cart-sauce-labs-bike-light")
	WebElement product3;
	@FindBy(css = "#item_4_title_link .inventory_item_name")
	WebElement text;
	@FindBy(css = ".shopping_cart_link")
	WebElement cart1;
	@FindBy(css = "#add-to-cart-sauce-labs-fleece-jacket")
	WebElement anotherP;
	@FindBy(css = "#remove-sauce-labs-backpack")
	WebElement removeProduct;
	@FindBy(css = "#remove-sauce-labs-fleece-jacket")
	WebElement removeProduct2;
	@FindBy(css = ".product_sort_container")
	WebElement sortProducts;
	@FindBy(css = ".product_sort_container")
	WebElement sortProduct2;
	@FindBy(css = ".product_sort_container>[value='lohi']")
	WebElement LowToH;

	public ProductPage(WebDriver driver) {
		super(driver);

	}

	public void sortItems(String S) {
		sleepS(2000);
		Select Items = new Select(sortProducts);
		Items.selectByValue(S);

	}

	public void sortItems2() {
		clickThat(sortProduct2);
		sleepS(2000);
		clickThat(LowToH);

	}

	public void addProducts() {
		sleepS(2000);
		clickThat(product1);
		clickThat(InterToBackPack);
		driver.navigate().back();
		clickThat(product2);
		clickThat(product3);

	}

	public String gtext() {
		return getText(text);

	}

	public void Cart() {
		sleepS(1000);
		clickThat(cart1);
		driver.navigate().back();
	}

	public void anotherProduct() {
		sleepS(700);
		clickThat(anotherP);

	}

	public void removeP() {
		sleepS(1000);
		clickThat(removeProduct);

	}

	public void removeP2() {
		clickThat(cart1);
		sleepS(2000);
		clickThat(removeProduct2);

	}

}
