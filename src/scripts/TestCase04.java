package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase04 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.etsy.com/");

        WebElement signIn = driver.findElement(By.cssSelector("button[class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
        signIn.click();
        Thread.sleep(3000);


    }
}
