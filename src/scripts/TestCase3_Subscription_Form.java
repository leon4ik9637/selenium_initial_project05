package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase3_Subscription_Form {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        WebElement subscription = driver.findElement(By.xpath("//div[@class='single-widget']"));
        if(subscription.isDisplayed())
            System.out.println("Subscription validation PASSED");
        else System.out.println("Subscription validation FAILED");

        WebElement email = driver.findElement(By.id("susbscribe_email"));
        if(email.isDisplayed())
            System.out.println("Email validation PASSED");
        else System.out.println("Email validation FAILED");

        WebElement submit = driver.findElement(By.id("subscribe"));
        if(submit.isDisplayed())
            System.out.println("Submit button validation PASSED");
        else System.out.println("Submit button validation FAILED");

        System.out.println(subscription.getText());

        Driver.quitDriver();
    }
}
