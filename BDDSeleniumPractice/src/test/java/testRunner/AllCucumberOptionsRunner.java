package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/features",
		glue="pageObjectStepDefination",
		dryRun=false,
		tags="@ReRunFailedScenarios",
		plugin = {"html:target/cucumber-html-report.html",
				  "json:target/cucumber.json",
				  "pretty:target/cucumber-pretty.txt",
				  "usage:target/cucumber-usage.json",
				  "junit:target/cucumber-results.xml",
				  "rerun:target/failed_scenario.txt",
				  "progress:target/cucumber-progress.txt"},
		publish=true,
		monochrome=true
		)
public class AllCucumberOptionsRunner extends AbstractTestNGCucumberTests
{

}