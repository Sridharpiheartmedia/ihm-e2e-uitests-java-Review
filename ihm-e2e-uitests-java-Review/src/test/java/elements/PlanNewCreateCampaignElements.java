package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/* Author PranayThoutam
Created elements using css selectors for the Ad+plan
This page is Creating a new Proposal after launching the Ad+plan from Opportunity
for the first time
 */

public class PlanNewCreateCampaignElements {

    @FindBy(how = How.CSS, using = ".at-multi-product-proposal-select")
    public static WebElement btnSelectMultiProduct;

    @FindBy(how = How.CSS, using = ".at-quick-broadcast-select")
    public static WebElement btnSelectQuickBroadcast;

    @FindBy(how = How.CSS, using = ".at-import-broadcast-xml-select")
    public static WebElement btnSelectImportXml;

    @FindBy(how = How.CSS, using = "#mat-input-0")
    public static WebElement tbxCampaignName;

    @FindBy(how = How.CSS, using = "#mat-input-2")
    public static WebElement tbxStartDate;

    @FindBy(how = How.CSS, using = "#mat-input-3")
    public static WebElement tbxEndDate;

    @FindBy(how = How.CSS, using = "#mat-input-1")
    public static WebElement tbxnumberOfWeeks;

    @FindBy(how = How.CSS, using = "#mat-select-5 .mat-select-value")
    public static WebElement drpObjectives;

    @FindBy(how = How.CSS, using = "#mat-input-5")
    public static WebElement tbxBudget;

    @FindBy(how = How.CSS, using = "#mat-select-6 .mat-select-value")
    public static WebElement drpStartAge;

    @FindBy(how = How.CSS, using = "#mat-select-7 .mat-select-value")
    public static WebElement drpEndAge;

    @FindBy(how = How.CSS, using = "#mat-button-toggle-10-button > .mat-button-toggle-label-content")
    public static WebElement btnGenderAll;

    @FindBy(how = How.CSS, using = "#mat-button-toggle-11-button > .mat-button-toggle-label-content")
    public static WebElement btnGenderMale;

    @FindBy(how = How.CSS, using = "#mat-button-toggle-12-button > .mat-button-toggle-label-content")
    public static WebElement btnGenderFemale;

    @FindBy(how = How.CSS, using = "#mat-button-toggle-13-button > .mat-button-toggle-label-content")
    public static WebElement btnEthnicityAll;

    @FindBy(how = How.CSS, using = "#mat-button-toggle-14-button > .mat-button-toggle-label-content")
    public static WebElement btnEthnicityBlack;

    @FindBy(how = How.CSS, using = "#mat-button-toggle-15-button > .mat-button-toggle-label-content")
    public static WebElement btnEthnicityHispanic;

    @FindBy(how = How.CSS, using = ".collaborate-button > .mat-button-wrapper")
    public static WebElement btnRequestDigitalAssistance;

    @FindBy(how = How.CSS, using = ".at-goals-and-targets-next")
    public static WebElement btnNextChooseMedia;
    
}
