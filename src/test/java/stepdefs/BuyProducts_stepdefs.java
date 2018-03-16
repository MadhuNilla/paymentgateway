package stepdefs;

import Utils.WebDriverUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import page_objects.CartToBuyProducts;
import Utils.InvokeBrowser;
import Utils.WebDriverUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import page_objects.CartToBuyProducts;

public class BuyProducts_stepdefs {

        CartToBuyProducts cart;

        @Given("^User should be on payment gateway homepage$")
        public void userShouldBeOnPaymentGatewayHomepage() throws Throwable {
            cart=new CartToBuyProducts();
        }
        @When("^User clicks the cart button$")
        public void userClicksTheCartButton() throws Throwable {
            cart.clickOnCart();
        }
        @And("^User selects the Quantity$")
        public void userSelectsTheQuantity() throws Throwable {
            cart.enterQuantity();

        }
        @And("^User clicks the BuyNow button$")
        public void userClicksTheBuyNowButton() throws Throwable {
            cart.clickBuynow();
        }
        @And("^User enters the Card details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
        public void userEntersTheCardDetails(String card, String expiryMonth, String expiryYear, String cvv) throws Throwable {
            cart.enterCardDetails(card,expiryMonth,expiryYear,cvv);}

        @And("^User clicks the Paynow$")
        public void userClicksThePaynow() throws Throwable {
            cart.clickPayNow();
        }
        @Then("^User get a message says \"([^\"]*)\"$")
        public void userGetAMessageSays(String text) throws Throwable {
            Assert.assertTrue(WebDriverUtils.isTextPresent(text));
        }
    }


