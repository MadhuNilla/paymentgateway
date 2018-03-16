package page_objects;

import Utils.InvokeBrowser;
import Utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static page_objects.BasePage.eventdriver;

public class CartToBuyProducts extends ObjectRepository{
    ObjectRepository obj;

    public  void clickOnCart() {
        obj.clickcart.click();
       // WebDriverUtils.sleep();

    }
    public void enterQuantity() {
        Select selectQuantity=new Select(obj.quantity);
        selectQuantity.selectByValue("2");
    }
    public void clickBuynow() {
        obj.buy.click();
    }
    public void enterCardDetails(String card,String expiryMonth,String expiryYear,String cvv )
    {
        obj.cardnum.sendKeys(card);
        //select an month
        Select selectMonth=new Select(obj.month);
        selectMonth.selectByValue(expiryMonth);
        //selects an year
        Select selectYear=new Select(obj.year);
        selectYear.selectByValue(expiryYear);
        obj.cvvnum.sendKeys(cvv);

    }
    public void clickPayNow() {
        obj.pay.click();
    }
}
