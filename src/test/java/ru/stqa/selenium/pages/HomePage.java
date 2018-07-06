package ru.stqa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class HomePage extends Page {

 @FindBy(xpath = "//button[@onclick=\"document.getElementById('id01').style.display='block'\"]")
 WebElement login;

 @FindBy(xpath = "//input[@type='text']")
 WebElement userName;

 @FindBy(xpath = "//input[@type='password']")
 WebElement password;

 @FindBy(xpath = "//button[@type='submit']")
 WebElement submitClick;

  @CacheLookup
  public WebElement header;

  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }
  public void loginButton(){
   login.click();
  }
  public void userNameButton(){
   elements(userName);
   userName.sendKeys("admin");
   userName.click();
     }

  public void passwordButton(){
   elements(password);
   password.sendKeys("secret");
   password.click();
  }
  public void submitButton(){
   submitClick.click();
  }
 }
