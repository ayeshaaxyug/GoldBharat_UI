package Sprint_1;

import org.testng.annotations.Test;

import Base.BrowserLaunch;

public class UserUi extends BrowserLaunch {

	LoginPage loginPages;

	@Test
	public void LoginButtonTest() throws Exception {

		loginPages = new LoginPage(driver);
		
		loginPages.LiveRates();
		loginPages.Register();
		loginPages.Login();
		loginPages.Dashboard(driver);
		
	}

}