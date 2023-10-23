package StepDefs;


	
	import org.openqa.selenium.WebDriver;

	import io.cucumber.java.en.Then;
	import Pages.BookFlightPage;

	public class BookFlight  {
		WebDriver driver = Hooks.driver;
		BookFlightPage bf;
		
		
		@Then("validate title of the book flight")
		public void validate_title_of_the_book_flight() {
		    // Write code here that turns the phrase above into concrete actions
		 
		    bf = new BookFlightPage(driver);	
		    bf.getBookFlightBtn();
		}


	}


