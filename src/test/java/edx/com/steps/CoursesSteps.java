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
        anton.go_to_courses_page();
    }

    @Then("^they should see the current is more than (\\d+) and less than (\\d+)$")
    public void they_should_see_the_current_is_more_than_and_less_than(int lower_limit, int upper_limit) {
        // Write code here that turns the phrase above into concrete actions
        anton.should_see_current(lower_limit, upper_limit);
    }


}
