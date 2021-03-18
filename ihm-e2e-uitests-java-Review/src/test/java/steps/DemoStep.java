package steps;

import configs.WebDriverConfig;
import enums.Browsers;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import pages.DemoPage;

import static org.testng.Assert.assertEquals;

public class DemoStep extends WebDriverConfig implements En {

    WebDriver driver = getDriver(Browsers.CHROME);
    DemoPage demoPage = new DemoPage(getDriver(Browsers.CHROME));

    /* Constructor */
    public DemoStep() {

        Given("I open Google page", () -> {
            driver.get("https://www.google.com");
        });

        Given("I see {string} in the title", (String expectedAnswer) -> {
            assertEquals(expectedAnswer, driver.getTitle());
        });


        Given("I search {string}", (String searchGameStop) -> {
            demoPage.searchGameStop(searchGameStop);
        });


        Given("I enter search", () -> {
            demoPage.enterSearch();
        });
    }
}
