package hellocucumber.passed;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"junit:target/junit.xml"}
        , glue = {"hellocucumber/passed"}, features = {"src/test/resources/hellocucumber/RobustGherkin.feature"}
)
public class RunCucumberTest {

}
