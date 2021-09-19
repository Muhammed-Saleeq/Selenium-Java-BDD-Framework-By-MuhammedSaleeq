package QA.PageClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import QA.Framework.PageBase;

public class TripAdvisorHomepage extends PageBase {
	
	
	 
  //static WebDriver driver=null;
  
	public  TripAdvisorHomepage  (){ 
		
		super(driver);
		
}
	
	
	public void LaunchTripAdvisorHomePage () {
		try {
			
			//this.OpenApp();
			this.fn_OpenURL();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FindBy(xpath = "//*[@id=\"lithium-root\"]/main/div[3]/div/div/div[2]/form/input[1]")
	WebElement HomepageSearchBox; 
	
	public void SearchCountry (String Country) {
		try {
		
			this.EnterText(HomepageSearchBox, Country);
			HomepageSearchBox.sendKeys(Keys.ENTER);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}