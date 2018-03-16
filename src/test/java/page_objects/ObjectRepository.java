package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepository extends BasePage {

    public ObjectRepository()
    {
        PageFactory.initElements(eventdriver,this);
    }

    @FindBy(xpath=".//nav[@id='nav']/a[1]")
     static WebElement clickcart;

    @FindBy(name="quantity")
     static WebElement quantity;

    @FindBy(xpath=".//section[@id='three']/div/form/div/div[8]/ul/li/input")
    static WebElement buy;

    @FindBy(id="card_nmuber")
    static WebElement cardnum;

    @FindBy(id="month")
    static WebElement month;

    @FindBy(id="year")
    static WebElement year;

    @FindBy(id="cvv_code")
    static WebElement cvvnum;

    @FindBy(name="submit")
    static WebElement pay;

    @FindBy(xpath=".//*[@id='nav']/a[2]")
     static WebElement generatecard;

    @FindBy(xpath="html/body/section/div/header/h2")
    static WebElement checkCardResult;


    @FindBy(xpath=".//*[@id='nav']/a[3]")
    static WebElement checkCredit;

    @FindBy(css="#card_nmuber")
    static WebElement enterCardNum;

    @FindBy(name="submit")
    static WebElement submit;

   @FindBy(xpath="//section[@id='three']/div/font[1]")
    static  WebElement checkResult;

   @FindBy(xpath ="//section[@id='three']/div/font[2]" )
    static WebElement checkResult1;

   @FindBy(xpath="//section[@id='three']/div/ul/li/a")
    static WebElement backToCart;

}
