package StepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.citizenShipPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class citizenshipSteps {

    leftNav lv=new leftNav();
    citizenShipPage cp = new citizenShipPage();

    @Given("^Click on citizenship$")
    public void click_on_citizenship() throws Throwable {
        lv.clickbuttonCitizenship();
    }
    @Given("^Type the citizenship name \"(.*?)\"$")
    public void type_the_citizenship_name(String name) throws Throwable {
        cp.typeinputCitizenName(name);

    }

    @Given("^Type the shortName \"(.*?)\"$")
    public void type_the_shortName(String shortname) throws Throwable {
       cp.typeInputCitizenShortName(shortname);

    }


}
