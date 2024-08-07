package WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methoods {
    /* Иницилизация драйвера для открытия браузера */
    WebDriver driver = new ChromeDriver();

    /* Тут все наши меттоды */
    public void openChrome(){
        WebDriverManager.chromedriver().setup();
        /* вставляем ссылку на сайт */
        System.out.println("Start Test");
        driver.get(" https//test/ua ");
    }
    //Все методы подписывайте понятно, например: openWebsite, findeElementButtonIphone и тд...
}
