Meta:

Narrative: Lookup Info About Coach On Coach Page
As a administrator of website
I want to be sure that by clicking on the name of coach, I get on his page and see the course

Scenario: Verify whether infa about 'coach' is present on the Coach Page
Given the user is on Team Page
When click on coach <nameCoachForClick>
Then they should see the <nameCoachOnPage> and <course> contains:
Examples:
|nameCoachForClick|nameCoachOnPage|course|
|Александр Галковский|Александр Галковский|Погружение в Java|
|Виктория Писаренко|Виктория Писаренко|Погружение в тестирование программного обеспечения и обеспечение качества|
|Артем Карпов|Артем Карпов|Автоматизация тестирования ПО|







