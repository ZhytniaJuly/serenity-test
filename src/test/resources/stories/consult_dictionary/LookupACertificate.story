Story: Lookup a definition
Narrative:
In order to be sure that my site works good
As an skillsUp student
I want to look up my certificate with id


Scenario: Verify that 02810150 belongs to 'Artem Karpov'
Given the user is on the SkillsUp home page
When the user looks up the definition of the word '02810150'
Then they should see the definition 'Artem Karpov'




