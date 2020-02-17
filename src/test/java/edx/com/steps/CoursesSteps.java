package edx.com.steps;

import java.util.Properties;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import edx.com.steps.serenity.EndUserSteps;

public class CoursesSteps {

    @Steps
    EndUserSteps anton;

    @Given("the user is logged in")
    public void givenTheUserIsOnTheCoursesPage() {
        anton.is_the_home_page();
        anton.submits_credentials("humaninterfaced@gmail.com", "123456qwerty");
    }

    @When("the user goes to courses page")
    public void userGetsToCoursesPage(){
        anton.is_the_course_page();
    }

    @Then("^they should see the Current is more than 1000 and less than 2000$")
    public void thenTheyShouldSeeCurrent() {
        anton.should_see_current();
    }

}
