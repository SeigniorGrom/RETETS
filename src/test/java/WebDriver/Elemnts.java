package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elemnts {
    public WebElement buttonIphone;
    WebDriver driver = new ChromeDriver();

    /*WebElements*/
    public void buttonIphone() {WebElement element = driver.findElement(By.className("parent"));}


    
}
/* Доп информация
----------------------------------------------------------------------
Сайт для практиики -- https://sota.store/ua/
----------------------------------------------------------------------
Шпаргалки
 По поиску елемента:

-Поиск по ID:
WebElement element = driver.findElement(By.id("elementId"));

-Поиск по имени (name):
WebElement element = driver.findElement(By.name("elementName"));

-Поиск по классу (className):
WebElement element = driver.findElement(By.className("elementClass")); 

-Поиск по тегу (tagName):
WebElement element = driver.findElement(By.tagName("tagName"));

-Поиск по ссылке текста (linkText):
WebElement element = driver.findElement(By.linkText("linkText"));

-Поиск по частичному тексту ссылки (partialLinkText):
WebElement element = driver.findElement(By.partialLinkText("partialLinkText"));

-Поиск по CSS селектору (cssSelector):
WebElement element = driver.findElement(By.cssSelector("cssSelector"));

-Поиск по XPath:
WebElement element = driver.findElement(By.xpath("xpathExpression"));
----------------------------------------------------------------------
Как сделать ассерт:

-Проверка, что элемент найден и присутствует на странице
 Assert.assertNotNull(element);

-Дополнительно, можно проверить видимость элемента
Assert.assertTrue(element.isDisplayed());

 */