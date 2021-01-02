package android.pages;

import com.pnt.mobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountBtn;

    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    private WebElement transferButton;

    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    private WebElement depositButton;

    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    private WebElement sendMoneyButton;

    @FindBy(xpath = "//android.widget.Button[@text='PAY A BILL']")
    private WebElement payABillButton;

    @FindBy(xpath = "//android.widget.TextView[@text= 'Contact us']")
    private WebElement contactUSButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.tdbank:id/gift_card_dial_button']")
    private WebElement giftCardCallButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc= 'Show Menu']")
    private WebElement menuBar;

    @FindBy(xpath = "//android.widget.TextView[@text='Overdraft Services']")
    private WebElement overdraftServicesButton;

    @FindBy(xpath = "//android.widget.TextView[@text='View Accounts']")
    private WebElement viewAccountsButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement productsButton;

    public void clickOnAccountsButton() {
        accountBtn.click();
        ExtentTestManager.log("Clicked on Account Button");
    }

    public void clickOnContactUsButton() {
        contactUSButton.click();
        ExtentTestManager.log("Clicked on contact us button");
    }

    public void clickOnCallCustomerServiceForGiftCard() {
        giftCardCallButton.click();
        ExtentTestManager.log("Clicked to call customer service about gift card");
    }

    public void clickOnTransferButton() {
        transferButton.click();
        ExtentTestManager.log("Clicked on Transfer Button");
    }

    public void clickOnDepositButton() {
        depositButton.click();
        ExtentTestManager.log("Clicked on Deposit Button");
    }

    public void clickOnSendMoneyButton() {
        sendMoneyButton.click();
        ExtentTestManager.log("Clicked on Send Money Button");
    }

    public void clickOnPayABillButton() {
        payABillButton.click();
        ExtentTestManager.log("Clicked on Pay A Bill Button");
    }

    public void clickOnMenuBar() {
        menuBar.click();
        ExtentTestManager.log("Clicked to open the Menu");
    }

    public void clickOnOverdraftServices() {
        overdraftServicesButton.click();
        ExtentTestManager.log("Clicked on overdraft services");
    }

    public void clickOnViewAccounts() {
        viewAccountsButton.click();
        ExtentTestManager.log("Clicked on view accounts button");
    }

    public void clickOnProductsButton() {
        productsButton.click();
        ExtentTestManager.log("Clicked on Products Page");
    }
}
