package ru.stqa.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SampleTest extends TestBase {
  Alert alert;

  @Test
  public void testHomePageHasAHeader() throws InterruptedException {
    //driver.get(baseUrl);
   driver.get("file:///C://Users/User/Desktop/AlertsDemo.html");
    List<WebElement> buttons = driver.findElements(By.tagName("button"));
    System.out.println("buttons : " + driver.findElements(By.tagName("button")).get(0).getText());

    buttons.get(0).click();
    alert = driver.switchTo().alert();
    System.out.println("Alert = " + alert.getText());
    Thread.sleep(2000);
    alert.accept();

    Thread.sleep(2000);
    buttons.get(1).click();
    alert = driver.switchTo().alert();
    System.out.println("Alert = " + alert.getText());
    Thread.sleep(2000);
    alert.dismiss();

    Thread.sleep(2000);
    buttons.get(2).click();
    alert = driver.switchTo().alert();
    alert.sendKeys("Shalava");
    Thread.sleep(2000);
    alert.accept();
    buttons.get(2).click();
    alert = driver.switchTo().alert();
    Thread.sleep(2000);
    alert.dismiss();

    Thread.sleep(10000);
  }
}
