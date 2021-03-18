package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UP_ChooseMediaElement {

    // Add products
    @FindBy(how = How.CSS, using = ".at-add-product-add-products")
    public static WebElement addProductButton;

    // Add products first level
    @FindBy(how = How.CSS, using = ".at-add-product-broadcast")
    public static WebElement addBroadcastOption;
    @FindBy(how = How.CSS, using = ".at-add-product-streaming")
    public static WebElement addStreamingOption;
    @FindBy(how = How.CSS, using = ".at-add-product-podcast")
    public static WebElement addPodcastOption;
    @FindBy(how = How.CSS, using = ".at-add-product-digital")
    public static WebElement addDigitalOption;
    @FindBy(how = How.CSS, using = ".at-add-product-miscellaneous")
    public static WebElement addMiscellaneousOption;

    // Add products selection
    @FindBy(how = How.XPATH, using = "//*[text() = 'Campaign Builder']")
    public static WebElement productSelection;

    // Gen Button
    @FindBy(how = How.CSS, using = ".at-option-selection-submit")
    public static WebElement submitButton;

}
