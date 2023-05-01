package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase03 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.etsy.com/");

        WebElement giftsForMum = driver.findElement(By.cssSelector("span[class='wt-display-table-cell wt-text-left-xs']"));
        giftsForMum.click();
        Thread.sleep(3000);

        if(driver.getTitle().equals("Mother’s Day Gifts 2023")) System.out.println("User is on Gifts for Mum page");
        else throw new NotFoundException("User is not routed to Gifts for Mum");

        WebElement heading2 = driver.findElement(By.xpath("//h1"));
        WebElement heading4 = driver.findElement(By.cssSelector("h3[class='wt-text-title-02 wt-pb-xs-2 wt-text-black']"));

        if (heading2.getText().equals("Mother’s Day Gifts 2023")) System.out.println("Heading2 validation PASSED");
        else throw new NotFoundException("Heading2 is not displayed as expected");

        if (heading4.getText().equals("Make her day with one-of-a-kind presents that show your love all year long.")) System.out.println("Heading4 validation PASSED");
        else throw new NotFoundException("Heading4 is not displayed as expected");



        Driver.quitDriver();


    }
}
