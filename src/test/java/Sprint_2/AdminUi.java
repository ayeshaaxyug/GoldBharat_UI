package Sprint_2;

import org.testng.annotations.Test;

import AdminBase.AdminBrowserLaunch;

public class AdminUi extends AdminBrowserLaunch {
	
	AdminPageUI AdminloginPages;
	
	@Test
	public void AdminLoginTest() throws Exception
	{
		
		AdminloginPages = new AdminPageUI(driver);
		
		AdminloginPages.LoginPage();
		AdminloginPages.DashboardPage();
		AdminloginPages.ManageDistributorPage();
		AdminloginPages.DistributorManageOrderPage();
		
	}

}