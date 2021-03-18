package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UP_DashboardElement {

    @FindBy(how = How.CSS, using = ".at-create-new-campaign-workflow-button")
    public static WebElement createProposalButton;

}
