package WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Father {

    @BeforeTest
    public void befTest(){
        /* добавить бефорку */
    }
    @AfterTest
    public void afTest(){
        /* добавить афтер */
    }
}
