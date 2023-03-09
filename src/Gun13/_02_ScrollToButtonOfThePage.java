package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToButtonOfThePage extends BaseDriver {
    @Test public void Test1(){

        driver.get("https://p-del.co/");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        // sayfanın sonuna gittim
        MyFunc.Bekle(2);

        js.executeScript("window.scrollTo(0,0);");
        // direkt olarak en başa gittim
        MyFunc.Bekle(2);

        //js.executeScript("window.scrollTo(0,1000);");
        // Bulunduğu yerden 1000 pixel kadar gider
    }
}
