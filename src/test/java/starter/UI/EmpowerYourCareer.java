package starter.UI;

import net.serenitybdd.screenplay.targets.Target;

public class EmpowerYourCareer {
    public static final Target SeeAllOffersButton =
            Target.the("verify button SeeAllOffersButton").locatedBy("//a[normalize-space()='see all offers']");

    public static final Target Title =
            Target.the("verify text of the Title").locatedBy("//div[@class='main-title']");

    public static final Target Subtitle =
            Target.the("verify text of the SubTitle").locatedBy("//div[@class='subtitle']");

}
