package serenitytest.pages;



import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

@DefaultUrl("http://skillsup.ua/")
public class MainPage extends PageObject {

    private By searchField = By.id("u5016-2");
    private By linkOurTeam = By.linkText("Наша команда");
    private By training = By.xpath(".//*[@id='menu1078']/a");
    private By courses = By.xpath(".//*[@id='menu1078']/ul/li[2]");
    private By coursesList = By.xpath(".//*[@id='subMenuSubNodes1190']/li[8]/a");

    public void openTeamPageByLink() {find(linkOurTeam).click();}

    public void openCoursesList() {
        WebElement hoverOnTraining = getDriver().findElement(training);
        WebElement hoverOnCourses = getDriver().findElement(courses);
        Actions openCoursesList = new Actions(getDriver());
        openCoursesList.moveToElement(hoverOnTraining).perform();
        openCoursesList.moveToElement(hoverOnCourses).perform();
    }

    public void openCoursePage(String courseName) {
        List<WebElementFacade>  element = findAll(coursesList);
        for (WebElement i : element) {
            if (i.getText().contains(courseName)) {
                i.click();
                break;
            }
        }
    }

    public void enter_name_start_search(String keyword) {
        WebElementFacade search = find(searchField);
        search.sendKeys(keyword, Keys.ENTER);
        waitFor(titleContains("Поиск - SkillsUp"));
    }

}

