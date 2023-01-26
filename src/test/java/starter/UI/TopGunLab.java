package starter.UI;

import net.serenitybdd.screenplay.targets.Target;

public class TopGunLab {

    public static final Target SeeMoreButton =
            Target.the("verify button SeeMoreButton").locatedBy("//a[normalize-space()='see more']");

    public static final Target Title =
            Target.the("verify text of the Title").locatedBy("//h1[@class='main-title']");

    public static final Target Subtitle =
            Target.the("verify text of the SubTitle").locatedBy("//p[@class='subtitle']");

}
