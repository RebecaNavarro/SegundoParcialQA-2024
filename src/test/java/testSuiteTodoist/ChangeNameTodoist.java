package testSuiteTodoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangeNameTodoist extends BaseTestTodoist{

    @Test
    public void verifyLoginSuccessfully() throws InterruptedException {
        mainPage.iniciarSesionButton.click();
        loginSection.login("rebecanavarros1@upb.edu","Hola1234");
        loginSection.loginButton.click();
        menuSection.buttonWithName.click();
        menuSection.configurationButton.click();
//        Assertions.assertTrue(menuSection.buttonWithName.isControlDislayed(),
//                "ERROR! the login was failed");
    }



}
