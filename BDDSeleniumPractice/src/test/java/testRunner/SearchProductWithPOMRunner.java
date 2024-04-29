package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/features",
		glue="pageObjectStepDefination",
		dryRun=false,
		tags="@SearchProductWithPOM",
		monochrome=true
		)
public class SearchProductWithPOMRunner extends AbstractTestNGCucumberTests
{

}
