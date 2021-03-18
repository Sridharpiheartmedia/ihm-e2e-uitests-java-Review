package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class CommonUtil {

    public static void waitForElementToBeClickable(WebElement webElement, WebDriver driver, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void waitForElementToBeDisplayed(WebElement webElement, WebDriver driver, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static String generateDate( int addDays) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Use today date
        c.add(Calendar.DATE, addDays); // Adding 14 days which is two weeks from the current date
        String output = sdf.format(c.getTime());
        return output;
    }

    public static void waitForElementToBeAttachedToDOM(WebElement webElement, WebDriver driver, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void jsClick(WebElement locator, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", locator);
    }

    //Json read file
    public static JSONObject getDataFile(String dataFileName) {
        String workingDir = System.getProperty("user.dir");
        String filepath = workingDir + "/src/test/java/testData/";
        String dataFilePath = filepath;
        JSONObject testObject = null;

        try {
            FileReader reader = new FileReader(dataFilePath + dataFileName);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            testObject = (JSONObject) jsonObject;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return testObject;
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String generateCampaignName() {
        int int_random = ThreadLocalRandom.current().nextInt();
        return "E2ETest-" + ( int_random * 2 );
    }

}
