package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import org.testng.annotations.Test;


public class AddUsersToSlaveTests extends CommonOps {

    @Test(priority = 0)
    public void testAddInternalUserToSlaveAndVerify() {
        driver.navigate().to(getData("url_slave1"));
        WebFlows.login(getData("slaveUser"), getData("slavePass"));
        Verifications.textInElement(slave124Home.txt_mainHeader, "MASTER ACCESS TOKEN MANAGEMENT");
        WebFlows.addInternalUserToSlave("INTERNAL", "xyz12");
        WebFlows.copyTokenToClipBoard();

        Verifications.numberOfElementsAfterAdding(slave124Home.users, slave124Home.users.size());//???

//        WebFlows.addAdUserToSlave("ACTIVE DIRECTORY", "stas.d");
//
//        //Verifications.numberOfElementsAfterAdding();
//        Verifications.numberOfElementsAfterAdding(slave124Home.users, slave124Home.users.size()); //???

    }
}
