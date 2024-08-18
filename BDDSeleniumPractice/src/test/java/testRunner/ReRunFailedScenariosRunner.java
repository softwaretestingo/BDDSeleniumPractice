package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/features",
		glue="pageObjectStepDefination",
		dryRun=false,
		tags="@ReRunFailedScenarios",
		plugin={"rerun:target/failed_scenario.txt"},
		monochrome=true
		)
public class ReRunFailedScenariosRunner extends AbstractTestNGCucumberTests
{

}