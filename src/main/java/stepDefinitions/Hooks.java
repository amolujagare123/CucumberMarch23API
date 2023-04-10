package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@login")
    public void beforeScenario()
    {
        System.out.println("beforeScenario ********");
    }

    @After("@login")
    public void afterScenario()
    {
        System.out.println("afterScenario ********");
    }
}
