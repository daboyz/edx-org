package edx.com.steps.serenity;

import edx.com.pages.DashboardPage;
import edx.com.pages.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Step
    public void is_the_home_page() {
        System.setProperty("Webdriver.chrome.driver", "~//IdeaProjects//Innocamp//chromedriver");
        loginPage.open();
    }

    @Step
    public void submits__credentials(String login, String password) {
        loginPage.enter_credentials(login, password);
        loginPage.press_login();
    }

    @Step
    public void should_see_user_info(String username) {
        assertThat(dashboardPage.getUsername(), containsString(username));
    }

    //@Step
    public void looks_for(String term) {
        //enters(term);
        //starts_search();
    }
}