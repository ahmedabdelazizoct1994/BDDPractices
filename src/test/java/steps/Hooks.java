package steps;

import bdd.cucumber.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

    @Before
    public void beforeMethods(){
System.out.println(" I will run before any methods ");

    }


    @After
    public void afterMethods(){
        driver.quit();

    }
}
