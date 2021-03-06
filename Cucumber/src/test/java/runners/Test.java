package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features\\Smoke\\Sample.feature",
		glue = "steps",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:test.output"}
		
		)
public class Test {

}
