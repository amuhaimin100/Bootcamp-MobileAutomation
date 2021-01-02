package android.pages;

import com.pnt.mobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductPage {

    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement headerForProductsPage;

    @FindBy(xpath = "//android.widget.TextView[@text='Mortgage']")
    private WebElement mortgageButton;

    public void validateHeaderForProductsPage() {
        Assert.assertTrue(headerForProductsPage.isDisplayed());
        ExtentTestManager.log("Validated the header is displayed on the Products page");
    }

    public void clickOnMortgageButton() {
        mortgageButton.click();
        ExtentTestManager.log("Clicked on Mortgage button");
    }
}
