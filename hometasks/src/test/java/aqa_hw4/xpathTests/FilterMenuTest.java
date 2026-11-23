package aqa_hw4.xpathTests;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FilterMenuTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement petStuffButton = driver.findElement(By.xpath("//a[@data-eventlabel='Зоотовари']"));
        petStuffButton.click();

        sleep(3000);

        WebElement foodForCatsButton = driver.findElement(By.xpath("//img[@src='/img/uploads/clients/6721f9f6185374.87463891=konservu_dlya_kotiv-1.png']"));
        foodForCatsButton.click();

        sleep(3000);

        WebElement filterMenu = driver.findElement(By.xpath("//div[@class='flex']"));

        sleep(3000);

        Assert.assertTrue("The filter menu is not displayed on the page.", filterMenu.isDisplayed());

        sleep(3000);

        driver.quit();
    }
}
