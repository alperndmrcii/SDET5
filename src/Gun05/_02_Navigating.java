package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {


        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);


        WebElement element=driver.findElement(By.id("alerttest"));
      //  WebElement element=driver.findElement(By.LinkText("Alerts (JavaScript)"));
        element.click();
        MyFunc.Bekle(3);
        System.out.println(driver.getCurrentUrl()); // o anda bulundugun url yi verir

        driver.navigate().back(); // tarayıcı historysinden geri geldim
        MyFunc.Bekle(3);
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        MyFunc.Bekle(3);
        System.out.println(driver.getCurrentUrl());



     //   BekleKapat();
    }
}
