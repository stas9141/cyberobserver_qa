package WorkFlows;

import Extensions.UiActions;
import PageObjects.CyberObserver.MasterLeftSubMenuPage;
import Utilities.CommonOps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.openqa.selenium.Keys.CONTROL;

public class WebFlows extends CommonOps {
    public static void login(String user, String pass) {
        UiActions.click(masterLogin.btn_advanced);
        UiActions.click(masterLogin.btn_proceed);
        UiActions.updateText(masterLogin.txt_userName, user);
        UiActions.updateText(masterLogin.txt_password, pass);
        UiActions.click(masterLogin.btn_login);
    }


    public static void addInternalUserToSlave(String userType, String userName) {
        UiActions.click(slave124Home.btn_addUser);
        UiActions.updateDropDown(slave124AddNewUser.selection_userType, userType);
        UiActions.updateText(slave124AddNewUser.txt_userName, userName);
        UiActions.click(slave124AddNewUser.btn_save);

    }

    public static void addAdUserToSlave(String userType, String adUser) {
        UiActions.click(slave124Home.btn_addUser);
        UiActions.updateDropDown(slave124AddNewUser.selection_userType, userType);
        UiActions.updateDropDown(slave124AddNewUser.selection_adUserName, adUser);
        UiActions.click(slave124AddNewUser.btn_save);

    }





    public static void copyTokenToClipBoard(){
        UiActions.copyTokenToClipboard(slave124Home.btn_copyToClipboardOfLastUser);
    }

    public static void pasteTokenFromClipBoard(){
        //UiActions.click(masterRemoteMachines.txt_token);
        UiActions.pastText(masterRemoteMachines.txt_token);

    }


    public static void removeLastUserFromSlave() {
        UiActions.click(slave124Home.users.get(slave124Home.users.size()-1));
        UiActions.click(slave124Home.btn_deleteUser);
        UiActions.click(slave124Home.btn_confirmDeleteUser);

    }

    public static void addRemoteMachine(String machineName, String description, String address){
        UiActions.click(masterLeftMenu.link_system);
        UiActions.click(masterLeftSubMenu.link_remoteMachines);

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        UiActions.updateText(masterRemoteMachines.txt_machineName, machineName);
        // UiActions.updateText(masterRemoteMachines.txt_description, description);

        UiActions.updateDropDown(masterRemoteMachines.selection_address, address);
        //UiActions.copyPasteTextFromClipboard(masterRemoteMachines.txt_token, token);
        UiActions.pastText(masterRemoteMachines.txt_token);
        UiActions.click(masterRemoteMachines.btn_save);

    }


    public static void editRemoteMachine(String machineName, String description) {
        UiActions.click(masterLeftMenu.link_system);
        UiActions.click(masterLeftSubMenu.link_remoteMachines);
        //UiActions.mouseHoverElements(masterRemoteMachines.first_slave,masterRemoteMachines.btn_edit);
        UiActions.click(masterRemoteMachines.btn_edit);
        UiActions.updateText(masterRemoteMachines.txt_machineName, machineName);
        UiActions.updateText(masterRemoteMachines.txt_description, description);
        UiActions.click(masterRemoteMachines.btn_save);

    }

    public static boolean isUserPresent() {
        return isElementPresent(By.xpath("//i[@ng-click='removeUser(user);']"));
    }

    public static int getUserCount() {
        return slave124Home.users.size();
    }
}