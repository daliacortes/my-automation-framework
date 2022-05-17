package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
 
    @Before
    public void setup(){
        System.out.println("SETUP");
    }


    @After
    public void tearDown(){
        System.out.println("CLOSE");
    }
}