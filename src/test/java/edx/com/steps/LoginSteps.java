package edx.com.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import edx.com.steps.serenity.EndUserSteps;

public class LoginSteps {

    @Steps
    EndUserSteps anton;

    @Given("the user is on the landing page")
    public void givenTheUserIsOnTheHomePage() {
        anton.is_the_home_page();
    }

    @When("^the user logs in as humaninterfaced@gmail\\.com$")
    public void whenTheUserLogsIn() { anton.submits_credentials("humaninterfaced@gmail.com", "123456qwerty"); }

    @Then("^they should see the ashashukqa displayed in upper right corner$")
    public void thenTheyShouldSeeTheirUsername() {
        anton.should_see_user_info("ashashukqa");
    }

}
