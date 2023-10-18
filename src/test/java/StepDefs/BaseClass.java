package StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		this .driver = new ChromeDriver();
		driver.get("http://localhost:8080/FlyAway/home");
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
	}
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
}
