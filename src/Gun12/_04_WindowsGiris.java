package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");
        // şu aşamada ana sayfadayım
        // bulunulan windowid yi almak için de
        String currentWindowId = driver.getWindowHandle();
        System.out.println("currentWindowId = " + currentWindowId);

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : linkler)
            if (!link.getAttribute("href").contains("mail"))
                link.click();
        // bu aşamada bütün sayfalar açıldı

        Set<String> windowsIdler = driver.getWindowHandles();
        for (String id : windowsIdler)
            System.out.println("id = " + id);
// şu anda en son açılan sayfadayım ana sayfaya geçmek için ne yapacağım ?

        driver.switchTo().window(currentWindowId); // ana sayfaya geçtim

        MyFunc.Bekle(10);

        BekleKapat();

    }
}
