package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/"
		,glue={"stepdefinitions"},tags="@smoke",monochrome = true,dryRun = false,plugin={"html:src/test/resources/sample.html"})

public class Runner {

}
