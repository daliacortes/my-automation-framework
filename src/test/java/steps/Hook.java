package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import runners.RunnerTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hook {
    public WebDriver driver;
    public static final Logger log = LogManager.getLogger(Hook.class);
    Scenario scenario = null;

    @Before
    public void setupDriver(Scenario scenario) {
        log.info("======================================");
        log.info("====== SETUP BROWSER AND DRIVER ======");
        log.info("======================================");
        String browser = RunnerTest.BROWSER.get();
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                //chromeOptions.setHeadless(true);
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                //firefoxOptions.setHeadless(true);
                driver = new FirefoxDriver(firefoxOptions);
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions =  new EdgeOptions();
                //edgeOptions.setHeadless(true);
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
                break;
        }

        this.scenario = scenario;
    }

    @After
    public void tearDown() {
        driver.quit();
        log.info("======================================");
        log.info("====== BROwSER AND DRIVER CLOSED ======");
        log.info("======================================");
    }
}