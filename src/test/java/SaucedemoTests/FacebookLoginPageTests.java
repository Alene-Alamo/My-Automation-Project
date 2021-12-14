package SaucedemoTests;

import org.testng.annotations.Test;

import POMsaucedemoPages.FaceBookLogInPage;
import POMsaucedemoPages.LogInPage;

public class FacebookLoginPageTests extends BaseTest {
	@Test
	public void fLogIn() {
		LogInPage LGIP = new LogInPage(driver);
		LGIP.login("standard_user", "secret_sauce");
		FaceBookLogInPage FLIP = new FaceBookLogInPage(driver);
		FLIP.logInFaceBook("ale@gmail.com", "24324234");
	}
}
