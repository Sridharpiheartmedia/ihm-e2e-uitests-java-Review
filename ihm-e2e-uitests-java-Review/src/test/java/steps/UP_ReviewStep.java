package steps;

import configs.WebDriverConfig;
import enums.Browsers;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import pages.UP_ReviewPage;

public class UP_ReviewStep extends WebDriverConfig implements En {

    WebDriver driver = getDriver(Browsers.CHROME);
    UP_ReviewPage reviewPage = new UP_ReviewPage(getDriver(Browsers.CHROME));


    public UP_ReviewStep() {

        Given("go to review page", () -> {
            reviewPage.reviewButton();
        });

        Then("save the proposal", () -> {
            reviewPage.saveEvent();
        });

        Then("sync the proposal", () -> {
            reviewPage.syncEvent();
        });

    }
}
