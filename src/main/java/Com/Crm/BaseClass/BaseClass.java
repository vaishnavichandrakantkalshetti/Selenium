package Com.Crm.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Com.Crm.FileUtility.ReadProperties;
import Com.Crm.FileUtility.VTigerLogin;

public class BaseClass {

	public static WebDriver driver=null;
	
	@BeforeClass
	public void preCondition() throws IOException
	{
		String browser=ReadProperties.property("browser");
		String url=ReadProperties.property("url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
        }
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
//		FileInputStream fis=new FileInputStream("D:\\selenium\\VtigerLogin1.xlsx");
//		Workbook wb= WorkbookFactory.create(fis);
//		Sheet sheet=wb.getSheet("Sheet1");
		
	
		String user=ReadProperties.property("username");
		String password=ReadProperties.property("password");
		
		VTigerLogin log=new VTigerLogin(driver);
		
//		String user = sheet.getRow(0).getCell(0).toString();
//		String pass = sheet.getRow(1).getCell(0).toString();
		//WebElement username = driver.findElement(By.name("user_name"));
		
//		username.sendKeys(user);
//		WebElement password = driver.findElement(By.name("user_password"));
//		password.sendKeys(pass);
	//	driver.findElement(By.cssSelector("input[id='submitButton']")).click();
		
		log.Login(user, password);
		
	}
	
	@AfterMethod
	public void logOut()
	{
		WebElement logout = driver.findElement(By.xpath("//td[@class='small']//td[2]/img"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(logout).perform();
		
	    driver.findElement(By.linkText("Sign Out")).click();	
	}
	
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}
	
}
