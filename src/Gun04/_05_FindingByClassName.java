package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); // went to website

        WebElement name=driver.findElement(By.className("form-textbox"));
        name.sendKeys("Alpy");
        // birden fazla aynı locatore sahip eleman varsa findelement ilk elementi bulur.

        // classlarda aramak için de aramak istediğimiz kelimenin önüne . koyuyoruz
        List<WebElement> labels=driver.findElements(By.className("form-sub-label"));
        System.out.println(labels.size());
        for (WebElement e : labels)
            System.out.println("e.getText() = " + e.getText());
        // aranılan eleman bulunamazsa : findelement NoSuchElement hatası verir
        // findElements is size ı 0 olan List verir yeni hata vermez


        MyFunc.Bekle(5);
        driver.quit();
    }
}
