package POMsaucedemoPages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FaceBookLogInPage extends BasePage {
	@FindBy(css = ".social_facebook a")
	WebElement facebookB;
	@FindBy(css = "td [type='email']")
	WebElement mailFild;
	@FindBy(css = "td #pass")
	WebElement passFild;
	@FindBy(css = "[value='Log In']")
	WebElement logInB;
	@FindBy(css = ".phl.ptm.uiInterstitialContent")
	WebElement errText;

	public FaceBookLogInPage(WebDriver driver) {
		super(driver);

	}

	public void logInFaceBook(String email, String pass) {
		clickThat(facebookB);
		String main = driver.getWindowHandle();
		
		Set<String> list = driver.getWindowHandles();
		for (String facebook : list) {
		driver.switchTo().window(facebook);

		}
		fillText(mailFild, email);
		fillText(passFild, pass);
		clickThat(logInB);
        System.out.println(getText(errText));
        
        driver.close();
        driver.switchTo().window(main);
	}

}
