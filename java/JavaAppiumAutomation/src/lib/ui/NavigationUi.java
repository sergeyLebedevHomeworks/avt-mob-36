package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NavigationUi extends MainPageObject
{
    private static final String
            MY_LISTS_LINK = "//android.widget.FrameLayout[@content-desc='My lists']";

    public NavigationUi(AppiumDriver driver)
    {
        super(driver);
    }

    public void clickMyLists() throws InterruptedException {
        this.waitForElementAndClick(
                By.xpath(MY_LISTS_LINK),
                "Cannot find navigation button to My lists",
                5
        );
        Thread.sleep(5000);
    }
}
