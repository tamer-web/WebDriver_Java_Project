package base.exercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests1 {

    private WebDriver driver;

    public void setup(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

       driver.findElement(By.linkText("Shifting Content")).click();

       driver.findElement(By.linkText("Example 1: Menu Element")).click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of menu items: " + links.size());

        driver.quit();
    }
    public static void main(String[] arg){
        BaseTests1 tests1 = new BaseTests1();
        tests1.setup();
    }
}
