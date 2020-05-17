package PageObjects.CyberObserver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MasterLoginPage
{
    @FindBy(how = How.ID_OR_NAME, using = "details-button")
    public WebElement btn_advanced;

    @FindBy(how = How.ID_OR_NAME, using = "proceed-link")
    public WebElement btn_proceed;

    @FindBy(how = How.NAME, using = "j_username")
    public WebElement txt_userName;

    @FindBy(how = How.NAME, using = "j_password")
    public WebElement txt_password;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement btn_login;


}


