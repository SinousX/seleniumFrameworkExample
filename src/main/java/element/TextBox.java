package element;

import org.openqa.selenium.By;

public class TextBox extends BaseElement {

    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String text){
        waitUntilClickable().sendKeys(text);
    }
}
