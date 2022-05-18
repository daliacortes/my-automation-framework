package steps;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hook {
    public WebDriver driver;
    public static final Logger log = LogManager.getLogger(Hook.class);
    Scenario scenario = null;

    @Before
    public void setupDriver(Scenario scenario) {
        log.info("====== SETUP DRIVER ======");
        log.info("Starting - " + scenario.getName());
        log.info("==========================");

        

        this.scenario = scenario;
    }

    @After
    public void tearDown() {
        // getDriver().close();
        // getDriver().quit();
        log.info("====== CLOSE DRIVER ======");
    }
}