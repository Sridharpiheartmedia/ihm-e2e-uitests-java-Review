package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class BroadcastBuildTargetElement {
    @FindBy(how = How.ID, using = "#mat-button-toggle-4-button > .mat-button-toggle-label-content")
    public static WebElement btnBuildByBudget;


    @FindBy(how = How.CSS, using = ".ag-cell:nth-child(3)")
    public static WebElement cellBudget;

    @FindBy(how = How.CSS, using = ".market-chip > .mat-chip")
    public static WebElement btnMarketChip;

    @FindBy(how = How.CSS, using = ".ag-numeric-editor")
    public static WebElement cellBudgetEnter;
}
