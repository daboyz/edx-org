package edx.com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;


@DefaultUrl("https://courses.edx.org/course")
public class CoursePage extends PageObject {

    @FindBy(xpath="//button[@data-value='current']/span[1]")
    private WebElementFacade currentCourses;

    @FindBy(xpath="//div[@class='form form-item form-type-textfield form-item-search-query']//input[@name='search_query']")
    private WebElementFacade searchBox;

    @FindBy(xpath="//h3[text()='Python for Data Science']")
    private WebElementFacade pyCourseTile;

    public int getCurrent() {
        String value = currentCourses.getText().trim();
        value = value.substring(0, value.length()-8);
        return Integer.parseInt(value);
    }

    public void searchCourse(String course) {
        searchBox.type(course);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void openPyCourse() {
        pyCourseTile.click();
    }
}