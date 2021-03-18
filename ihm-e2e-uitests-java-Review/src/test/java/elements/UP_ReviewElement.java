package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UP_ReviewElement {

    @FindBy(how = How.XPATH, using = "//*[@eventname='save']/button[1]")
    public static WebElement saveEvent;
    @FindBy(how = How.XPATH, using = "//*[@eventname='sync']/button[1]")
    public static WebElement syncEvent;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Ok')]/ancestor::button[1]")
    public static WebElement okWarning;

    // Choose Media Footer
    @FindBy(how = How.CSS, using = ".at-choose-media-save button")
    public static WebElement footerSave;
    @FindBy(how = How.CSS, using = ".at-review-sync button")
    public static WebElement footerSync;
    @FindBy(how = How.CSS, using = ".at-choose-media-export button")
    public static WebElement footerExport;
    @FindBy(how = How.CSS, using = ".at-choose-media-review button")
    public static WebElement footerReview;

}
