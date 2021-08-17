package seleniumPhase2;

import org.testng.annotations.Test;

import FrameWorkDemo1.GenericFuntion1;

public class AlertDemo1 {
@Test
public void alertTest() throws InterruptedException {
	GenericFuntion1 key= new GenericFuntion1();
	key.openBrowser("Chrome");
	key.enterURL("https://www.meghanabus.in/index.html");
    key.click("xpath", "//*[@id='close']");
    key.click("xpath", "//*[@id='navbar-menu']/ul[1]/li[2]/a");
    
    Thread.sleep(3000); 
    
    key.click("xpath", "//*[@id='ticketForm']/div[3]/div/button");

    Thread.sleep(3000);
    key.alertText();
    key.alertAccept();
    
    key.click("xpath", "//*[@id='ticketForm']/div[3]/div/button");
    key.getText("xpath", "//*[@id='manage_booking']/div[1]/div[1]/div[1]/span");    

}
}
