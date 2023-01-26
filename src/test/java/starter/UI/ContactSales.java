package starter.UI;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.function.Function;

public class ContactSales {
    public static final Target iframe =
            Target.the("iframe form").locatedBy("#contact-section>iframe");

    public static final Target title =
            Target.the("title form").locatedBy("//div[normalize-space()='Contact Sales']");

    public static final Target fieldName =
            Target.the("fieldName").locatedBy("//input[@data-id='firstName']");
    public static final Target fieldLastName =
            Target.the("fieldLastName").locatedBy("//input[@data-id='lastName']");
    public static final Target fieldCompany =
            Target.the("fieldCompany").locatedBy("//input[@data-id='company']");
    public static final Target fieldEmail =
            Target.the("fieldEmail").locatedBy("//input[@data-id='email']");
    public static final Target fieldPhone =
            Target.the("fieldPhone").locatedBy("//input[@data-id='phone']");
    public static final Target fieldMessage =
            Target.the("fieldMessage").locatedBy("//input[@data-id='message']");

    public static final Target buttonForm =
            Target.the("fieldMessage").locatedBy("//input[@class='submit-button']");

    public static final Target checkBoxPrivacyPolicy =
            Target.the("checkbox PrivacyPolicy" ).locatedBy("(//span[@class='checkmark'])[1]");

    public static final Target checkBoxAnnouncements =
            Target.the("checkbox Announcements").locatedBy("(//span[@class='checkmark'])[2]");

    public static final Target messaggeSuccessfully =
            Target.the("check messageSuccessfully").locatedBy("(//div[normalize-space()='THANK YOU FOR CONTACTING US!']");

}
