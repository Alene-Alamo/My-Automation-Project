package POMsaucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinishPage extends BasePage {
	@FindBy(css = "#finish")
	WebElement finishBtn;
	@FindBy(css = "#react-burger-menu-btn")
	WebElement OPListt;
	@FindBy(css = "#logout_sidebar_link")
	WebElement logOut;
	public FinishPage(WebDriver driver) {
		super(driver);
	}
	public void FinisB() {
		sleepS(3000);
		clickThat(finishBtn);
	}

	public void logOutBtn() {
		sleepS(2000);
		clickThat(OPListt);
		sleepS(1000);
		clickThat(logOut);
	}
}
