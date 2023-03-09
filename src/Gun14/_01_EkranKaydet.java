package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {
    @Test public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username= driver.findElement(By.name("username"));
        username.sendKeys("Alperen");

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("alperen1234");

        WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        // hatalı ise çıkan element
        List<WebElement>hataMesaji=driver.findElements(By.cssSelector("div[role='alert']"));
        if (hataMesaji.size()>0){
            System.out.println("Hata oluştu");
            ScreenShotAl();
          // TakesScreenshot ss=(TakesScreenshot) driver; // 1.aşama ekran görüntü alma değişkenini tanımladım
          // File hafizadakiHali=ss.getScreenshotAs(OutputType.FILE); // 2. aşamada ekran görüntüsü alındı şuan hafızada
          // // hafızadaki bu bilgiyi dosya olarak kaydetmem gerek
          // LocalTime saat=LocalTime.now();
          // DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk.mm.");
          // LocalDate tarih=LocalDate.now();

          // FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri\\"+tarih+"."+saat.format(of2)+saat.getSecond()+".png"));



        }

        MyFunc.Bekle(1);
        BekleKapat();
    }
}
