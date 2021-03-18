package pages;

import elements.UP_BroadcastBuildTargetsElement;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtil;

import java.util.concurrent.TimeUnit;

public class UP_BroadcastBuildTargetsPage extends UP_BroadcastBuildTargetsElement {

    WebDriver driver;

    public UP_BroadcastBuildTargetsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectAgeEndDate(String ageEnd) {
        CommonUtil.waitForElementToBeClickable(endAgeField,driver,5000);
        CommonUtil.jsClick(endAgeField, driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", endAgeField);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement endAgeOption = driver.findElement(By.xpath("//*[@id='cdk-overlay-4']//following::mat-option/span[contains(text(),'"+ageEnd+"')]"));
        CommonUtil.jsClick(endAgeOption, driver);
    }

    public void selectDayPart(String DayPart) {
        CommonUtil.jsClick(addDayParts, driver);
        CommonUtil.jsClick(cleanAllDayParts, driver);
        WebElement dayParts = driver.findElement(By.xpath("//*[contains(text(),'"+DayPart+"')]"));
        CommonUtil.jsClick(dayParts, driver);
        CommonUtil.jsClick(applyDayParts, driver);
    }

    public void selectDayPartPercentage(String percentageDayPart) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", percentageDayParts);
        CommonUtil.jsClick(percentageDayParts, driver);
        percentageDayParts.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        percentageDayParts.sendKeys(Keys.DELETE);
        percentageDayParts.sendKeys(percentageDayPart);
        CommonUtil.jsClick(percentageDayPartsTotal, driver);
    }

    public void selectSpotLengthDuration(String spotDurationLength) {
        CommonUtil.jsClick(addSpotLength, driver);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement spotDuration = driver.findElement(By.xpath("//span[contains(text(),'"+spotDurationLength+"')]/ancestor::button[1]"));
        CommonUtil.jsClick(spotDuration, driver);
    }

    public void selectSpotLengthPercentage(String spotLengthPercentage) {
        CommonUtil.jsClick(addSpotLengthPercentage, driver);
//        addSpotLengthPercentage.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//        addSpotLengthPercentage.sendKeys(Keys.CLEAR);
//        addSpotLengthPercentage.sendKeys(spotLengthPercentage);
        addSpotLengthPercentage.sendKeys(Keys.TAB);
    }

    public void enterSpotLengthBudget(String budget) {
        CommonUtil.jsClick(marketBudgetTab, driver);
        Actions actions = new Actions(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", marketBudget);
        actions.doubleClick(marketBudget).build().perform();
        CommonUtil.jsClick(marketBudgetInput, driver);
        marketBudgetInput.sendKeys(budget);
        marketBudgetInput.sendKeys(Keys.TAB);
    }

    public void selectStations() throws InterruptedException {
        marketBudgetOptions.click();
        marketBudgetOptionsStations.click();
        CommonUtil.waitForElementToBeClickable(selectDeselectAllStations,driver,10000);
        selectDeselectAllStations.click();
        CommonUtil.waitForElementToBeClickable(selectStationsOption,driver,10000);
        selectStationsOption.click();
        selectStationsSave.click();
        Thread.sleep(3000);
    }

    public void clickGenerateSchedule(){
        CommonUtil.waitForElementToBeAttachedToDOM(generateSchedule,driver,10000);
        CommonUtil.waitForElementToBeClickable(generateSchedule,driver,10000);
        CommonUtil.jsClick(generateSchedule, driver);
        CommonUtil.waitForElementToBeClickable(notification,driver,10000);
        if(notification.isDisplayed()){
            CommonUtil.jsClick(notification, driver);
        }
    }
}
