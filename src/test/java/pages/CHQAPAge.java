package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CHQAPAge {
  public   CHQAPAge(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  @FindBy(xpath = "//a[text()='Log in']")
  public WebElement logInLinki;

    @FindBy(xpath="//input[@name='UserName']")
    public WebElement username;

    @FindBy(xpath="//input[@name='Password']")
    public WebElement password;

    @FindBy (xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath="//span[text()='Try again please']")
    public WebElement girisYapilamadiYazisiElementi;













}
