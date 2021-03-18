package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddProductsElement {
    @FindBy(how = How.CSS, using = ".at-add-product-add-products")
    public static WebElement btnAddProducts;

    @FindBy(how = How.CSS, using = ".at-add-product-broadcast")
    public static WebElement btnAddBroadcast;

    @FindBy(how = How.CSS, using = "#mat-radio-2 .mat-radio-outer-circle")
    public static WebElement rbtnCampainBuilder;

    @FindBy(how = How.CSS, using = ".at-option-selection-submit")
    public static WebElement btnAddToProposal;



}
