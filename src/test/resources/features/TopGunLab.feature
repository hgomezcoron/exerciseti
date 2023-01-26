Feature: Validate different flows and scenarios are carried out to test the Top Gun Labs section

  Scenario Outline: Verify Top Gun Labs labels
    Given Hans is researching the webpage Team International on the internet
    When he scroll on the section Top Gun Lab
    Then he verify the labels <label> is visible for Top Gun Labs

    Examples:
      | label                     |
      | .NET PROGRAMMING          |
      | PROFESSIONAL JAVASCRIPT   |

  Scenario: Verify Top Gun Labs click actions on the button see more
    Given Hans is researching the webpage Team International on the internet
    And he scroll on the section Top Gun Lab
    When he click Top Gun Lab button section
    Then he should see information Top Gun Labs