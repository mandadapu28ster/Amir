package StepDefinations;

import BrowserFacade.BrowserFacade;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;


public class Step_Definations  {

    WebDriver driver;
    BrowserFacade BF;

    @Given("I am on home page")
    public void i_am_on_home_page() throws Exception {

        BF= new BrowserFacade();
        BF.OpenBrowser();
        BrowserFacade.getDriver().get("https://www.amazon.co.uk/");

    }

    @When("I enter search mobile phone in search bar")
    public void i_enter_search_mobile_phone_in_search_bar() {

    }

    @And("I press enter")
    public void i_press_enter() {

    }

    @And("I am presented on search result page")
    public void i_am_presented_on_search_result_page() {

    }

    @And("I search for least price mobile phone")
    public void i_search_for_least_price_mobile_phone() {

    }

    @Then("I am have got search results")
    public void i_am_have_got_search_results() {

    }
}
