package testRunner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/features",
		glue="pageObjectStepDefination",
		dryRun=false,
		monochrome=true
		)
public class ParallelTestRunner extends AbstractTestNGCucumberTests
{
	//This will run all the feature file in parallel mode
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
