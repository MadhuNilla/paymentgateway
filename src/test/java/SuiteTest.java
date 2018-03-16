import Utils.InvokeBrowser;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucumber-html-reports","pretty:target/cucumber.json"},
        features="src/test/resources/features",strict = false)
public class SuiteTest extends InvokeBrowser{

}
