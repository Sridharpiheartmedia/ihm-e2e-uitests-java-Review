package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UP_CampaignWorkflowElement {

    // General buttons
    @FindBy(how = How.CSS, using = ".at-multi-product-proposal-select")
    public static WebElement multiProductSelect;
    @FindBy(how = How.CSS, using = ".at-goals-and-targets-next")
    public static WebElement btnNextChooseMedia;

    // Fields
    @FindBy(how = How.CSS, using = ".at-campaign-workflow-name")
    public static WebElement campaignName;
    @FindBy(how = How.CSS, using = ".at-run-date-start-date input")
    public static WebElement startDate;
    @FindBy(how = How.CSS, using = ".at-run-date-end-date input")
    public static WebElement endDate;
    @FindBy(how = How.CSS, using = "[formcontrolname='totalWeeks']")
    public static WebElement totalWeeks;
    @FindBy(how = How.CSS, using = "[id='mat-chip-list-input-0']")
    public static WebElement markets;
    @FindBy(how = How.CSS, using = ".at-run-date-end-date input")
    public static WebElement location;

}
