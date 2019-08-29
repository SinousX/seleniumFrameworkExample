package bankProject;

import element.Label;
import org.openqa.selenium.By;

public class DashboardPage {

    private Label welcomeLabel;

    public DashboardPage(){
        welcomeLabel = new Label(By.className("heading3"));
    }

    public boolean isSideMenuDisplayed(){
        return welcomeLabel.isDisplayed();
    }
}
