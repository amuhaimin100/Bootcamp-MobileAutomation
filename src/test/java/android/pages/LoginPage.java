package android.pages;

import com.pnt.mobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Go Back']")
    private WebElement backButton;

    @FindBy(id = "com.tdbank:id/login_logo")
    private WebElement tdBankLogo;

    @FindBy(xpath = "//android.widget.EditText[@text='User name']")
    private WebElement userNameField;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//android.widget.Button[@text='Log in']")
    private WebElement loginButton;

    public void clickOnBackButton() {
        backButton.click();
        ExtentTestManager.log("Clicked on the back button from the header");
    }

    public void validateLoginPage() {
        Assert.assertTrue(tdBankLogo.isDisplayed());
        ExtentTestManager.log("Validated the TD bank logo is displayed on the log in page");

    }

    public void typeUserName() {
        userNameField.sendKeys("RealPerson@Gmail.com");
        ExtentTestManager.log("Typed in user name in the user name field");
    }

    public void typePassword() {
        passwordField.sendKeys("RealLifePerson2$");
        ExtentTestManager.log("Typed in password in the password filed");
    }

    public void clickOnLogIn() {
        loginButton.click();
        ExtentTestManager.log("Clicked on log in button");
    }

}
