package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BookFlightPage {
	WebDriver driver;
	By bookFlightBtn = By.xpath("//a[@href='bookflight?id=7']");

	public By getBookFlightBtn() {
		driver.findElement(bookFlightBtn).click();
		// validate title
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Fly Away - Make Flight Booking");
		return bookFlightBtn;
	}

	public BookFlightPage(WebDriver driver) {
		this.driver = driver;
	}

}
