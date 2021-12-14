package POMsaucedemoPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	@FindBy(css = "")
	WebElement waitlitle;
	JavascriptExecutor js;

	public BasePage(WebDriver driver) {
		js = (JavascriptExecutor) driver;
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void fillText(WebElement el, String text) {
		highlightElement(el, "black");
		sleepS(200);
		el.clear();
		el.sendKeys(text);
	}

	public void clickThat(WebElement el) {
		highlightElement(el, "blue");
		el.click();
	}

	// method that give me the option to write on popup  
	public void alertText(String text) {
		// the name
		driver.switchTo().alert().sendKeys(text);
		// the submit

	}
  // method that give me the option to press on OK  
	public void alertok() {
		driver.switchTo().alert().accept();
	}

	public void sleepS(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public String getText(WebElement el) {
		highlightElement(el, "green;");
		return el.getText();

	}

	public void waitRun() {
	
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(waitlitle));
		wait.until(ExpectedConditions.invisibilityOf(waitlitle));
	}

	private void highlightElement(WebElement element, String color) {
		// keep the old style to change it back
		String originalStyle = element.getAttribute("style");
		String newStyle = "background-color:yellow; border: 4px solid  " + color + ";" + originalStyle;

		// Change the style
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ newStyle + "');},0);", element);

		// Change the style back after few miliseconds
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ originalStyle + "');},400);", element);

	}

}
