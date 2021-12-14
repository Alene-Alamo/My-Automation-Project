package SaucedemoTests;

import org.testng.annotations.Test;


import POMsaucedemoPages.LogInPage;
import POMsaucedemoPages.OpenNewSites;

public class NewSitesTests extends BaseTest {

	@Test(description = "open main site")
	public void tc01_user() {
		LogInPage LI = new LogInPage(driver);
		LI.login("standard_user", "secret_sauce");
	}

	@Test(description = "FaceBook new account Page")
	public void tc02_LogInFaceBook() {
		OpenNewSites LIFP=new OpenNewSites(driver);
		LIFP.newAccount("ron@gmail.com", "312312312g", "ron", "alon", "0502357623", "URB12457", "8", "7", "2003");
	
		


	}



}
