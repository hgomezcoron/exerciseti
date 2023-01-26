package starter.questions;

import net.serenitybdd.screenplay.Question;
import starter.UI.SectionsPage;

public class SectionInformationQuestions {

    private SectionInformationQuestions() {
        throw new IllegalStateException("Utility class");
    }

    public static Question<String> getTextInnovative_IT() {
        return actor -> SectionsPage.Innovative_IT.resolveFor(actor).getText();
    }

    public static Question<String> getTextTrustUs() {
        return actor -> SectionsPage.Trust_US.resolveFor(actor).getAttribute("alt");
    }

    public static Question<Boolean> getIconName(String icon) {
        return actor -> SectionsPage.Trust_US_ICON.apply(icon).resolveFor(actor).isVisible();
    }

    public static Question<String> getIconNameAttributeCss(String icon) {
        return actor -> SectionsPage.Trust_US_ICON.apply(icon).resolveFor(actor).getCssValue("filter");
    }

    public static Question<String> getTextLocations() {
        return actor -> SectionsPage.Locations.resolveFor(actor).getText();
    }

    public static Question<String> getTextGun_Lab() {
        return actor -> SectionsPage.Top_Gun.resolveFor(actor).getText();
    }

    public static Question<String> getTextCareer() {
        return actor -> SectionsPage.Empower.resolveFor(actor).getText();
    }

    public static Question<String> getTextSales() {
        return actor -> SectionsPage.Contact.resolveFor(actor).getText();
    }
}
