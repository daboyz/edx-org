package edx.com.steps.serenity;

import edx.com.pages.*;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.*;

public class EndUserSteps {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    CoursePage coursePage;

    @Step
    public void is_the_home_page() {
        System.setProperty("Webdriver.chrome.driver", "~//IdeaProjects//Innocamp//chromedriver");
        loginPage.open();
    }

    @Step
    public void submits_credentials(String login, String password) {
        loginPage.enter_credentials(login, password);
        loginPage.press_login();
    }

    @Step
    public void should_see_user_info(String username) {
        assertThat(dashboardPage.getUsername(), containsString(username));
    }

    @Step
    public void go_to_courses_page() {
        dashboardPage.goToCourses();
    }

    @Step
    public void should_see_current(int lower_limit, int upper_limit) {
        assertThat(coursePage.getCurrent(), is(both(greaterThan(lower_limit)).and(lessThan(upper_limit))));

    }

}