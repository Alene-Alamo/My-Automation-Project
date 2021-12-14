package SaucedemoTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Utils;

public class BaseTest {
	WebDriver driver;

	@BeforeClass
	public void firstRun() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// tests on the elements in saucedemo the site
		driver.manage().window().maximize();
		Utils u = new Utils();
		driver.get(u.readPropertty("url"));

	}

	@AfterClass
	public void tearDown() {
	driver.quit();
	}
	
	// * This method will run after  test,
	// * it will take screen shot only for tests that failed
	@AfterMethod
	public void failedTest(ITestResult result) {
		// check if the test failed
		if (result.getStatus() == ITestResult.FAILURE) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(srcFile, new File("./ScreenShots/" + result.getName() + ".jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			// result.getname() method will give the current test case name.
			// ./ScreenShots/ tell you that, in your current directory, create folder
			// ScreenShots. dot represents current directory
		}
	}
}
