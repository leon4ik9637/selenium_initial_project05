package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase2_Site_Header_Items {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.etsy.com/");

        // 2. Validation
        WebElement home = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        if(home.isDisplayed() && home.isEnabled()) System.out.println("Home button validation PASSED");
        else System.out.println("Home button validation FAILED");

        WebElement products = driver.findElement(By.cssSelector("i[class='material-icons card_travel']"));
        if(products.isDisplayed() && products.isEnabled())
            System.out.println("Products button validation PASSED");
        else System.out.println("Products button validation FAILED");

        WebElement cart = driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']"));
        if(cart.isDisplayed() && cart.isEnabled())
            System.out.println("Cart button validation PASSED");
        else System.out.println("Cart button validation FAILED");

        WebElement signupLogin = driver.findElement(By.cssSelector("i[class='fa fa-lock']"));
        if(signupLogin.isDisplayed() && signupLogin.isEnabled())
            System.out.println("Signup/Login button validation PASSED");
        else System.out.println("Signup/Login button validation FAILED");

        WebElement testCases = driver.findElement(By.partialLinkText("Cases"));
        if(testCases.isDisplayed() && testCases.isEnabled())
            System.out.println("Test Cases button validation PASSED");
        else System.out.println("Test Cases button validation FAILED");

        WebElement apiTesting = driver.findElement(By.partialLinkText("API"));
        if(apiTesting.isDisplayed() && apiTesting.isEnabled())
            System.out.println("API Testing button validation PASSED");
        else System.out.println("API Testing button validation FAILED");

        WebElement videoTutorials = driver.findElement(By.partialLinkText("Tutorials"));
        if(videoTutorials.isDisplayed() && videoTutorials.isEnabled())
            System.out.println("Video Tutorials button validation PASSED");
        else System.out.println("Video Tutorials button validation FAILED");

        WebElement contactUs = driver.findElement(By.partialLinkText("Contact"));
        if(contactUs.isDisplayed() && contactUs.isEnabled())
            System.out.println("Contact Us button validation PASSED");
        else System.out.println("Contact Us button validation FAILED");
        System.out.println(contactUs.getText());

        Driver.quitDriver();

    }
}
