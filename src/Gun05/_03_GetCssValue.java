package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://snapdeal.com");
        WebElement inputValenter=driver.findElement(By.id("inputValEnter"));
        //<input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
        //id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands" value="" strtindx="" endindx="">

        System.out.println("inputValenter.getAttribute(class) = " + inputValenter.getAttribute("class"));

        System.out.println("getCssValue(color) = " + inputValenter.getCssValue("color"));

        System.out.println("getCssValue(font-size) = " + inputValenter.getCssValue("font-size"));

        System.out.println("getCssValue(background) = " + inputValenter.getCssValue("background"));




        BekleKapat();
    }
}
