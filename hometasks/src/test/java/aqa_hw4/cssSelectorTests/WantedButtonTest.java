package aqa_hw4.cssSelectorTests;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class WantedButtonTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement wantedButton = driver.findElement(By.cssSelector("[class='popover my-lists']"));
        wantedButton.click();

        WebElement secondWantedButton = driver.findElement(By.cssSelector("[class='profile-sidebar__section-child-container']"));
        secondWantedButton.click();

        WebElement titleText = driver.findElement(By.cssSelector("[class='profile-page-title__text']"));

        Assert.assertTrue(titleText.isDisplayed());

        sleep(3000);

        driver.quit();
    }
}
