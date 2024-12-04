package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts {

	public Contacts(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(linkText="Contacts")
	public WebElement contacts_btn;
	
	@FindBy(css="img[title='Create Contact...']")
	public WebElement createContacts_btn;
	
	@FindBy(name="firstname")
	public WebElement firstName;
	
	@FindBy(name="salutationtype")
	public WebElement salutationtype;
	
	@FindBy(name="lastname")
	public WebElement lastName;

	@FindBy(id="title")
	public WebElement title;
	
	@FindBy(id="department")
	public WebElement department;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(css="input[accesskey='S']")
	public WebElement save_btn;
	
	@FindBy(css="input[accesskey='X']")
	public WebElement cancel_btn;
	
	@FindBy(xpath="//input[@value='Delete']")
	public WebElement DeleteBtn;
	
	@FindBy(xpath="//input[@value='Mass Edit']")
	public WebElement massEdit;
	
	@FindBy(xpath="//input[@value='Send Mail']")
	public WebElement sendMail;
	
	@FindBy(xpath="//input[@value='Send SMS']")
	public WebElement send_SMS;
}
