package starter.questions;

import net.serenitybdd.screenplay.Question;
import starter.UI.*;

public class LabelsSsQuestions {

    private LabelsSsQuestions() {
        throw new IllegalStateException("Utility class");
    }

    public static Question<Boolean> getButtonExpensesVisible(String label) {
        return actor -> SectionsPage.LabelsSS.apply(label).resolveFor(actor).isVisible();
    }

    public static Question<Boolean> getLabelIt(String label) {
        return actor -> SectionsPage.LabelsIT.apply(label).resolveFor(actor).isVisible();
    }

    public static Question<Boolean> getLabelTg(String label) {
        return actor -> SectionsPage.LabelsTG.apply(label).resolveFor(actor).isVisible();
    }

    public static Question<String> getTextLogistics() {
        return actor -> SectionsPage.Logistics.resolveFor(actor).getText();
    }

    public static Question<String> getTextOil() {
        return actor -> SectionsPage.Oil.resolveFor(actor).getText();
    }

    public static Question<String> getTextTelecom() {
        return actor -> SectionsPage.Telecom.resolveFor(actor).getText();
    }

    public static Question<String> getTextTechnology() {
        return actor -> SectionsPage.Technology.resolveFor(actor).getText();
    }

    public static Question<String> getTextFinancial() {
        return actor -> SectionsPage.Financial.resolveFor(actor).getText();
    }

    public static Question<String> getTextHealthcare() {
        return actor -> SectionsPage.Healthcare.resolveFor(actor).getText();
    }

    public static Question<String> getTextTravel() {
        return actor -> SectionsPage.Travel.resolveFor(actor).getText();
    }

    public static Question<String> getTextRetail() {
        return actor -> SectionsPage.Retail.resolveFor(actor).getText();
    }

    public static Question<String> getTextDigital() {
        return actor -> SectionsPage.Digital.resolveFor(actor).getText();
    }

    public static Question<Boolean> getLogisticsTransportationTextPage(String title) {
        return actor -> SofwareSolutionsSections.TitlePage.apply(title).resolveFor(actor).isVisible();
    }

    public static Question<Boolean> getTitleTopGunLab() {
        return actor -> TopGunLab.Title.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> getTextTopGunLab() {
        return actor -> TopGunLab.Subtitle.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> getTitleEmpowerYourCareer() {
        return actor -> EmpowerYourCareer.Title.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> getTitleContact() {
        return actor -> ContactSales.messaggeSuccessfully.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> getTextEmpowerYourCareer() {
        return actor -> EmpowerYourCareer.Subtitle.resolveFor(actor).isVisible();
    }

    public static Question<String> getTextSoftwareDevelopmentOutsourcing() {
        return actor -> InnovationIT.SoftwareDevelopmentOutsourcing.resolveFor(actor).getText();
    }

    public static Question<String> getTextLocationPage() {
        return actor -> Location.TitlePage.resolveFor(actor).getText();
    }

    public static Question<String> getTextAutomationServices() {
        return actor -> InnovationIT.AutomationServices.resolveFor(actor).getText();
    }

    public static Question<String> getTextSoftwareQATesting() {
        return actor -> InnovationIT.SoftwareQATesting.resolveFor(actor).getText();
    }

    public static Question<String> getTextMicrosoftServices() {
        return actor -> InnovationIT.MicrosoftServices.resolveFor(actor).getText();
    }

    public static Question<String> getTextProfessionalITConsulting() {
        return actor -> InnovationIT.ProfessionalITConsulting.resolveFor(actor).getText();
    }

    public static Question<String> getTextDataAnalyticsServices() {
        return actor -> InnovationIT.DataAnalyticsServices.resolveFor(actor).getText();
    }

    public static Question<String> getTextManagedITServices() {
        return actor -> InnovationIT.ManagedITServices.resolveFor(actor).getText();
    }

}
