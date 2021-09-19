package QA.Framework;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
	import cucumber.api.java.Before;

	public class Hooks {

		
		

		WebdriverManager wb = new WebdriverManager();
		
		
		@Before
		public void BeforeSteps() {
		wb.getDriver();
		
		}

		@After
		public void AfterSteps() {
			
			//testContext.getWebDriverManager().quitDriver();
		wb.closeDriver();
		
		}

	}


