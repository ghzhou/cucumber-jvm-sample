package hellocucumber.two.scenarios;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"junit:target/test_result_passed_two_scenarios.xml"},
        glue = {"hellocucumber/two/scenarios"},
        features = {"src/test/resources/hellocucumber/TwoSameOutlinedScenario.feature"}
)
public class RunCucumberTest {

}
