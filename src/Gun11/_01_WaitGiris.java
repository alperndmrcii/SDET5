package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_WaitGiris extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration sure = Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(sure);


        WebElement mesaj = driver.findElement(By.xpath("//p[text()='WebDriver']"));
        /*
         * Selenium Bekletme Komutları
         *
         * Implicity Wait;
         * Tüm sayfadaki elemanlar için elemanın locatoru sayfa içinde bulunabililr hala getirene kadar verilen bekleme süresi
         * Bütün elemanlar için geçerli ve eleman bulunuğunda kalan süreyi beklemez.
         *
         * Thread.sleep bu konuda işlevi yetersiz kalmaktadır çünkü Implicity Wait aksine bu kod aranılan elemanı bulsa bile beklemesi gereken süreyi tamamlar
         *  ancak Implicity wait kalan süreyi bekletmez
         * */
    }
}
