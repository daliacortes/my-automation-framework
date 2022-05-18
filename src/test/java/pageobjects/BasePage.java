package pageobjects;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import steps.Hook;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    Logger log;

    public BasePage() {
        driver = Hook.driver;
        wait = Hook.wait;
        log = Hook.log;
        PageFactory.initElements(driver, this);
    }

    public void navigateTo(String url){
        driver.get(url);
    }

    public String getPageTitle(){
        return driver.getTitle();
    } 
}
