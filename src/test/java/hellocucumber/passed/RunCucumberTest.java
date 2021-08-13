package hellocucumber.passed;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"junit:target/test_result_passed.xml"},
        glue = {"hellocucumber/passed"},
        features = {"src/test/resources/hellocucumber/RobustGherkin.feature",
                "src/test/resources/hellocucumber/Standard test for bdd demo_5001.feature"}
)
public class RunCucumberTest {

}
