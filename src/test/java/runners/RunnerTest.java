package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "steps" }, monochrome = true, tags = "@regression")
public class RunnerTest extends AbstractTestNGCucumberTests {

}