package serenitytest.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import serenitytest.steps.serenity.EndUserSteps;

public class Dictionary {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the SkillsUp home page")
    public void givenTheUserIsOnTheSkillsUpHomePage() {
        endUser.is_the_home_page();
    }

    @Given("the user is on  Team Page")
    public void givenTheUserIsOnTheTeamPage() {
        endUser.is_the_team_page();
    }

   /* @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }*/

    @When ("the user switch to TeamPage")
    public void whenTheUserSwitchToTeamPage() {endUser.is_switch_to_team_page();}

    @When("click on coach <nameCoachForClick>")
    public void whenUserSwitchToCoachPage(String nameCoachForClick){endUser.is_switch_to_coach_page(nameCoachForClick);}

    @When ("the user go to need <coursePage> with drop-down list")
    public void whenUserSwitchToCoursepage(String coursePage){endUser.is_switch_to_course_page(coursePage);}

    /*@Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }*/

    @Then ("they should see the <nameCoachOnPage> and <course> contains:")
    public void thenUserShouldSeeNameAndCourse ( @Named("nameCoachOnPage") String name, @Named("course") String course)
    {endUser.is_see_full_info_about_coach(name,course);}

    @Then ("the user see the <price> and <numberOfPeople>")
    public void thenUserShouldSeePriceAndMembers ( @Named("price") String priceOfCourse, @Named("numberOfPeople") String members)
    {endUser.is_see_full_info_about_course(priceOfCourse,members);}

    @Then("user should see <foundCoach> and <CoachPosition>")
    public void thenUserShouldSeeCoachAndPosition(@Named("foundCoach") String foundCoach, @Named("CoachPosition") String position){
        endUser.should_see_coach_and_position(foundCoach, position);
    }

    @When("the user looks up the <name> in english")
    public void endUserStartSerachingByName(@Named("name") String name){
        endUser.start_search(name);
    }

    @Then("user should see <titleResult> and <descriptionResult>")
    public void endUserAnalyzeTitleAndDecriptionOfResulset(@Named("titleResult") String titleResult, @Named("descriptionResult") String descriptionResult){
        endUser.get_result_list(titleResult,descriptionResult);
    }

    @When("the user looks up the '$name' in russion")
    public void startSearchingNameInRussian(String name){
        endUser.enters_russian_words(name);
    }


    @Then("user should not see '$name'")
    public void checkResultPage(String name){
        endUser.check_resultSetNegative(name);
    }
}
