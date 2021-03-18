package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShareElement {

    @FindBy(how = How.CSS, using = "body")
    public WebElement body;

    @FindBy(how = How.CSS, using = ".mat-snack-bar-container .mat-simple-snackbar")
    public WebElement toast;

    @FindBy(how = How.CSS, using = ".at-confirmation-dialog")
    public WebElement confirmationDialog;

    @FindBy(how = How.CSS, using = ".at-information-dialog-action")
    public WebElement undoPhase1Image;

    @FindBy(how = How.CSS, using = "u")
    public WebElement extendYourCampaingsDigitalReachImage;

    @FindBy(how = How.CSS, using = ".ihm-loading-indicator")
    public WebElement loadingImage;

    @FindBy(how = How.CSS, using = ".mat-option")
    public WebElement genericMatOption;

    @FindBy(how = How.CSS, using = ".mat-input-element")
    public WebElement genericMatInput;

    @FindBy(how = How.CSS, using = ".mat-dialog-title")
    public WebElement genericMatDialogTitle;

    @FindBy(how = How.CSS, using = ".mat-dialog-container")
    public WebElement genericMatDialogContainer;

}
