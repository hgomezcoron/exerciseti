Feature: Validate different flows and scenarios are carried out to test the locations section

  @two
  Scenario Outline: Verify locations hover and labels
    Given Hans is researching the webpage Team International on the internet
    And he scroll on the section Locations
    And he slick to the next option <clicks>
    And he verify the labels <label> is visible
#    When Hans hover mouse it services action on each label <label>
#    Then he should see information it services about each label <label>

    Examples:
      | label         | clicks |
      | united states | 0      |
      | Portugal      | 0      |
      | Mexico        | 1      |
      | Colombia      | 3      |
      | Argentina     | 4      |
      | Ukraine       | 6      |

  Scenario Outline: Verify locations click actions on every small section.
    Given Hans is researching the webpage Team International on the internet
    And he scroll on the section Locations
    And he slick to the next option <clicks>
    When he click locations on each small section <option>
    Then he should see information about locations on the world

    Examples:
      | clicks | option |
      | 6      | [3]    |
      | 0      | [4]    |
      | 1      | [5]    |
      | 2      | [6]    |
      | 3      | [7]    |
      | 4      | [8]    |
      | 5      | [9]    |

