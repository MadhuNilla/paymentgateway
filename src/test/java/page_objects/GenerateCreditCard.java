package page_objects;

import org.junit.Assert;

public class GenerateCreditCard extends ObjectRepository{

    ObjectRepository object;

    public void clickOnGenerateCardNumber() {
        object.generatecard.click();
    }

    public void checkGenerateCardResult(String text) {
//        String message=object.checkCardResult.getText();
//        Assert.assertEquals(text,message);


    }
}
