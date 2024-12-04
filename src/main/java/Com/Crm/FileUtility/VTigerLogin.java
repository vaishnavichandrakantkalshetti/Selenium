package Com.Crm.FileUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VTigerLogin {

	public VTigerLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private WebElement user;
	
	@FindBy(name="user_password")
	private WebElement pass;
	
	@FindBy(css="input[id='submitButton']")
	private WebElement submit;
	
	public void Login(String email,String psw)
	{
		user.sendKeys(email);
		pass.sendKeys(psw);
		submit.click();
	}
}
