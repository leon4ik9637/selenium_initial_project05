package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase1_Website_Logo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.etsy.com/");

        WebElement giftsForMum = driver.findElement(By.cssSelector("span[class='wt-display-table-cell wt-text-left-xs']"));
        giftsForMum.click();

        if(driver.getCurrentUrl().contains("mothers-day")) System.out.println("User is on Gifts for Mum page");
        else throw new NotFoundException("User is not routed to Gifts for Mum");


        WebElement logo = driver.findElement(By.id("logo"));

        if(logo.isDisplayed() && logo.isEnabled()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation FAILED");

        WebElement heading = driver.findElement(By.xpath("//h1"));

        if(heading.getText().equals("Mother’s Day Gifts 2023")) System.out.println("Heading validation PASSED");
        else throw new NotFoundException("Heading is not displayed as expected");

        Driver.quitDriver();
        }
}
