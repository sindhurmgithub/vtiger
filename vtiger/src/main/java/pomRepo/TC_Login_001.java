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

public class TC_Login_001 {
	
 
		//Constructor
		public TC_Login_001(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//Data members or properties
		@FindBy(name="user_name") private WebElement usernameTextField;
		
		@FindBy(name="user_password") private WebElement passwordTextField;
		
		@FindBy(id="submitButton") private WebElement loginButton;
		
		//getter methods
		public WebElement getUsernameTextField() {
			return usernameTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		//action methods or business logics or page action
	      public void loginToApp(String username,String password) {
	    	  usernameTextField.sendKeys(username);
	    	  passwordTextField.sendKeys(password);
	    	  loginButton.click();
	      }
	    
	}





