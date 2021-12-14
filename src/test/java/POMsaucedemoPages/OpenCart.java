package POMsaucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCart extends BasePage {
	@FindBy(css = ".shopping_cart_link")
	WebElement Ocart;
	@FindBy(css = "#header_container .title")
	WebElement title;
	@FindBy(css = "#checkout")
	WebElement checkout;
	@FindBy(css = "#first-name")
	WebElement firstname;
	@FindBy(css = "#last-name")
	WebElement lastname;
	@FindBy(css = "#postal-code")
	WebElement zip;
	@FindBy(css = "#continue")
	WebElement continue1;


	public OpenCart(WebDriver driver) {
		super(driver);
	}
	
	public void oCart() {
		sleepS(1000);
		clickThat(Ocart);
		
	}

	public void mycart(String name, String Lastname, String zipcode) {
		sleepS(1000);
		clickThat(checkout);
		fillText(firstname, name);
		fillText(lastname, Lastname);
		fillText(zip, zipcode);
		sleepS(1000);
	}

	public String gettitle() {
		clickThat(continue1);
		sleepS(2000);
		return getText(title);


	}


}
