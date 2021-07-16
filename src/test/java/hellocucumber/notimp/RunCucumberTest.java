package hellocucumber.notimp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
     plugin = {"junit:target/junit.xml"}
    ,glue= {"hellocucumber/notimp"},features={"src/test/resources/hellocucumber/RobustGherkin.feature"}
)
public class RunCucumberTest {

}
