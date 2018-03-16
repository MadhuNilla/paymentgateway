package Utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import page_objects.BasePage;

public class WebDriverUtils extends BasePage {
    public static boolean isTextPresent(String text) {

        return eventdriver.findElement(By.tagName("body")).getText().contains(text);
    }

    public static void checkText(String text) {
        boolean textPresent = eventdriver.getPageSource().contains(text);
        Assert.assertTrue(textPresent);
    }

    public static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

