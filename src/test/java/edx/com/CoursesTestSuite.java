package edx.com;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/subscribe_to_course/")
//@CucumberOptions(features="src/test/resources/features/login_user/")
//@CucumberOptions(features="src/test/resources/features/")
public class CoursesTestSuite {
}
