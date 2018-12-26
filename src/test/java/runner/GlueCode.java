package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\vikassum\\workspace_photon\\APITesting\\src\\test\\java\\features\\example.feature"},
		glue = "stepDefination",
		plugin = "pretty",
		monochrome = true,
		dryRun = false,
		strict = true,
		tags = {"@tag2"}
		)

public class GlueCode {

	
}
