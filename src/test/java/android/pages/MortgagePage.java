package android.pages;

import com.pnt.mobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MortgagePage {

    @FindBy(xpath = "//android.widget.TextView[@text='Mortgage']")
    private WebElement headerForMortgagePage;

    public void validateHeaderForMortgagePage() {
        Assert.assertTrue(headerForMortgagePage.isDisplayed());
        ExtentTestManager.log("Validated header for Mortgage page is displayed");
    }
}
