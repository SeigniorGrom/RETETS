package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Docher extends Father{
    WebDriver driver = new ChromeDriver();

    @Test
    public void managerTest(){
    }


}

/*
Шпаргалка:

Как сделать ассерт--
-Проверка, что элемент найден и присутствует на странице
 Assert.assertNotNull(element);

-Дополнительно, можно проверить видимость элемента
Assert.assertTrue(element.isDisplayed());
 */