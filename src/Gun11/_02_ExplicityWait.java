package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_ExplicityWait extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement btn = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        WebDriverWait bekle = new WebDriverWait(driver,Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        // Beklenen kriterlerden --> Expected Conditions
        // Verilen locatordaki elemnt gözükür hale gelene kadar ---> VisibilityOfelementLocated
        // gelene kadar bekle --Z bekle.until

        System.out.println("Bitti");
    }
}
