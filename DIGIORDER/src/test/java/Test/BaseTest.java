package Test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Core.BasePage;
import Core.Createcategory;
import Core.LoginPage;
import Core.LogoutPage;
import Core.TaxParameterPage;

@Test
public class BaseTest {

	public void ValidateBaseTest() throws InterruptedException, AWTException {
		BasePage basepage = new BasePage();
		basepage.setup();

		LoginPage loginpage = new LoginPage(basepage.driver);
		loginpage.launchapplication();

		Createcategory createcategory = new Createcategory(basepage.driver);
		createcategory.CreateNewCategory();

		TaxParameterPage txpPage = new TaxParameterPage(basepage.driver);
		txpPage.ValidateUserIsAbleToNavigateTaxParameter();

		LogoutPage logoutpage = new LogoutPage(basepage.driver);
		logoutpage.ValidateUserIsAbleToLogout();
	}

}
