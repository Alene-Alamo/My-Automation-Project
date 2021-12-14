package POMsaucedemoPages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenNewSites extends BasePage {

	@FindBy(css = ".social_facebook a")
	WebElement facebookBtn;
	@FindBy(css = "td #email")
	WebElement emailfiled;
	@FindBy(css = "td [name='pass']")
	WebElement passwordfiled;
	@FindBy(css = "[value='Log In']")
	WebElement logIn1filed;
	@FindBy(css = ".phl.ptm.uiInterstitialContent")
	WebElement errorText1;
	
	@FindBy(css = "._4qc7 a:nth-child(1) ")
	WebElement LOGIN2Fild;
	@FindBy(css = "#login_link a:nth-child(3)")
	WebElement SignUpFacebookBtn;
	@FindBy(css = "[name='firstname']")
	WebElement FirtsName;
	@FindBy(css = "[name='lastname']")
	WebElement LastName;
	@FindBy(css = "[name='reg_email__']")
	WebElement Phonfiled;
	@FindBy(css = "#password_step_input")
	WebElement PasswordFiled2;
	@FindBy(css = "#month")
	WebElement monthfiled;
	@FindBy(css = "#day")
	WebElement dayfiled;
	@FindBy(css = "#year")
	WebElement yearfiled;
	@FindBy(css = "[name='websubmit']")
	WebElement SingUn;
	@FindBy(css = "[class='_5633 _5634 _53ij']")
	WebElement erText;
	@FindBy(css = "._5k_2._5dba:nth-child(2)")
	WebElement Malefiled;
	@FindBy(css = "[name='websubmit']")
	WebElement SingUn2;

	String main;

	public OpenNewSites(WebDriver driver) {

		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void newAccount(String email, String password,String name, String Lname, String Phon, String NewPassword, String month, String day,
			String Year) {
		sleepS(2000);
		clickThat(facebookBtn);
		// the main page
		String main = driver.getWindowHandle();
		// the list of all the page
		Set<String> list = driver.getWindowHandles();
		// run on all pages
		for (String facebook : list) {
			// switch to this page
			driver.switchTo().window(facebook);

		}
		fillText(emailfiled, email);
		fillText(passwordfiled, password);
		clickThat(logIn1filed);
		System.out.println(getText(errorText1));
		sleepS(2000);
       driver.navigate().back();
		clickThat(LOGIN2Fild);

		clickThat(SignUpFacebookBtn);

		sleepS(3000);
		fillText(FirtsName, name);
		fillText(LastName, Lname);
		fillText(Phonfiled, Phon);
		fillText(PasswordFiled2, NewPassword);
		Select MyMonth = new Select(monthfiled);
		MyMonth.selectByValue(month);

		Select MyDay = new Select(dayfiled);
		MyDay.selectByValue(day);

		Select MyYear = new Select(yearfiled);
		MyYear.selectByValue(Year);

		sleepS(1000);
		clickThat(SingUn);

		System.out.println(getText(erText));
		clickThat(Malefiled);
		clickThat(SingUn2);

		sleepS(1000);
		driver.close();
		driver.switchTo().window(main);

	}

}
