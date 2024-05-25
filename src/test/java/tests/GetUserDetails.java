package tests;

import org.testng.annotations.Test;

import pageObjects.DashboardPageObject;
import pageObjects.loginPageObject;
import utility.Hooks;

public class GetUserDetails extends Hooks {

	public loginPageObject login;

	@Test
	public void getFreeUserDetails() {
		login = new loginPageObject();
		try {
			login.getLogin();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DashboardPageObject dashboard = new DashboardPageObject();
		dashboard.getFreeMembers();
	}
}
