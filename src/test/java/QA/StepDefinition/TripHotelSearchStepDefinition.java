package QA.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import QA.PageClass.HotelWebsite;
import QA.PageClass.TripAdvisorHomepage;
import QA.PageClass.TripAdvisorResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TripHotelSearchStepDefinition {
	
	  
		WebDriver driver;
	
	TripAdvisorHomepage Trip = new TripAdvisorHomepage ();
	TripAdvisorResultPage Resultpage = new TripAdvisorResultPage ();
	HotelWebsite Hotel = new HotelWebsite ();
	
	@Given("^User navigates to TripAdvisor homepage\\.$")
	public void user_navigates_to_TripAdvisor_homepage() throws Exception { 
		
	   Trip.LaunchTripAdvisorHomePage();
	}

	@When("^User searches a particular \"([^\"]*)\" of his choice\\.$")
	public void user_searches_a_particular_of_his_choice(String Country) throws Exception {
	  Trip.SearchCountry(Country);
	}

	@When("^User Clicks on hotel option\\.$")
	public void user_Clicks_on_hotel_option() throws Exception {
		   Resultpage.ClickHotelOption();
		}

	@When("^User selects the first displayed hotel\\.$")
	public void user_selects_the_first_displayed_hotel() throws Exception {
		
		Resultpage.ClickOnFirstDisplayedHotel();
		}

	@When("^User switches window and verifies the hotel Details\\.$")
	public void user_switches_window_and_verifies_the_hotel_Details() throws Exception { 
		
		Resultpage.SwitchWindowandVerifyResult();
		}

	@When("^User Clicks on hotels website\\.$")
	public void user_Clicks_on_hotels_website() throws Exception {
		Resultpage.ClickOnHotelWebpage();
		}
	@Then("^User Verifies wether Website of the hotel is successfully launched\\.$")
	public void user_Verifies_wether_Website_of_the_hotel_is_successfully_launched() throws Exception {
		Hotel.CLosePopup();
		Hotel.VerifyHotelWebsite();
		}


}
