package StepDefs;


	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			dryRun=false,
			features="src/test/java/feature",
			plugin ={"pretty","html:target/html-cucumber.html","json:target/cucumber/report.json"},
			glue="StepDefs",
			tags= {"@smoke"}
			)
			
			public class TestRunner {
}

