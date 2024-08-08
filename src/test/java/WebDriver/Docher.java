package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Docher extends Father{
    /* инцилизациия наших методов в этот тест*/
    Methoods methoods = new Methoods();


    @Test
    public void managerTest() {
        methoods.openChrome();
    }
    @Test
    public void stressTest() {
        methoods.openHer();
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