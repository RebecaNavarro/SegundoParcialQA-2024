package pages.todoist;

import controls.Button;
import org.openqa.selenium.By;

public class MainPage {
    public  Button iniciarSesionButton =
            new Button(By.xpath(
                    "//ul[@class='_navbarItemGroup_ue8ah_1']//li//a[contains(@href, \"https://app.todoist.com/auth/login\")]"));
}