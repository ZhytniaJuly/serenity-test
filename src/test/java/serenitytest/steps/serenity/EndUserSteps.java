package serenitytest.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class EndUserSteps extends ScenarioSteps {

    MainPage mainPage;
    CoachPage coachPage;
    TeamPage teamPage;
    CoursePage coursePage;
    SearchPage searchPage;

   /* @Step
    public void enters(String keyword) {
        mainPage.enterKeywords(keyword);
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(mainPage.getDefinitions(), hasItem(containsString(definition)));
    }

//
    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }*/

    @Step
    public void is_the_home_page() {
        mainPage.open();
    }

    @Step
    public void is_switch_to_team_page() {
        mainPage.openTeamPageByLink();
    }

    @Step
    public void is_switch_to_coach_page(String coach) {
        teamPage.openCoachPage(coach);
    }

    @Step
    public void is_the_team_page() {
        teamPage.open();
    }

    @Step
    public void is_switch_to_course_page(String coursePage) {
        mainPage.openCoursesList();
        mainPage.openCoursePage(coursePage);
    }

    @Step
    public void is_see_full_info_about_coach(String name, String course) {
        assertTrue(coachPage.coachNameIsPresentAtPersonalPage(name));
        assertTrue(coachPage.courseIsPresentAtPersonalPage(course));
    }

    @Step
    public void is_see_full_info_about_course(String priceOfCourse, String members) {
        coursePage.getCourseDescriptions();
        assertThat(priceOfCourse+" incorrect", coursePage.getCourseDescriptions(), hasItem(containsString(priceOfCourse)));
        assertThat(members+" incorrect", coursePage.getCourseDescriptions(), hasItem(containsString(members)));
    }

    @Step
    public void should_see_coach_and_position(String foundCoach, String post) {
        assertTrue(foundCoach +" is not the coach", teamPage.checkThatPersonIsPresented(foundCoach));
        assertThat("Coach position not found", teamPage.getAllCoachPost(), hasItem(containsString(post)));
    }

    @Step
    public void start_search(String name) {
        mainPage.enter_name_start_search(name);
    }

    @Step
    public void get_result_list(String titleResults, String description ) {
        assertThat(titleResults+" not found", searchPage.resultListTitles(), hasItem(containsString(titleResults)));
        assertThat(description + " not found", searchPage.resultListDescriptions(), hasItem(containsString(description)));
    }

    @Step
    public void enters_russian_words(String name) { // not found
        mainPage.enter_name_start_search(name);
    }

    @Step
    public void check_resultSetNegative(String name){
        assertFalse(searchPage.nameIsNotFound(name));
    }
}