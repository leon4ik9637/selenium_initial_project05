import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");

        WebElement subscribe = driver.findElement(By.xpath("//div[@class='fusion-tb-footer fusion-footer']//h2"));
        if(subscribe.getText().equals("Subscribe To Our Newsletter")) System.out.println("Subscribe button validation PASSED");
        else System.out.println("Subscribe button validation FAILED");

        Driver.quitDriver();
    }
}
