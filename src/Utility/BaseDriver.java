package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;

    static
    {
        KalanOncekileriKapat();

        Logger logger= Logger.getLogger(""); // outputa ait bütün loglaraı üreten objeye/servise ulaştım
        logger.setLevel(Level.SEVERE); // sadece errorları göster
        // Outputtaki gerekmeyen logları kaldıracağız
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
       // driver= new ChromeDriver();

        driver.manage().window().maximize();

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        // sadece tüm sayfanın kodlarının bilgisayarınıza inmesi süresiyle ilhili
        // bu eklenmezse selenium sayfa yüklenene kadar (sonsuza) kadar bekler
        // 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
        // eğer 2 sn içinde yüklerse 30 sn beklemez.

        driver.manage().timeouts().implicitlyWait(dr); // bütün webelementlerin element bazında elemente özel işlem yapılmadan önce
        // hazır hale gelmesi verilen mühlet yani süre. // eğer 2 sn içinde yüklerse 30 sn. beklemez.
    }

    public static void BekleKapat()
    {
        MyFunc.Bekle(3);
        driver.quit();
    }
    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
    public static void ScreenShotAl() throws IOException {
        TakesScreenshot ss=(TakesScreenshot) driver; // 1.aşama ekran görüntü alma değişkenini tanımladım
        File hafizadakiHali=ss.getScreenshotAs(OutputType.FILE); // 2. aşamada ekran görüntüsü alındı şuan hafızada
        // hafızadaki bu bilgiyi dosya olarak kaydetmem gerek
        LocalTime saat=LocalTime.now();
        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter tarihVeSaat=DateTimeFormatter.ofPattern("dd_MM_yyyy__kk_mm_");
        FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri\\"+dt.format(tarihVeSaat)+saat.getSecond()+".png"));
    }

}
