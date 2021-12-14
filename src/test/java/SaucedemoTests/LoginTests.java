package SaucedemoTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMsaucedemoPages.LogInPage;

public class LoginTests extends BaseTest {

	@Test(dataProvider = "getData")
	public void Login_tc01(String Name, String Password) throws InterruptedException {
		// test on name and password to login
		LogInPage LI = new LogInPage(driver);
		Thread.sleep(1000);
		LI.login(Name, Password);
		driver.navigate().back();

	}

	@DataProvider
	public Object [][] getData() {
		Object[][]data ={
		{"problem_user", "secret_sauce"},
		{"performance_glitch_user", "secret_sauce"},
		{"standard_user", "secret_sauce"},
		{"locked_out_user", "secret_sauce"}
		

		};
	  	return data;
	}
}
