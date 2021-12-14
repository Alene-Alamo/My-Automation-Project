package POMsaucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {
	@FindBy(css = "#user-name")
	WebElement firstname;
	@FindBy(css = "#password")
	WebElement password1;
	@FindBy(css = "#login-button")
	WebElement LOGIN;
	@FindBy(css = ".error-message-container.error >h3")
	WebElement errorMasseg2;

	public LogInPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void login(String name, String password) {
		sleepS(2000);
		fillText(firstname, name);
		fillText(password1, password);
		clickThat(LOGIN);

	}

	public String errormsg() {
		return getText(errorMasseg2);

	}

}
