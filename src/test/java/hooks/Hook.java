package hooks;

import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
    public static WebDriver driver;
    private static final Logger log = LogManager.getLogger(Hook.class);

    @Before
    public void setup(){
        System.out.println("====== BEFORE =======");
        if (driver == null) {
            log.trace("Entering setup.");
        }
    }


    @After
    public void tearDown(){
        System.out.println("====== AFTER =======");
        log.trace("Close browser.");
        if (driver != null) {
            driver.quit();
        }
    }
}