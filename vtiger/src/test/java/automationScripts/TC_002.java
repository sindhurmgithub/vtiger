package automationScripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.ExcelLib;
import pomRepo.TC_CreatingNewInvoice_001;
import pomRepo.TC_HomePage_001;
import pomRepo.TC_InvoiceLookUpImage_001;

/***
 * 
 * @author Sindhu
 *
 */

public class TC_002 extends BaseClass {
	@Test
	public void createInvoiceWith_Created_Status() {

				//Test Data
				//Enter data in Excel sheet
	
		//		String testUrl=ExcelLib.readStringData("Sheet1",0,0);
		//		String username=ExcelLib.readStringData("Sheet1",0,1);
		//		String password=ExcelLib.readStringData("Sheet1",0,2);
		//		String expectedLoginPageTitle=ExcelLib.readStringData("Sheet1",1,0);
		//		String expectedHomePageTitle=ExcelLib.readStringData("Sheet1",1,1);
				String subject=ExcelLib.readStringData("Sheet1", 2, 0);
				String bill=ExcelLib.readStringData("Sheet1", 2, 1);
				String ship=ExcelLib.readStringData("Sheet1", 2, 2);
			//	CharSequence[] qty=ExcelLib.readStringData("Sheet1", 2, 3);
				String qty=ExcelLib.readNumericData("Sheet1", 2, 3);
			//	String searchOrganisation=ExcelLib.readStringData("Sheet1", 3, 0);
				
				//property file pass url data
//				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//				WebDriver driver=new ChromeDriver();
//				System.out.println("Browser is launched successfully");
//				driver.manage().window().maximize();
//				System.out.println("Browser is maximized successfully");
//				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);   
//				
//				driver.get(testUrl);
//				String actualLoginPageTitle=driver.getTitle();
//				if(actualLoginPageTitle.equals(expectedLoginPageTitle))
//				{
//					System.out.println("Login page is displayed successfully");
//					
//				}
//				//call methods from pom class
//				TC_Login_001 loginPage=new TC_Login_001(driver);
//				loginPage.loginToApp(username,password);
//				String actualHomePageTitle=driver.getTitle();
//				if(actualHomePageTitle.equals(expectedHomePageTitle)) {
//					System.out.println("Login is Successfull");
//				}
				
			//	String parentWindowId=driver.getWindowHandle();
			//	Set<String> allWindowIds=driver.getWindowHandles();
			//	allWindowIds.remove(parentWindowId);
				
			//	for(String windowId:allWindowIds) {
			//		driver.switchTo().window(windowId);
					
					
			//	}
				
				//Actions actions=new Actions(driver);
			    // WebElement moreModuleLink = null;
				//actions.moveToElement(moreModuleLink).perform(); 
				
				//HomePage
				
				homePage=new TC_HomePage_001(driver);
				homePage.getMoreModuleLink().click();
				
				
				homePage=new TC_HomePage_001(driver);
				homePage.getInvoiceModuleLink().click();
				
				//InvoicePage
				invoiceLookUpImage=new TC_InvoiceLookUpImage_001(driver);
				invoiceLookUpImage.getInvoiceModuleLookUpImage().click();
				
				//CreatingNewInvoicePage
			    creatingNewInvoice=new TC_CreatingNewInvoice_001(driver);
				creatingNewInvoice.enterSubject(subject);
				
				creatingNewInvoice=new TC_CreatingNewInvoice_001(driver);
				creatingNewInvoice.enterBillAddress(bill);
				 
			    creatingNewInvoice=new TC_CreatingNewInvoice_001(driver);
				creatingNewInvoice.enterShipAddress(ship);
				
				creatingNewInvoice=new TC_CreatingNewInvoice_001(driver);
				creatingNewInvoice.getClickLookUpImageOranizationField().click();
				
				
				
		//		TC_CreatingNewInvoice_001 clickOnSearchOption=new TC_CreatingNewInvoice_001(driver);
		//		clickOnSearchOption.searchOrganisationName(searchOrganisation);
			
			
				String parentWindowId=driver.getWindowHandle();
				Set<String> allWindowIds=driver.getWindowHandles();
				allWindowIds.remove(parentWindowId);
				
				for(String windowId:allWindowIds) {
					driver.switchTo().window(windowId);
					TC_CreatingNewInvoice_001 selectNameInOrganisationWindow=new TC_CreatingNewInvoice_001(driver);
					selectNameInOrganisationWindow.getSelectOrganisationName().click();
					
					Alert confirmationPopUp=driver.switchTo().alert();
					System.out.println(confirmationPopUp.getText());
					
					//handle the confirmation popup
					//confirmationPopUp.accept();
					confirmationPopUp.dismiss();   
					
					
				}
				driver.switchTo().window(parentWindowId);
		//		TC_CreatingNewInvoice_001 selectNameInOrganisationWindow=new TC_CreatingNewInvoice_001(driver);
		//		selectNameInOrganisationWindow.getSelectOrganisationName().click();
				
				
				creatingNewInvoice=new TC_CreatingNewInvoice_001(driver);
				creatingNewInvoice.getClickLoopUpImageItemName().click();
				
				
				String parentWindowId1=driver.getWindowHandle();
				Set<String> allWindowId=driver.getWindowHandles();
				allWindowId.remove(parentWindowId1);
				
				for(String windowId:allWindowId) {
					driver.switchTo().window(windowId);
				TC_CreatingNewInvoice_001 clickOnProductItemWindow=new TC_CreatingNewInvoice_001(driver);
				clickOnProductItemWindow.getClickOnProductInItemWindow().click();
				}
				driver.switchTo().window(parentWindowId1);
				 
				
		//		TC_CreatingNewInvoice_001 clickProductsName=new TC_CreatingNewInvoice_001(driver);
		//		 clickProductsName. getSelectProductsFromProductWindow().click();
				
				creatingNewInvoice=new TC_CreatingNewInvoice_001(driver);
				creatingNewInvoice.getClickOnStatus().click();
				
				
				
				creatingNewInvoice=new TC_CreatingNewInvoice_001(driver);
				creatingNewInvoice.getClickOnCreatedFromDropDown().click(); 
					
				creatingNewInvoice=new TC_CreatingNewInvoice_001(driver);
				creatingNewInvoice.enterQty(qty);
				
				
				
				creatingNewInvoice=new TC_CreatingNewInvoice_001(driver);
				creatingNewInvoice.getClickOnSave().click();
				
				creatingNewInvoice=new TC_CreatingNewInvoice_001(driver);
				creatingNewInvoice.getClickOnAdministratorImageLogout().click();
				
			//	TC_CreatingNewInvoice_001 clickOnTheSignOut=new TC_CreatingNewInvoice_001(driver);
			/// clickOnTheSignOut.getclickOnSignOut().click();
				
				
				
				
		
				
			}


}
