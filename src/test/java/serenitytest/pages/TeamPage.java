package serenitytest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.List;




/**
 * Created by дима on 27.05.2016.
 */
@DefaultUrl("http://skillsup.ua/about/our-team.aspx")
public class TeamPage extends PageObject {


    private By nameFieldInsideCard = By.className("name");



    public List<String> getAllCoachNames() {
        List<WebElementFacade> results = findAll(nameFieldInsideCard);
        List<String> stringsNames = new ArrayList<String>();
        for (WebElement i: results){
            stringsNames.add (i.getText());
        }
        return stringsNames;
    }


    public Boolean checkThatPersonIsPresented(String person) {
        return getAllCoachNames().contains(person);
    }

    public void openCoachPage(String coach) {
        List<WebElementFacade>  element= findAll(nameFieldInsideCard);
        for (WebElement i : element) {
            if (i.getText().contains(coach)) {
                i.click();
                break;
            }
        }
    }




}