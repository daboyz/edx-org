package edx.com.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import edx.com.steps.serenity.EndUserSteps;

public class CoursesSteps {

    @Steps
    EndUserSteps actor;

    @Given("user is logged in")
    public void givenTheUserIsOnTheCoursesPage() {
        actor.is_the_home_page();
        actor.submits_credentials("fobejo9285@upcmaill.com", "123456qwerty");
    }

    @When("user goes to courses page")
    public void userGetsToCoursesPage() {
        actor.go_to_courses_page();
    }

    @Then("^they should see current is more than (\\d+) and less than (\\d+)$")
    public void they_should_see_current_is_more_than_and_less_than(int lower_limit, int upper_limit) {
        actor.should_see_current(lower_limit, upper_limit);
    }

    @When("^user searches for course")
    public void user_searches_for_py_course() {
        actor.searches_for_py_course();
    }

    @When("^user opens course page from grid$")
    public void user_opens_course_page_from_grid() {
        actor.opens_py_course_page_from_grid();
    }

    @When("^user unenrolls from course")
    public void user_unenrolls_from_course() {
        actor.unenrolls_from_course();
    }

    @Then("^then they should not see .*course$ on dashboard$")
    public void they_should_not_see_course_on_dashboard(String course) {
        actor.refreshes_dashpage();
        actor.should_not_see_course_on_dashboard(course);
    }

}
