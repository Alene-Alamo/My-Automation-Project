package SaucedemoTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import POMsaucedemoPages.LogInPage;
import POMsaucedemoPages.OpenCart;
import POMsaucedemoPages.ProductPage;

public class OpenCartTests extends BaseTest {
	@Test
	public void tc01_Login1() throws InterruptedException {
		LogInPage LI = new LogInPage(driver);
		Thread.sleep(2000);
		LI.login("standard_user", "secret_sauce");
		Thread.sleep(2000);
	}

	@Test(description = "add products")
	public void tc02_product1() throws InterruptedException {
		ProductPage PP = new ProductPage(driver);
		PP.addProducts();
	}
	
	@Test(description = "open cart and Fill in the fields")
	public void tc03_myCart() throws InterruptedException {
		OpenCart OP = new OpenCart(driver);
		OP.oCart();
		OP.mycart("dani", "shalos", "32156");
		String excepted = "CHECKOUT: OVERVIEW";
		String actual = OP.gettitle();
		Assert.assertEquals(excepted, actual);
	}

	@Test(description = "open cart and Fill in the fields Check the sentence")
	public void tc04_myCart2() throws InterruptedException {
		OpenCart OP = new OpenCart(driver);
		OP.mycart("mor", "nisan", "157456");
		String excepted = "CHECKOUT:OVdsadERVIEWIEW ";
		String actual = OP.gettitle();
		Assert.assertEquals(excepted, actual);
	}

}
