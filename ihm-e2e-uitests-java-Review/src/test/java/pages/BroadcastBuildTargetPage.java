package pages;

import elements.BroadcastBuildTargetElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtil;

public class BroadcastBuildTargetPage extends BroadcastBuildTargetElement {
    WebDriver driver;

    public BroadcastBuildTargetPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  void addBudget(){
//      CommonUntilStep.waitForElementToBeClickable(btnBuildByBudget,driver,2000);
//       btnBuildByBudget.click();
//        CommonUntilStep.waitForElementToBeClickable(btnMarketChip,driver,20);
//        CommonUntilStep.waitForElementToBeAttachedToDOM(btnMarketChip,driver,20);
//        btnMarketChip.click();
//        CommonUntilStep.waitForElementToBeAttachedToDOM(cellBudget,driver,20);
//        CommonUntilStep.waitForElementToBeClickable(cellBudget,driver,20);
//        Actions a = new Actions(driver);
//        a.moveToElement(cellBudget).doubleClick();
//        CommonUntilStep.waitForElementToBeDisplayed(cellBudgetEnter,driver,20);
//        cellBudgetEnter.sendKeys("40000");
        CommonUtil.waitForElementToBeDisplayed(btnBuildByBudget,driver,20);
        CommonUtil.jsClick(btnBuildByBudget,driver);
    }
}
