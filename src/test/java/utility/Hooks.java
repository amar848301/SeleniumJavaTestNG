package utility;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends Base {
	
	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		initilizeDriver();
		launchUrl();
	}
	
	@AfterMethod
	public void tearDown()
	{
		if (driver != null) {
            driver.quit();
        }
	}
}
