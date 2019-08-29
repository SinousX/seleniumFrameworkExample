package bankProject;

import element.BaseElement;
import org.openqa.selenium.By;

public class DashboardPage {

    private BaseElement sideMenu;

    public DashboardPage(){
        sideMenu = new BaseElement(By.className("menusubnav"));
    }

    public boolean isSideMenuDisplayed(){
        return sideMenu.isDisplayed();
    }
}
