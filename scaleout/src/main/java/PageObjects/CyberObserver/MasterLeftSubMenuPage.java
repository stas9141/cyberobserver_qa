package PageObjects.CyberObserver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MasterLeftSubMenuPage
{
    @FindBy(how = How.XPATH, using = "//a[@ng-repeat='submenu in submenus'][@href='#/system/tools']")
    public WebElement link_toolsConfiguration;

    @FindBy(how = How.XPATH, using = "//a[@href='#/system/csc']")
    public WebElement link_cscs;
    @FindBy(how = How.XPATH, using = "//a[@href='#/system/groups']")
    public WebElement link_groups;
    @FindBy(how = How.XPATH, using = "//a[@href='#/system/standards']")
    public WebElement link_standards;
    @FindBy(how = How.XPATH, using = "//a[@href='#/system/remoteMachines']")
    public WebElement link_remoteMachines;

    @FindBy(how = How.XPATH, using = "//a[@href='#/system/settings']")
    public WebElement link_settings;
}
