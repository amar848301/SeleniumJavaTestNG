package tests;

import java.io.IOException;
import org.testng.annotations.Test;
import pageObjects.loginPageObject;
import utility.Hooks;

public class loginTests extends Hooks{

	@Test
	public void loginWithInvalidCredentials()
	{
		loginPageObject login = new loginPageObject();
		try {
			login.getLogin();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
