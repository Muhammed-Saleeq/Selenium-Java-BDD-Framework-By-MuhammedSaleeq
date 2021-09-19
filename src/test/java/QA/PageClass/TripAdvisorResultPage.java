package QA.PageClass;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import QA.Framework.PageBase;

public class TripAdvisorResultPage extends PageBase {
	
	//static WebDriver driver;
	public  TripAdvisorResultPage (){ 
		super(driver);
			
	}

	@FindBy(xpath = "//*[@id=\"search-filters\"]/ul/li[2]/a")
	WebElement HotelsOption; 

	public void ClickHotelOption () {
		try {
			Thread.sleep(3000);
			this.ClickElement(HotelsOption);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath = "//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[1]/div[1]/span")
	WebElement FirstDisplayedHotel; 
	
	public void ClickOnFirstDisplayedHotel () {
		try {
			
			this.ClickElement(FirstDisplayedHotel);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath = "//*[@id=\"component_4\"]/div/div[1]/div[1]/div[3]/div/a/span[2]")
	WebElement HotelWebsite; 
	
	@FindBy(xpath = "//*[@id=\"HEADING\"]")
	WebElement HotelHeading; 
	
	public void ClickOnHotelWebpage () {
		try {
			Thread.sleep(5000);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", HotelWebsite);
			
			//this.WaitTillElementisVisible(HotelWebsite);
			//this.ClickElement(HotelWebsite);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void SwitchWindowandVerifyResult () {
		try {
			
			this.SwitchToCurrentWindow("");
			this.WaitTillElementisVisible(HotelHeading);
			Assert.assertTrue(HotelHeading.isDisplayed());
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
