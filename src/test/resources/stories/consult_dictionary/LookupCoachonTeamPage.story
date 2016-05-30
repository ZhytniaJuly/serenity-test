Meta:
Story Lookup a coach on Team Page
Narrative:
As a administrator of website
I want to see our coaches on TeamPage


Scenario: Verify whether 'Лина Олейник' is present on the Page Our Team
Given the user is on the SkillsUp home page
When the user switch to TeamPage
Then the user should see <foundCoach>
Examples:
|foundCoach|
|Лина Олейник|
|Анастасия Педоренко|
|Ольга Симчак|
|Александр Галковский|
|Артем Карпов|
|Денис Скаленко|



