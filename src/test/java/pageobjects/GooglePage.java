package pageobjects;

import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage{
    //@FindBy(how = How.ID, using=" element-id")
    //private WebElement element-name;

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void navigateTo(String url){
        driver.get(url);
    }
}
