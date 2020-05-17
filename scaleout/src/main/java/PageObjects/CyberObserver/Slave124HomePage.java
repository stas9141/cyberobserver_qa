package PageObjects.CyberObserver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Slave124HomePage
{
    @FindBy(how = How.XPATH, using = "//h4[@class='systemTitle ng-binding']")
    public WebElement txt_mainHeader;
    @FindBy(how = How.XPATH, using = "//div[@class='clearfix']/button")
    public WebElement btn_addUser;

    @FindBy(how = How.XPATH, using = "//tr[last()]//i[@ng-click='copyTokenToClipboard(user.token);']")
    public WebElement btn_copyToClipboardOfLastUser;

    @FindBy(how = How.XPATH, using = "//tr[@ng-repeat='user in users']")
    public List<WebElement> users;
}
