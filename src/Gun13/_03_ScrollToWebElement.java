package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {
    @Test public void Test1(){
        driver.manage().deleteAllCookies();
        driver.get("https://www.copado.com/robotic-testing");

        JavascriptExecutor js=(JavascriptExecutor)driver;
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        // element.click(); tıkklatma özelliğini kaybettiren elementlerin altında oldıuğunda tıklatmaz
        MyFunc.Bekle(5);
        js.executeScript("arguments[0].click();", element); // html içinden elemente ulaşıyor (ekrandan değil) ve tıklatır






        //a[text()='Read story']
    }
}
