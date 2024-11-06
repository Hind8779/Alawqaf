package Runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        dryRun = false,
        tags = "@fail",
        plugin={"pretty","html:target/Cucumber.html","json:target/Cucumber.json", "junit:target/Cucumber.xml"}
)
public class RunnerClass {
}
