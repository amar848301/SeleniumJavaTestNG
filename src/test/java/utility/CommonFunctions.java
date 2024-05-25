package utility;

import org.openqa.selenium.WebElement;

public class CommonFunctions {
	
	public static void sendTextToElement(WebElement element, String text)
	{
		element.clear();
		element.sendKeys(text);
	}
	public static void clickElement(WebElement element)
	{
		element.click();
	}
}
