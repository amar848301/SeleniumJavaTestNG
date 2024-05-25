package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base;
import utility.CommonFunctions;

public class loginPageObject extends CommonFunctions{
	
	public WebDriver driver = Base.driver;

	@FindBy(xpath = "//a[text()='Log In']")
	static WebElement loginBtn;
	@FindBy(xpath = "//input[@type='email']")
	static WebElement username;
	@FindBy(xpath = "//input[@type='password']")
	static WebElement password;
	@FindBy(xpath = "(//button[@type='submit']) [1]")
	static WebElement submitBtn;
	
	public loginPageObject() {
        PageFactory.initElements(driver, this);
    }
	
	public void getLogin() throws InterruptedException
	{
		clickElement(loginBtn);
		sendTextToElement(username, Base.prop.getProperty("username"));
		sendTextToElement(password, Base.prop.getProperty("password"));
		clickElement(submitBtn);
	}
}
