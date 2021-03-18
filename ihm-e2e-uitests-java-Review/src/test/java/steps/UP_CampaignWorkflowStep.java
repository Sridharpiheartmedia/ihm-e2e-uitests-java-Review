package steps;

import configs.WebDriverConfig;
import enums.Browsers;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import pages.UP_CampaignWorkflowPage;
import utils.CommonUtil;

import java.util.List;
import java.util.Map;

public class UP_CampaignWorkflowStep extends WebDriverConfig implements En {

    UP_CampaignWorkflowPage campaignWorkflowPage = new UP_CampaignWorkflowPage(getDriver(Browsers.CHROME));

    /* Constructor */
    public UP_CampaignWorkflowStep() {
        Given("select multi product flow", () -> {
            campaignWorkflowPage.selectMultiProduct();
        });

        Given("fills out campaign workflow", (DataTable dataTable) -> {
            List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
            String compaignName = CommonUtil.generateCampaignName();
            // TODO Add DataTable for weekToGen
            String startDate = CommonUtil.generateDate(14);
            String endDate = CommonUtil.generateDate(21);
            campaignWorkflowPage.fillCampaignName(compaignName);
            campaignWorkflowPage.fillDates(startDate, endDate);
            campaignWorkflowPage.enterTotalWeeks(data.get(0).get("weeksToGenerate"));
            campaignWorkflowPage.nextChooseMedia();
        });
    }
}
