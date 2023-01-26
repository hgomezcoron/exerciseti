Feature: Validate different flows and scenarios are carried out to test the software Innovative IT Software Services section

  Scenario Outline: Verify Innovative IT Software Services hover and labels
    Given Hans is researching the webpage Team International on the internet
    And he scroll on the section Innovative IT Software Services
    And he verify the labels <label> is visible for it services
    When Hans hover mouse it services action on each label <label>
    Then he should see information it services about each label <label>

    Examples:
      | label                            |
      | Software Development Outsourcing |
      | AutomationServices               |
      | Software QA& Testing             |
      | MicrosoftServices                |
      | Professional ITConsulting        |
      | DataAnalytics Services           |
      | Managed ITServices               |

  Scenario Outline: Verify IT Software Services click actions on every small section.
    Given Hans is researching the webpage Team International on the internet
    And he scroll on the section Innovative IT Software Services
    When he click it services on each small section <small section>
    Then he should see information about each small section <TitlePage>

    Examples:
      | small section                    | TitlePage                        |
      | Software Development Outsourcing | Software Development Outsourcing |
      | AutomationServices               | Automation Services.             |
      | Software QA& Testing             | Software QA & Testing            |
      | MicrosoftServices                | MicrosoftServices                |
      | Professional ITConsulting        | Professional IT Consulting       |
      | DataAnalytics Services           | Data Analytics                   |
      | Managed ITServices               | ManagedServices                  |

