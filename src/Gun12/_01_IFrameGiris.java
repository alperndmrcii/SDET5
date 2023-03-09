package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_IFrameGiris extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://chercher.tech/practice/frames");
        //id=frame1 name=iamframe index?: bulunduğu sayfada kaçıncı frame olduğu
       // driver.switchTo().frame("frame1"); // çok yavaş
        // driver.switchTo().frame("iamframe"); // id ye göre çok hızlı
        driver.switchTo().frame(0); // en hızlısı

        //iframe içindeki bir locatorda işlem yapılacaksa önce o iframe e geçiş yapılmalıdır.
        //driver.switchTo().frame(0); // ilgili odaya(iframe geç
        //driver.switchTo().parentFrame(); // bir önceki odaya geç parente geç
        //driver.switchTo().defaultContent(); // ilk ana sayfaya direkt geçer


        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Türkiye");

        BekleKapat();
    }
}
