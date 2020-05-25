package SanityTests;


import Extensions.Verifications;
import PageObjects.CyberObserver.RemoteMachinesPage;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import org.testng.annotations.Test;



public class AddRemoteMachineTests extends CommonOps {

    @Test(priority = 0)
    public void testMasterHomePage() {
        Verifications.partOfTextInElement(masterHome.txt_mainHeader, "CYBER DEFENSE STATUS: ");
    }


    @Test(priority = 2)
    public void testAddRemoteMachineAndVerify() {
        WebFlows.addRemoteMachine("124", null, "192.168.1.124");
        //WebFlows.pasteTokenFromClipBoard();
        //Verifications.numberOfElementsAfterAdding(RemoteMachinesPage.slaves, RemoteMachinesPage.slaves.size() );
    }
}
