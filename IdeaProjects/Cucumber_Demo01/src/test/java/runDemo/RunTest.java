package runDemo;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by X Rebecca on 2017/2/24.
 */
@CucumberOptions(
        features = "src/test/features/first_feature.feature",
        format = {"pretty",
                "html:target/site/cucumber-pretty",
                "rerun:target/rerun.txt",
                "json:target/cucumber1.json"},
        tags = {"@Automation"},
        glue = {"steps.Steps"})
public class RunTest extends AbstractTestNGCucumberTests{

}
