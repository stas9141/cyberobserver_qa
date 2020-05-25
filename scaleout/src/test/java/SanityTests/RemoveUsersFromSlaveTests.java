package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import org.testng.annotations.Test;

public class RemoveUsersFromSlaveTests extends CommonOps {

    @Test(priority = 0)
    public void testRemoveUserFromSlaveAndVerify() {
        driver.navigate().to(getData("url_slave1"));
        WebFlows.login(getData("slaveUser"), getData("slavePass"));
        Verifications.textInElement(slave124Home.txt_mainHeader, "MASTER ACCESS TOKEN MANAGEMENT");

        if(! WebFlows.isUserPresent()){
            WebFlows.addInternalUserToSlave("INTERNAL", "test");
        }
        WebFlows.removeLastUserFromSlave();
    }
}
