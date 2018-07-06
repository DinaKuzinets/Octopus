package ru.stqa.selenium;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ru.stqa.selenium.pages.HomePage;

import java.util.concurrent.TimeUnit;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() throws InterruptedException {
    driver.get(baseUrl);
    Assert.assertTrue(true);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    homepage.loginButton();
    homepage.userNameButton();
    Thread.sleep(1000);
    homepage.passwordButton();
    Thread.sleep(1000);
    homepage.submitButton();
    Thread.sleep(3000);

  }
}
