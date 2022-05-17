package steps;

import io.cucumber.java.en.Given;

public class GoogleSteps {
    
    @Given("^I go to google$")
    public void iGoToGoogle() {
        System.out.println("Step 1");
    }
}
