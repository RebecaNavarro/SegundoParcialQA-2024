package pages.todoly;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;


public class SettingsSection {

    public Button settingsButton = new Button(By.xpath("//a[text()='Settings']"));

    public TextBox oldPwdTxtbox = new TextBox(By.id("TextPwOld"));

    public TextBox newPwdTxtbox = new TextBox(By.id("TextPwNew"));
    public void settings(){
        this.settingsButton.click();
    }
}
