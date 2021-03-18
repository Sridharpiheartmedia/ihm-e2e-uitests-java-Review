package steps;

import configs.WebDriverConfig;
import enums.Browsers;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import pages.UP_ChooseMediaPage;
import pages.UP_BroadcastBuildTargetsPage;

import java.util.List;
import java.util.Map;

public class UP_ChooseMediaStep extends WebDriverConfig implements En {

    UP_ChooseMediaPage chooseMediaPage = new UP_ChooseMediaPage(getDriver(Browsers.CHROME));
    UP_BroadcastBuildTargetsPage broadcastBuildTargetsPage = new UP_BroadcastBuildTargetsPage(getDriver(Browsers.CHROME));

    /* Constructor */
    public UP_ChooseMediaStep() {

        Given("users select the products", (DataTable dataTable) -> {
            List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
            chooseMediaPage.addProduct(data.get(0).get("broadcast"));
        });

        Given("fills out build targets", (DataTable dataTable) -> {
            List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
            broadcastBuildTargetsPage.selectAgeEndDate(data.get(0).get("endAge"));
            broadcastBuildTargetsPage.selectDayPart(data.get(0).get("dayParts"));
            broadcastBuildTargetsPage.selectDayPartPercentage(data.get(0).get("percentageDayPart"));
            broadcastBuildTargetsPage.selectSpotLengthDuration(data.get(0).get("spotLengthSeconds"));
            broadcastBuildTargetsPage.selectSpotLengthPercentage(data.get(0).get("spotLengthPercentage"));
            broadcastBuildTargetsPage.enterSpotLengthBudget(data.get(0).get("budget"));
            broadcastBuildTargetsPage.selectStations();
        });

        Then("generate schedule", () -> {
            broadcastBuildTargetsPage.clickGenerateSchedule();
        });
    }
}
