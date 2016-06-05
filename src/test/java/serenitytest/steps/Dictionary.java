package serenitytest.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.model.ExamplesTable;
import serenitytest.steps.serenity.EndUserSteps;

import java.util.Map;

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

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @When ("the user switch to TeamPage")
    public void whenTheUserSwitchToTeamPage() {endUser.is_switch_to_team_page();}

    @When("click on coach <nameCoachForClick>")
    public void whenUserSwitchToCoachPage(String nameCoachForClick){endUser.is_switch_to_coach_page(nameCoachForClick);}

    @When ("the user go to need <coursePage> with drop-down list")
    public void whenUserSwitchToCoursepage(String coursePage){endUser.is_switch_to_course_page(coursePage);}

    @Then ("see info about coach on Coach Page '$definition'")
    public void thenUserSeeInfoAboutCoach(String teacher){endUser.is_see_info_about_coach(teacher);}

    @Then ("the user should see <foundCoach>")
    public void thenUserShouldSeeFoundCoach (String foundCoach){endUser.should_see_coach(foundCoach);}

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    @Then ("they should see the <nameCoachOnPage> and <course> contains:")
    public void thenUserShouldSeeNameAndCourse ( @Named("nameCoachOnPage") String name, @Named("course") String course)
    {endUser.is_see_fool_info_about_coach(name,course);}

    @Then ("the user see the <price> and <numberOfPeople>")
    public void thenUserShouldSeePriceAndMembers ( @Named("price") String priceOfCourse, @Named("numberOfPeople") String members)
    {endUser.is_see_fool_info_about_course(priceOfCourse,members);}



    /*@Then("they should see the name and cource contains: $coachTables")
    public void findAllCoaches(ExamplesTable coachTables) {
        for (Map<String, String> row : coachTables.getRows()) {
            String name = row.get("name");
            String cource = row.get("cource");
            System.out.println(name + " " + cource);
        }
    }*/
}
