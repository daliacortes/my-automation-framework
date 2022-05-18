package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pageobjects.GooglePage;

public class GoogleSteps {
    private WebDriver driver;

    @Given("^I go to google$")
    public void iGoToGoogle() {
        GooglePage googlePage = new GooglePage(driver);
        googlePage.navigateTo("https//google.com");
    }
}
