package steps;

import configs.WebDriverConfig;
import enums.Browsers;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import pages.UP_DashboardPage;

public class UP_DashboardStep extends WebDriverConfig implements En {

    WebDriver driver = getDriver(Browsers.CHROME);
    UP_DashboardPage dashboardPage = new UP_DashboardPage(getDriver(Browsers.CHROME));

    /* Constructor */
    public UP_DashboardStep() {

        Given("Open Ad+Plan Dashboard", () -> {
//            driver.get("https://proposal-ci.x1-nonprod.iheartmedia.com/dashboard/0062F00000Dp8K3QAJ");
            driver.get("https://proposal-stg.x1-nonprod.iheartmedia.com/dashboard/0062F00000Dp8K3QAJ");
        });

        Given("the AE user is on the UP dashboard", () -> {
            dashboardPage.clickOnCreateProposalButton();
        });
    }
}
