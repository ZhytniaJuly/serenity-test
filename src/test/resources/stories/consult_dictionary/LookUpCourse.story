Meta:

Narrative:
As a user
I want to go to the course page with drop-down list
So that I can see price and info about course

Scenario: Verify the price of course and the number of people in a group
Given the user is on the SkillsUp home page
When the user go to need <coursePage> with drop-down list
Then the user see the <price> and <numberOfPeople>
Examples:
|coursePage|price|numberOfPeople|
|Путь лидера|4500|12-16 человек|
