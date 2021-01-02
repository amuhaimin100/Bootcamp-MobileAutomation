package android.pages;

import com.pnt.mobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OverdraftServicesPage {
    @FindBy(xpath = "//android.widget.TextView[@text='Overdraft Services']")
    private WebElement headerForOverdraftServicesPage;

    public void validateHeaderForOverdraftServicesPage() {
        Assert.assertTrue(headerForOverdraftServicesPage.isDisplayed());
        ExtentTestManager.log("Validated header for the Overdraft Services is displayed");

    }
}
