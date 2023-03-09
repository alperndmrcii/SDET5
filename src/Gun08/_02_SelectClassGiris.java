package Gun08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().deleteAllCookies();
        WebElement webmenu= driver.findElement(By.id("searchDropdownBox"));
        // bu element select tagi ile başlıyorsa sen bunu select yap öyle kullan.
        Select ddMenu=new Select(webmenu); // Elementi daha rahat kullanabilir SELECT nesnesi haline getirdik.
        ddMenu.selectByIndex(4); // ister bu şekilde seçebilirsin
        ddMenu.deselectByValue("value değerini"); // ister bu şekilde
        ddMenu.selectByVisibleText("Elektronik"); // ister bu şekilde

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());
    }
}
