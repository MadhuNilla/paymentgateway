package page_objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class CheckCardBalance extends ObjectRepository{

    ObjectRepository object;

    public void clickcOnCheckCreditCardLimit() {
     object.checkCredit.click();

    }

    public void enterTheCardNumber(String num) {
        object.enterCardNum.sendKeys(num);
    }

    public void clickSubmitButton() {
        object.submit.click();

    }
    public void resultCheck(String text) {
       String message= object.checkResult.getText();
        Assert.assertEquals(text,message);
     }

    public void backToCartPage() {
        object.backToCart.click();
    }
}
