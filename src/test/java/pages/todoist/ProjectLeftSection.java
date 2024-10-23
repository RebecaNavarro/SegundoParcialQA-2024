package pages.todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class ProjectLeftSection {

    public Button addProjectButton = new Button(By.id(":r1:"));
    public Button projectButton = new Button(By.xpath("//div[@role='menuitem' and @class='sMSZZS5']"));
    public TextBox projectName = new TextBox(By.xpath("//input[@name='name' and @type='text']"));

    public Button anadirButton = new Button(By.xpath("//button[@type='submit']"));



}
