package org.ual.hmis.AlonsoBravoMoyano;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      firefoxOptions.setHeadless(true);
      driver = new FirefoxDriver(firefoxOptions);

      js = (JavascriptExecutor) driver;
      vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() {
    driver.get("http://34.71.203.97:8080/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.cssSelector(".form-control")).click();
    driver.findElement(By.cssSelector(".form-control")).sendKeys("prueba1");
    driver.findElement(By.cssSelector(".form-control")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".form-control")).click();
    driver.findElement(By.cssSelector(".form-control")).sendKeys("prueba2");
    driver.findElement(By.cssSelector(".btn-success")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-success"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".item:nth-child(3) .remove > .btn")).click();
    driver.findElement(By.cssSelector(".far")).click();
    driver.findElement(By.cssSelector(".fa")).click();
  }
}