package edx.com.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import edx.com.steps.serenity.EndUserSteps;

public class CourseViewSteps {

    @Steps
    EndUserSteps actor;

    @When("^user enrolls to course$")
    public void user_enrolls_to_course() throws InterruptedException {
        actor.enrolls_to_course();
    }

    @Then("^they should be able to start course$")
    public void they_should_be_able_to_start_course() throws InterruptedException {
        actor.should_see_button("Start Course");
    }
}
