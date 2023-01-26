Feature: Validate form Contact Sales with the different flows

  Scenario: Fill required information and send the form
    Given Hans is researching the webpage Team International on the internet
    And he scroll on the section Empower Your Career
    And he scroll on the form Contact Sales
    When he fill the form
    Then he should see a message with information to be contacted