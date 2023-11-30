package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Parent{
    public Locators() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    // Left Navigator
    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register;
    @FindBy(css = "[name='username']")
    public WebElement logUserName;
    @FindBy(css = "[name='password']")
    public WebElement logPassword;
    @FindBy(css = "[value='Log In']")
    public WebElement logIn;
    @FindBy(css = "[class='smallText']")
    public WebElement controlLogIN;
    @FindBy(xpath = "//a[text()='Log Out']")
    public WebElement logOut;
    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement newAccount;
    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement billPay;
    @FindBy(xpath = "//a[text()='Update Contact Info'] ")
    public WebElement contactInfo;
    @FindBy(xpath = "//a[text()='Request Loan'] ")
    public WebElement requestLoan;

    // Center Navigator
    @FindBy(css = "[id='customer.firstName']")
    public WebElement fName;
    @FindBy(css = "[id='customer.lastName']")
    public WebElement lName;
    @FindBy(css = "[id='customer.address.street']")
    public WebElement address;
    @FindBy(css = "[id='customer.address.city']")
    public WebElement city;
    @FindBy(css = "[id='customer.address.state']")
    public WebElement state;
    @FindBy(css = "[id='customer.address.zipCode']")
    public WebElement zCode;
    @FindBy(css = "[id='customer.phoneNumber']")
    public WebElement pNumber;
    @FindBy(css = "[id='customer.ssn']")
    public WebElement ssn;
    @FindBy(css = "[id='customer.username']")
    public WebElement regUserName;
    @FindBy(css = "[id='customer.password']")
    public WebElement regPassword;
    @FindBy(css = "[id='repeatedPassword']")
    public WebElement confirm;
    @FindBy(css = "[value='Register']")
    public WebElement centerRegister;
    @FindBy(css = "[id='rightPanel'] >h1")
    public WebElement controlCenterTitle;
    @FindBy(css = "[id='rightPanel'] >p")
    public WebElement controlCenterText;
    @FindBy(css = "[id='customer.username.errors']")
    public WebElement alReadyUsername;
    @FindBy(css = "[id='type']")
    public WebElement accountType;
    @FindBy(css = "[value='Open New Account']")
    public WebElement openAccount;
    @FindBy(css = "[ng-if='showResult']>p")
    public WebElement accountCont;
    @FindBy(css = "[name='payee.name']")
    public WebElement payeeName;
    @FindBy(css = "[name='payee.address.street']")
    public WebElement payeeAddress;
    @FindBy(css = "[name='payee.address.city']")
    public WebElement payeeCity;
    @FindBy(css = "[name='payee.address.state']")
    public WebElement payeeState;
    @FindBy(css = "[name='payee.address.zipCode']")
    public WebElement payeeZCode;
    @FindBy(css = "[name='payee.phoneNumber']")
    public WebElement payeeNumber;
    @FindBy(css = "[name='payee.accountNumber']")
    public WebElement payeeAccount;
    @FindBy(css = "[name='verifyAccount']")
    public WebElement payeeVAccount;
    @FindBy(css = "[name='amount']")
    public WebElement payeeAmount;
    @FindBy(css = "[value='Send Payment']")
    public WebElement sendPayment;
    @FindBy(css = "[ng-show='showResult'] >h1")
    public WebElement billPayCont;
    @FindBy(css = "[value='Update Profile'] ")
    public WebElement updateProfile;
    @FindBy(css = "[ng-if='showResult'] >h1")
    public WebElement updatePCont;
    @FindBy(css = "[id='amount'] ")
    public WebElement loanAmount;
    @FindBy(css = "[id='downPayment'] ")
    public WebElement loanDownPayment;
    @FindBy(css = "[value='Apply Now'] ")
    public WebElement applyNow;
    @FindBy(css = "[ng-if='loanResponse.approved'] >p")
    public WebElement loanContV;
    @FindBy(css = "[class='error ng-scope'] ")
    public WebElement loanContIV;


    public WebElement getWebElement(String strButton){

        switch (strButton){
            case"register":return register;
            case"logUserName":return logUserName;
            case"logPassword":return logPassword;
            case"logIn":return logIn;
            case"logOut":return logOut;
            case"fName":return fName;
            case"lName":return lName;
            case"address":return address;
            case"city":return city;
            case"state":return state;
            case"zCode":return zCode;
            case"pNumber":return pNumber;
            case"ssn":return ssn;
            case"regUserName":return regUserName;
            case"regPassword":return regPassword;
            case"confirm":return confirm;
            case"centerRegister":return centerRegister;
            case"newAccount":return newAccount;
            case"openAccount":return openAccount;
            case"billPay":return billPay;
            case"payeeName":return payeeName;
            case"payeeAddress":return payeeAddress;
            case"payeeCity":return payeeCity;
            case"payeeState":return payeeState;
            case"payeeZCode":return payeeZCode;
            case"payeeNumber":return payeeNumber;
            case"payeeAccount":return payeeAccount;
            case"payeeVAccount":return payeeVAccount;
            case"payeeAmount":return payeeAmount;
            case"sendPayment":return sendPayment;
            case"updateProfile":return updateProfile;
            case"contactInfo":return contactInfo;
            case"requestLoan":return requestLoan;
            case"loanAmount":return loanAmount;
            case"loanDownPayment":return loanDownPayment;
            case"applyNow":return applyNow;
        }
        return null;
    }
}
