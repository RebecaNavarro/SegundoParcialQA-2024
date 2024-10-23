package pages.todoist;

import controls.Button;
import org.openqa.selenium.By;

public class MenuSection {
    public Button buttonWithName = new Button(By.xpath("//*[@id=':r0:']"));

    public Button configurationButton = new Button(By.xpath("//*[@id=':rbq:']"));
    public Button logoutButton = new Button(By.xpath("//*[@id=':r48:']"));
}

