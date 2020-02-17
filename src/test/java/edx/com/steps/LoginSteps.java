package edx.com.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import edx.com.steps.serenity.EndUserSteps;

public class LoginSteps {

    @Steps
    EndUserSteps actor;

    @Given("user is on landing page")
    public void givenTheUserIsOnTheHomePage() {
        actor.is_the_home_page();
    }

    @When("^user logs in as testuser1$")
    public void whenTheUserLogsIn() { actor.submits_credentials("fobejo9285@upcmaill.com", "123456qwerty"); }

    @Then("^they should see ashashukqa displayed in upper right corner$")
    public void thenTheyShouldSeeTheirUsername() {
        actor.should_see_user_info("ashashukqa");
    }

}
