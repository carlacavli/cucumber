package StepDefinition;

import cucumber.api.java.After;
import utulities.Driver;

/*
before and after methods will be in this class
 */
public class hooks {
 @After
    public void afterClass(){
     Driver.closeDriver();
 }
}
