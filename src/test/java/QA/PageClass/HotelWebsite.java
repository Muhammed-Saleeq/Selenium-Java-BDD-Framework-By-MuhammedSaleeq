package QA.PageClass;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import QA.Framework.PageBase;

public class HotelWebsite extends PageBase {
	
	
	
	public  HotelWebsite (){ 
		
		super(driver);
		
			
	}
	
	@FindBy(id= "spu-11907")
	WebElement HotelsOption; 
	
	@FindBy(xpath = "//*[@id=\"spu-11907\"]/span[1]/i")
	WebElement Closepop; 
	
	public void CLosePopup () {
		try {  
			
			this.SwitchToCurrentWindow("");
			this.WaitTillElementisVisible(HotelsOption);
			this.ClickElement(Closepop);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
			
	@FindBy(xpath = "//img[@src=\"https://www.defrance.co.uk/wp-content/uploads/hdef-logo-blue-window.png\"]")
	WebElement HotelLogo; 
	
	public void VerifyHotelWebsite () {
		try {  
			
			
			this.WaitTillElementisVisible(HotelLogo);
			Assert.assertTrue(HotelLogo.isDisplayed());
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
			
}
