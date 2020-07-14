package testrunners;

import constants.FeatureLocationConstants;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {FeatureLocationConstants.TEMPLATE_PATH},
        glue = {FeatureLocationConstants.STEPS_DEFINITION_PACKAGE_NAME,
            FeatureLocationConstants.HOOKS_PACKAGE_NAME
        },
        tags = {"@ListOfMaps"},
        plugin = {"pretty", "html:target/SystemTestReports/html",
        "json:target/SystemTestReports/json/report.json",
        "junit:target/SystemTestReports/junit/report.xml"},
        monochrome = true
)
public class TemplateTest {

}
