package edx.com.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import edx.com.steps.serenity.EndUserSteps;

public class CoursesSteps {

    @Steps
    EndUserSteps anton;

    @Given("the user is on the landing page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        anton.is_the_home_page();
    }

    @When("the user loogs in")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        anton.looks_for(word);
    }

    @Then("they should see the username displayed in upper right corner'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        anton.should_see_definition(definition);
    }

}
