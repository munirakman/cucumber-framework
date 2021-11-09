package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver() {

    }

    private static WebDriver driver;
    // driver'i baska class'lardan sadece Driver class ismi ile çağırabilmek icin STATIC yaptık
    // henuz bu driver ile ilgili ayarlar yapmadığım icin baska class'lar bunu yanlıslıkla  kullanmasın diye
    // erisimi private yaptık (sadece bu class'ın kullanımına acık yaptık)

    public static WebDriver getDriver() {

       if (driver==null) {
           // if'i bu method her çaıştığında yeni bir driver olusturmaması icin kullanıyoruz
           //if driver'i kontrol edecek eger bir deger ataması yapıldıysa yeni bir driver olusturmayacak
           switch (ConfigReader.getProperty("browser")) {
               // case'i driver'i istediğimiz browser'da calıstırmak icin kullanıyoruz
               // configuration.properties dosyasında browser olarak ne yazdıysak tum testlerimiz o browser'da çalışacak
               // browser secimi yapılmadıysa default olarak chrome devreye girecek
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
                   break;
               case  "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver=new FirefoxDriver();
                   break;
               case "opera":
                   WebDriverManager.operadriver().setup();
                   driver=new OperaDriver();
                   break;
               case "edge":
                   WebDriverManager.edgedriver().setup();
                   driver=new EdgeDriver();
                   break;
               default:
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();


           }

           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       }

        return driver;

    }

    public static void closeDriver() {

        if (driver!=null) {
            driver.quit();
        }
        // burada yeniden null degeri atamamızın sebebi, bir sonraki getDriver method'u çağrışımızda
        // yeni deger atayabilmek istememizdir.
        driver=null;


    }
}
