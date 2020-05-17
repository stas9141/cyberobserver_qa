package PageObjects.CyberObserver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MasterHomePage
{
    @FindBy(how = How.XPATH, using = "//h4[@class='ng-binding']")   //div[@class='main_container']/h4")
    public WebElement txt_mainHeader;
}
