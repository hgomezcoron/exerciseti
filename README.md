# Getting started with Serenity and Cucumber

Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured.

Serenity strongly encourages good test automation design, and supports several design patterns, including classic Page Objects, the newer Lean Page Objects/ Action Classes approach, and the more sophisticated and flexible Screenplay pattern.

The latest version of Serenity supports Cucumber 6.x.

## The starter project TI
The best place to start with Serenity and Cucumber is to clone or download the starter project on Github ([https://github.com/serenity-bdd/serenity-cucumber-starter](https://github.com/serenity-bdd/serenity-cucumber-starter)). This project gives you a basic project setup, along with some sample tests and supporting classes. There are two versions to choose from. The master branch uses a more classic approach, using action classes and lightweight page objects, whereas the **[screenplay](https://github.com/serenity-bdd/serenity-cucumber-starter/tree/screenplay)** branch shows the same sample test implemented using Screenplay.

### The project directory structure
The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
     + search                  Feature file subdirectories 
             search_by_keyword.feature
```

Serenity 2.2.13 introduced integration with WebdriverManager to download webdriver binaries.

## The sample scenario
Both variations of the sample project uses the sample Cucumber scenario. In this scenario, Hans (who likes to search for stuff) is performing a search on the internet:

```Gherkin
Feature: Validate different flows and scenarios are carried out to test the software Solutions for Your Industry section

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
```

### The Screenplay implementation
The sample code in the master branch uses the Screenplay pattern. The Screenplay pattern describes tests in terms of actors and the tasks they perform. Tasks are represented as objects performed by an actor, rather than methods. This makes them more flexible and composable, at the cost of being a bit more wordy. Here is an example:
```java
@Given("{actor} is researching the webpage Team International on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.teamInternationalHomePage());
    }

    @When("{actor} scroll on the section {}")
    public void heScrollAllPage(Actor actor, String section) {
        actor.attemptsTo(
                ScrollPage.toElement(section)
        );
    }

    @Then("{actor} should see information about each section {}")
    public void heShouldSeeInformationAboutEachSection(Actor actor, String title) {
        if (title.equals("Innovative")) {
            OnStage.theActorInTheSpotlight()
                    .should(
                            eventually(
                                    seeThat(SectionInformationQuestions.getTextInnovative_IT(), CoreMatchers.equalTo(Constants.Innovative_IT_Text)))
                    );
}
```

Screenplay classes emphasise reusable components and a very readable declarative style, whereas Lean Page Objects and Action Classes (that you can see further down) opt for a more imperative style.

The `NavigateTo` class is responsible for opening the TeamInternational home page:
```java
public static Performable teamInternationalHomePage() {
        return Task.where("{0} opens the TeamInternational home page",
                Open.browserOn().the(TeamInternationalPage.class));
    }
}
```

The `SwitchTo` class does the actual Switch :
```java
 public static SwitchTo toNewTab(){
        return instrumented(SwitchTo.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toNewWindow()
        );
    }
}
```

In Screenplay, we keep track of locators in light weight page or component objects, like this one:
```java
public static final Target messaggeSuccessfully =
            Target.the("check messageSuccessfully").locatedBy("//div[normalize-space()='THANK YOU FOR CONTACTING US!']");

```

The Screenplay DSL is rich and flexible, and well suited to teams working on large test automation projects with many team members, and who are reasonably comfortable with Java and design patterns. 

### The Action Classes implementation.

A more imperative-style implementation using the Action Classes pattern can be found in the `action-classes` branch. The glue code in this version looks this this:

```java
@Given("{actor} is researching the webpage Team International on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.teamInternationalHomePage());
    }
```

```java
public class NavigateTo {

    TeamInternationalPage homePage;

    @Step("Open the TeamInternational home page")
    public void theHomePage() {
        homePage.open();
    }
}
```

It does this using a standard Serenity Page Object. Page Objects are often very minimal, storing just the URL of the page itself:
```java
@DefaultUrl("https://www.teaminternational.com/")
public class TeamInternationalPage extends PageObject {}
```

## Executing the tests
To run the sample project, you can either just run the `CucumberTestSuite` test runner class, or run either `gradle verify` or `gradle test` from the command line.

By default, the tests will run using Chrome. You can run them in Firefox by overriding the `driver` system property, e.g.
```json
$ gradle clean test -Pdriver=firefox
```

The test results will be recorded in the `target/site/serenity` directory.

## Generating the reports
Since the Serenity reports contain aggregate information about all of the tests, they are not generated after each individual test (as this would be extremenly inefficient). Rather, The Full Serenity reports are generated by the `serenity-maven-plugin`. You can trigger this by running `mvn serenity:aggregate` from the command line or from your IDE.

They reports are also integrated into the Maven build process: the following code in the `pom.xml` file causes the reports to be generated automatically once all the tests have completed when you run `mvn verify`?

```
             <plugin>
                <groupId>net.serenity-bdd.maven.plugins</groupId>
                <artifactId>serenity-maven-plugin</artifactId>
                <version>${serenity.maven.version}</version>
                <configuration>
                    <tags>${tags}</tags>
                </configuration>
                <executions>
                    <execution>
                        <id>serenity-reports</id>
                        <phase>post-integration-test</phase>
                        <goals>
                            <goal>aggregate</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
```

## Simplified WebDriver configuration and other Serenity extras
The sample projects both use some Serenity features which make configuring the tests easier. In particular, Serenity uses the `serenity.conf` file in the `src/test/resources` directory to configure test execution options.  
### Webdriver configuration
The WebDriver configuration is managed entirely from this file, as illustrated below:

Note: for run e2e test cases you can put headless.mode = false
```java
serenity {
    take.screenshots = FOR_FAILURES
}

headless.mode = false
serenity.browser.width = 1600
serenity.browser.height = 1400
webdriver {
  driver = chrome
  capabilities {
    browserName = "chrome"
    acceptInsecureCerts = true
    "goog:chromeOptions" {
      args = ["test-type", "no-sandbox", "ignore-certificate-errors", "--window-size=1000,800",
        "incognito", "disable-infobars", "disable-gpu", "disable-default-apps", "disable-popup-blocking"]
    }
  }
}
```

Serenity uses WebDriverManager to download the WebDriver binaries automatically before the tests are executed.

See [**this article**](https://johnfergusonsmart.com/environment-specific-configuration-in-serenity-bdd/) for more details about this feature.

## Want to learn more?
For more information about Serenity BDD, you can read the [**Serenity BDD Book**](https://serenity-bdd.github.io/theserenitybook/latest/index.html), the official online Serenity documentation source. Other sources include:
* **[Learn Serenity BDD Online](https://expansion.serenity-dojo.com/)** with online courses from the Serenity Dojo Training Library
* **[Byte-sized Serenity BDD](https://www.youtube.com/channel/UCav6-dPEUiLbnu-rgpy7_bw/featured)** - tips and tricks about Serenity BDD
* For regular posts on agile test automation best practices, join the **[Agile Test Automation Secrets](https://www.linkedin.com/groups/8961597/)** groups on [LinkedIn](https://www.linkedin.com/groups/8961597/) and [Facebook](https://www.facebook.com/groups/agiletestautomation/)
* [**Serenity BDD Blog**](https://johnfergusonsmart.com/category/serenity-bdd/) - regular articles about Serenity BDD
