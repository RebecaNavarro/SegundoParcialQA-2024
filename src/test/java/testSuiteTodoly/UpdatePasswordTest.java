package testSuiteTodoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todoly.ProfileSection;

public class UpdatePasswordTest extends BaseTestTodoLy {
    ProfileSection profileSection = new ProfileSection();

    @Test
    public void verifyUpdateFullName() throws InterruptedException {
        String newName = "Update"; // Antes: Tarea
        String pwd = "12345";
        mainPage.loginButton.click();
        loginSection.login("tareaupdate@tarea.com",pwd);
        settingsSection.settings();
        settingsSection.oldPwdTxtbox.setText(pwd);
        String newpwd = "123456";
        settingsSection.newPwdTxtbox.setText(newpwd);
        profileSection.okProfileButton.click();
        menuSection.logoutButton.click();
        mainPage.loginButton.click();
        loginSection.login("tareaupdate@tarea.com",newpwd);

        Assertions.assertTrue(menuSection.logoutButton.isControlDislayed(),
                "ERROR! the login with the new pwd failed");
    }
}
