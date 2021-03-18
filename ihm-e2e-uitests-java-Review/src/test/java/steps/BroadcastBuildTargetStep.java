package steps;

import configs.WebDriverConfig;
import enums.Browsers;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import pages.BroadcastBuildTargetPage;

public class BroadcastBuildTargetStep extends WebDriverConfig implements En{
    WebDriver driver = getDriver(Browsers.CHROME);
    BroadcastBuildTargetPage broadcastBuildTargetPage = new BroadcastBuildTargetPage(getDriver(Browsers.CHROME));
    public BroadcastBuildTargetStep() {
        Given("I enter my Broadcast Budget to the Campaign", () -> {
            broadcastBuildTargetPage.addBudget();
        });
    }
}
