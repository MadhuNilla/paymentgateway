package stepdefs;

import Utils.WebDriverUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import page_objects.GenerateCreditCard;


public class GenarateCard_stepdefs  {

    GenerateCreditCard creditCard=new GenerateCreditCard();

    @When("^User clicks the Genarate card number$")
    public void userClicksTheGenarateCardNumber() throws Throwable {
       creditCard.clickOnGenerateCardNumber();

    }
    @Then("^User gets a message says \"([^\"]*)\" with all card details$")
    public void userGetsAMessageSaysWithAllCardDetails(String text) throws Throwable {
     // WebDriverUtils.checkText(text);
        //creditCard.checkGenerateCardResult(text);
    }
    }


