Story: Lookup a definition
Narrative:
In order to find some info
As a student
I want to look up it by search field

Scenario: search in inglish
Given the user is on the SkillsUp home page
When the user looks up the <name> in english
Then user should see <titleResult> and <descriptionResult>
Examples:
|name|titleResult|descriptionResult|
|Galkovskiy|Alexander Galkovskiy|«Diving into Java»|
|Tsariov|06109150|Alexander Tsariov|


Scenario: search in russion
Given the user is on the SkillsUp home page
When the user looks up the 'Галковский' in russion
Then user should not see 'Галковский'