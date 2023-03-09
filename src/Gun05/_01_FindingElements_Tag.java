package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_Tag extends BaseDriver {
    public static void main(String[] args) {


        driver.get("https://www.hepsiburada.com/");

        List<WebElement> linkler=driver.findElements(By.tagName("a"));
        for (WebElement e : linkler)
        {
            if (e.getText().isEmpty())
            {
                System.out.println("(href) = " + e.getAttribute("href"));
                System.out.println("(title) = " + e.getAttribute("title"));
                System.out.println("(rel) = " + e.getAttribute("rel"));
            }


        }



        BekleKapat();


    }
}
