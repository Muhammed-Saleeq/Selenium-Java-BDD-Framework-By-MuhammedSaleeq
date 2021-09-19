package QA.Runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/FeatureFiles",
				glue= {"QA.StepDefinition","QA.Framework"},
		format = {"pretty" ,"json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml","html:target/cucumber-reports"
				},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReport.html"},
		monochrome = true
		)
//"html:target/cucumber-reports","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
public class TestRunner {
	@AfterClass
	public static void setup()
	{
	//Reporter.loadXMLConfig(new File("/Configs/extent-config"));
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "Muhammed Saleeq");
	Reporter.setSystemInfo("Application Name", "Trip Advisor ");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Production");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}
	
}
