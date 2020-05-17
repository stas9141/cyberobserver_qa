package SanityTests;


import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import org.testng.annotations.Test;




public class CyberObserverWeb extends CommonOps
{

//    @Test(priority = 0)
//    public void test01_masterLogin()
//    {
//        WebFlows.login(getData("user"),getData("password"));
//
//        Verifications.partOfTextInElement(masterHome.txt_mainHeader, "CYBER DEFENSE STATUS: ");
//
//    }
    @Test(priority = 0)
    public void test03_slave124LoginAddInternalAndADUsersAndVerifyTheNumberOfUsers() {
        driver.navigate().to(getData("url_slave1"));
        WebFlows.login(getData("slaveUser"),getData("slavePass"));
        Verifications.textInElement(slave124Home.txt_mainHeader, "MASTER ACCESS TOKEN MANAGEMENT");
        WebFlows.addInternalUserToSlave("INTERNAL", "qa_user123");
        WebFlows.copyTokenToClipBoard();


        Verifications.numberOfElementsAfterAdding(slave124Home.users, slave124Home.users.size());
    }

//        WebFlows.addAdUserToSlave("ACTIVE DIRECTORY", "stas.d");
//        //Verifications.numberOfElementsAfterAdding();
//        Verifications.numberOfElementsAfterAdding(slave124Home.users, slave124Home.users.size()); //???
//
//    }
//
//    public void test04_slave124RemoveUserAndVerifyTheNumberOfUsers()
//    {
//        WebFlows.addAdUserToSlave("ACTIVE DIRECTORY", "stas.d");
//
//
//    }



    @Test(priority = 4)
    public void test11_masterAddAndVerifyRemoteMachine()
    {
        WebFlows.addRemoteMachine("124", "qa test","192.168.1.124");
        //WebFlows.pasteTokenFromClipBoard();


    }
}
