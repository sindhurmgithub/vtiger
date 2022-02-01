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

public class TC_InvoiceLookUpImage_001 {
	//Constructor
		public TC_InvoiceLookUpImage_001(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//Data members or properties
		@FindBy(xpath="//img[@title='Create Invoice...']") private WebElement invoiceModuleLookUpImage;
		
	
		//getter methods
		public WebElement getInvoiceModuleLookUpImage() {
			return invoiceModuleLookUpImage;
		}	

}
