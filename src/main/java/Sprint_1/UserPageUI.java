package Sprint_1;

import java.util.ArrayList;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class UserPageUI {
	public static WebDriver driver;

	WebDriverUtility wUtility = new WebDriverUtility();
	
	@FindBy(xpath = "//li[.=' Live Rates ']") private WebElement LiveRatesLnk; 
	
	// Login
	
	@FindBy(xpath = "//button[@class='loginbotn']") private WebElement loginBtn;	
	@FindBy(xpath ="//span[@class='Register-spans']") private WebElement LoginNowBtn;	
	@FindBy(xpath ="//input[@formcontrolname='phone']") private WebElement MobileNumberEdt;	
	@FindBy(xpath ="//button[.='Login']") private WebElement LoginBtn;	
	@FindBy(xpath ="//h6[.='OTP Verification']") private WebElement OtpVerify;	
	@FindBy(xpath ="(//input[@autocomplete='one-time-code'])[1]") private WebElement OtpEdt;
	
	// Dashboard Page
	
	@FindBy(xpath ="(//img[@class='goldbharathimg'])[1]") private WebElement LogoLnk;	
	@FindBy(xpath ="//li[.='About Us']") private WebElement AboutUsLnk;	
	@FindBy(xpath ="//img[@src='../../assets/googlplay.png']") private WebElement PlaystoreLnk;	
	@FindBy(xpath ="(//img[@class='googleplay'])[2]") private WebElement AppleStoreLnk;	
	@FindBy(xpath ="//a[.=' X-YUG Technologies']") private WebElement XyugTechLnk;	
	@FindBy(xpath ="//li[.='Products']") private WebElement ProductsLnk;	
	@FindBy(xpath ="//li[.=' Locate Us ']") private WebElement LocateUsLnk;	
	@FindBy(xpath ="//li[.=' Privacy Policy ']") private WebElement PrivacyPolicyLnk;
	
	//Charts
	
	@FindBy(xpath ="//li[.=' Chart ']") private WebElement ChartLnk;	
	@FindBy(xpath ="//h2[.='Charts']") private WebElement ChatsPageLnk;	
	@FindBy(xpath ="//select[@name='timeSelect']") private WebElement TimeSelectDrpDwn;	
	@FindBy(xpath ="//option[@value='15']") private WebElement MinuteLnk;	
	@FindBy(xpath ="//select[@name='typeSelect']") private WebElement TypeSelectDrpDwn;	
	@FindBy(xpath ="//option[.='Silver']") private WebElement SilverLnk;
	
	// Dashboard Page
	
	@FindBy(xpath ="//li[.=' Margin ']") private WebElement MarginLnk;	
	@FindBy(xpath ="//li[.=' Rate Alert ']") private WebElement RateAlertLnk;	
	@FindBy(xpath ="//li[.=' Booking ']") private WebElement BookingLnk;	
	@FindBy(xpath ="//button[.='Book Gold']") private WebElement BookGoldBtn;	
	@FindBy(xpath ="//h5[.=' Book Gold ']") private WebElement BookGoldPageLnk;	
	@FindBy(xpath ="(//button[@aria-label='Close'])[2]") private WebElement BookGoldCloseBtn;	
	@FindBy(xpath ="//button[.='Buy Gold']") private WebElement BuyGoldBtn;	
	@FindBy(xpath ="//h5[.=' Buy Gold ']") private WebElement BuyGoldPageLnk;	
	@FindBy(xpath ="(//button[@class='btn-close'])[5]") private WebElement BuyGoldCloseBtn;	
    @FindBy(xpath ="//button[.=' Register ']") private WebElement RegisterLnk;    
    @FindBy(xpath ="//h5[.='Hello! Register to get started']") private WebElement RegisterPageLnk;    
    @FindBy(xpath ="//button[.=' Register ']") private WebElement RegisterButtonLnk;	
	@FindBy(xpath ="//img[@class='goldsikkaimage']") private WebElement ProfileLnk;	
	@FindBy(xpath ="//p[.='KYC']") private WebElement KycLnk;		
	@FindBy(xpath ="//label[.='KYC Status']") private WebElement KycStatusLnk;	
	@FindBy(xpath ="//p[.='Orders']") private WebElement OrdersLnk;	
	@FindBy(xpath ="//label[.='Select Order Type']") private WebElement SelectOrderTypeLnk;	
	@FindBy(xpath ="//p[.='Log Out']") private WebElement LogoutBtn;	
	@FindBy(xpath ="//button[.='Ok']") private WebElement OkBtn;
	
	
	UserPageUI(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
    public void LiveRates() throws InterruptedException 
    {			
		boolean LiveRatesButton = LiveRatesLnk.isDisplayed();
		System.out.println("Live Rates are Displayed :"+LiveRatesButton);
		Thread.sleep(3000);
		LiveRatesLnk.click();	
    }
   
    public void Register() throws Exception 
    {   
       boolean Register = RegisterLnk.isDisplayed();
       System.out.println("Register is Displayed:"+ Register);
       RegisterLnk.click();
       Thread.sleep(3000);
       
       boolean RegisterPgae = RegisterPageLnk.isDisplayed();
       System.out.println("Register Page is Displayed:"+ RegisterPgae);
       Thread.sleep(3000);
       
       boolean RegisterButton = RegisterButtonLnk.isDisplayed();
       System.out.println("Register Button is Displayed :"+ RegisterButton);
       Thread.sleep(3000);
       
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(5);

		boolean LoginNowButton = LoginNowBtn.isDisplayed();
		System.out.println("Login Now Button is Displayed :"+ LoginNowButton);
		Thread.sleep(3000);
		LoginNowBtn.click();
		Thread.sleep(3000);

     }
	
		public void Login()throws InterruptedException 
		{			
			boolean Login = MobileNumberEdt.isDisplayed();			
			System.out.println("Mobile Number Feild is Displayed :"+Login);
			Thread.sleep(3000);
			MobileNumberEdt.sendKeys("6309631698");
			Thread.sleep(3000);
			LoginBtn.click();
			Thread.sleep(3000);
			
			boolean Otpverification = OtpVerify.isDisplayed();
			System.out.println("Otp Page is Displayed :"+ Otpverification);
			Thread.sleep(4000);
			OtpEdt.sendKeys("123456");
			Thread.sleep(3000);
			
			boolean LogoGoldBharat = LogoLnk.isDisplayed();
			System.out.println("Logo is Displayed :"+ LogoGoldBharat);
			Thread.sleep(3000);			
			
		}
		
	  public void Dashboard(WebDriver driver)throws Exception
		{	
			boolean About = AboutUsLnk.isDisplayed();
			System.out.println("About Us is Displayed :"+ About);
			AboutUsLnk.click();
			Thread.sleep(6000);	
			
		    wUtility = new WebDriverUtility();
			wUtility.scrollPageDown(7);
            
			Thread.sleep(3000);	
		    boolean PlaystoreIcon = PlaystoreLnk.isDisplayed();
		    Thread.sleep(3000);	
		    System.out.println("Playstore is Displayed :"+ PlaystoreIcon);
		    Thread.sleep(3000);	
		    PlaystoreLnk.click();
		    Thread.sleep(4000);			    			
			
			// Get the list of all window handles
	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

	        // Switch to the new tab (which is the second tab, index 1)
	        driver.switchTo().window(tabs.get(1));

	        // Navigate to a website in the new tab
	        driver.get("https://goldbharat.com/");

	        // Switch to the second tab (which is the second tab, index 1)
	        driver.switchTo().window(tabs.get(1));

	        // Close the second tab
	        driver.close();

	        // Switch back to the first tab
	        driver.switchTo().window(tabs.get(0));

	        // Continue with your tests on the first tab
	        // ...
	        // Close the driver
	        
	        Thread.sleep(4000);	
			AboutUsLnk.click();
			Thread.sleep(4000);	
			
		    wUtility = new WebDriverUtility();
			wUtility.scrollPageDown(7);
            
			Thread.sleep(3000);	
		    boolean XyugTech = XyugTechLnk.isDisplayed();
		    Thread.sleep(3000);	
		    System.out.println("Playstore is Displayed :"+ XyugTech);
		    Thread.sleep(3000);	
		    XyugTechLnk.click();
		    Thread.sleep(4000);	
		    driver.navigate().back();
						
		    Thread.sleep(3000);
			boolean Products = ProductsLnk.isDisplayed();			
			System.out.println("Product is Displayed :"+ Products);			
			ProductsLnk.click();
			Thread.sleep(3000);	
			
			Thread.sleep(3000);	
			boolean LocateUs = LocateUsLnk.isDisplayed();			
			System.out.println("Locate Us is Displayed :"+ LocateUs);			
			LocateUsLnk.click();
			Thread.sleep(3000);
			
			Thread.sleep(3000);	
			boolean PrivacyPolicy = PrivacyPolicyLnk.isDisplayed();			
			System.out.println("Privacy Policy is Displayed :"+ PrivacyPolicy);		  
			PrivacyPolicyLnk.click();
			Thread.sleep(3000);	
			
			//Chart
			
			/*
			 
			boolean Chart = ChartLnk.isDisplayed();
			System.out.println("Chart is Displayed :"+ Chart);
			ChartLnk.click();
			Thread.sleep(3000);
			
			boolean Charts = ChatsPageLnk.isDisplayed();
			System.out.println("Charts Is Displayed :"+ Charts);
			Thread.sleep(3000);	
			
			boolean SelectTime = TimeSelectDrpDwn.isDisplayed();
			System.out.println("Time Selection is Displayed :"+ SelectTime);
			TimeSelectDrpDwn.click();
			Thread.sleep(3000);	
			
			boolean TimeDay = MinuteLnk.isDisplayed();
			System.out.println("Time is Selected :"+ TimeDay);
			MinuteLnk.click();
			Thread.sleep(3000);	
			
			boolean SelectType = TypeSelectDrpDwn.isDisplayed();
			System.out.println("Select Type is Selected :"+ SelectType);
			TypeSelectDrpDwn.click();
			Thread.sleep(3000);	
			
			boolean Silver = SilverLnk.isDisplayed();
			System.out.println("Silver is Displayed:"+ Silver);
			SilverLnk.click();
			Thread.sleep(7000);
			
			*/
			
			Thread.sleep(3000);
			boolean Margin = MarginLnk.isDisplayed();
			System.out.println("Margin is Displayed :"+ Margin);
			MarginLnk.click();
			Thread.sleep(3000);
			
			Thread.sleep(3000);	
			boolean RateAlert = RateAlertLnk.isDisplayed();
	        System.out.println("Rate Alert is Displayed :"+ RateAlert);
	        RateAlertLnk.click();
	        Thread.sleep(3000);
	        
	        Thread.sleep(3000);	
	        boolean Booking = BookingLnk.isDisplayed();
	        System.out.println("Booking is Displayed:"+ Booking);
	        BookingLnk.click();
	        Thread.sleep(3000);
	        
	        LiveRatesLnk.click();	
			Thread.sleep(3000);
			
			Thread.sleep(3000);	
			boolean BookGoldButton = BookGoldBtn.isDisplayed();
			System.out.println("Booking Gold Button is Displayed :"+ BookGoldButton);
			BookGoldBtn.click();
			Thread.sleep(3000);
			
			Thread.sleep(3000);	
			boolean BookGoldPage = BookGoldPageLnk.isDisplayed();
			Thread.sleep(3000);
			System.out.println("Book Gold Page is Displayed :"+ BookGoldPage);
			Thread.sleep(3000);
			
			Thread.sleep(3000);	
			boolean BookGoldCloseButton = BookGoldCloseBtn.isDisplayed();
			Thread.sleep(3000);
			System.out.println("Book Gold Close Button is displayed :"+ BookGoldCloseButton);
			Thread.sleep(3000);
			BookGoldCloseBtn.click();
			Thread.sleep(3000);		
			
			Thread.sleep(3000);	
			boolean BuyGoldButton = BuyGoldBtn.isDisplayed();
			System.out.println("Booking Gold Button is Displayed :"+ BuyGoldButton);
			BuyGoldBtn.click();
			Thread.sleep(3000);
			
			Thread.sleep(3000);	
			boolean BuyGoldPage = BuyGoldPageLnk.isDisplayed();
			System.out.println("Book Gold Page is Displayed :"+ BuyGoldPage);
			Thread.sleep(3000);
			
			Thread.sleep(3000);	
			boolean BuyGoldCloseButton = BuyGoldCloseBtn.isDisplayed();
			Thread.sleep(3000);
			System.out.println("Book Gold Close Button is displayed :"+ BuyGoldCloseButton);
			BuyGoldCloseBtn.click();
			Thread.sleep(3000);
	        
			Thread.sleep(3000);	
	        boolean Profile = ProfileLnk.isDisplayed();
	        System.out.println("Profile is Displayed:"+ Profile);
	        ProfileLnk.click();
	        Thread.sleep(3000);
	        
	        Thread.sleep(3000);	
	        boolean Kyc = KycLnk.isDisplayed();
	        System.out.println("Kyc is Displaye :"+ Kyc);
	        KycLnk.click();
	        Thread.sleep(3000);
	        
	        Thread.sleep(3000);	
	        boolean KycStatus = KycStatusLnk.isDisplayed();
	        System.out.println("Kyc Status is Displayed :"+ KycStatus);
	        Thread.sleep(3000);
	        
	        Thread.sleep(3000);	
	        ProfileLnk.click();
	        Thread.sleep(3000);
	        boolean Orders = OrdersLnk.isDisplayed();
	        System.out.println("Orders is Displayed :"+ Orders);
	        OrdersLnk.click();
	        
	        Thread.sleep(3000);	
	        boolean SelectOrderType = SelectOrderTypeLnk.isDisplayed();
	        System.out.println("Select Order Type is Displayed :"+ SelectOrderType);
	        Thread.sleep(3000);
	        
	        Thread.sleep(3000);	
	        ProfileLnk.click();
	        Thread.sleep(5000);	
			LogoutBtn.click();
			Thread.sleep(3000);
			OkBtn.click();
			Thread.sleep(3000);
			
			Thread.sleep(3000);	
			LiveRatesLnk.click();	
			Thread.sleep(3000);
			
		}
		
		
}