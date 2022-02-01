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

public class TC_HomePage_001 {
	//Constructor
	public TC_HomePage_001(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Data members or properties
	@FindBy(linkText="More") private WebElement moreModuleLink;
	
	@FindBy(linkText="Invoice") private WebElement invoiceModuleLink;
	
	@FindBy(linkText="Sign Out") private WebElement clickOnSignOut;

	
	public WebElement getMoreModuleLink() {
		return moreModuleLink;
	}

	public WebElement getInvoiceModuleLink() {
		return invoiceModuleLink;
	}

	public WebElement getClickOnSignOut() {
		return clickOnSignOut;
	}
	

	
	

}
