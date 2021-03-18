package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OktaLoginElement {

    @FindBy(how = How.XPATH, using = "//*[@id='idp_section_buttons']/button[1]")
    public static WebElement selectOkta;

    @FindBy(how = How.CSS, using = "#okta-signin-username")
    public static WebElement tbxUsername;

    @FindBy(how = How.CSS, using = "#okta-signin-password")
    public static WebElement tbxPassword;

    @FindBy(how = How.CLASS_NAME, using = "password-with-toggle")
    public static WebElement tbxAnswer;

    @FindBy(how = How.CSS, using = "#okta-signin-submit")
    public static WebElement btnLogin;

    @FindBy(how = How.CSS, using = "#idp_section_buttons button:nth-of-type(1)")
    public static WebElement btnOktaLogin;
}
