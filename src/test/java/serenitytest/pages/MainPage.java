package serenitytest.pages;



import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://skillsup.ua/")
public class MainPage extends PageObject {

    private By searchField = By.id("u5016-2");
    private By lookupButton = By.id("u1552-2");
    private By linkOurTeam = By.linkText("Наша команда");
    private By searchResult = By.className("xsltsearch_result");
    private By training = By.xpath(".//*[@id='menu1078']/a");
    private By courses = By.xpath(".//*[@id='menu1078']/ul/li[2]");
    private By coursesList = By.xpath(".//*[@id='subMenuSubNodes1190']/li[8]/a");

    public void openTeamPageByLink() {find(linkOurTeam).click();}

    public void enterKeywords(String keyword) {
        find(searchField).type(keyword);
    }

    public void lookupTerms() {
        find(lookupButton).click();
    }

    public List<String> getDefinitions() {
        List <WebElementFacade> resultList = findAll(searchResult);
        List<String> stringsNames = new ArrayList<String>();
        for (WebElement i : resultList){
            stringsNames.add (i.getText());
        }

        return stringsNames;

    }



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

}

