package ncCucumber.runner;

import com.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "C:\\SeleniumCucumber\\CucumberSelenium\\src\\main\\java\\ncCucumber\\features\\Signin.feature",
			glue = {"ncCucumber/stepDefinitions"}, //the path of the step definition files
			plugin = {"pretty","html:test-output", "json:test-output/json_output/cucumber.json", "junit:test-output/junit_xml/cucumber.xml","com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			dryRun = true //to check the mapping is proper between feature file and step def file
			)

public class TestRunner //extends AbstractTestNGCucumberTests {
{
	@AfterClass
	public static void setup()
	{
		Reporter.loadXMLConfig(new File("src/test/resource/extent-config.xml"));
		Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
		Reporter.setSystemInfo("User Name", "Prashan");
		Reporter.setSystemInfo("Application Name", "Test App ");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "Production");
		Reporter.setSystemInfo("Browser", "Chrome");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}
}

