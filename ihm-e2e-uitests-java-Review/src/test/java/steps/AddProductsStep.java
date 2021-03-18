package steps;

import configs.WebDriverConfig;
import enums.Browsers;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import pages.AddProductsPage;

public class AddProductsStep extends WebDriverConfig implements En {
    WebDriver driver = getDriver(Browsers.CHROME);
    AddProductsPage addProductsPage = new AddProductsPage(getDriver(Browsers.CHROME));

    public AddProductsStep() {
        Given("I want to add Broadcast Product", () -> {
            addProductsPage.addCampaignBroadcast();
        });
    }
}
