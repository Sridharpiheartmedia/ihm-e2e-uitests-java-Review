package steps;

import configs.WebDriverConfig;
import enums.Browsers;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import pages.OktaLoginPage;


public class OktaLoginStep extends WebDriverConfig implements En {

    WebDriver driver = getDriver(Browsers.CHROME);
    OktaLoginPage oktaLoginPage = new OktaLoginPage(getDriver(Browsers.CHROME));

    /* Constructor */
    public OktaLoginStep() {

        Given("the user is logged as AE from SF", () -> {
            oktaLoginPage.loginAsAE_SF();
        });

        Given("the user is logged as AE from UP", () -> {
            oktaLoginPage.loginAsAE_UP();
        });

        Given("Login in to the application",()->{
            oktaLoginPage.logintoAdplus();
        });

//
//        Given("the user is logged as SM", () -> {
//            driver.get("https://ihm--adplusci.lightning.force.com/lightning/r/Account/0017b00000mGJyWAAW/view");
//
//           oktaLoginPage.loginAsSM();
//        });
//
//        Given("the user is logged as DSE", () -> {
//            driver.get("https://ihm--adplusci.lightning.force.com/lightning/r/Account/0017b00000mGJyWAAW/view");
//            oktaLoginPage.loginAsDSE();
//       });
    }
}
