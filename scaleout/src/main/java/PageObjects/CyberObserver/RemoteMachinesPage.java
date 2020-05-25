package PageObjects.CyberObserver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class RemoteMachinesPage
{
    @FindBy(how = How.XPATH, using = "//h4[@class='systemTitle ng-binding ng-scope']")
    public WebElement txt_mainHeader;

    @FindBy(how = How.XPATH, using = "//li[@ng-repeat='remoteMachine in remoteMachinesList']")
    public List<WebElement> remoteMachinesList;

    @FindBy(how = How.ID, using = "name")
    public WebElement txt_machineName;

    @FindBy(how = How.ID, using = "description")
    public WebElement txt_description;

    @FindBy(how = How.XPATH, using = "//div[@class='col-sm-2']/select")
    public WebElement selection_address;

    @FindBy(how = How.ID, using = "token")
    public WebElement txt_token;

    @FindBy(how = How.ID, using = "//button[@type='submit']//i")
    public WebElement btn_save;

    @FindBy(how = How.ID, using = "//i[@ng-click='getRemoteMachine(remoteMachine);']")
    public WebElement btn_edit;

    @FindBy(how = How.ID, using = "//i[@ng-click='removeRemoteMachine(remoteMachine);']")
    public WebElement btn_delete;

    @FindBy(how = How.XPATH, using = "//li[@ng-repeat='remoteMachine in remoteMachinesList'][2]")
    public WebElement first_slave;



}
