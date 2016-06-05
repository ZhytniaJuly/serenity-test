package serenitytest.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;



import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Created by дима on 27.05.2016.
 */


public class CoursePage extends PageObject {
    private By membersField = By.xpath(".//*[@id='page_position_content']/div[3]/div/div/div[1]/div/p[5]");
    private By priceField =  By.xpath(".//*[@id='page_position_content']/div[3]/div/div/div[1]/div/p[9]");

    public boolean membersArePresentAtCoursePage(String members) {
        return find(membersField).getText().contains(members);
    }

    public boolean priceIsPresentAtCoursePage(String price){
        return find(priceField).getText().contains(price);

    }


}