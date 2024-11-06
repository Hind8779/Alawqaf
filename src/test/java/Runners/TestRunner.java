package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.yourpackage.stepdefinitions",
        dryRun = false,
        tags = "@invalidlogin",
        plugin = {"pretty", "html:target/cucumber.html"}
)

public class TestRunner {
}
