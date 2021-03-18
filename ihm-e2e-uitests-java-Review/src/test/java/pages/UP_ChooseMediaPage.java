package pages;

import elements.UP_ChooseMediaElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtil;

public class UP_ChooseMediaPage extends UP_ChooseMediaElement {

    WebDriver driver;

    public UP_ChooseMediaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void addProduct(String optionName) {
        // TODO: Add Data Table to Select Products
        CommonUtil.waitForElementToBeDisplayed(addProductButton,driver,2000);
        addProductButton.click();
        // TODO: Swtich Statement Workflow Product Family
        CommonUtil.waitForElementToBeDisplayed(addBroadcastOption,driver,2000);
        addBroadcastOption.click();
        // TODO: Select Product Type
        selectBroadcastOption(optionName);
        //productSelection.click();
        submitButton.click();
    }

    public void selectBroadcastOption(String option){
        WebElement broadcastOption = driver.findElement(By.xpath("//*[text() = '"+option+"']/ancestor-or-self::mat-radio-button[1]"));
        /*CommonUtil.waitForElementToBeDisplayed(broadcastOption,driver,2000);
        CommonUtil.jsClick(broadcastOption, driver);*/
        broadcastOption.click();
    }

}
