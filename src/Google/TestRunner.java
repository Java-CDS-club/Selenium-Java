package Google;

import cucumber.api.CucumberOptions;
import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by mgundala on 03-Jul-15.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty"}, features = "classpath:features/google_search.feature")
public class TestRunner {
}
