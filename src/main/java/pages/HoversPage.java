package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver=driver;
    }

    /**
     *
     * @param index starts at 1
     */

    public FigureCaption hoverOverFigure(int index){// since we have three figures in the class we in an index

        // we declare the webElement to the figure
        WebElement figure =driver.findElements(figureBox).get(index-1);

        // Action Object
        Actions actions = new Actions(driver);// Actions takes driver argument
        actions.moveToElement(figure).perform();//Builder Pattern allows multiple methods calls
        return new FigureCaption(figure.findElement(boxCaption));
    }
    public static class FigureCaption{
        private final By header = By.tagName("h5");
        private final By link = By.tagName("a");

        private final WebElement caption;

        // constructor that accepts this webElement
        public FigureCaption(WebElement caption){
            this.caption = caption;
        }
        //Methods
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }
        public String getTitle(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
