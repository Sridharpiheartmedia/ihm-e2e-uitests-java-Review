package steps;

import configs.WebDriverConfig;
import enums.Browsers;
import io.cucumber.java8.En;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import pages.CreateOpportunityPage;
import pages.OktaLoginPage;
import utils.CommonUtil;

public class CreateOpportunityStep extends WebDriverConfig implements En {
    WebDriver driver = getDriver(Browsers.CHROME);
    OktaLoginPage oktaLoginPage = new OktaLoginPage(getDriver(Browsers.CHROME));
    CreateOpportunityPage createOpportunityPage = new CreateOpportunityPage(getDriver(Browsers.CHROME));

    /* Constructor */
    public CreateOpportunityStep() {

        Given("Open Salesforce Dashboard", () -> {
            driver.get("https://ihm--adplusci.lightning.force.com/lightning/r/Account/0017b00000mGJyWAAW/view");
        });


        Then("create a new opportunity in {int} days", (Integer days) -> {
            String closeDate = CommonUtil.generateDate(days);
            JSONObject testData = CommonUtil.getDataFile("local-scope.json");
            createOpportunityPage.createOpportunity(testData.get("opportunityName").toString(),closeDate);
        });

        And("create a opportunity initiative", () ->{
            createOpportunityPage.createOpportunityInitiative();
        });
    }
}
