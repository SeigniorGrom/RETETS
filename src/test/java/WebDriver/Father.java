package WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Father {
    WebDriver driver;

    @BeforeTest
    public void befTest(){
        System.out.println("Start Test");
        /* добавить бефорку теста */
    }
    @BeforeMethod
    public void befMet(){
        System.out.println("starts BefMet");
      // WebDriverManager.chromedriver().setup();

    }
//    @AfterTest
//    public void afTest(){
//        System.out.println("finish Test");
//        driver.quit();
//        /* добавить афтер */
//    }


    @AfterTest
    public void afTest() {
        System.out.println("finish Test");
           // driver.quit();
    }

}
/*
 Добавьте все полезные функци которые будет идти перед и после теста, по приимеру который я вам прописал

 */