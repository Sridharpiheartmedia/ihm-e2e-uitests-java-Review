package pages;

import elements.UP_CampaignWorkflowElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtil;

public class UP_CampaignWorkflowPage extends UP_CampaignWorkflowElement {

    WebDriver driver;

    public UP_CampaignWorkflowPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void selectMultiProduct() {
        CommonUtil.waitForElementToBeClickable(multiProductSelect,driver,2000);
        multiProductSelect.click();
    }

    public void fillCampaignName(String name) {
        campaignName.sendKeys(name);
    }

    public void fillDates(String start, String end) {
        startDate.click();
        startDate.sendKeys(start + Keys.ESCAPE);
        endDate.click();
        endDate.sendKeys(end + Keys.ESCAPE);
        endDate.sendKeys(Keys.TAB);
    }

    public void enterTotalWeeks(String totalweeks){
        totalWeeks.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        totalWeeks.sendKeys(Keys.DELETE);
        totalWeeks.sendKeys(totalweeks);
    }

    public void enterMarket(String market){
        markets.clear();
        markets.sendKeys(market);
    }

    public void fillLocation(String loc) {
        location.click();
        location.sendKeys(loc + Keys.ENTER);
    }

    public void nextChooseMedia() {
        btnNextChooseMedia.click();
    }
}
