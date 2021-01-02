package android.tests;

import android.pages.*;
import com.pnt.mobileautomation.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegressionTests extends TestBase {

    private HomePage homePage;
    private LoginPage loginPage;
    private OverdraftServicesPage overdraftServicesPage;
    private ProductPage productPage;
    private MortgagePage mortgagePage;

    @BeforeMethod
    public void setupPageFactory() {
        homePage = PageFactory.initElements(getDriver(), HomePage.class);
        loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
        overdraftServicesPage = PageFactory.initElements(getDriver(), OverdraftServicesPage.class);
        productPage = PageFactory.initElements(getDriver(), ProductPage.class);
        mortgagePage = PageFactory.initElements(getDriver(), MortgagePage.class);
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnContactUsAndThenCallCustomerService() {
        homePage.clickOnContactUsButton();
        homePage.clickOnCallCustomerServiceForGiftCard();
    }

    @Test(enabled = false)
    public void validateUserIsAbleNavigateBetweenButtonsAndUseBackButtonFromTheHeader() {
        homePage.clickOnAccountsButton();
        loginPage.validateLoginPage();
        loginPage.clickOnBackButton();
        homePage.clickOnTransferButton();
        loginPage.validateLoginPage();
        loginPage.clickOnBackButton();
        homePage.clickOnDepositButton();
        loginPage.validateLoginPage();
        loginPage.clickOnBackButton();
        homePage.clickOnSendMoneyButton();
        loginPage.validateLoginPage();
        loginPage.clickOnBackButton();
        homePage.clickOnPayABillButton();
        loginPage.validateLoginPage();
        loginPage.clickOnBackButton();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnTheMenuAndSelectOverdraftServices() {
        homePage.clickOnMenuBar();
        homePage.clickOnOverdraftServices();
        overdraftServicesPage.validateHeaderForOverdraftServicesPage();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnViewAccountsThenInputLogInInformationAndClickLogIn() {
        homePage.clickOnViewAccounts();
        loginPage.validateLoginPage();
        loginPage.typeUserName();
        loginPage.typePassword();
        loginPage.clickOnLogIn();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToScrollOnHomepageClickOnProductsThenScrollOnProductPageAndClickOnMortgage() {
        homePage.clickOnProductsButton();
        productPage.validateHeaderForProductsPage();
        functionSwipe("up", 500, 500);
        productPage.clickOnMortgageButton();
        mortgagePage.validateHeaderForMortgagePage();
    }


}

