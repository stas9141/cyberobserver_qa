package PageObjects.CyberObserver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Slave124AddNewUserPage
{
    @FindBy(how = How.XPATH, using = "//div[@class='col-sm-5']/select[@name='userType']")
    public WebElement selection_userType;

    @FindBy(how = How.XPATH, using = "//div[@class='col-sm-5']/select[@name='logonName']")
    public WebElement selection_adUserName;

    @FindBy(how = How.XPATH, using = "//input[@name='logonName']")
    public WebElement txt_userName;

    @FindBy(how = How.XPATH, using = "//button[@ng-disabled='addUserToken.$invalid']")
    public WebElement btn_save;





}
