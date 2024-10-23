package pages.todoist;

import controls.Button;
import org.openqa.selenium.By;

public class MenuSection {
    public Button buttonWithName = new Button(By.xpath("//*[@id=':r0:']"));

    public Button configurationButton = new Button(By.xpath("//div[contains(@id=':rd8:') and contains(@role='menuitem')]//span[@class='user_menu_label']"));
//*[@id=":rd8:"]//*[@id=":rd8:"]/span
    //[@class='user_menu_label']//span

    public Button logoutButton = new Button(By.xpath("//*[@id=':r48:']"));
}

