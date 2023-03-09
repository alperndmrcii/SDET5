package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsSoru extends BaseDriver {
    @Test public void Test1() {
/*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */
        driver.get("https://www.selenium.dev/");
        String mainPageId = driver.getWindowHandle();
        System.out.println("mainPageId = " + mainPageId);
        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));
        // Aşağıdaki kodla bütün sayfalar açıldı
        for (WebElement link : linkler)
            if (!link.getAttribute("href").contains("mail"))
                link.click();


        // her bir sayfaya geçip url ve title yazdırma
       Set<String>windowsIdler=driver.getWindowHandles();
       for (String id:windowsIdler)
       {
           MyFunc.Bekle(2);
           driver.switchTo().window(id); // sıradaki tabdaki windowa geçmiş oldum
           System.out.println("Title() = " + driver.getTitle() +"  /// Url =" + driver.getCurrentUrl());
       }
        for (String id:windowsIdler) {
            if (id.equals(mainPageId))
                continue;
            MyFunc.Bekle(2);
            driver.switchTo().window(id); //
            driver.close();
        }

    }
}
