package testrunners;

import constants.FeatureLocationConstants;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {FeatureLocationConstants.TEMPLATE_PATH},
        glue = {FeatureLocationConstants.STEPS_DEFINITION_PACKAGE_NAME},
        tags = {"@SmokeTest"},
        plugin = {"pretty"}
)
public class TemplateTest {

}
