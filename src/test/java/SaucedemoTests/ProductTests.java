package SaucedemoTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import POMsaucedemoPages.LogInPage;
import POMsaucedemoPages.ProductPage;

public class ProductTests extends BaseTest {
	@Test(description = "log-in to the user")
	public void tc01_Login() throws InterruptedException {
		LogInPage LI = new LogInPage(driver);
		Thread.sleep(2000);
		LI.login("standard_user", "secret_sauce");
		Thread.sleep(2000);

	}
	@Test(description = "sort the items by")
	public void tc02_sortItems() {
		ProductPage SI=new ProductPage(driver);
		SI.sortItems2();

	}

	@Test(description = "add the items")
	public void tc03_product() throws InterruptedException {

		ProductPage PP = new ProductPage(driver);
		PP.addProducts();
	}

	@Test(description = "get the text check the sentence")
	public void tc04_getText1() throws InterruptedException {
		ProductPage GT = new ProductPage(driver);
		GT.gtext();
		System.out.println(GT.gtext());
		String excepted = "Sauce Labs Bacdaskpack";
		String actual = GT.gtext();
		Assert.assertEquals(actual, excepted);
	}

	@Test(description = "get the text check the sentence")
	public void tc05_getText2() {
		ProductPage GTT = new ProductPage(driver);
		GTT.gtext();
		System.out.println(GTT.gtext());
		String excepted = "Sauce Labs Backpack";
		String actual = GTT.gtext();
		Assert.assertEquals(excepted, actual);
	}

}
