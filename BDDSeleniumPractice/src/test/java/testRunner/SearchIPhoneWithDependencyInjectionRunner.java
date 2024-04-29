package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/features",
		glue="dependencyInjectionStepDefination",
		dryRun=false,
		tags="@SearchIPhoneWithDependencyInjection",
		monochrome=true
		)
public class SearchIPhoneWithDependencyInjectionRunner extends AbstractTestNGCucumberTests
{

}
