package edx.com.steps.serenity;

import edx.com.pages.*;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertFalse;

public class EndUserSteps {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    CoursePage coursePage;
    CourseViewPage courseViewPage;

    @Step
    public void is_the_home_page() {
        System.setProperty("webdriver.chrome.driver", "//chromedriver");
        loginPage.open();
    }

    @Step
    public void refreshes_dashpage() {
        dashboardPage.refreshPage();
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

    @Step
    public void searches_for_py_course() {
        coursePage.searchCourse("Python for Data Science");
    }

    @Step
    public void opens_py_course_page_from_grid() {
        coursePage.openPyCourse();
    }

    @Step
    public void enrolls_to_course() {
        courseViewPage.enroll();
    }

    @Step
    public void should_see_button(String msg) {
        assertThat(courseViewPage.checkForStartBtn(), is(msg));
    }

    @Step
    public void unenrolls_from_course () {
        courseViewPage.return_to_dashboard();
        dashboardPage.unenrollFromPyCourse();
    }

    @Step
    public void should_not_see_course_on_dashboard(String course) {
        assertFalse(dashboardPage.checkForCourse(course));
    }

}