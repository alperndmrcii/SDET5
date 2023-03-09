package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/"); // went to website

        WebElement siparislerimlinki=driver.findElement(By.linkText("Siparişlerim"));
        //gözüken texti siparişlerim olan a tagli webelement
        System.out.println("siparislerimlinki.getText() = " + siparislerimlinki.getText());

        System.out.println("siparislerimlinki.getAttribute(\"href\") = " + siparislerimlinki.getAttribute("href"));
        System.out.println("siparislerimlinki.getAttribute(\"title\") = " + siparislerimlinki.getAttribute("title"));
        System.out.println("siparislerimlinki.getAttribute(\"rel\") = " + siparislerimlinki.getAttribute("rel"));
        
        // partialLinkText
        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());

        MyFunc.Bekle(5);
        driver.quit();
    }
}
