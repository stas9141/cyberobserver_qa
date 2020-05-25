package SanityTests;

import Utilities.CommonOps;
import WorkFlows.WebFlows;
import org.testng.annotations.Test;

public class EditRemoteMachineTests extends CommonOps {

    @Test(priority =2)
    public void testEditRemoteMachineAndVerify() {

        WebFlows.editRemoteMachine("123","test");

    }
}
