#enconde: iso-8859-1
Feature: Validate different flows and scenarios are carried out to test the software Solutions for Your Industry section

  @two
  Scenario Outline: Scroll all page
    Given Hans is researching the webpage Team International on the internet
    When he scroll on the section <Section>
    Then he should see information about each section <Title>

    Examples:
      | Section                         | Title      |
      | Innovative IT Software Services | Innovative |
      | They trust us                   | trust us   |
      | Locations                       | Locations  |
      | Top Gun Lab                     | Gun Lab    |
      | Empower Your Career             | Career     |
# issue front div|h2     | Contact Sales                   | Sales      |

  Scenario Outline: Verify Solutions for Your Industry hover and labels
    Given Hans is researching the webpage Team International on the internet
    And he verify the labels <label> is visible
    When Hans hover mouse action on each label <label>
    Then he should see information about each label <label>

    Examples:
      | label                      |
      | Logistics & Transportation |
      | Oil & Gas                  |
      | Telecom                    |
      | Technology & Innovation    |
      | Financial Services         |
      | Healthcare & Life Sciences |
      | Travel & Hospitality       |
      | Retail & Ecommerce         |
      | Digital Marketing          |

  Scenario Outline: Verify Solutions for Your Industry click actions on every small section.
    Given Hans is researching the webpage Team International on the internet
    When he click on each small section <small section>
    Then he should see information about each small section <small section>

    Examples:
      | small section              |
      | Logistics & Transportation |
      | Telecom                    |
      | Technology & Innovation    |
      | Financial Services         |
      | Healthcare & Life Sciences |
      | Travel & Hospitality       |
      | Retail & Ecommerce         |

