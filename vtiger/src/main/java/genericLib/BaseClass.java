package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pomRepo.TC_CreatingNewInvoice_001;
import pomRepo.TC_HomePage_001;
import pomRepo.TC_InvoiceLookUpImage_001;
import pomRepo.TC_Login_001;

/***
 * 
 * @author Sindhu
 *
 */

public class BaseClass {
	
	public WebDriver driver;
	public ExcelLib elib=new ExcelLib();
	public WebDriverWait explicitWait;
	public TC_Login_001 loginPage;
    public TC_HomePage_001 homePage;
	public TC_InvoiceLookUpImage_001 invoiceLookUpImage;
	public TC_CreatingNewInvoice_001 creatingNewInvoice;

	@Parameters("browserName")
	@BeforeClass(alwaysRun=true)
	public void beforeClass(@Optional("chrome") String bName) {
		if(bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}
		Reporter.log("Browser is launched Successfully",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized Successfully",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		explicitWait=new WebDriverWait(driver,10);
	}
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() throws InterruptedException {
		//URL
		driver.get(elib.readStringData("Sheet1",0,0));
		//String expectedLoginPageTitle= "vtiger CRM 5 - Commercial Open Source CRM";
	    String expectedLoginPageTitle=ExcelLib.readStringData("Sheet1", 1, 0);

		Assert.assertEquals(driver.getTitle(),expectedLoginPageTitle,"Login Page is not displayed successfully");
		Reporter.log("Login Page  displayed successfully",true);
		loginPage=new TC_Login_001(driver);
		loginPage.loginToApp(elib.readStringData("Sheet1",0,1),elib.readStringData("Sheet1",0,2));
		
	
		String expectedHomePageTitle=ExcelLib.readStringData("Sheet1", 1, 1);
	//	String expectedHomePageTitle=" Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
	//	explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
	//	Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"Login was failed");
     	Reporter.log("Successfully logged in to the application",true);
	}
		
		@AfterMethod(alwaysRun=true)
		public void afterMethod() {
			explicitWait.until(ExpectedConditions.elementToBeClickable(homePage.getClickOnSignOut()));
		//	homePage=new TC_HomePage_001(driver);
			homePage.getClickOnSignOut().click();
			String expectedLoginPageTitle="vtiger CRM 5 - Commercial Open Source CRM";
		//	Assert.assertEquals(driver.getTitle(), expectedLoginPageTitle,"Successfully logged out of the application");
			if(driver.getTitle().equals(expectedLoginPageTitle)) {
				Reporter.log("Successfully logged out of application",true);
			}else {
				Reporter.log("Logout was failed",true);
			}
			
		}
		@AfterClass(alwaysRun=true)
		public void afterClass() {
			driver.quit();
			Reporter.log("Successfully closed the browser",true);
	}
				
		
	
}


