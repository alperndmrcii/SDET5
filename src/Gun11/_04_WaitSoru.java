package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitSoru extends BaseDriver {
    @Test public void test1(){
     //   Senaryo
     //   1-  https://www.demoblaze.com/index.html  siteyi açınız.
     //   2- Samsung galaxy s6  linkine tıklayınız.
     //   3- Sepete ekleyiniz.
     //   4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz

        driver.get("https://www.demoblaze.com/index.html");
        WebElement smsng= driver.findElement(By.xpath("//*[text()='Samsung galaxy s6']"));
        smsng.click();

        WebElement addcart=driver.findElement(By.xpath("//*[text()='Add to cart']"));
        addcart.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        WebElement productstore=driver.findElement(By.xpath("//*[@id='nava']"));
        productstore.click();

        WebElement mesaj=driver.findElement(By.xpath("//*[@id='cat']"));
        Assert.assertTrue("Başarılı", mesaj.isDisplayed());

    }
}
