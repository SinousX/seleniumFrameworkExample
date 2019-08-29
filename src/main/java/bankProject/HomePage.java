package bankProject;

import driver.BaseDriver;
import element.Button;
import element.Label;
import element.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver = BaseDriver.getDriver();

    private Label bankHeader;
    private TextBox loginTextbox;
    private TextBox passwordTextbox;
    private Button loginButton;

    public HomePage(){
        bankHeader = new Label(By.xpath("//h2[@class='barone']"));
        loginTextbox = new TextBox(By.name("uid"));
        passwordTextbox = new TextBox(By.name("password"));
        loginButton = new Button(By.name("btnLogin"));
    }

    public HomePage openHomePage(){
        driver.get("http://demo.guru99.com/V1/index.php");
        return this;
    }

    public boolean isBankHeaderPresent(){
        return bankHeader.isDisplayed();
    }

    public DashboardPage login(String username, String password){
        loginTextbox.setText(username);
        passwordTextbox.setText(password);
        loginButton.click();
        return new DashboardPage();
    }
}
