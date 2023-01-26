Feature: Validate different flows and scenarios are carried out to test the They trust us section

  @two
  Scenario Outline: Verify They trust us hover and labels
    Given Hans is researching the webpage Team International on the internet
    And he scroll on the section They trust us
    And he verify the icon <Icon number> is visible
    When Hans hover mouse action on each icon <Icon number>
    Then he should see another color about each label <Icon number>

    Examples:
      | Icon number     |
      | logo-partners-1 |
      | logo-partners-2 |
      | logo-partners-3 |
      | logo-partners-4 |

