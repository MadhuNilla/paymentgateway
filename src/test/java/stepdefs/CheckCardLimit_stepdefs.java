package stepdefs;

import Utils.WebDriverUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.xpath.SourceTree;
import org.junit.Assert;
import org.openqa.selenium.By;
import page_objects.BasePage;
import page_objects.CheckCardBalance;

public class CheckCardLimit_stepdefs extends BasePage{

    CheckCardBalance checkCard=new CheckCardBalance();

    @When("^User clicks the Check Credit card Limit$")
    public void userClicksTheCheckCreditCardLimit() throws Throwable {
      checkCard.clickcOnCheckCreditCardLimit();
    }
    @And("^User enters the card number \"([^\"]*)\"$")
    public void userEntersTheCardNumber(String num) throws Throwable {
      checkCard.enterTheCardNumber(num);
    }
    @And("^User clicks the submit button$")
    public void userClicksTheSubmitButton() throws Throwable {
      checkCard.clickSubmitButton();
    }
    @Then("^User can view the credit card balance with message says \"([^\"]*)\"$")
    public void userCanViewTheCreditCardBalanceWithMessageSays(String text) throws Throwable {
        Assert.assertTrue(WebDriverUtils.isTextPresent(text));
    }
    @And("^User wants to go back to home page$")
    public void userWantsToGoBackToHomePage() throws Throwable {
     checkCard.backToCartPage();
    }
    @Then("^User gets an error message says \"([^\"]*)\"$")
    public void userGetsAnErrorMessageSays(String text) throws Throwable {
        WebDriverUtils.checkText(text);

    }
}
