package WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Father {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void befTest(){
        WebDriverManager.chromedriver().setup();
        /* добавить бефорку */

    }
    @AfterTest
    public void afTest(){
        driver.quit();
        /* добавить афтер */
    }
}
/*
 Добавьте все полезные функци которые будет идти перед и после теста, по приимеру который я вам прописал

 */