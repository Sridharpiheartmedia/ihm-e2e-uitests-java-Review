package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DemoElement {

    @FindBy(how = How.CSS, using = ".gLFyf")
    public WebElement searchBar;

}
