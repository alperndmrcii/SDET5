package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {
    @Test
    public void Test1() {


        // 1- https://forsmarts.com/from/yu?mode=h5 sitesini açın
        // 2- businessi çekleyin
        // 3- discover XYZ ye tıklayın ve online advertisingi seçin
        // 4- every day i seçin
        // 5- good u seçin
        // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
        //  css selector ile yapılacak hepsi

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.Bekle(2);

        WebElement business = driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        business.click();

        MyFunc.Bekle(2);

        WebElement discover = driver.findElement(By.cssSelector("[id$='_4588']"));
        discover.click();

        MyFunc.Bekle(2);

        WebElement online = driver.findElement(By.cssSelector("[value='Online Advertising']"));
        online.click();

        MyFunc.Bekle(2);

        WebElement everyDay = driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        everyDay.click();

        MyFunc.Bekle(2);

        WebElement Good = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        Good.click();

        MyFunc.Bekle(2);

        WebElement usingXYZ = driver.findElement(By.cssSelector("select[id$='_4597']"));
        usingXYZ.click();

        MyFunc.Bekle(2);

        WebElement thirdoption = driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        thirdoption.click();

        Good.click();

        BekleKapat();

    }
}