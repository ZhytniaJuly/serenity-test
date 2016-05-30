package serenitytest.pages;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://skillsup.ua/")
public class MainPage extends PageObject {

    private By searchField = By.id("u5016-2");
    private By lookupButton = By.id("u1552-2");
    private By linkOurTeam = By.linkText("Наша команда");
    private By searchResult = By.className("xsltsearch_result");
    private By li = By.className("xsltsearch_title");



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

}

