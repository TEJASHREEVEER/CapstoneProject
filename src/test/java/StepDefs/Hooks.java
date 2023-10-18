package StepDefs;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.protobuf.Method;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;

	@BeforeTest
	public void ReportSetup() {

		report = new ExtentReports("ExtendReport.html");
	}

	@Before
	public void setup(Method method) {
		
		test = report.startTest(method.getName());
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("115");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
	}

	@Before
	public void beforeScenario() {
		System.out.println("This will run before the scenario");
	}

	@SuppressWarnings("deprecation")
	@After
	public void afterScenario(io.cucumber.java.Scenario sc) {
		System.out.println("This will run after the scenario");
		if (sc.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshot, "image/png");
		} else {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshot, "image/png");
		}
	}

	@After
	public void teardown() {
		report.endTest(test);
		driver.quit();
	}

	@AfterTest
	public void ReportClean() {
		report.flush();
		report.close();

	}

}
