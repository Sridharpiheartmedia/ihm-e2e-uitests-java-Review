package configs;

import enums.Browsers;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebDriverConfig {

    private static final String CHROMEDRIVER_PATH_WIN =  System.getProperty("user.dir")+"/src/test/resources/chromedrivers/chromedriver.exe";
    private static final String CHROMEDRIVER_PATH =  System.getProperty("user.dir")+"/src/test/resources/chromedrivers/chromedriver_mac";
    private static final String FIREFOXDRIVER_PATH = System.getProperty("user.dir")+"/src/test/resources/chromedrivers/chromedriver_mac";
    private static final String EDGEDRIVER_PATH =    System.getProperty("user.dir")+"/src/test/resources/chromedrivers/chromedriver_mac";
    private static final String OS = System.getProperty("os.name").toLowerCase();
    public static boolean IS_WINDOWS = (OS.contains("win"));
    public static boolean IS_MAC = (OS.contains("mac"));

    private static WebDriver driver;
    private static Browsers currentBrowser;

    static {
        initChromeDriverProperties();
        initFirefoxDriverProperties();
        initEdgeDriverProperties();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver getDriver(Browsers browser) {
        if (null != driver) {
            if (browser == currentBrowser) {
                return driver;
            }
            driver.quit();
        }

        currentBrowser = browser;

        switch (browser) {
            case CHROME:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                options.addArguments("enable-automation");
                options.addArguments("–no-sandbox");
                options.addArguments("–disable-infobars");
                options.addArguments("–disable-extensions");
                options.addArguments("–dns-prefetch-disable");
                options.addArguments("–disable-dev-shm-usage");
                options.addArguments("–disable-browser-side-navigation");
                options.addArguments("–disable-gpu");
//                options.addArguments("–headless"); // only if you are ACTUALLY running headless
                options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case EDGE:
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Must supply a supported Browser type!");
        }
        return driver;
    }

    private static void initChromeDriverProperties() {
        if (IS_WINDOWS){
            if (System.getProperty("webdriver.chrome.driver") == null && new File(CHROMEDRIVER_PATH_WIN).exists()) {
                System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH_WIN);
            }
        }
        if (IS_MAC){
            if (System.getProperty("webdriver.chrome.driver") == null && new File(CHROMEDRIVER_PATH).exists()) {
                System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
            }
        }
        if (System.getProperty("webdriver.chrome.driver") != null) {
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
            Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        } else {
            System.err.println("WARNING: Cannot locate Chrome WebDriver!");
        }
    }

    private static void initFirefoxDriverProperties() {
        if (System.getProperty("webdriver.firefox.driver") == null && new File(FIREFOXDRIVER_PATH).exists()) {
            System.setProperty("webdriver.firefox.driver", FIREFOXDRIVER_PATH);
        }
        if (System.getProperty("webdriver.firefox.driver") == null) {
            System.err.println("WARNING: Cannot locate Firefox (gecko) WebDriver!");
        }
    }



    private static void initEdgeDriverProperties() {
        if (System.getProperty("webdriver.edge.driver") == null && new File(EDGEDRIVER_PATH).exists()) {
            System.setProperty("webdriver.edge.driver", EDGEDRIVER_PATH);
        }
        if (System.getProperty("webdriver.edge.driver") == null) {
            System.err.println("WARNING: Cannot locate Edge WebDriver!");
        }

    }

}
