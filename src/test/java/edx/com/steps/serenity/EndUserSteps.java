package edx.com.steps.serenity;

import edx.com.pages.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    LoginPage loginPage;

    @Step
    public void enters_credentials(String login, String password) {
        loginPage.enter_credentials(login, password);
    }

    @Step
    public void presses_login_button() {
        loginPage.press_login();
    }

    @Step
    public void should_see_user_info(String username) {
        assertThat(loginPage.getUsername(), containsString(username));
    }

    //@Step
    public void is_the_home_page() {
        loginPage.open();
    }

    //@Step
    public void looks_for(String term) {
        //enters(term);
        //starts_search();
    }
}