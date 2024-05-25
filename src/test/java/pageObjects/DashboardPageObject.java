package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base;
import utility.CommonFunctions;

public class DashboardPageObject extends CommonFunctions {

	WebDriver driver = Base.driver;

	@FindBy(xpath = "//span[text()='Members']")
	WebElement membersMenu;
	@FindBy(xpath = "//span[text()='Free Members']")
	WebElement freeMembersSubMenu;
	@FindBy(xpath = "//td[@style='display: table-cell;'] [3]")
	List<WebElement> memberCode;
	@FindBy(xpath = "//td[@style='display: none;'] [1]")
	List<WebElement> memberName;

	public DashboardPageObject() {
		PageFactory.initElements(driver, this);
	}

	public void getFreeMembers() {
		clickElement(membersMenu);
		clickElement(freeMembersSubMenu);
		for (int i = 0; i < memberCode.size(); i++) {
			System.out.println(memberCode.get(i).getText());
			System.out.println(memberName.get(i).getText());
		}
	}
}
