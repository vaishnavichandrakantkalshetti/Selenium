package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateOrganization {

	public CreateOrganization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(linkText="Organizations")
	private WebElement organization;
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement create_org ;
	
	@FindBy(name="accountname")
	private WebElement organization_name;
	
	@FindBy(id="assign_team")
	private WebElement group_sel_drpdwn;
	
//	Select se=new Select(group_sel_drpdwn);
	
//	@FindBy(name="website")
//	private WebElement website;
//	
//	@FindBy(id="tickersymbol")
//	private WebElement tickerSymbol;
//	
//	@FindBy(xpath="//img[@title='Select']")
//	private WebElement member_of_add_btn;
//	
//	@FindBy(id="employees")
//	private WebElement employees;
//	
//	@FindBy(id="email2")
//	private WebElement other_Email;
//	
//	@FindBy(name="industry")
//	private WebElement industry_drpdwn;
//	
//	@FindBy(name="accounttype")
//	private WebElement account_type_drpdwn;
//	
//	@FindBy(xpath="//input[@name='emailoptout']")
//	private WebElement emailOptChkbx;
//	
	@FindBy(css="input[value='U']")
	private WebElement user_btn;
	
	@FindBy(css="input[value='T']")
	private WebElement group_btn;
	
	@FindBy(css="input[accesskey='S']")
	private WebElement save_btn;
	
	@FindBy(css="input[accesskey='X']")
	private WebElement cancel_btn;
	
	@FindBy(css="img[alt='Search in Organizations...']")
	private WebElement search_organization_btn;
	
	@FindBy(name="search_text")
	private WebElement search_For_btn;
	
	@FindBy(id="bas_searchfield")
	private WebElement in_drpdwn;
	
	@FindBy(xpath="//input[@value=' Search Now ']")
	private WebElement searchNowBtn;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement DeleteBtn;
	
	@FindBy(xpath="//input[@value='Mass Edit']")
	private WebElement massEdit;
	
	@FindBy(xpath="//input[@value='Send Mail']")
	private WebElement sendMail;
	
	@FindBy(xpath="//input[@value='Mailer Export']")
	private WebElement mailerExport;
	
	@FindBy(xpath="//input[@value='Send SMS']")
	private WebElement send_SMS;
	
	public WebElement getOrganization()
	{
		return organization;
	}
	
	public void create_org()
	{
		create_org.click();
	}
	
	public void organization_name()
	{
		
	}
	
}
