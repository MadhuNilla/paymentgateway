package Utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page_objects.BasePage;

import java.util.concurrent.TimeUnit;


public class InvokeBrowser extends BasePage{

    private static String OS=System.getProperty("os.name").toLowerCase();
    private static final Logger LOGGER= LoggerFactory.getLogger(InvokeBrowser.class);
   static String browserName=AutomationConstraints.BROWSER;
  static   String url=AutomationConstraints.URL;

    @org.junit.BeforeClass
    public static void setUpBrowser() {
        if (eventdriver == null) {
            //setting up the browser
                startBrowser(browserName);
                eventdriver.get("http://demo.guru99.com/payment-gateway/index.php");
                eventdriver.manage().window().maximize();
                eventdriver.manage().timeouts().implicitlyWait(AutomationConstraints.TIMEOUT, TimeUnit.SECONDS);

            }
        }
    public static void startBrowser(String browserName) {
        LOGGER.info("opening the browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            LOGGER.info("opening the chrome browser");
            if (isMac()) {
                //opening the chrome browser in mac
                WebDriverManager.chromedriver().setup();
                eventdriver = new EventFiringWebDriver(new ChromeDriver());
            }
            else if(isWindows()) {
                // opening the browser in windows
                WebDriverManager.chromedriver().setup();
                eventdriver = new EventFiringWebDriver(new ChromeDriver());
            }
        }
        else if(browserName.equalsIgnoreCase("firefox"))
        {
            LOGGER.info("opening the firefox browser");
        if(isMac())
        { //opening the firefox browser in mac
            WebDriverManager.firefoxdriver().setup();
            eventdriver = new EventFiringWebDriver(new FirefoxDriver());
        }
        else if(isWindows())
        {//opening the firefox browser in windows
            WebDriverManager.firefoxdriver().setup();
            eventdriver = new EventFiringWebDriver(new FirefoxDriver());
        }
        }
    }
    private static boolean isMac()
    {
       return OS.indexOf("mac")>=0;
    }

    private static boolean isWindows()
    {
        return OS.indexOf("Windows")>=0;
    }

    @org.junit.AfterClass
    public static void closeBrowser()
    {
        if(eventdriver!=null)
        {
            eventdriver.quit();
        }
    }


}
