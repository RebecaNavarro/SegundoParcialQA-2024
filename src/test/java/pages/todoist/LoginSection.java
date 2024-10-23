package pages.todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@id='element-0']"));
    public TextBox pwdTxtBox = new TextBox(By.xpath("//input[@id='element-2']"));
    public  Button loginButton = new Button(By.xpath("//button[contains(@type,'submit')]"));

    public void login(String email, String pwd){
        this.emailTxtBox.setText(email);
        this.pwdTxtBox.setText(pwd);
        this.loginButton.click();
    }
}
