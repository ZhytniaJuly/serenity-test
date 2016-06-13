Meta:
Story Lookup a coach on Team Page
Narrative:
As a administrator of website
I want to see our coaches on TeamPage


Scenario: Verify whether 'coaches' and their positions are present on the Page Our Team
Given the user is on the SkillsUp home page
When the user switch to TeamPage
Then user should see <foundCoach> and <CoachPosition>
Examples:
|foundCoach|CoachPosition|
|Лина Олейник|тренер|
|Анастасия Педоренко|тренер|
|Михаил Чокан|руководитель учебного центра|








