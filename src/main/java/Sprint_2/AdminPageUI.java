package Sprint_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class AdminPageUI {
	public static WebDriver driver;
	
	WebDriverUtility wUtility = new WebDriverUtility();
	
	//Login Page
	
	@FindBy(xpath ="//div[@class='admin_login_logo']") private WebElement LogoLnk;
	
	@FindBy(xpath ="//input[@formcontrolname='userId']") private WebElement UserIdLnk;
	 
	@FindBy(xpath ="//input[@formcontrolname='password']") private WebElement PasswordLnk;
	
	@FindBy(xpath ="//button[.='Login']") private WebElement LoginBtnLnk;
	
	//Dashboard Page
	
	@FindBy(xpath ="//a[text()='Dashboard']") private WebElement DashboardTextLnk;
	
	@FindBy(xpath ="//div[@class='header_valuer']") private WebElement AdminLnk;
	
	@FindBy(xpath ="//i[@class='fa-solid fa-ellipsis-vertical icon-vertical ng-star-inserted']") private WebElement FullPageLnk;
	
	@FindBy(xpath ="//i[@class='fa-solid fa-bell user-icon']") private WebElement NotificationLnk;
	
	@FindBy(xpath ="//span[.='Dashboard']") private WebElement DashboardLnk ;
	
	@FindBy(xpath ="//p[.=' All Distributor ']") private WebElement AllDistributorLnk;
	
	@FindBy(xpath ="//p[.=' Manage']") private WebElement ManageLnk;
	
	//Manage Distributor Page
	
	@FindBy(xpath ="//a[text()='Manage Distributor']") private WebElement ManageDistributorTextLnk;
	
	@FindBy(xpath ="//input[@placeholder='Search']") private WebElement SearchEdt;
	
	@FindBy(xpath ="(//input[@class='form-check-input'])[1]") private WebElement BootStrapBtn;
	
	@FindBy(xpath ="//button[.='Yes']") private WebElement YesUserBtn;
	
	@FindBy(xpath ="(//i[@class='fa fa-pencil'])[1]") private WebElement EditBtn;
	
	@FindBy(xpath ="//label[.='KYC Status']") private WebElement KycStatusLnk;
	
	@FindBy(xpath ="//span[.='Submit']") private WebElement SubmitBtn;
	
	@FindBy(xpath ="//span[.='Manage Distributor']") private WebElement ManageDistributorBtn;
	
	@FindBy(xpath ="(//i[@class='fa fa-eye'])[1]") private WebElement EyeBtn;
	
	@FindBy(xpath ="//h4[.='KYC Details']") private WebElement KycDetailsPageLnk;
	
	@FindBy(xpath ="//h5[.='Documents']") private WebElement DocumentsTextLnk;
	
	@FindBy(xpath ="(//button[.='Download'])[1]") private WebElement DownloadBtn;
	
	@FindBy(xpath ="//a[.='Distributor Manage Order']") private WebElement DistributorManageOrderBtn;
	
	// Distributor Manage Order
	
	@FindBy(xpath ="//a[text()='Distributor Manage Order']") private WebElement DistributorManageOrderTextLnk;
	
	@FindBy(xpath ="//button[.='Buy Order']") private WebElement BuyOrderBtn; 
	
	@FindBy(xpath ="//input[@placeholder='Search']") private WebElement BuyOrderSearchBtn; 
	
	@FindBy(xpath ="(//button[.='Inprocess'])[1]") private WebElement InProcessBtn;
	
	@FindBy(xpath ="(//button[.='Order Created'])[1]") private WebElement OrderCreatedBtn; 
	
	@FindBy(xpath ="(//button[.='Pending'])[1]") private WebElement PendingBtn;
	
	@FindBy(xpath ="//a[text()=' Next ']") private WebElement NextPageBtn; 
	
	@FindBy(xpath ="//a[text()=' Previous ']") private WebElement PreviousPageBtn; 
	
	@FindBy(xpath ="//button[.='Book Order']") private WebElement BookOrderBtn;
	
	@FindBy(xpath ="//input[@placeholder='Search']") private WebElement BookOrderSearchBtn; 
	
	@FindBy(xpath ="//button[@class='logout']") private WebElement LogOutBtn; 
	
	@FindBy(xpath ="//button[text()='Yes']") private WebElement YesLogOutBtn; 
	
	/*
	
	@FindBy(xpath ="//input[@placeholder='Search']") private WebElement BookOrderSearchBtn; 
	
	@FindBy(xpath ="") private WebElement ;
	
	@FindBy(xpath ="") private WebElement ;

	*/
	
	AdminPageUI(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	
	public void LoginPage() throws InterruptedException
	{
		
		boolean Logo = LogoLnk.isDisplayed();
		System.out.println("Logo is Displayed "+Logo);
		Thread.sleep(2000);
		
		boolean UserId = UserIdLnk.isDisplayed();
		System.out.println("User Id Is Displayed:"+UserId);
		Thread.sleep(2000);
		
		UserIdLnk.sendKeys("admin@gmail.com");
		Thread.sleep(2000);
		
		boolean Password = PasswordLnk.isDisplayed();
		System.out.println("Password Is Displayed:"+Password);
		Thread.sleep(2000);

		PasswordLnk.sendKeys("123456");
		Thread.sleep(2000);
		
		boolean LoginBtn = LoginBtnLnk.isDisplayed();
		System.out.println("Login Button Is Displayed:"+LoginBtn);
		Thread.sleep(2000);
		LoginBtnLnk.click();
		Thread.sleep(2000);
		
	}
	
    public void DashboardPage() throws Exception	
	{
		
		boolean DashboardText = DashboardTextLnk.isDisplayed();
		System.out.println("Dashboard Text is Displayed "+DashboardText);
		Thread.sleep(2000);

		boolean Admin = AdminLnk.isDisplayed();
		System.out.println("Admin is Displayed "+Admin);
		Thread.sleep(2000);
	
		boolean FullPage = FullPageLnk.isDisplayed();
		System.out.println("FullPage is Displayed "+FullPage);
		Thread.sleep(2000);
		FullPageLnk.click();
		Thread.sleep(2000);
		FullPageLnk.click();
		Thread.sleep(3000);
		
		boolean Notification = NotificationLnk.isDisplayed();
		System.out.println("Notification is Displayed "+Notification);
		Thread.sleep(2000);
		NotificationLnk.click();
		Thread.sleep(2000);
		
		boolean Dashboard = DashboardLnk.isDisplayed();
		System.out.println("Dashboard is Displayed "+Dashboard);
		Thread.sleep(2000);
		DashboardLnk.click();
		Thread.sleep(2000);
		
		boolean AllDistributor = AllDistributorLnk.isDisplayed();
		System.out.println("AllDistributor is Displayed "+AllDistributor);
		Thread.sleep(2000);
		
		boolean Manage = ManageLnk.isDisplayed();
		System.out.println("Manage is Displayed "+Manage);
		Thread.sleep(2000);
		ManageLnk.click();
		Thread.sleep(2000);
		
	   }
	
    public void ManageDistributorPage() throws Exception
    {
    	
		boolean ManageDistributorText = ManageDistributorTextLnk.isDisplayed();
		System.out.println("Manage Distributor Text is Displayed "+ManageDistributorText);
		Thread.sleep(2000);
		
		boolean Search = SearchEdt.isDisplayed();
		System.out.println("Search is Displayed "+Search);
		Thread.sleep(2000);

		boolean BootStrapButton = BootStrapBtn.isDisplayed();
		System.out.println("BootStrapButton is Displayed "+BootStrapButton);
		Thread.sleep(2000);
		BootStrapBtn.click();
		Thread.sleep(2000);
		
		boolean YesButton = YesUserBtn.isDisplayed();
		System.out.println("Yes Button is Displayed "+YesButton);
		Thread.sleep(2000);
		YesUserBtn.click();
		Thread.sleep(2000);
				
		boolean EditButton = EditBtn.isDisplayed();
		System.out.println("Edit Button is Displayed "+EditButton);
		Thread.sleep(2000);
		EditBtn.click();
		Thread.sleep(2000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(6);

		boolean KycStatus = KycStatusLnk.isDisplayed();
		System.out.println("KycStatus is Displayed "+KycStatus);
		Thread.sleep(2000);

	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(2);

		boolean SubmitButton = SubmitBtn.isDisplayed();
		System.out.println("Submit Button is Displayed "+SubmitButton);
		Thread.sleep(2000);
		SubmitBtn.click();
		Thread.sleep(2000);
		
		boolean ManageDistributorButton = ManageDistributorBtn.isDisplayed();
		System.out.println("Manage Distributor Button is Displayed "+ManageDistributorButton);
		Thread.sleep(2000);
		ManageDistributorBtn.click();
		Thread.sleep(2000);
		
		boolean EyeButton = EyeBtn.isDisplayed();
		System.out.println("Eye Button is Displayed "+EyeButton);
		Thread.sleep(2000);
		EyeBtn.click();
		Thread.sleep(2000);
		
		boolean KycDetailsPage = KycDetailsPageLnk.isDisplayed();
		System.out.println("Kyc Details Page is Displayed "+KycDetailsPage);
		Thread.sleep(2000);

	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(2);
		
		boolean DocumentsText = DocumentsTextLnk.isDisplayed();
		System.out.println("Documents Text Page is Displayed "+DocumentsText);
		Thread.sleep(2000);

		boolean DownloadButton = DownloadBtn.isDisplayed();
		System.out.println("Download Button Page is Displayed "+DownloadButton);
		Thread.sleep(2000);
		DownloadBtn.click();
		Thread.sleep(2000);
		
		boolean DistributorManageOrderButton = DistributorManageOrderBtn.isDisplayed();
		System.out.println("Distributor Manage Order Button Page is Displayed "+DistributorManageOrderButton);
		Thread.sleep(2000);
		DistributorManageOrderBtn.click();
		Thread.sleep(2000);
    }
	
    public void DistributorManageOrderPage() throws InterruptedException
    {
    	
    	Thread.sleep(2000);
		boolean DistributorManageOrderText = DistributorManageOrderTextLnk.isDisplayed();
		System.out.println("Distributor Manage Order Text is Displayed "+DistributorManageOrderText);
		Thread.sleep(2000);

		boolean BuyOrder = BuyOrderBtn.isDisplayed();
		System.out.println("BuyOrder is Displayed "+BuyOrder);
		Thread.sleep(2000);
		BuyOrderBtn.click();
		Thread.sleep(2000);
		
		boolean BuyOrderSearch = BuyOrderSearchBtn.isDisplayed();
		System.out.println("BuyOrder Search is Displayed "+BuyOrderSearch);
		Thread.sleep(2000);

		boolean Inprocess = InProcessBtn.isDisplayed();
		System.out.println("Inprocess is Displayed "+Inprocess);
		Thread.sleep(2000);
		InProcessBtn.click();
		Thread.sleep(2000);

		boolean OrderCreated = OrderCreatedBtn.isDisplayed();
		System.out.println("Order Created is Displayed "+OrderCreated);
		Thread.sleep(2000);
		OrderCreatedBtn.click();
		Thread.sleep(2000);

		boolean Pending = PendingBtn.isDisplayed();
		System.out.println("Pending is Displayed "+Pending);
		Thread.sleep(2000);
		PendingBtn.click();
		Thread.sleep(2000);

		/*
		
		boolean NextPage = NextPageBtn.isDisplayed();
		System.out.println("Next Page is Displayed "+NextPage);
		Thread.sleep(2000);
		NextPageBtn.click();
		Thread.sleep(2000);

		boolean PreviousPage = PreviousPageBtn.isDisplayed();
		System.out.println("Previous Page is Displayed "+PreviousPage);
		Thread.sleep(2000);
		PreviousPageBtn.click();
		Thread.sleep(2000);

        */

		boolean BookOrder = BookOrderBtn.isDisplayed();
		System.out.println("Book Order is Displayed "+BookOrder);
		Thread.sleep(2000);
		BookOrderBtn.click();
		Thread.sleep(2000);
		
		boolean BookOrderSearch = BookOrderSearchBtn.isDisplayed();
		System.out.println("BookOrder Search is Displayed "+BookOrderSearch);
		Thread.sleep(2000);
		
		boolean LogOut = LogOutBtn.isDisplayed();
		System.out.println("LogOut is Displayed "+LogOut);
		Thread.sleep(2000);
		LogOutBtn.click();
		Thread.sleep(2000);

		boolean YesLogOut = YesLogOutBtn.isDisplayed();
		System.out.println("Yes LogOut is Displayed "+YesLogOut);
		Thread.sleep(2000);
		YesLogOutBtn.click();
		Thread.sleep(2000);
	
	driver.close();
		
    }

    
}