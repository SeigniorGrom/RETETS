package WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methoodss {
    WebDriver driver = new ChromeDriver();

    public void openChrome(){
        WebDriverManager.chromedriver().setup();
        driver.get(" наша ссылка на сайт ");
    }
}
