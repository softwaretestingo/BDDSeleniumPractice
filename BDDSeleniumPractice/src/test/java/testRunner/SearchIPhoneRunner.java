package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/java/features",
		glue="searchProduct",
		dryRun=false,
		tags="@searchiphone",
		monochrome=true
		)
public class SearchIPhoneRunner extends AbstractTestNGCucumberTests
{

}
