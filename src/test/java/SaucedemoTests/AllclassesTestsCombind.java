package SaucedemoTests;

import org.testng.Assert;

import org.testng.annotations.Test;

import POMsaucedemoPages.FinishPage;
import POMsaucedemoPages.LogInPage;
import POMsaucedemoPages.OpenCart;
import POMsaucedemoPages.OpenNewSites;
import POMsaucedemoPages.ProductPage;

public class AllclassesTestsCombind extends BaseTest {

	@Test(description = "log-in with this user and the check the sentence")
	public void tc01_Login1() throws InterruptedException {

		LogInPage R = new LogInPage(driver);
		R.sleepS(200);
		R.login("standard_user", "dasds1231");

		String excepted = " Username and password do not match any user in this service";
		String actual = R.errormsg();

		Assert.assertEquals(actual, excepted);
	}

	@Test(description = "log-in with this user and the check the sentence")
	public void tc02_Login2() throws InterruptedException {
		LogInPage R = new LogInPage(driver);
		R.sleepS(200);
		R.login("standard_2user", "secret_sauce");
		String excepted = "Epic sadface: Username and password do not match any user in this service";
		String actual = R.errormsg();

		Assert.assertEquals(excepted, actual);
	}

	@Test(description = "log-in with this user")
	public void tc03_Login3() throws InterruptedException {
		LogInPage LI = new LogInPage(driver);
		LI.sleepS(200);
		LI.login("standard_user", "secret_sauce");

	}


	@Test(description = "FaceBook Page with new account")
	public void tc04_LogInFaceBook() {
		OpenNewSites LIFP=new OpenNewSites(driver);
		LIFP.newAccount("alee@gmail.com", "3242423f","alene", "alamo", "0502356478", "12457urb", "1", "25", "1996" );


	}
	@Test(description = "sort the items by lohi")
	public void tc05_sortItems() {
		ProductPage SI=new ProductPage(driver);
		SI.sortItems("lohi");
	}



	@Test(description = "add the items")
	public void tc06_products()  {
		ProductPage PP = new ProductPage(driver);
		PP.addProducts();

	}

	@Test(description = "get the text check the sentence")
	public void tc07_getText1() {
		ProductPage GT = new ProductPage(driver);
		GT.gtext();
		String excepted = "Sauce Labs Backjob";
		String actual = GT.gtext();
		Assert.assertEquals(actual, excepted);
	}

	//
	@Test(description = "get the text check the sentence2")
	public void tc08_getText(){
		ProductPage GTT = new ProductPage(driver);
		GTT.gtext();
		String excepted = "Sauce Labs Backpack";
		String actual = GTT.gtext();
		Assert.assertEquals(excepted, actual);

	}
	@Test(description = "sort list by value")
	public void tc09_sortItems() {
		ProductPage SI=new ProductPage(driver);
		SI.sortItems2();

	}
	@Test(description = "add another Item")
	public void tc10_addproduct2() {
		ProductPage AAP = new ProductPage(driver);
		AAP.anotherProduct();

	}

	@Test(description = "Delete an item from the items I selected")
	public void tc11_removeP1()  {
		ProductPage RM = new ProductPage(driver);
		RM.sleepS(1000);
		RM.removeP();
		RM.Cart();


	}

	@Test(description = "Delete an item from the items I selected")
	public void tc12_removeP2() {
		ProductPage RM = new ProductPage(driver);
		RM.removeP2();
		RM.Cart();

	}

	@Test(description = "fill the fileds and check the sentence")
	public void tc13_myCart1() throws InterruptedException {

		OpenCart OP = new OpenCart(driver);
		OP.mycart("alene", "ale", "32157456");
		String actual = OP.gettitle();
		Assert.assertEquals(actual, "CHECKOUT: OVERVIEW");

	}

	@Test(description = "fill the fileds and check the sentence")
	public void tc14_myCart2() throws InterruptedException {
		OpenCart OP = new OpenCart(driver);
		OP.mycart("alene", "ale", "32157456");
		String excepted = "CHECKOUT: OVdsadERVIEW";
		String actual = OP.gettitle();
		Assert.assertEquals(excepted, actual);

	}

	@Test(description = "Click the Finish button")
	public void tc15_finish() throws InterruptedException {
		FinishPage F = new FinishPage(driver);
		F.FinisB();

	}
	@Test(description = "Click the Log-Out button from the list")
	public void tc16_logOut() throws InterruptedException {
		FinishPage LO= new FinishPage(driver);
		LO.logOutBtn();

	}
}
