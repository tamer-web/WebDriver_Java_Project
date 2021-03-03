package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {
    private final WebDriver driver;
    private final By table = By.id("large-table");

    public LargeAndDeepDomPage(WebDriver driver){
        this.driver = driver;
    }
    //  create a method that will use JavaScript in order to scroll to this table

    public void scrollToTable(){
    //   first thing we create the WebElement to actually find that table
        WebElement tableElement = driver.findElement(table);

    //
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
    }
}
