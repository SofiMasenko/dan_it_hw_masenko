package aqa_hw4.cssSelectorTests;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;
import static junit.framework.Assert.assertEquals;

public class LocationButtonTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement locationButton = driver.findElement(By.cssSelector("[class='location flex middle-xs']"));
        locationButton.click();

        sleep(2000);

        WebElement textWriterButton = driver.findElement(By.cssSelector("[class='field ']"));
        textWriterButton.sendKeys("Полтава");

        sleep(2000);

        WebElement findLocation = driver.findElement(By.cssSelector("#autosuggest__results-item--0"));
        findLocation.click();

        sleep(2000);

        WebElement locationButtonUpdate = driver.findElement(By.cssSelector("[title='Полтава']"));

        sleep(4000);

        locationButtonUpdate.getText();


        Assert.assertEquals("Полтава", locationButtonUpdate.getText());

        driver.quit();
    }
}
