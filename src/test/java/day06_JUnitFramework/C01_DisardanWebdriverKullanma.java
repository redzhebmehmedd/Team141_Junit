package day06_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_DisardanWebdriverKullanma {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // url'in testotomasyonu icerigini test edin
        String expectedUrlicerik = "testotomasyonu" ;
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlicerik)){
            System.out.println("Url icerik Testi Passed");
        }else System.out.println(" Url test faild");


        // sayfayi kapatin

        Thread.sleep(3000);
        driver.quit();

    }
}
