package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/***
 * 
 * @author Sindhu
 *
 */
public class TC_CreatingNewInvoice_001 {
	//Constructor
		public TC_CreatingNewInvoice_001(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//Data members or properties
		@FindBy(name="subject") private WebElement creatingNewInvoiceSubject;
		@FindBy(name="bill_street") private WebElement enterBillingAddress;
		@FindBy(name="ship_street") private WebElement enterShippingAddress;
		@FindBy(xpath="(//img[@title='Select'])[3]") private WebElement clickLookUpImageOrganizationField;
	//	@FindBy(id="search_txt") private WebElement searchOrganisationName;
	//	@FindBy(xpath="(//input[@type='text'])[1]") private WebElement searchOrganisationName;
	//	@FindBy(xpath=("//td[@class='lvtCol']/../..//a[text()='vtiger']")) private WebElement selectOrganisationName;
		@FindBy(xpath=("//td[@class='lvtCol']/../..//a[text()='Motorola']")) private WebElement selectOrganisationName;
	//	@FindBy(xpath="(//a[@href='javascript:window.close();'])[1]") private WebElement selectOrganisationName;
		//@FindBy(xpath="//td[text()='Organizations']/../../../..//a[text()='vtiger']") private WebElement selectOrganisationName;
		//@FindBy(linkText="vtiger") private WebElement selectOrganisationName;
	
		@FindBy(id="searchIcon1") private WebElement clickLoopUpImageItemName;
		@FindBy(id="popup_product_131") private WebElement clickOnProductInItemWindow;
	//	@FindBy(linkText="Vtiger Single User Pack") private WebElement selectProductsFromProdutWindow;
		@FindBy(name="invoicestatus") private WebElement clickOnStatus;
		@FindBy(xpath="//option[@value='Created']") private WebElement clickOnCreatedFromDropDown;
		@FindBy(xpath="//option[@value='Approved']") private WebElement clickOnApprovedFromDropDown;
		@FindBy(xpath="//option[@value='Sent']") private WebElement clickOnSentFromDropDown;
		@FindBy(xpath="//option[@value='Credit Invoice']") private WebElement clickOnCreditInvoiceFromDropDown;
		@FindBy(id="qty1") private WebElement enterQty;
		@FindBy(name="button") private WebElement clickOnSave;
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") private WebElement clickOnAdministratorImageLogout;
	//	@FindBy(linkText="Sign Out") private WebElement clickOnSignOut;
		
		//getter methods
		public WebElement getCreatingNewInvoiceSubject() {
			return creatingNewInvoiceSubject;
		}

		public WebElement getEnterBillingAddress() {
			return enterBillingAddress;
		}
		
		public WebElement getEnterShippingAddress() {
			return enterShippingAddress;
		}
		
		public WebElement getClickLookUpImageOranizationField() {
			return clickLookUpImageOrganizationField;
		}
		
		//public WebElement getSearchOrganisationName() {
		//	return searchOrganisationName;
		//	}
		
		
       public WebElement getSelectOrganisationName() {
    	   return selectOrganisationName;
      }
		
		public WebElement getClickLoopUpImageItemName() {
			return clickLoopUpImageItemName;
		}
		
		public WebElement getClickOnProductInItemWindow() {
			return clickOnProductInItemWindow;
		}
		
	//	public WebElement getSelectProductsFromProductWindow() {
	//		return  selectProductsFromProdutWindow;
	//	}
		
		//2nd test case
		public WebElement getClickOnStatus() {
			return clickOnStatus;
		}
		
		//2nd test case
		public WebElement getClickOnCreatedFromDropDown() {
			return clickOnCreatedFromDropDown;
		}
		
		//3rd test case
		public WebElement getClickOnApprovedFromDropDown() {
			return clickOnApprovedFromDropDown;
		}
		
		//4th test case
		public WebElement getClickOnSentFromDropDown() {
			return  clickOnSentFromDropDown;
		}
		
		//5th test case
		public WebElement getClickOnCreditInvoiceFromDropDown() {
			return clickOnCreditInvoiceFromDropDown;
		}
		
		public WebElement getEnterQty() {
			return enterQty;
		}
		
	   public WebElement getClickOnSave() {
		return clickOnSave;
		
	    }
	
	   public WebElement getClickOnAdministratorImageLogout() {
		return clickOnAdministratorImageLogout;
	   }
    
	//    public WebElement getClickOnSignOut() {
	//	return clickOnSignOut;
	 //  }
//	   public WebElement getclickOnSignOut() {
//			return clickOnSignOut;
//		}
	      
		//action methods or business logics or page action
	      public void enterSubject(String subject) {
	    	  creatingNewInvoiceSubject.sendKeys(subject);
	    	  
	      }
	    

		public void enterBillAddress(String bill) {
	    	  enterBillingAddress.sendKeys(bill);
	      }
	      
	      public void enterShipAddress(String ship) {
	    	  enterShippingAddress.sendKeys(ship);
	      }
	      
	   //   public void searchOrganisationName(String searchOrganisation) {
		//		 searchOrganisationName.sendKeys(searchOrganisation);
		//	}
	    
	      
	      public void enterQty(String qty) {
	    	  enterQty.sendKeys(qty);
	      }

	//	public WebElement getClickOnSignOut() {
		
	//		return clickOnSignOut;
	//	}

		
	      
	      

		//public void enterQty(double qty) {
			// TODO Auto-generated method stub
			
		//}
	      
	      
	     


}
