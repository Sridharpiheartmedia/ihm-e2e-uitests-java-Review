package pages;

import elements.DemoElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DemoPage extends DemoElement {

    WebDriver driver;

    public DemoPage(WebDriver driver) {
         this.driver = driver;
         PageFactory.initElements(driver,this);
    }

    public void searchGameStop(String searchGameStop) {
        searchBar.sendKeys("GameStop");
    }

    public void enterSearch(){
        searchBar.sendKeys(Keys.RETURN);
    }

}
