package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="@target/failed_scenario.txt",
		glue="pageObjectStepDefination",
		dryRun=false,
		//tags="@ReRunFailedScenarios",
		plugin="pretty",
		monochrome=true
		)
public class FailedTestRunner extends AbstractTestNGCucumberTests
{
	
}
