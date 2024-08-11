package WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methoods {
    /* Иницилизация драйвера для открытия браузера */
    WebDriver driver = new ChromeDriver();

    /* Тут все наши меттоды */
    public void openChrome(){
        /* вставляем ссылку на сайт */
        WebDriverManager.chromedriver().setup();
        System.out.println("Open SotaStore");
        driver.get("https://sota.store/ua/");
       // driver.quit();
    }
    public void openHer(){
        Elemnts elemnts = new Elemnts();
        elemnts.buttonIphone.click();
        System.out.println(1);
    }
    //Все методы подписывайте понятно, например: openWebsite, findeElementButtonIphone и тд...
}
